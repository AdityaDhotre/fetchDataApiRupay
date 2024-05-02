package org.npci.edd.postDataToDB.postRupayData.service;

import java.util.List;

import org.npci.edd.postDataToDB.postRupayData.model.McprBinDataDetails;
import org.springframework.stereotype.Service;
//import org.npci.edd.postDataToDB.postRupayData.model.Participant;

public interface PostgresDataService {
    List<McprBinDataDetails> getMcprBinData();
//    List<Participant> getParticipantData();
}

