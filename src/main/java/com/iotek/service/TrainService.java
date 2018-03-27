package com.iotek.service;


import com.iotek.po.Train;

import java.util.List;

/**
 * Created by Administrator on 2018/3/23.
 */
public interface TrainService {
    boolean addTrainDao(Train train);
    List<Train> checkTrainContent();
    List<Train> checkMyTrain(Train train);
    boolean deleteMyTrain(Train train);
    Train queryMyTrain(Train train);
    boolean  updateMyTrain(Train train);

}
