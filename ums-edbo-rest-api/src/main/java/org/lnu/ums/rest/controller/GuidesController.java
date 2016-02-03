package org.lnu.ums.rest.controller;

import org.lnu.ums.rest.model.Constants;
import org.lnu.ums.service.guides.GuidesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.edboservice.ArrayOfDLanguages;
import ua.edboservice.ArrayOfDSpecSpecialization;
import ua.edboservice.ArrayOfDUniversities;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialities;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialitiesQuotas;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialitiesSubjects2;
import ua.edboservice.ArrayOfDUniversityFacultetsRequests2;

import javax.annotation.Resource;

@RestController
@RequestMapping(Constants.API_URL + "/guides")
public class GuidesController extends BaseController {

    @Resource
    public GuidesService guidesService;

    @RequestMapping("/faculties/specialties")
    public ArrayOfDUniversityFacultetSpecialities getUniversityFacultySpecialties(@RequestParam(value ="SessionGUID", required = true) String sessionGUID,
                                                                                  @RequestParam(value ="Id_Language", required = true) int idLanguage,
                                                                                  @RequestParam(value ="ActualDate", required = true) String actualDate,
                                                                                  @RequestParam(value ="UniversityKode", required = false) String universityKode,
                                                                                  @RequestParam(value ="UniversityFacultetKode", required = false) String universityFacultetKode,
                                                                                  @RequestParam(value ="SpecCode", required = false) String specCode,
                                                                                  @RequestParam(value ="Id_PersonRequestSeasons", required = false, defaultValue = "0") int idPersonRequestSeasons,
                                                                                  @RequestParam(value ="Id_PersonEducationForm", required = false, defaultValue = "0") int idPersonEducationForm,
                                                                                  @RequestParam(value ="UniversitySpecialitiesKode", required = false) String universitySpecialitiesKode,
                                                                                  @RequestParam(value ="SpecDirectionsCode", required = false) String specDirectionsCode,
                                                                                  @RequestParam(value ="SpecSpecialityCode", required = false) String specSpecialityCode,
                                                                                  @RequestParam(value ="Filters", required = false) String filters) {
        return guidesService.getUniversityFacultySpecialties(sessionGUID, universityKode, universityFacultetKode,
                specCode, idLanguage, actualDate, idPersonRequestSeasons, idPersonEducationForm,
                universitySpecialitiesKode, specDirectionsCode, specSpecialityCode, filters);
    }

    @RequestMapping("/faculties/subjects")
    public ArrayOfDUniversityFacultetSpecialitiesSubjects2 getUniversityFacultySpecialtiesSubjects(@RequestParam("SessionGUID") String sessionGUID,
                                                                                          @RequestParam("Id_Language") int idLanguage,
                                                                                          @RequestParam("ActualDate") String actualDate,
                                                                                          @RequestParam("UniversitySpecialitiesKode") String universitySpecialitiesKode) {
        return guidesService.getUniversityFacultySpecialtiesSubjects(sessionGUID, idLanguage, actualDate, universitySpecialitiesKode);
    }

    @RequestMapping("/faculties/specialties/quotas")
    public ArrayOfDUniversityFacultetSpecialitiesQuotas getUniversityFacultySpecialitiesQuotas(@RequestParam(value ="SessionGUID") String sessionGUID,
                                                                                               @RequestParam(value ="Id_Language") int idLanguage,
                                                                                               @RequestParam(value ="ActualDate") String actualDate,
                                                                                               @RequestParam(value ="UniversitySpecialitiesKode") String universitySpecialitiesKode,
                                                                                               @RequestParam(value ="Id_Quota") int idQuota) {
        return guidesService.getUniversityFacultySpecialitiesQuotas(sessionGUID, idLanguage, actualDate, universitySpecialitiesKode, idQuota);
    }

    @RequestMapping("/logout")
    public String logout(@RequestParam("SessionGUID") String sessionGUID) {
        return guidesService.logout(sessionGUID);
    }

    @RequestMapping("/languages")
    public ArrayOfDLanguages getLanguages(@RequestParam("SessionGUID") String sessionGUID) {
        return guidesService.getLanguages(sessionGUID);
    }

    @RequestMapping("/faculties")
    public ArrayOfDUniversityFacultetsRequests2 getFaculties2(@RequestParam("SessionGUID") String sessionGUID,
                                                              @RequestParam("Id_PersonRequestSeasons") int idPersonRequestSeasons,
                                                              @RequestParam("UniversityFacultetKode") String universityFacultetKode,
                                                              @RequestParam("UniversitySpecialitiesKode") String universitySpecialitiesKode,
                                                              @RequestParam("Id_Language") int idLanguage,
                                                              @RequestParam("ActualDate") String actualDate,
                                                              @RequestParam("PersonCodeU") String personCodeU,
                                                              @RequestParam("Hundred") int hundred,
                                                              @RequestParam("MinDate") String minDate,
                                                              @RequestParam("Id_PersonRequestStatusType1") int idPersonRequestStatusType1,
                                                              @RequestParam("Id_PersonRequestStatusType2") int idPersonRequestStatusType2,
                                                              @RequestParam("Id_PersonRequestStatusType3") int idPersonRequestStatusType3,
                                                              @RequestParam("Id_PersonEducationForm") int idPersonEducationForm,
                                                              @RequestParam("UniversityKode") String universityKode,
                                                              @RequestParam("Id_Qualification") int idQualification,
                                                              @RequestParam("Filters") String filters) {
        return guidesService.getFaculties2(sessionGUID, idPersonRequestSeasons, universityFacultetKode, universitySpecialitiesKode, idLanguage, actualDate, personCodeU, hundred,
                minDate, idPersonRequestStatusType1, idPersonRequestStatusType2, idPersonRequestStatusType3, idPersonEducationForm, universityKode, idQualification, filters);
    }

    @RequestMapping("/spec/specializations")
    public ArrayOfDSpecSpecialization getSpecSpecializations(@RequestParam("SessionGUID") String sessionGUID,
                                                             @RequestParam("SpecDirectionsCode") String specDirectionsCode,
                                                             @RequestParam("SpecSpecialityCode") String specSpecialityCode) {
        return guidesService.getSpecSpecializations(sessionGUID, specDirectionsCode, specSpecialityCode);
    }

    @RequestMapping("/universities")
    public ArrayOfDUniversities getUniversities(@RequestParam("SessionGUID") String sessionGUID,
                                                @RequestParam("UniversityKode") String universityKode,
                                                @RequestParam("Id_Language") int idLanguage,
                                                @RequestParam("ActualDate") String actualDate,
                                                @RequestParam("UniversityName") String universityName) {
        return guidesService.getUniversities(sessionGUID, universityKode, idLanguage, actualDate, universityName);
    }

    @RequestMapping("/login")
    public String login(@RequestParam("User") String user, @RequestParam("Password") String password) {
        return guidesService.login(user, password);
    }

}
