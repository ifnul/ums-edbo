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
    public ArrayOfDUniversityFacultetSpecialitiesSubjects2 getUniversityFacultySpecialtiesSubjects(@RequestParam(value = "SessionGUID", required = true) String sessionGUID,
                                                                                          @RequestParam(value = "Id_Language", required = true) int idLanguage,
                                                                                          @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                                                          @RequestParam(value = "UniversitySpecialitiesKode", required = false) String universitySpecialitiesKode) {
        return guidesService.getUniversityFacultySpecialtiesSubjects(sessionGUID, idLanguage, actualDate, universitySpecialitiesKode);
    }

    @RequestMapping("/faculties/specialties/quotas")
    public ArrayOfDUniversityFacultetSpecialitiesQuotas getUniversityFacultySpecialitiesQuotas(@RequestParam(value ="SessionGUID", required = true) String sessionGUID,
                                                                                               @RequestParam(value ="Id_Language", required = true) int idLanguage,
                                                                                               @RequestParam(value ="ActualDate", required = true) String actualDate,
                                                                                               @RequestParam(value ="UniversitySpecialitiesKode", required = false) String universitySpecialitiesKode,
                                                                                               @RequestParam(value ="Id_Quota", required = false, defaultValue = "0") int idQuota) {
        return guidesService.getUniversityFacultySpecialitiesQuotas(sessionGUID, idLanguage, actualDate, universitySpecialitiesKode, idQuota);
    }

    @RequestMapping("/logout")
    public String logout(@RequestParam(value = "SessionGUID", required = true) String sessionGUID) {
        return guidesService.logout(sessionGUID);
    }

    @RequestMapping("/languages")
    public ArrayOfDLanguages getLanguages(@RequestParam(value = "SessionGUID", required = true) String sessionGUID) {
        return guidesService.getLanguages(sessionGUID);
    }

    @RequestMapping("/faculties")
    public ArrayOfDUniversityFacultetsRequests2 getFacultiesRequests(@RequestParam(value = "SessionGUID", required = true) String sessionGUID,
                                                                     @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                                     @RequestParam(value = "Id_Language", required = true) int idLanguage,
                                                                     @RequestParam(value = "Id_PersonRequestSeasons", required = false) int idPersonRequestSeasons,
                                                                     @RequestParam(value = "UniversityFacultetKode", required = false) String universityFacultetKode,
                                                                     @RequestParam(value = "UniversitySpecialitiesKode", required = false) String universitySpecialitiesKode,
                                                                     @RequestParam(value = "PersonCodeU", required = false) String personCodeU,
                                                                     @RequestParam(value = "Hundred",required = false, defaultValue = "0") int hundred,
                                                                     @RequestParam(value = "MinDate", required = false) String minDate,
                                                                     @RequestParam(value = "Id_PersonRequestStatusType1",required = false) int idPersonRequestStatusType1,
                                                                     @RequestParam(value = "Id_PersonRequestStatusType2", required = false) int idPersonRequestStatusType2,
                                                                     @RequestParam(value = "Id_PersonRequestStatusType3", required = false) int idPersonRequestStatusType3,
                                                                     @RequestParam(value = "Id_PersonEducationForm", required = false) int idPersonEducationForm,
                                                                     @RequestParam(value = "UniversityKode", required = false) String universityKode,
                                                                     @RequestParam(value = "Id_Qualification", required = false) int idQualification,
                                                                     @RequestParam(value = "Filters", required = false) String filters) {
        return guidesService.getFaculties2(sessionGUID, idPersonRequestSeasons, universityFacultetKode, universitySpecialitiesKode, idLanguage, actualDate, personCodeU, hundred,
                minDate, idPersonRequestStatusType1, idPersonRequestStatusType2, idPersonRequestStatusType3, idPersonEducationForm, universityKode, idQualification, filters);
    }

    @RequestMapping("/spec/specializations")
    public ArrayOfDSpecSpecialization getSpecSpecializations(@RequestParam(value = "SessionGUID", required = true) String sessionGUID,
                                                             @RequestParam(value = "SpecDirectionsCode", required = false) String specDirectionsCode,
                                                             @RequestParam(value = "SpecSpecialityCode", required = false) String specSpecialityCode) {
        return guidesService.getSpecSpecializations(sessionGUID, specDirectionsCode, specSpecialityCode);
    }

    @RequestMapping("/universities")
    public ArrayOfDUniversities getUniversities(@RequestParam(value = "SessionGUID",required = true) String sessionGUID,
                                                @RequestParam(value = "Id_Language", required = true) int idLanguage,
                                                @RequestParam(value = "ActualDate", required = true) String actualDate,
                                                @RequestParam(value = "UniversityKode", required = false) String universityKode,
                                                @RequestParam(value = "UniversityName", required = false) String universityName) {
        return guidesService.getUniversities(sessionGUID, universityKode, idLanguage, actualDate, universityName);
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value = "User", required = true) String user,
                        @RequestParam(value = "Password", required = true) String password) {
        return guidesService.login(user, password);
    }

}
