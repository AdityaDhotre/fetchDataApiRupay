package org.npci.edd.dataMigration.rupayDataMigration.controller;

import java.util.List;

import org.npci.edd.dataMigration.rupayDataMigration.model.McprBinDataDetails;
//import org.npci.edd.dataMigration.rupayDataMigration.model.NpciBillingSummaryMmyy;
import org.npci.edd.dataMigration.rupayDataMigration.service.PostgresDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postgres-data")
public class PostgresDataController {

    @Autowired
    private PostgresDataService postgresDataService;

    @GetMapping("/mcpr-bin-data")
    public ResponseEntity<List<McprBinDataDetails>> getMcprBinData() {
        List<McprBinDataDetails> data = postgresDataService.getMcprBinData();
        return ResponseEntity.ok(data);
    }

//    @GetMapping("/npci-billing-summary")
//    public ResponseEntity<List<NpciBillingSummaryMmyy>> getNpciBillingSummary() {
//        List<NpciBillingSummaryMmyy> data = postgresDataService.getNpciBillingSummary();
//        return ResponseEntity.ok(data);
//    }
}

