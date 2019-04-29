package com.lh.controller;

import com.google.code.kaptcha.Producer;
import com.lh.entity.MsUser;
import com.github.pagehelper.PageInfo;
import com.lh.entity.MsSleeper;
import com.lh.service.MsRoomService;
import com.lh.service.MsUserService;
import com.lh.utils.LoginUtils;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

@RestController
@CrossOrigin(allowCredentials="true")
public class MsUserServlet {
    @Resource
    private MsUserService msUserService;

    @Resource
    private Producer producer;

    @Resource
    private MsRoomService msRoomService;

    @RequestMapping("/a")
    public R login(){
        return R.ok().put("data","hello world");
    }

    //房屋收藏
    @RequestMapping("/ms/user/housecollect")
    public R houseCollect(PageInfo pageInfo){
        System.out.println(pageInfo.getPageNum()+pageInfo.getPageSize());
        return  msRoomService.selectHouseCollect(pageInfo);
    }

    //查询旅客等级
    @RequestMapping("/ms/user/sleepscore")
    public R selectLerver(){
        return msUserService.selectLevler();
    }

    //试睡员申请提交
    @RequestMapping("/ms/user/cansleep")
    public R insertSleeper(@RequestBody MsSleeper msSleeper){
        return msUserService.insertSleeper(msSleeper);
    }

    //修改当前用户个人资料
    @RequestMapping("/ms/user/mydata")
    public R updateUser(@RequestBody MsUser msUser){
        return msUserService.updateUser(msUser);
    }

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
        return msUserService.register(user);
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
        if(!code.equals(user.getCaptcha())){ return R.error("验证码错误"); }
        Md5Hash hash = new Md5Hash(user.getPassword(),user.getUsername(),1024);
        String password = hash.toString();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),password);
        String s = "";
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            System.out.println(subject.hasRole("旅客"));
            System.out.println(subject.hasRole("房东"));
            MsUser msUser = msUserService.findByName(user.getUsername());
            return R.ok().put("data",msUser);
        } catch (Exception e) { s = e.getMessage(); }
        return R.error(s);
    }

    //重置密码
    @RequestMapping("/ms/user/forgetpassword")
    public R password(@RequestBody MsUser user){
        if(!ShiroUtils.getAttribute(user.getPhone()).equals(user.getRandNum())){ return R.error("验证码错误"); }
        MsUser msUser = msUserService.findByPhone(user.getPhone());
        if(msUser==null){ return R.error("该手机号未注册"); }
        Md5Hash hash = new Md5Hash(user.getPassword(),msUser.getUsername(),1024);
        String password = hash.toString();
        msUser.setPassword(password);
        return msUserService.updatePassword(msUser);
    }

    //退出
    @RequestMapping("/logout")
    public R logout(){
        ShiroUtils.logout();
        return R.ok();
    }
}
