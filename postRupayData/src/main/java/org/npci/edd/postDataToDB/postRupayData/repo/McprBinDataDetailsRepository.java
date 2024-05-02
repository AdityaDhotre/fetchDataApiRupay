package org.npci.edd.postDataToDB.postRupayData.repo;

import org.npci.edd.postDataToDB.postRupayData.model.McprBinDataDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface McprBinDataDetailsRepository extends JpaRepository<McprBinDataDetails, Long> {
}
