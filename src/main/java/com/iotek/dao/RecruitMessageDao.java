package com.iotek.dao;

import com.iotek.po.RecruitMessage;

import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
public interface RecruitMessageDao {
    boolean addRecruitMessage(RecruitMessage recruitMessage);
    List<RecruitMessage> seekRecruitMessage();
    List<RecruitMessage> seekMyRecruitMessage(RecruitMessage recruitMessage);
    boolean deleteMyRecruitMessage(RecruitMessage recruitMessage);
}
