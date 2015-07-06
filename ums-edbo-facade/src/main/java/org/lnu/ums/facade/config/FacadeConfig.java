package org.lnu.ums.facade.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "org.lnu.ums.facade",
        "org.lnu.ums.converter"
})
public class FacadeConfig {

}