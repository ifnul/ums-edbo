package org.lnu.ums.rest.controller;

import org.lnu.ums.rest.model.Constants;
import org.lnu.ums.service.guides.GuidesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialities;

import javax.annotation.Resource;

@RestController
@RequestMapping(Constants.API_URL + "/guides")
public class GuidesController extends BaseController {

    @Resource
    public GuidesService guidesService;

    @RequestMapping("/faculties/specialties")
    public ArrayOfDUniversityFacultetSpecialities getUniversityFacultySpecialties(@RequestParam(value ="SessionGUID") String sessionGUID,
                                                                                  @RequestParam(value ="UniversityKode") String universityKode,
                                                                                  @RequestParam(value ="UniversityFacultetKode") String universityFacultetKode,
                                                                                  @RequestParam(value ="SpecCode") String specCode,
                                                                                  @RequestParam(value ="Id_Language") int idLanguage,
                                                                                  @RequestParam(value ="ActualDate") String actualDate,
                                                                                  @RequestParam(value ="Id_PersonRequestSeasons") int idPersonRequestSeasons,
                                                                                  @RequestParam(value ="Id_PersonEducationForm") int idPersonEducationForm,
                                                                                  @RequestParam(value ="UniversitySpecialitiesKode") String universitySpecialitiesKode,
                                                                                  @RequestParam(value ="SpecDirectionsCode") String specDirectionsCode,
                                                                                  @RequestParam(value ="SpecSpecialityCode") String specSpecialityCode,
                                                                                  @RequestParam(value ="Filters") String filters) {
        return guidesService.getUniversityFacultySpecialties(sessionGUID, universityKode, universityFacultetKode,
                specCode, idLanguage, actualDate, idPersonRequestSeasons, idPersonEducationForm,
                universitySpecialitiesKode, specDirectionsCode, specSpecialityCode, filters);
    }

}
