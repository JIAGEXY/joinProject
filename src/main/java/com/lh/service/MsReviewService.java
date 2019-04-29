package com.lh.service;

import com.github.pagehelper.PageInfo;
import com.lh.entity.MsReview;
import com.lh.utils.R;

public interface MsReviewService {
    public R Comment(MsReview msReview);
    public PageInfo ViewComments(MsReview msReview, int pageNum, int pageSize);
    public PageInfo viewreply(MsReview msReview, int pageNum, int pageSize);
/*    public R Reply(MsReview msReview)*/;

}
