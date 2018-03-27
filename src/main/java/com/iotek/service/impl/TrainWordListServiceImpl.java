package com.iotek.service.impl;

import com.iotek.dao.TrainWordListDao;
import com.iotek.po.TrainWordList;
import com.iotek.service.TrainWordListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/23.
 */
@Service(value = "trainWordListService")
public class TrainWordListServiceImpl implements TrainWordListService {
    @Autowired
    private TrainWordListDao trainWordListDao;
    @Override
    public boolean additionTrainWordList(TrainWordList trainWordList) {
        return trainWordListDao.additionTrainWordList(trainWordList);
    }

    @Override
    public TrainWordList queryTrainWordListById(TrainWordList trainWordList) {
        return trainWordListDao.queryTrainWordListById(trainWordList);
    }
}
