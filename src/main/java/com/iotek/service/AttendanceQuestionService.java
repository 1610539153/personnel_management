package com.iotek.service;

import com.iotek.po.AttendanceQuestion;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
public interface AttendanceQuestionService {
    boolean addAttendanceQuestionFine(AttendanceQuestion attendanceQuestion);
    List<AttendanceQuestion> checkAttendanceQuestion(AttendanceQuestion attendanceQuestion);
}
