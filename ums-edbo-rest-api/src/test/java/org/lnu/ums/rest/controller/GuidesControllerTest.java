package org.lnu.ums.rest.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.edbo.cal.guides.GetUniversityFacultySpecialtiesCmd;
import org.lnu.ums.Application;
import org.lnu.ums.service.guides.GuidesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialities;

import java.util.Optional;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {
        Application.class,
        IntegrationTestConfig.class
})
@WebAppConfiguration
@IntegrationTest
public class GuidesControllerTest {

    @Autowired
    private GuidesService guidesService;

    private String baseUrl = "http://localhost:8080/ums-edbo-rest-api";
    private RestTemplate restTemplate = new RestTemplate();

    private String sessionGUID = "sessionGUID";
    private String actualDate = "actualDate";
    private int languageId = 1;

    @Test
    public void getUniversityFacultySpecialties() throws Exception {
        // Given
        ArrayOfDUniversityFacultetSpecialities expected = new ArrayOfDUniversityFacultetSpecialities();

        GetUniversityFacultySpecialtiesCmd cmd = new GetUniversityFacultySpecialtiesCmd(baseUrl, restTemplate);
        cmd.setSessionGUID(sessionGUID);
        cmd.setActualDate(actualDate);
        cmd.setIdLanguage(languageId);

        // When
        doReturn(expected).when(guidesService).getUniversityFacultySpecialties(anyString(), anyString(),
                anyString(), anyString(), anyInt(), anyString(), anyInt(), anyInt(),
                anyString(), anyString(), anyString(), anyString());

        Optional<ArrayOfDUniversityFacultetSpecialities> actual = cmd.execute();

        // Then
        assertTrue(actual.isPresent());
    }
}
