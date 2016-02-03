package org.lnu.ums.rest.controller;

import org.lnu.ums.service.guides.GuidesService;
import org.lnu.ums.service.person.PersonService;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IntegrationTestConfig {

    @Mock
    private PersonService personService;

    @Mock
    private GuidesService guidesService;

    public IntegrationTestConfig() {
        MockitoAnnotations.initMocks(this);
    }

    @Bean
    public PersonService personService() {
        return personService;
    }

    @Bean
    public GuidesService guidesService() {
        return guidesService;
    }
}