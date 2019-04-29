package com.lh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lh.entity.MsReview;
import com.lh.entity.MsReviewExample;
import com.lh.entity.MsUser;
import com.lh.mapper.MsReportMapper;
import com.lh.mapper.MsReviewMapper;
import com.lh.mapper.MsUserMapper;
import com.lh.service.MsReviewService;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "msReviewServiceImpl")
public class MsReviewServiceImpl implements MsReviewService {
    @Resource
    MsReviewMapper msReviewMapper;
    @Resource
    MsUserMapper msUserMapper;
    @Override
    public R Comment(MsReview msReview) {
        Long userid = ((MsUser) ShiroUtils.getCurrentUser()).getUserid();
        MsUser msUser = msUserMapper.selectByPrimaryKey(userid);
        msReview.setUsername(msUser.getUsername());
        msReview.setHeadphoto(msUser.getHeadphoto());
        msReviewMapper.insert(msReview);
        return R.ok();
    }

    @Override
    public PageInfo ViewComments(MsReview msReview,int pageNum,int pageSize) {
        MsReviewExample example = new MsReviewExample();
        MsReviewExample.Criteria criteria = example.createCriteria();
        criteria.andArtidEqualTo(msReview.getArtid());
        List<MsReview> msReviews = msReviewMapper.selectByExample(example);
        PageHelper.startPage(pageNum,pageSize);
        //pagesize表示每页多少行数据
        PageInfo pageInfo = new PageInfo(msReviews);
        return pageInfo;
    }

    @Override
    public PageInfo viewreply(MsReview msReview, int pageNum, int pageSize) {
        MsReviewExample example = new MsReviewExample();
        MsReviewExample.Criteria criteria = example.createCriteria();
        criteria.andParentidEqualTo(msReview.getReviewid());
        List<MsReview> msReviews = msReviewMapper.selectByExample(example);
        PageHelper.startPage(pageNum,pageSize);
        PageInfo pageInfo = new PageInfo(msReviews);
        return pageInfo;
    }

   /* @Override
    public R Reply(MsReview msReview) {

        return null;
    }*/
}
