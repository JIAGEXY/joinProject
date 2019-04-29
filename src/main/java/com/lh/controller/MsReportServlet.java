package com.lh.controller;

import com.lh.entity.MsReport;
import com.lh.entity.MsUser;
import com.lh.service.MsReportService;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin(allowCredentials="true")
public class MsReportServlet {
    @Resource(name = "msReportServiceImpl")
    MsReportService msReportService;
    @RequestMapping("/ms/article/report")
    public R report(@RequestBody MsReport msReport){
        MsUser msUser = (MsUser) ShiroUtils.getCurrentUser();
        long userId = msUser.getUserid();
        msReport.setUserid(userId);
        java.util.Date  date=new java.util.Date();
        java.sql.Date  data1=new java.sql.Date(date.getTime());
        msReport.setCreatetime(data1);
        return msReportService.report(msReport);
    }
}
