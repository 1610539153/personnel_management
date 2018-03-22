package com.iotek.service;

import com.iotek.po.PutResume;

import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public interface PutResumeService {
    boolean  addPutResume(PutResume putResume);
    List<PutResume> checkResume();
    List<PutResume> checkResumeByCustomerId(PutResume putResume);
}
