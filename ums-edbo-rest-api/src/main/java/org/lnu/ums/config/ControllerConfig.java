package org.lnu.ums.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = "org.lnu.ums.rest")
public class ControllerConfig extends WebMvcConfigurerAdapter {

}