package org.lnu.ums.service.person;

import org.lnu.ums.service.BaseEdboService;
import ua.edboservice.ArrayOfDPersonBenefits;
import ua.edboservice.ArrayOfDPersonDocumentTypes;
import ua.edboservice.ArrayOfDPersonRequestBenefits;
import ua.edboservice.ArrayOfDPersonRequestDocumentSubjects;
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

    public ArrayOfDPersonRequestDocumentSubjects getPersonDocumentSubjects(String sessionGUID, String actualDate, int languageId, int personId) {
        ArrayOfDPersonRequestDocumentSubjects response = client().personRequestDocumentSubjectsGet(sessionGUID, actualDate, languageId, personId);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDPersonRequestOlympiadsAwards getOlympiadAwards(String sessionGUID, String actualDate, int languageId, int personId) {
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
}
