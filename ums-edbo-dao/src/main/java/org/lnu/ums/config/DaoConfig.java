package org.lnu.ums.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.lnu.ums.dao")
@PropertySource("classpath:application.properties")
public class DaoConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(DaoConfig.class);


}