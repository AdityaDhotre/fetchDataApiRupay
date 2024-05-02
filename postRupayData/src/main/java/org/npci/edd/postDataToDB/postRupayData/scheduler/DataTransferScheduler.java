package org.npci.edd.postDataToDB.postRupayData.scheduler;

import org.npci.edd.postDataToDB.postRupayData.service.MysqlDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DataTransferScheduler {

    @Autowired
    private MysqlDataService mysqlDataService;

    // Run the transferDataFromPostgres method on the 21st day of every month at midnight
    @Scheduled(cron = "0 0 0 21 * *")
    public void transferData() {
        mysqlDataService.transferDataFromPostgres();
    }
}
