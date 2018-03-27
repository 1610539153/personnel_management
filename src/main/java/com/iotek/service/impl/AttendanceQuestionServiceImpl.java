package com.iotek.service.impl;

import com.iotek.dao.AttendanceQuestionDao;
import com.iotek.po.AttendanceQuestion;
import com.iotek.service.AttendanceQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
@Service(value = "attendanceQuestionService")
public class AttendanceQuestionServiceImpl implements AttendanceQuestionService {
    @Autowired
    private AttendanceQuestionDao attendanceQuestionDao;
    @Override
    public boolean addAttendanceQuestionFine(AttendanceQuestion attendanceQuestion) {
        return attendanceQuestionDao.addAttendanceQuestionFine(attendanceQuestion);
    }

    @Override
    public List<AttendanceQuestion> checkAttendanceQuestion(AttendanceQuestion attendanceQuestion) {
        return attendanceQuestionDao.checkAttendanceQuestion(attendanceQuestion);
    }
}
