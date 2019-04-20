package com.lh.controller;

import com.google.code.kaptcha.Producer;
import com.lh.entity.MsUser;
import com.lh.service.MsUserService;
import com.lh.utils.LoginUtils;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

@RestController
public class MsUserServlet {
    @Resource
    private MsUserService service;
    @Resource
    private Producer producer;

    //注册账号时手机验证码
    @RequestMapping("/ms/user/code/{phone}")
    public void code(@PathVariable(value = "phone") String phone){

        String randNum =LoginUtils.getCode(phone);

        ShiroUtils.setAttribute(phone,randNum);
    }

    //用户注册
    @RequestMapping("/ms/user/register")
    public R register(@RequestBody MsUser user){

        if(!ShiroUtils.getAttribute(user.getPhone()).equals(user.getRandNum())){

            return R.error("验证码错误");

        }

        Md5Hash hash = new Md5Hash(user.getPassword(),user.getUsername(),1024);
        String password = hash.toString();

        user.setPassword(password);

        return service.register(user);

    }

    //用户登录验证码
    @RequestMapping("/captcha.jpg")
    public void get(HttpServletResponse response){

        try {

            String text =producer.createText();
            ShiroUtils.setAttribute("code",text);

            //根据验证码创建验证码图片
            BufferedImage image = producer.createImage(text);

            OutputStream out = response.getOutputStream();
            ImageIO.write(image,"jpg",out);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //登录验证
    @RequestMapping("/ms/user/login")
    public R login(@RequestBody MsUser user){

        String code = (String) ShiroUtils.getAttribute("code");

        if(!code.equals(user.getCaptcha())){
            return R.error("验证码错误");
        }

        Md5Hash hash = new Md5Hash(user.getPassword(),user.getUsername(),1024);
        String password = hash.toString();

        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),password);

        String s = "";
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);

            System.out.println(subject.hasRole("旅客"));
            System.out.println(subject.hasRole("房东"));

            MsUser msUser = (MsUser) ShiroUtils.getCurrentUser();

            return R.ok().put("data",msUser);
        } catch (Exception e) {
            s = e.getMessage();
        }

        return R.error(s);

    }

    //重置密码
    @RequestMapping("/ms/user/forgetpassword")
    public R password(@RequestBody MsUser user){


        if(!ShiroUtils.getAttribute(user.getPhone()).equals(user.getRandNum())){

            return R.error("验证码错误");

        }
        MsUser msUser = service.findByPhone(user.getPhone());

        if(msUser==null){
            return R.error("该手机号未注册");
        }

        Md5Hash hash = new Md5Hash(user.getPassword(),msUser.getUsername(),1024);
        String password = hash.toString();

        msUser.setPassword(password);

        return service.updatePassword(msUser);

    }


    //退出
    @RequestMapping("/logout")
    public R logout(){

        ShiroUtils.logout();

        return R.ok();
    }

}
