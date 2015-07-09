package org.lnu.ums.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.lnu.ums.dao")
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("org.lnu.is.domain")
public class DaoConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(DaoConfig.class);

    @Bean
    public DataSource dataSource() {
        LOGGER.info("Creating datasource for main database");
        return DataSourceBuilder.create().build();
    }

}