package com.lh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lh.entity.MsRoom;
import com.lh.entity.MsUser;
import com.lh.mapper.MsRoomMapper;
import com.lh.service.MsRoomService;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MsRoomServiceImpl implements MsRoomService {
    @Resource
    private MsRoomMapper mapper;

    @Override
    public R insert(MsRoom room) {
        int i = mapper.insert(room);
        return i>0?R.ok():R.error("发布失败");
    }
    @Override
    public R selectHouseCollect(PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//      MsUser user=(MsUser) ShiroUtils.getCurrentUser();
        MsUser user=new MsUser();
        user.setUserid(Long.parseLong("1"));
        List<MsRoom> rooms = mapper.selectHouseCollect(user.getUserid());
        PageInfo info=new PageInfo(rooms);
        return R.ok().put("data",info);
    }
}
