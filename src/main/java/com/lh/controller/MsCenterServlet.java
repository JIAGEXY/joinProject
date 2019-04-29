package com.lh.controller;

import com.lh.service.MsCenterService;
import com.lh.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@CrossOrigin(allowCredentials="true")
public class MsCenterServlet {

    @Resource
    private MsCenterService msCenterService;

    @RequestMapping("/ms/art/artdisplay")
    @ResponseBody
    public R findCenter(Byte type ,
                           Long userId ,
                       int pageNum ,
                       int pageSize) {
        System.out.println(userId);
        //  pageNum 当前页	 pageSize 每页行数   type 类型 数字	租客/房东

        if (type == 1 && userId==null) {//租客故事
            return msCenterService.findTenan(pageNum, pageSize, type);
        }else if (type == 2 && userId==null) {//房东故事
            type = 0;
            return msCenterService.findTenan(pageNum, pageSize, type);
        } else if (type == 3 && userId!=null) {//个人文章
            return msCenterService.findPersonal(pageNum, pageSize, userId);
        }else if (type == 4 && userId!=null) {//收藏文章
            return msCenterService.findCollection(pageNum, pageSize, userId);
        }
        return R.error("输入错误");
    }

    @RequestMapping("/ms/art/artdisplay/choice")
    @ResponseBody
    public R findSfit(){//个人中心——精选文章
        return msCenterService.findSfit();
    }
}
