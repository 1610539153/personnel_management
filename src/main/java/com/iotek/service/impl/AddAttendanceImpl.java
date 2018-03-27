package com.iotek.service.impl;

import com.iotek.dao.AttendanceDao;
import com.iotek.po.Attendance;
import com.iotek.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/25.
 */
@Service(value = "attendanceService")
public class AddAttendanceImpl implements AttendanceService {
    @Autowired
    private AttendanceDao attendanceDao;
    @Override
    public boolean addAttendance(Attendance attendance) {
        return attendanceDao.addAttendance(attendance);
    }

    @Override
    public boolean updateClosedAttendance(Attendance attendance) {
        return attendanceDao.updateClosedAttendance(attendance);
    }

    @Override
    public List<Attendance> checkAttendance(Attendance attendance) {
        return attendanceDao.checkAttendance(attendance);
    }

    @Override
    public List<Attendance> checkAllAttendance() {
        return attendanceDao.checkAllAttendance();
    }
}
