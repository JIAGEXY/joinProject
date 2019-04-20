package com.lh.realm;

import com.lh.entity.MsUser;
import com.lh.service.MsUserService;
import com.lh.utils.ShiroUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component("userRealm")
public class UserRealm extends AuthorizingRealm {

    @Resource
    private MsUserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {

        MsUser user = (MsUser) principal.getPrimaryPrincipal();
        System.out.println(user.getUsername());
        List<String> roles = new ArrayList<>();
        List<String> perms = new ArrayList<>();

        if(user.getType() == 1){
            roles.add("旅客");
            perms.add("ms:user:*");
        }
        if(user.getType() == 0){
            roles.add("房东");
            perms.add("ms:landlord:*");
        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(roles);
        info.addStringPermissions(perms);
        return info;

    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) {
        //登录认证
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        String uname = token.getUsername();

        String upass = new String(token.getPassword());

        MsUser user = userService.findByName(uname);


        if(user == null){
            throw new UnknownAccountException("账号不存在");
        }
        if(!upass.equals(user.getPassword())){
            throw new IncorrectCredentialsException("密码错误");
        }


        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,upass,this.getName());

        return info;
    }
}
