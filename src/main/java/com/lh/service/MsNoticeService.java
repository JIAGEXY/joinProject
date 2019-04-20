package com.lh.service;

import com.lh.entity.MsNotice;
import com.lh.utils.R;

public interface MsNoticeService {
    R findNoticeByUserId(long userId);
    R findNoticeByNoticeId(long noticeId);
    R insert(MsNotice notice);
    R delete(long noticeId);
}
