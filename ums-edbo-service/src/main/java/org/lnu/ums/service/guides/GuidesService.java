package org.lnu.ums.service.guides;

import org.lnu.ums.service.BaseEdboService;
import ua.edboservice.ArrayOfDLanguages;
import ua.edboservice.ArrayOfDSpecSpecialization;
import ua.edboservice.ArrayOfDUniversities;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialities;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialitiesQuotas;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialitiesSubjects2;
import ua.edboservice.ArrayOfDUniversityFacultetsRequests2;
import ua.edboservice.EDBOGuidesSoap;

public class GuidesService extends BaseEdboService<EDBOGuidesSoap> {

    public ArrayOfDUniversityFacultetSpecialities getUniversityFacultySpecialties(String sessionGUID, String universityKode, String universityFacultetKode,
                                                                                  String specCode, int idLanguage, String actualDate, int idPersonRequestSeasons,
                                                                                  int idPersonEducationForm, String universitySpecialitiesKode,
                                                                                  String specDirectionsCode, String specSpecialityCode, String filters) {
        ArrayOfDUniversityFacultetSpecialities response = client().universityFacultetSpecialitiesGet(sessionGUID, universityKode, universityFacultetKode, specCode, idLanguage, actualDate, idPersonRequestSeasons,
                idPersonEducationForm, universitySpecialitiesKode, specDirectionsCode, specSpecialityCode, filters);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDUniversityFacultetSpecialitiesQuotas getUniversityFacultySpecialitiesQuotas(String sessionGUID, int idLanguage, String actualDate, String universitySpecialitiesKode, int idQuota) {
        ArrayOfDUniversityFacultetSpecialitiesQuotas response = client().universityFacultetSpecialitiesQuotasGet(sessionGUID, idLanguage, actualDate, universitySpecialitiesKode, idQuota);
        return handleResponse(response, sessionGUID);
    }

    public String logout(String sessionGUID) {
        String response = client().logout(sessionGUID);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDLanguages getLanguages(String sessionGUID) {
        ArrayOfDLanguages response = client().languagesGet(sessionGUID);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDUniversityFacultetsRequests2 getFaculties2(String sessionGUID, int idPersonRequestSeasons, String universityFacultetKode, String universitySpecialitiesKode,
                                                              int idLanguage, String actualDate, String personCodeU, int hundred, String minDate, int idPersonRequestStatusType1, int idPersonRequestStatusType2,
                                                              int idPersonRequestStatusType3, int idPersonEducationForm, String universityKode, int idQualification, String filters) {
        ArrayOfDUniversityFacultetsRequests2 response = client().universityFacultetsGetRequests2(sessionGUID, idPersonRequestSeasons, universityFacultetKode, universitySpecialitiesKode, idLanguage, actualDate,
                personCodeU, hundred, minDate, idPersonRequestStatusType1, idPersonRequestStatusType2, idPersonRequestStatusType3, idPersonEducationForm, universityKode, idQualification, filters);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDSpecSpecialization getSpecSpecializations(String sessionGUID, String specDirectionsCode, String specSpecialityCode) {
        ArrayOfDSpecSpecialization response = client().specSpecializationFind(sessionGUID, specDirectionsCode, specSpecialityCode);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDUniversities getUniversities(String sessionGUID, String universityKode, int idLanguage, String actualDate, String universityName) {
        ArrayOfDUniversities response = client().universitiesGet(sessionGUID, universityKode, idLanguage, actualDate, universityName);
        return handleResponse(response, sessionGUID);
    }

    public ArrayOfDUniversityFacultetSpecialitiesSubjects2 getUniversityFacultySpecialtiesSubjects(String sessionGUID, int idLanguage, String actualDate, String universitySpecialitiesKode) {
        ArrayOfDUniversityFacultetSpecialitiesSubjects2 response = client().universityFacultetSpecialitiesSubjectsGet2(sessionGUID, idLanguage, actualDate, universitySpecialitiesKode);
        return handleResponse(response, sessionGUID);
    }

    public String login(String user, String password) {
        String response = client().login(user, password, getClearPreviousSession(), getApplicationKey());
        return handleResponse(response, "");
    }
}
