package org.npci.edd.dataMigration.rupayDataMigration.serviceImpl;
import java.util.List;

import org.npci.edd.dataMigration.rupayDataMigration.model.McprBinDataDetails;
import org.npci.edd.dataMigration.rupayDataMigration.repo.McprBinDataDetailsRepository;
import org.npci.edd.dataMigration.rupayDataMigration.service.PostgresDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostgresDataServiceImpl implements PostgresDataService {

    @Autowired
    private McprBinDataDetailsRepository mcprBinDataDetailsRepository;

    @Override
    public List<McprBinDataDetails> getMcprBinData() {
        return mcprBinDataDetailsRepository.findAll();
    }
}


