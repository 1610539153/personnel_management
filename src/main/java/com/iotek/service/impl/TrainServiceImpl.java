package com.iotek.service.impl;

import com.iotek.dao.TrainDao;
import com.iotek.po.Train;
import com.iotek.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/23.
 */
@Service(value = "trainService")
public class TrainServiceImpl implements TrainService{
    @Autowired
    private TrainDao trainDao;

    @Override
    public boolean addTrainDao(com.iotek.po.Train train) {
        return trainDao.addTrainDao(train);
    }

    @Override
    public List<Train> checkTrainContent() {
        return trainDao.checkTrainContent();
    }

    @Override
    public List<Train> checkMyTrain(Train train) {
        return trainDao.checkMyTrain(train);
    }

    @Override
    public boolean deleteMyTrain(Train train) {
        return trainDao.deleteMyTrain(train);
    }

    @Override
    public Train queryMyTrain(Train train) {
        return trainDao.queryMyTrain(train);
    }

    @Override
    public boolean updateMyTrain(Train train) {
        return trainDao.updateMyTrain(train);
    }


}
