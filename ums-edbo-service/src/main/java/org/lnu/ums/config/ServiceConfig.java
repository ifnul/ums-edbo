package org.lnu.ums.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "org.lnu.ums.service"
})
public class ServiceConfig {

}