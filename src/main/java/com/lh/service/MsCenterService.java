package com.lh.service;

import com.lh.utils.R;

public interface MsCenterService {

    R findPersonal(int nowPage, int pageSize, Long userId);//个人

    R findTenan(int pageNum, int pageSize,Byte type);//  租客/房东

    R findCollection(int nowPage, int pageSize, Long userId);//收藏

    R findSfit();//个人中心——精选文章
}
