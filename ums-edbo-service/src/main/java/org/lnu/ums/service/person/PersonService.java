package org.lnu.ums.service.person;

import org.lnu.ums.service.BaseEdboService;
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
import ua.edboservice.EDBOPersonSoap;

public class PersonService extends BaseEdboService<EDBOPersonSoap> {

    public ArrayOfDPersonRequestBenefits getRequestBenefits(String sessionGUID,
                                                String actualDate,
                                                int idLanguage,
                                                int idPersonRequest) {
        ArrayOfDPersonRequestBenefits response = client().personRequestBenefitsGet(sessionGUID, actualDate, idLanguage, idPersonRequest);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonsFind getPersons(String sessionGUID,
                                          String actualDate,
                                          int idLanguage,
                                          String fioMask,
                                          String documentSeries,
                                          String documentNumber,
                                          String idsDocumentTypes,
                                          int hundred,
                                          String personCodeU,
                                          String filters) {

        ArrayOfDPersonsFind response = client().personsFind(sessionGUID, actualDate, idLanguage,
                fioMask, documentSeries, documentNumber,
                idsDocumentTypes, hundred, personCodeU, filters);

        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonDocumentTypes getDocumentTypes(String sessionGUID, String actualDate, int languageId) {
        ArrayOfDPersonDocumentTypes response = client().personDocumentTypesGet(sessionGUID, actualDate, languageId);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonRequestDocumentSubjects getPersonRequestDocumentSubjects(String sessionGUID, String actualDate, int languageId, int personId) {
        ArrayOfDPersonRequestDocumentSubjects response = client().personRequestDocumentSubjectsGet(sessionGUID, actualDate, languageId, personId);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonRequestOlympiadsAwards getRequestOlympiadAwards(String sessionGUID, String actualDate, int languageId, int personId) {
        ArrayOfDPersonRequestOlympiadsAwards response = client().personRequestOlympiadsAwardsGet(sessionGUID, actualDate, languageId, personId);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonBenefits getBenefits(String sessionGUID, String actualDate, int languageId, int personId) {
        ArrayOfDPersonBenefits response = client().personBenefitsGet(sessionGUID, actualDate, languageId, personId);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonRequestQuotas getPersonQuotas(String sessionGUID, String actualDate, int languageId, int personId) {
        ArrayOfDPersonRequestQuotas response = client().personRequestQuotasGet(sessionGUID, actualDate, languageId, personId);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonDocumentsSubjects getPersonDocumentSubjects(String sessionGUID, String actualDate, int languageId, int personDocumentId, int personId, int personDocumentTypeId) {
        ArrayOfDPersonDocumentsSubjects response = client().personDocumentsSubjectsGet(sessionGUID, actualDate, languageId, personDocumentId, personId, personDocumentTypeId);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonAddresses2 getPersonAddresses2(String sessionGUID, String actualDate, int languageId, String personCodeU, int personAddressId) {
        ArrayOfDPersonAddresses2 response = client().personAddressesGet2(sessionGUID, actualDate, languageId, personCodeU, personAddressId);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonDocuments getPersonDocuments(String sessionGUID, String actualDate, int idLanguage, String personCodeU, int idPersonDocumentType,
                                                      int idPersonDocument, String universityKode, int isEntrantDocument) {
        ArrayOfDPersonDocuments response = client().personDocumentsGet(sessionGUID, actualDate, idLanguage, personCodeU, idPersonDocumentType, idPersonDocument, universityKode, isEntrantDocument);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonRequestExaminations getPersonExaminations(String sessionGUID, String actualDate, int languageId, int personId) {
        ArrayOfDPersonRequestExaminations response = client().personRequestExaminationsGet(sessionGUID, actualDate, languageId, personId);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonOlympiadsAwards getOlympiadAwards(String sessionGUID, String actualDate, int idLanguage, String personCodeU, int idPersonRequestSeasons) {
        ArrayOfDPersonOlympiadsAwards response = client().personOlympiadsAwardsGet(sessionGUID, actualDate, idLanguage, personCodeU, idPersonRequestSeasons);
        return handleResponse(response, sessionGUID);
    }
}
