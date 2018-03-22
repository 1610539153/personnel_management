package com.iotek.service.impl;

import com.iotek.dao.PutResumeDao;
import com.iotek.po.PutResume;
import com.iotek.service.PutResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
@Service(value = "putResumeService")
public class PutResumeServiceImpl implements PutResumeService{
    @Autowired
    private PutResumeDao putResumeDao;
    @Override
    public boolean addPutResume(PutResume putResume){
        return putResumeDao.addPutResume(putResume);
    }

    @Override
    public List<PutResume> checkResume() {
        return putResumeDao.checkResume();
    }

    @Override
    public List<PutResume> checkResumeByCustomerId(PutResume putResume){
        return putResumeDao.checkResumeByCustomerId(putResume);
    }


}
