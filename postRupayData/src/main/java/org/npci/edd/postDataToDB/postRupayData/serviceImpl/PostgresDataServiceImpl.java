package org.npci.edd.postDataToDB.postRupayData.serviceImpl;

import java.util.List;

import org.npci.edd.postDataToDB.postRupayData.model.McprBinDataDetails;
import org.npci.edd.postDataToDB.postRupayData.service.PostgresDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostgresDataServiceImpl implements PostgresDataService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${postgres.url}")
    private String postgresUrl;

    @Override
    public List<McprBinDataDetails> getMcprBinData() {
        ResponseEntity<List<McprBinDataDetails>> responseEntity = restTemplate.exchange(
            postgresUrl + "/postgres-data/mcpr-bin-data",
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<McprBinDataDetails>>() {});
        return responseEntity.getBody();
    }
}