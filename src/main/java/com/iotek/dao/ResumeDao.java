package com.iotek.dao;

import com.iotek.po.Resume;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Administrator on 2018/3/17.
 */
@Repository
public interface ResumeDao{
    boolean addResume(Resume resume);
    List<Resume> checkMyResume(Resume resume);
    Resume checkAppointResumeByResumeId(Resume resume);
    boolean  updateResume(Resume resume);
}
