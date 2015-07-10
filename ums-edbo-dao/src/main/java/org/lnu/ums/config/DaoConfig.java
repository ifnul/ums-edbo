package org.lnu.ums.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("org.lnu.ums.dao")
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("org.lnu.ums.dao")
@EntityScan(basePackages = {"org.lnu.is.domain"})
@EnableAutoConfiguration
@EnableTransactionManagement
public class DaoConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(DaoConfig.class);

}