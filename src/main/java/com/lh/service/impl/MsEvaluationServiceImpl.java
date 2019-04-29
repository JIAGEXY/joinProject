package com.lh.service.impl;

import com.lh.entity.MsEvaluation;
import com.lh.entity.MsUser;
import com.lh.mapper.MsEvaluationMapper;
import com.lh.mapper.MsUserMapper;
import com.lh.service.MsEvaluationService;
import com.lh.utils.R;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class MsEvaluationServiceImpl implements MsEvaluationService {
    @Resource
    private MsEvaluationMapper msEvaluationMapper;
    @Resource
    private MsUserMapper msUserMapper;
    @Override
    @Transactional//添加失误
    public R evaluation(MsEvaluation evaluation) {
        int i = msEvaluationMapper.insert(evaluation);
        if (i>0){
            int observation = evaluation.getObservation();//感受力 0,1,2,3,4
            int sensibilities = evaluation.getSensibilities();//观察力
            int integration  = (observation + sensibilities) * 5;
            MsUser user = msUserMapper.selectByPrimaryKey(evaluation.getUserid());
            user.setIntegration(integration);
            int a = msUserMapper.updateByPrimaryKey(user);
            return a!=0?R.ok():R.error("评价失败");
        }
        return R.error("评价失败");
    }
}
