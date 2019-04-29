package com.lh.utils;

public interface OrderStatus {
    int PREPAID=1;//已支付,待入驻
    int UNPAID=0;//未支付
    int CANCEL=2;//已取消
    int FAIL=3;//交易失败
    int APPRAISE=4;//待评价
}
