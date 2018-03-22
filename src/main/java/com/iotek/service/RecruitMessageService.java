package com.iotek.service;

import com.iotek.po.RecruitMessage;

import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
public interface RecruitMessageService{
    List<RecruitMessage> seekRecruitMessage();
    boolean addRecruitMessage(RecruitMessage recruitMessage);
    List<RecruitMessage> seekMyRecruitMessage(RecruitMessage recruitMessage);
    boolean deleteMyRecruitMessage(RecruitMessage recruitMessage);
}
