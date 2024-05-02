package org.npci.edd.dataMigration.rupayDataMigration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.npci.edd.dataMigration.rupayDataMigration.repo")
@ComponentScan(basePackages = "org.npci.edd.dataMigration.rupayDataMigration")
public class RupayDataMigrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RupayDataMigrationApplication.class, args);
		System.out.println("application started");
	}

}
