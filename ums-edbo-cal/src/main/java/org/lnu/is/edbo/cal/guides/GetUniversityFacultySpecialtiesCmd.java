package org.lnu.is.edbo.cal.guides;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialities;

public class GetUniversityFacultySpecialtiesCmd extends AbstractGetEdboCommand<ArrayOfDUniversityFacultetSpecialities> {

    private String sessionGUID;
    private int idLanguage;
    private String actualDate;
    private String universityKode;
    private String universityFacultetKode;
    private String specCode;
    private int idPersonRequestSeasons;
    private int idPersonEducationForm;
    private String universitySpecialitiesKode;
    private String specDirectionsCode;
    private String specSpecialityCode;
    private String filters;

    public GetUniversityFacultySpecialtiesCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetUniversityFacultySpecialtiesCmd", baseUrl, ArrayOfDUniversityFacultetSpecialities.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "UniversityKode", universityKode);
        put(params, "UniversityFacultetKode", universityFacultetKode);
        put(params, "SpecCode", specCode);
        put(params, "Id_Language", String.valueOf(idLanguage));
        put(params, "ActualDate", actualDate);
        put(params, "Id_PersonRequestSeasons", String.valueOf(idPersonRequestSeasons));
        put(params, "Id_PersonEducationForm", String.valueOf(idPersonEducationForm));
        put(params, "UniversitySpecialitiesKode", universitySpecialitiesKode);
        put(params, "SpecDirectionsCode", specDirectionsCode);
        put(params, "SpecSpecialityCode", specSpecialityCode);
        put(params, "Filters", filters);

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/guides/faculties/specialties";
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public void setIdLanguage(int idLanguage) {
        this.idLanguage = idLanguage;
    }

    public void setIdPersonEducationForm(int idPersonEducationForm) {
        this.idPersonEducationForm = idPersonEducationForm;
    }

    public void setIdPersonRequestSeasons(int idPersonRequestSeasons) {
        this.idPersonRequestSeasons = idPersonRequestSeasons;
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public void setSpecDirectionsCode(String specDirectionsCode) {
        this.specDirectionsCode = specDirectionsCode;
    }

    public void setSpecSpecialityCode(String specSpecialityCode) {
        this.specSpecialityCode = specSpecialityCode;
    }

    public void setUniversityFacultetKode(String universityFacultetKode) {
        this.universityFacultetKode = universityFacultetKode;
    }

    public void setUniversityKode(String universityKode) {
        this.universityKode = universityKode;
    }

    public void setUniversitySpecialitiesKode(String universitySpecialitiesKode) {
        this.universitySpecialitiesKode = universitySpecialitiesKode;
    }
}
