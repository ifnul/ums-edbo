package org.lnu.ums.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("org.lnu.ums.dao")
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("org.lnu.is.domain")
@EntityScan(basePackages = {"org.lnu.ums.dao"})
@EnableAutoConfiguration
public class DaoConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(DaoConfig.class);

}