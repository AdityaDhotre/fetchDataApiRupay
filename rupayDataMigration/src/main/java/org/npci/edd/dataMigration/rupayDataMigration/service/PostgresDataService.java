package org.npci.edd.dataMigration.rupayDataMigration.service;

import java.util.List;

import org.npci.edd.dataMigration.rupayDataMigration.model.McprBinDataDetails;
//import org.npci.edd.dataMigration.rupayDataMigration.model.NpciBillingSummaryMmyy;

public interface PostgresDataService {
	List<McprBinDataDetails> getMcprBinData();
//    List<NpciBillingSummaryMmyy> getNpciBillingSummary();
}