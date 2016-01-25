package org.lnu.ums.service.guides;

import org.lnu.ums.service.BaseEdboService;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialities;
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
}
