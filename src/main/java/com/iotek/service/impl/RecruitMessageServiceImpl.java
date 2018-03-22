package com.iotek.service.impl;

import com.iotek.dao.RecruitMessageDao;
import com.iotek.po.RecruitMessage;
import com.iotek.service.RecruitMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
@Service(value = "recruitMessageService")
public class RecruitMessageServiceImpl implements RecruitMessageService{
    @Autowired
    private RecruitMessageDao recruitMessageDao;

    @Override
    public List<RecruitMessage> seekRecruitMessage(){
        return recruitMessageDao.seekRecruitMessage();
    }

    @Override
    public boolean addRecruitMessage(RecruitMessage recruitMessage){
        if(recruitMessage==null){
            return  false;
        }
        return recruitMessageDao.addRecruitMessage(recruitMessage);
    }

    @Override
    public List<RecruitMessage> seekMyRecruitMessage(RecruitMessage recruitMessage) {
      return recruitMessageDao.seekMyRecruitMessage(recruitMessage);
    }

    @Override
    public boolean deleteMyRecruitMessage(RecruitMessage recruitMessage){
        return recruitMessageDao.deleteMyRecruitMessage(recruitMessage);
    }
}
