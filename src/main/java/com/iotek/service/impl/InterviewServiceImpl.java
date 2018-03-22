package com.iotek.service.impl;

import com.iotek.dao.InterviewDao;
import com.iotek.po.Interview;
import com.iotek.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
@Service(value = "interviewService")
public class InterviewServiceImpl  implements InterviewService{
    @Autowired
    private InterviewDao interviewDao;
    @Override
    public boolean addInterview(Interview interview){
        return interviewDao.addInterview(interview);
    }

    @Override
    public List<Interview> checkMyInterviewMessage(Interview interview) {
        return interviewDao.checkMyInterviewMessage(interview);
    }
}
