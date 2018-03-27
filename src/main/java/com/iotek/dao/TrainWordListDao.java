package com.iotek.dao;

import com.iotek.po.TrainWordList;

/**
 * Created by Administrator on 2018/3/23.
 */
public interface TrainWordListDao {
    boolean additionTrainWordList(TrainWordList trainWordList);
    TrainWordList queryTrainWordListById(TrainWordList trainWordList);

}
