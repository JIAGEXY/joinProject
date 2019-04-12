package com.lh.service.impl;

import com.lh.entity.MsOrder;
import com.lh.entity.MsUser;
import com.lh.mapper.MsOrderMapper;
import com.lh.service.MsOrderService;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * //                            _ooOoo_
 * //                           o8888888o
 * //                           88" . "88
 * //                           (| -_- |)
 * //                            O\ = /O
 * //                        ____/`---'\____
 * //                      .   ' \\| |// `.
 * //                       / \\||| : |||// \
 * //                     / _||||| -:- |||||- \
 * //                       | | \\\ - /// | |
 * //                     | \_| ''\---/'' | |
 * //                      \ .-\__ `-` ___/-. /
 * //                   ___`. .' /--.--\ `. . __
 * //                ."" '< `.___\_<|>_/___.' >'"".
 * //               | | : `- \`.;`\ _ /`;.`/ - ` : | |
 * //                 \ \ `-. \_ __\ /__ _/ .-` / /
 * //         ======`-.____`-.___\_____/___.-`____.-'======
 * //                            `=---='
 * //
 * //         .............................................
 * //                  佛祖镇楼                  BUG辟易
 *
 * @Description:
 * @Date: 2019/4/11
 * @Time: 22:02
 */
@Service
public class MsOrderServiceImpl implements MsOrderService {
    @Resource
    private MsOrderMapper msOrderMapper;


    @Override
    public R insertOrder(MsOrder msOrder) {
        //MsUser user=(MsUser)ShiroUtils.getCurrentUser();
        //msOrder.setUserId(user.getUserId);
        msOrder.setUserid(Long.parseLong("1"));
        int i = msOrderMapper.insert(msOrder);
        if(i>0)
            return R.ok("添加订单成功");
        return R.error("添加订单失败");
    }
}
