package com.lh.service.impl;

import com.lh.entity.MsReport;
import com.lh.mapper.MsReportMapper;
import com.lh.service.MsReportService;
import com.lh.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "msReportServiceImpl")
public class MsReportServiceImpl implements MsReportService {
    @Resource
    MsReportMapper msReportMapper;

    @Override
    public R report(MsReport msReport) {
        msReportMapper.insert(msReport);
        return R.ok();
    }
}
