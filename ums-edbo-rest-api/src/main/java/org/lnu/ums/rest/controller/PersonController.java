package org.lnu.ums.rest.controller;

import org.lnu.ums.rest.model.Constants;
import org.lnu.ums.service.person.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.edboservice.ArrayOfDPersonBenefits;
import ua.edboservice.ArrayOfDPersonDocumentTypes;
import ua.edboservice.ArrayOfDPersonRequestBenefits;
import ua.edboservice.ArrayOfDPersonRequestDocumentSubjects;
import ua.edboservice.ArrayOfDPersonRequestOlympiadsAwards;
import ua.edboservice.ArrayOfDPersonRequestQuotas;
import ua.edboservice.ArrayOfDPersonsFind;

import javax.annotation.Resource;

@RestController
@RequestMapping(Constants.API_URL + "/persons")
public class PersonController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    @Resource
    private PersonService personService;

    @RequestMapping(value = "/requests/benefits")
    public ArrayOfDPersonRequestBenefits getBenefits(@RequestParam("sessionGUID") String sessionGUID,
                                                             @RequestParam("actualDate") String actualDate,
                                                             @RequestParam("idLanguage") int languageId,
                                                             @RequestParam("idPersonRequest") int personId) {
        LOGGER.info("Getting person Benefits, session Guid: {}, actualDate: {}, languageId: {}, personId: {}", sessionGUID, actualDate, languageId, personId);
        return personService.getRequestBenefits(sessionGUID, actualDate, languageId, personId);
    }

    @RequestMapping
    public ArrayOfDPersonsFind getPersons(@RequestParam("sessionGUID") String sessionGUID,
                                       @RequestParam("actualDate") String actualDate,
                                       @RequestParam("idLanguage") int idLanguage,
                                       @RequestParam("fioMask") String fioMask,
                                       @RequestParam("documentSeries") String documentSeries,
                                       @RequestParam("documentNumber") String documentNumber,
                                       @RequestParam("idsDocumentTypes") String idsDocumentTypes,
                                       @RequestParam("hundred") int hundred,
                                       @RequestParam("personCodeU") String personCodeU,
                                       @RequestParam("filters") String filters) {
        return personService.getPersons(sessionGUID,
                actualDate, idLanguage, fioMask, documentSeries,
                documentNumber, idsDocumentTypes, hundred, personCodeU, filters);
    }

    @RequestMapping(value = "/documents/types")
    public ArrayOfDPersonDocumentTypes personRequestDocumentSubjects(@RequestParam("sessionGUID") String sessionGUID,
                                                                               @RequestParam("actualDate") String actualDate,
                                                                               @RequestParam("idLanguage") int languageId) {
        return personService.getDocumentTypes(sessionGUID, actualDate, languageId);
    }

    @RequestMapping(value = "/documents/subjects")
    public ArrayOfDPersonRequestDocumentSubjects personDocumentSubjects(@RequestParam("sessionGUID") String sessionGUID,
                                                                        @RequestParam("actualDate") String actualDate,
                                                                        @RequestParam("idLanguage") int languageId,
                                                                        @RequestParam("idPersonRequest") int personId) {
        return personService.getPersonDocumentSubjects(sessionGUID, actualDate, languageId, personId);
    }

    @RequestMapping(value = "/olympiads/awards")
    public ArrayOfDPersonRequestOlympiadsAwards personOlympiadAwards(@RequestParam("sessionGUID") String sessionGUID,
                                                                     @RequestParam("actualDate") String actualDate,
                                                                     @RequestParam("idLanguage") int languageId,
                                                                     @RequestParam("idPersonRequest") int personId) {
        return personService.getOlympiadAwards(sessionGUID, actualDate, languageId, personId);
    }

    @RequestMapping(value = "/benefits")
    public ArrayOfDPersonBenefits getPersonBenefits(@RequestParam("sessionGUID") String sessionGUID,
                                                    @RequestParam("actualDate") String actualDate,
                                                    @RequestParam("idLanguage") int languageId,
                                                    @RequestParam("idPersonRequest") int personId){
        return personService.getBenefits(sessionGUID, actualDate, languageId, personId);
    }

    @RequestMapping(value = "/quotas")
    public ArrayOfDPersonRequestQuotas getPersonQuotas(@RequestParam("sessionGUID") String sessionGUID,
                                                    @RequestParam("actualDate") String actualDate,
                                                    @RequestParam("idLanguage") int languageId,
                                                    @RequestParam("idPersonRequest") int personId) {
        return personService.getPersonQuotas(sessionGUID, actualDate, languageId, personId);
    }

}
