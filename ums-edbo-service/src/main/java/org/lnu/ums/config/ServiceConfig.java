package org.lnu.ums.config;

import org.lnu.ums.manager.EDBOGuidesServiceManager;
import org.lnu.ums.manager.EDBOPersonServiceManager;
import org.lnu.ums.manager.ServiceManager;
import org.lnu.ums.service.guides.GuidesService;
import org.lnu.ums.service.person.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.EDBOGuides;
import ua.edboservice.EDBOGuidesSoap;
import ua.edboservice.EDBOPerson;
import ua.edboservice.EDBOPersonSoap;

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

    @Bean
    public RestTemplate restTemplate() {
        LOGGER.debug("Initializing rest tempalte");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(jacksonHttpMessageConverters());

        return restTemplate;
    }

    @Bean
    public PersonService personService() {
        PersonService personService = new PersonService();
        personService.setApplicationKey(applicationKey);
        personService.setClearPreviousSession(clearPreviousSession);
        personService.setServiceManager(edboPersonSoapServiceManager());

        return personService;
    }

    @Bean
    public GuidesService guidesService() {
        GuidesService guidesService = new GuidesService();
        guidesService.setApplicationKey(applicationKey);
        guidesService.setClearPreviousSession(clearPreviousSession);
        guidesService.setServiceManager(edboGuidesSoapServiceManager());

        return guidesService;
    }

    @Bean(name = "edboGuidesSoapServiceManager")
    public ServiceManager<EDBOGuidesSoap> edboGuidesSoapServiceManager() {
        EDBOGuidesServiceManager serviceManager = new EDBOGuidesServiceManager();
        serviceManager.setEdboGuidesSoap(edboGuidesSoap());

        return serviceManager;
    }


    @Bean(name = "edboPersonSoapServiceManager")
    public ServiceManager<EDBOPersonSoap> edboPersonSoapServiceManager() {
        EDBOPersonServiceManager serviceManager = new EDBOPersonServiceManager();
        serviceManager.setEdboPerson(edboPerson());

        return serviceManager;
    }

    @Bean
    public EDBOPersonSoap edboPerson() {
        LOGGER.info("Initializing edbo Guides Soap");

        URL wsdlURL = EDBOPerson.class.getClassLoader().getResource("wsdl/EDBOPerson.wsdl");

        QName serviceName = new QName("http://edboservice.ua/", "EDBOPerson");
        EDBOPerson edboPerson = new EDBOPerson(wsdlURL, serviceName);

        return edboPerson.getEDBOPersonSoap();
    }

    @Bean
    public EDBOGuidesSoap edboGuidesSoap() {
        LOGGER.info("Initializing edbo Person Soap");

        URL wsdlURL = EDBOGuides.class.getClassLoader().getResource("wsdl/EDBOGuides.wsdl");

        QName serviceName = new QName("http://edboservice.ua/", "EDBOGuides");
        EDBOGuides edboGuides = new EDBOGuides(wsdlURL, serviceName);

        return edboGuides.getEDBOGuidesSoap();
    }

    @Bean(name = "restTemplateJacksonHttpMessageConverter")
    public HttpMessageConverter<?> jacksonHttpMessageConverters() {
        return new MappingJackson2HttpMessageConverter();
    }

}
