package org.lnu.ums.config;

import org.lnu.ums.manager.EDBOGuidesServiceManager;
import org.lnu.ums.manager.ServiceManager;
import org.lnu.ums.service.BaseEdboService;
import org.lnu.ums.service.login.DefaultAuthentificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ua.edboservice.EDBOGuides;
import ua.edboservice.EDBOGuidesSoap;

import javax.xml.namespace.QName;
import java.net.URL;

@Configuration
@ComponentScan({
        "org.lnu.ums.service",
        "org.lnu.ums.security"
})
public class ServiceConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceConfig.class);

    @Value("${edbo.applicationKey}")
    private String applicationKey;

    @Value("${edbo.clearPreviousSession}")
    private Integer clearPreviousSession;

    @Bean(name = "edboAuthentificationService")
    public BaseEdboService<EDBOGuidesSoap> edboAuthentificationService() {
        BaseEdboService<EDBOGuidesSoap> service = new DefaultAuthentificationService();

        service.setApplicationKey(applicationKey);
        service.setClearPreviousSession(clearPreviousSession);
        service.setServiceManager(edboGuidesSoapServiceManager());

        return service;
    }

    @Bean
    public ServiceManager<EDBOGuidesSoap> edboGuidesSoapServiceManager() {
        EDBOGuidesServiceManager serviceManager = new EDBOGuidesServiceManager();
        serviceManager.setEdboGuidesSoap(edboGuidesSoap());

        return serviceManager;
    }

    @Bean
    public EDBOGuidesSoap edboGuidesSoap() {
        LOGGER.info("Initializing edbo Guides Soap");

        URL wsdlURL = EDBOGuides.class.getClassLoader().getResource("wsdl/EDBOGuides.wsdl");

        QName serviceName = new QName("http://edboservice.ua/", "EDBOGuides");
        EDBOGuides edboGuides = new EDBOGuides(wsdlURL, serviceName);

        return edboGuides.getEDBOGuidesSoap();
    }

}
