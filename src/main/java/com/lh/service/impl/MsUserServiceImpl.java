package com.lh.service.impl;

import com.lh.entity.MsSleeper;
import com.lh.entity.MsUser;
import com.lh.mapper.MsSleeperMapper;
import com.lh.mapper.MsUserMapper;
import com.lh.service.MsUserService;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class MsUserServiceImpl implements MsUserService {
    @Resource
    private MsUserMapper mapper;

    @Resource
    private MsSleeperMapper msSleeperMapper;

    @Override
    public R register(MsUser user) {

        int i = mapper.insert(user);

        if(i == 0 ){
            return R.error("注册失败,用户名已存在");
        }
        return R.ok();

    }

    @Override
    public MsUser findByName(String username) {

        MsUserExample example = new MsUserExample();
        if(username != null && !username.equals("") ){

            MsUserExample.Criteria criteria = example.createCriteria();

            criteria.andUsernameEqualTo(username);
        }
        List<MsUser> list = mapper.selectByExample(example);
        return list.get(0);
    }

    @Override
    public R updatePassword(MsUser user) {

        MsUser ms = (MsUser) ShiroUtils.getCurrentUser();

        if(!user.getPhone().equals(ms.getPhone())){
            return R.error("手机号不正确");
        }

        int i = mapper.updateByPrimaryKey(user);

        if(i == 0){
            return R.error("重置密码失败");
        }
        return R.ok();
    }

    @Override
    public MsUser findByPhone(String phone) {

        MsUserExample example = new MsUserExample();

        MsUserExample.Criteria criteria = example.createCriteria();

        criteria.andPhoneEqualTo(phone);

        List<MsUser> list = mapper.selectByExample(example);


        return list.get(0);
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
    public R updateUser(MsUser msUser) {
        int i = mapper.updateByPrimaryKeySelective(msUser);
        if(i>0)
            return R.ok();
        return R.error();
    }
}
