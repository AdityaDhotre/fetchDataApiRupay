package org.npci.edd.postDataToDB.postRupayData.serviceImpl;

import java.util.List;

import org.npci.edd.postDataToDB.postRupayData.model.McprBinDataDetails;
import org.npci.edd.postDataToDB.postRupayData.repo.McprBinDataDetailsRepository;
import org.npci.edd.postDataToDB.postRupayData.service.MysqlDataService;
import org.npci.edd.postDataToDB.postRupayData.service.PostgresDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MysqlDataServiceImpl implements MysqlDataService {

    @Autowired
    private PostgresDataService postgresDataService;

    @Autowired
    private McprBinDataDetailsRepository mcprBinDataDetailsRepository;

    @Override
    public boolean transferDataFromPostgres() {
        try {
            List<McprBinDataDetails> mcprBinDataDetailsList = postgresDataService.getMcprBinData();
            mcprBinDataDetailsRepository.saveAll(mcprBinDataDetailsList);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}