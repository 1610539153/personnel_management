package com.iotek.service.impl;

import com.iotek.dao.ResumeDao;
import com.iotek.po.Resume;
import com.iotek.service.ResumeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Administrator on 2018/3/17.
 */
@Service(value = "resumeService")
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeDao resumeDao;


    @Override
    public boolean addResume(Resume resume) {
        if (resume == null) {
            return  false;
        }
        return   resumeDao.addResume(resume);
    }

    @Override
    public List<Resume> checkMyResume(Resume resume) {
        return   resumeDao.checkMyResume(resume);
    }

    @Override
    public Resume checkAppointResumeByResumeId(Resume resume) {
        return  resumeDao.checkAppointResumeByResumeId(resume);
    }

    @Override
    public boolean updateResume(Resume resume) {
        return resumeDao.updateResume(resume);
    }


}
