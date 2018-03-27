package com.iotek.service;


import com.iotek.po.TrainWordList;

/**
 * Created by Administrator on 2018/3/23.
 */
public interface TrainWordListService {
    boolean additionTrainWordList(TrainWordList trainWordList);
    TrainWordList queryTrainWordListById(TrainWordList trainWordList);
}
