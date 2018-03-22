package com.iotek.dao;

import com.iotek.po.Interview;

import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
public interface InterviewDao{
   boolean addInterview(Interview interview);
   List<Interview> checkMyInterviewMessage(Interview interview);
}
