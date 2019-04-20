package com.lh.service.impl;

import com.lh.entity.MsNotice;
import com.lh.entity.MsNoticeExample;
import com.lh.mapper.MsNoticeMapper;
import com.lh.service.MsNoticeService;
import com.lh.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MsNoticeServiceImpl implements MsNoticeService {
    @Resource
    private MsNoticeMapper msNoticeMapper;

    @Override
    public R findNoticeByUserId(long userId) {
        MsNoticeExample example = new MsNoticeExample();
        MsNoticeExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<MsNotice> list = msNoticeMapper.selectByExample(example);
        return list!=null?R.ok().put("data",list):R.error("未发布公告");
    }

    @Override
    public R findNoticeByNoticeId(long noticeId) {
        MsNotice notice = msNoticeMapper.selectByPrimaryKey(noticeId);
        return notice!=null?R.ok().put("data",notice):R.error("公告不存在");
    }

    @Override
    public R insert(MsNotice notice) {
        int i = msNoticeMapper.insert(notice);
        return i>0?R.ok():R.error("发表失败");
    }

    @Override
    public R delete(long noticeId) {
        int i = msNoticeMapper.deleteByPrimaryKey(noticeId);
        return i>0?R.ok():R.error("删除失败");
    }
}
