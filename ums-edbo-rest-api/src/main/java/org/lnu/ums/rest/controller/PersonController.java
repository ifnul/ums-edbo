package org.lnu.ums.rest.controller;

import org.lnu.ums.rest.model.Constants;
import org.lnu.ums.service.person.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.edboservice.ArrayOfDPersonAddresses2;
import ua.edboservice.ArrayOfDPersonBenefits;
import ua.edboservice.ArrayOfDPersonDocumentTypes;
import ua.edboservice.ArrayOfDPersonDocuments;
import ua.edboservice.ArrayOfDPersonDocumentsSubjects;
import ua.edboservice.ArrayOfDPersonOlympiadsAwards;
import ua.edboservice.ArrayOfDPersonRequestBenefits;
import ua.edboservice.ArrayOfDPersonRequestDocumentSubjects;
import ua.edboservice.ArrayOfDPersonRequestExaminations;
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
    public ArrayOfDPersonRequestBenefits getBenefits(@RequestParam(value = "SessionGUID", required = true) String sessionGUID,
                                                             @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                             @RequestParam(value = "Id_Language", required = true) int languageId,
                                                             @RequestParam(value = "Id_PersonRequest", required = false, defaultValue = "0") int personId) {
        LOGGER.info("Getting person Benefits, session Guid: {}, actualDate: {}, languageId: {}, personId: {}", sessionGUID, actualDate, languageId, personId);
        return personService.getRequestBenefits(sessionGUID, actualDate, languageId, personId);
    }

    @RequestMapping(value = "/requests/documents/subjects")
    public ArrayOfDPersonRequestDocumentSubjects personRequestDocumentSubjects(@RequestParam(value = "SessionGUID",required = true) String sessionGUID,
                                                                               @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                                               @RequestParam(value = "Id_Language", required = true) int languageId,
                                                                               @RequestParam(value = "Id_PersonRequest", required = false) int personId) {
        return personService.getPersonRequestDocumentSubjects(sessionGUID, actualDate, languageId, personId);
    }

    @RequestMapping(value = "/requests/olympiads/awards")
    public ArrayOfDPersonRequestOlympiadsAwards personRequestOlympiadAwards(@RequestParam(value = "SessionGUID",required = true) String sessionGUID,
                                                                            @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                                            @RequestParam(value = "Id_Language", required = true) int languageId,
                                                                            @RequestParam(value = "Id_PersonRequest", required = false) int personId) {
        return personService.getRequestOlympiadAwards(sessionGUID, actualDate, languageId, personId);
    }

    @RequestMapping
    public ArrayOfDPersonsFind getPersons(@RequestParam(value = "SessionGUID",required = false) String sessionGUID,
                                       @RequestParam(value = "ActualDate",required = false) String actualDate,
                                       @RequestParam(value = "Id_Language",required = false) int idLanguage,
                                       @RequestParam(value = "fioMask", required = false) String fioMask,
                                       @RequestParam(value = "documentSeries", required = false) String documentSeries,
                                       @RequestParam(value = "documentNumber", required = false) String documentNumber,
                                       @RequestParam(value = "idsDocumentTypes", required = false) String idsDocumentTypes,
                                       @RequestParam(value = "hundred", required = false, defaultValue = "0") int hundred,
                                       @RequestParam(value = "personCodeU", required = false) String personCodeU,
                                       @RequestParam(value = "filters", required = false) String filters) {

        return personService.getPersons(sessionGUID,
                actualDate, idLanguage, fioMask, documentSeries,
                documentNumber, idsDocumentTypes, hundred, personCodeU, filters);
    }

    @RequestMapping(value = "/documents/types")
    public ArrayOfDPersonDocumentTypes personRequestDocumentTypes(@RequestParam(value = "SessionGUID",required = true) String sessionGUID,
                                                                  @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                                  @RequestParam(value = "Id_Language", required = true) int languageId) {
        return personService.getDocumentTypes(sessionGUID, actualDate, languageId);
    }

    @RequestMapping(value = "/benefits")
    public ArrayOfDPersonBenefits getPersonBenefits(@RequestParam(value = "SessionGUID", required = true) String sessionGUID,
                                                    @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                    @RequestParam(value = "Id_Language", required = true) int languageId,
                                                    @RequestParam(value = "Id_PersonRequest", required = false, defaultValue = "0") int personId){
        return personService.getBenefits(sessionGUID, actualDate, languageId, personId);
    }

    @RequestMapping(value = "/quotas")
    public ArrayOfDPersonRequestQuotas getPersonQuotas(@RequestParam(value = "SessionGUID", required = true) String sessionGUID,
                                                       @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                       @RequestParam(value = "Id_Language", required = true) int languageId,
                                                       @RequestParam(value = "Id_PersonRequest", required = false, defaultValue = "0") int personId) {
        return personService.getPersonQuotas(sessionGUID, actualDate, languageId, personId);
    }


    @RequestMapping(value = "/documents/subjects")
    public ArrayOfDPersonDocumentsSubjects getPersonDocumentSubjects(@RequestParam(value = "SessionGUID", required = true) String sessionGUID,
                                                                     @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                                     @RequestParam(value = "Id_Language", required = true) int languageId,
                                                                     @RequestParam(value = "Id_PersonRequest", required = false, defaultValue = "0") int personId,
                                                                     @RequestParam(value = "Id_dPersonDocument",required = false, defaultValue = "0") int personDocumentId,
                                                                     @RequestParam(value = "Id_PersonDocumentType", required = false, defaultValue = "0") int personDocumentTypeId) {
        return personService.getPersonDocumentSubjects(sessionGUID, actualDate, languageId, personDocumentId, personId, personDocumentTypeId);
    }

    @RequestMapping(value = "/addresses")
    public ArrayOfDPersonAddresses2 getPersonsAdresses(@RequestParam(value = "SessionGUID", required = true) String sessionGUID,
                                                       @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                       @RequestParam(value = "Id_Language", required = true) int languageId,
                                                       @RequestParam(value = "PersonCodeU",required = false) String personCodeU,
                                                       @RequestParam(value = "Id_PersonAddress", required = false, defaultValue = "0") int personAddressId) {
        return personService.getPersonAddresses2(sessionGUID, actualDate, languageId, personCodeU, personAddressId);
    }

    @RequestMapping(value = "/documents")
    public ArrayOfDPersonDocuments getPersonDocuments(@RequestParam(value = "SessionGUID", required = true) String sessionGUID,
                                                      @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                      @RequestParam(value = "Id_Language", required = true) int languageId,
                                                      @RequestParam(value = "PersonCodeU", required = false) String personCodeU,
                                                      @RequestParam(value = "Id_PersonDocumentType", required = false, defaultValue = "0") int idPersonDocumentType,
                                                      @RequestParam(value = "Id_PersonDocument", required = false, defaultValue = "0") int idPersonDocument,
                                                      @RequestParam(value = "UniversityKode", required = false) String universityKode,
                                                      @RequestParam(value = "IsEntrantDocument", required = false, defaultValue = "0") int isEntrantDocument) {
        return personService.getPersonDocuments(sessionGUID, actualDate, languageId, personCodeU, idPersonDocumentType, idPersonDocument, universityKode, isEntrantDocument);
    }

    @RequestMapping(value = "/examinations")
    public ArrayOfDPersonRequestExaminations getPersonRequestExaminations(@RequestParam(value = "SessionGUID", required = true) String sessionGUID,
                                                                          @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                                          @RequestParam(value = "Id_Language", required = true) int languageId,
                                                                          @RequestParam(value = "Id_PersonRequest", required = false, defaultValue = "0") int personId) {
        return personService.getPersonExaminations(sessionGUID, actualDate, languageId, personId);
    }


    @RequestMapping(value = "/olympiads/awards")
    public ArrayOfDPersonOlympiadsAwards persontOlympiadAwards(@RequestParam(value = "SessionGUID", required = true) String sessionGUID,
                                                               @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                               @RequestParam(value = "Id_Language", required = true) int languageId,
                                                               @RequestParam(value = "PersonCodeU", required = false) String personCodeU,
                                                               @RequestParam(value ="Id_PersonRequestSeasons", required = false, defaultValue = "0") int idPersonRequestSeasons) {
        return personService.getOlympiadAwards(sessionGUID, actualDate, languageId, personCodeU, idPersonRequestSeasons);
    }
}
