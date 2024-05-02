package org.npci.edd.dataMigration.rupayDataMigration.repo;

import org.npci.edd.dataMigration.rupayDataMigration.model.McprBinDataDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface McprBinDataDetailsRepository extends JpaRepository<McprBinDataDetails, Long> {
    // Repository methods
}


