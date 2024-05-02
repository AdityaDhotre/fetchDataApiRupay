package org.npci.edd.postDataToDB.postRupayData.controller;

import org.npci.edd.postDataToDB.postRupayData.service.MysqlDataService;
import org.npci.edd.postDataToDB.postRupayData.service.PostgresDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-transfer")
public class DataTransferController {

    @Autowired
    private MysqlDataService mysqlDataService;

    @PostMapping("/transfer")
    public ResponseEntity<?> transferData() {
        boolean result = mysqlDataService.transferDataFromPostgres();
        if (result) {
            return ResponseEntity.ok("Data transferred successfully to MySQL.");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to transfer data to MySQL.");
        }
    }
}

