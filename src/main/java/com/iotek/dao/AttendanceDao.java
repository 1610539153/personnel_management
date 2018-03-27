package com.iotek.dao;

import com.iotek.po.Attendance;

import java.util.List;


/**
 * Created by Administrator on 2018/3/25.
 */
public interface AttendanceDao{
    boolean addAttendance(Attendance attendance);
    boolean updateClosedAttendance(Attendance attendance);
    List<Attendance> checkAttendance(Attendance attendance);
    List<Attendance>  checkAllAttendance();

}
