package com.iotek.service;

import com.iotek.po.Resume;

import java.util.List;

/**
 * Created by Administrator on 2018/3/17.
 */

public interface ResumeService {

    boolean addResume(Resume resume);
    List<Resume> checkMyResume(Resume resume);
    Resume checkAppointResumeByResumeId(Resume resume);
    boolean  updateResume(Resume resume);


}
