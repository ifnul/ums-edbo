package org.lnu.ums.rest.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.ums.Application;
import org.lnu.ums.service.guides.GuidesService;
import org.lnu.ums.service.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {
        Application.class,
        IntegrationTestConfig.class
})
@WebAppConfiguration
public class GuidesControllerTest {

    @Autowired // formely mocked
    private PersonService personService;

    @Autowired // formely mocked
    private GuidesService guidesService;

    @Test
    public void testName() throws Exception {
        // Given

        // When

        // Then
        assertEquals(true, true);
    }
}
