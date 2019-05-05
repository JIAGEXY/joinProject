package com.lh.service.impl;

import com.lh.dto.UserDTO;
import com.lh.entity.MsSleeper;
import com.lh.entity.MsUser;
import com.lh.entity.MsUserExample;
import com.lh.exception.RZException;
import com.lh.mapper.MsSleeperMapper;
import com.lh.mapper.MsUserMapper;
import com.lh.service.MsUserService;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import com.lh.utils.StringUtil;
import com.lh.utils.UpLoad;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MsUserServiceImpl implements MsUserService {
    @Resource
    private MsUserMapper msUserMapper;

    @Resource
    private MsSleeperMapper msSleeperMapper;

    @Override
    public R register(@RequestBody MsUser user) {

        MsUser msUser = this.findByName(user.getUsername());

        if(msUser != null){
            return R.error("用户已存在");
        }

        MsUser ms = this.findByPhone(user.getPhone());
        if(ms != null){
            return R.error("手机号已注册");
        }

        int i = msUserMapper.insert(user);
        if(i == 0 ){ return R.error("注册失败,用户名已存在"); }
        return R.ok();
    }

    @Override
    public MsUser findByName(String username) {

        MsUserExample example = new MsUserExample();
        if( username != null && !username.equals("") ){
            MsUserExample.Criteria criteria = example.createCriteria();
            criteria.andUsernameEqualTo(username);
        }
        List<MsUser> list = msUserMapper.selectByExample(example);
        if(list.size() ==0){
            return null;
        }
        return list.get(0);
    }

    @Override
    public R updatePassword(MsUser user) {
        MsUser ms = (MsUser) ShiroUtils.getCurrentUser();
        if(!user.getPhone().equals(ms.getPhone())){ return R.error("手机号不正确"); }
        int i = msUserMapper.updateByPrimaryKey(user);
        if(i == 0){ return R.error("重置密码失败"); }
        return R.ok();
    }

    @Override
    public MsUser findByPhone(String phone) {
        MsUserExample example = new MsUserExample();
        MsUserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(phone);
        List<MsUser> list = msUserMapper.selectByExample(example);
        if(list.size() == 0){
            return null;
        }
        return list.get(0);
    }

    @Override
    public R selectUserInfo() {
        MsUser user = (MsUser)ShiroUtils.getCurrentUser();
        MsUserExample e=new MsUserExample();
        MsUserExample.Criteria c=e.createCriteria();
        c.andUseridEqualTo(user.getUserid());
        List<MsUser> msUsers = msUserMapper.selectByExample(e);
        if(msUsers==null||msUsers.isEmpty()){
            return null;
        }
        MsUser msUser = msUsers.get(0);
        UserDTO userDTO=new UserDTO();
        if(StringUtil.isNotEmpty(msUser.getHobby())){
            String hobby = msUser.getHobby();
            String[] split = hobby.split(";");
            List<String> like=new ArrayList<>();
            for (String s : split) {
                if(s!=null||s!=""){
                    like.add(s);
                }
            }
            userDTO.setLike(like);
        }
        if(StringUtil.isNotEmpty(user.getHeadphoto())) {
            userDTO.setHeadphoto(user.getHeadphoto());
        }
        if(StringUtil.isNotEmpty(user.getAddress())) {
            userDTO.setAddress(user.getAddress());
        }
        if(user.getAge()!=null) {
            userDTO.setAge(user.getAge());
        }
        if(StringUtil.isNotEmpty(user.getEmail())) {
            userDTO.setEmail(user.getEmail());
        }
        if(StringUtil.isNotEmpty(user.getBankcard())) {
            userDTO.setBankcard(user.getBankcard());
        }
        if(user.getLevel()!=null) {
            userDTO.setLevel(user.getLevel());
        }
        if(StringUtil.isNotEmpty(user.getPhone())) {
            userDTO.setPhone(user.getPhone());
        }
        if(StringUtil.isNotEmpty(user.getRealname())) {
            userDTO.setRealname(user.getRealname());
        }

        return R.ok().put("data",userDTO);
    }

    @Override
    public R updateUserHeadPhoto(MsUser user, String oldPhoto) {
        try {
            int i = msUserMapper.updateByPrimaryKey(user);
            if (StringUtil.isEmpty(oldPhoto)) return R.ok();
            if (i>0) {
                UpLoad upLoad = new UpLoad();
                if (upLoad.deleteFile(oldPhoto)==0)return R.ok();
                else throw new Exception("修改头像失败");
            } else R.error("修改修改失败");
        } catch (Exception e) {
            throw new RZException("修改头像失败");
        }
        return R.error("修改头像失败");
    }

    @Override
    public R selectLevler() {
       MsUser user= (MsUser)ShiroUtils.getCurrentUser();
       Integer level = user.getLevel();
       return R.ok().put("data",level);
    }

    @Override
    public R insertSleeper(MsSleeper msSleeper) {
        int i = msSleeperMapper.insertSelective(msSleeper);
        if(i>0)
            return R.ok();
        return R.error();
    }

    @Override
    public R updateUser(UserDTO msUser) {
        List<String> like = msUser.getLike();
        for (String s : like) {
            msUser.setHobby(msUser.getHobby()+";"+s);
        }
        int i = msUserMapper.updateByPrimaryKeySelective(msUser);
        if(i>0)
            return R.ok();
        return R.error();
    }
}
