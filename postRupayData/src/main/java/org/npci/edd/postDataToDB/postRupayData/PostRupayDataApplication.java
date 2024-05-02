package org.npci.edd.postDataToDB.postRupayData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

//@EnableJpaRepositories("org.npci.edd.postDataToDB.postRupayData.repo")
@SpringBootApplication
@ComponentScan(basePackages = {"org.npci.edd.postDataToDB.postRupayData"})
@EnableAutoConfiguration
@EnableScheduling
public class PostRupayDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostRupayDataApplication.class, args);
	}
	
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
