package org.lnu.ums;

import org.lnu.ums.config.ControllerConfig;
import org.lnu.ums.config.DaoConfig;
import org.lnu.ums.config.FacadeConfig;
import org.lnu.ums.config.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by ivanursul on 6/17/15.
 */
@SpringBootApplication
@Configuration
@Import({
        ControllerConfig.class,
        FacadeConfig.class,
        ServiceConfig.class,
        DaoConfig.class
})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
