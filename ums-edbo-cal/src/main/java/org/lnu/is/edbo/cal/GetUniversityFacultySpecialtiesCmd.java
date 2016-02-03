package org.lnu.is.edbo.cal;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialities;

public class GetUniversityFacultySpecialtiesCmd extends AbstractGetEdboCommand<ArrayOfDUniversityFacultetSpecialities> {

    private String sessionGUID;
    private String universityKode;
    private String universityFacultetKode;
    private String specCode;
    private int idLanguage;
    private String actualDate;
    private int idPersonRequestSeasons;
    private int idPersonEducationForm;
    private String universitySpecialitiesKode;
    private String specDirectionsCode;
    private String specSpecialityCode;
    private String filters;

    public GetUniversityFacultySpecialtiesCmd(String baseUrl, RestTemplate restTemplate,
                                              String sessionGUID, String universityKode,
                                              String universityFacultetKode, String specCode,
                                              int idLanguage, String actualDate,
                                              int idPersonRequestSeasons, int idPersonEducationForm,
                                              String universitySpecialitiesKode, String specDirectionsCode,
                                              String specSpecialityCode, String filters) {
        super("GetUniversityFacultySpecialtiesCmd", baseUrl, ArrayOfDUniversityFacultetSpecialities.class, restTemplate);
        this.sessionGUID = sessionGUID;
        this.universityKode = universityKode;
        this.universityFacultetKode = universityFacultetKode;
        this.specCode = specCode;
        this.idLanguage = idLanguage;
        this.actualDate = actualDate;
        this.idPersonRequestSeasons = idPersonRequestSeasons;
        this.idPersonEducationForm = idPersonEducationForm;
        this.universitySpecialitiesKode = universitySpecialitiesKode;
        this.specDirectionsCode = specDirectionsCode;
        this.specSpecialityCode = specSpecialityCode;
        this.filters = filters;
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        params.put("SessionGUID", sessionGUID);
        params.put("UniversityKode", universityKode);
        params.put("UniversityFacultetKode", universityFacultetKode);
        params.put("SpecCode", specCode);
        params.put("Id_Language", String.valueOf(idLanguage));
        params.put("ActualDate", actualDate);
        params.put("Id_PersonRequestSeasons", String.valueOf(idPersonRequestSeasons));
        params.put("Id_PersonEducationForm", String.valueOf(idPersonEducationForm));
        params.put("UniversitySpecialitiesKode", universitySpecialitiesKode);
        params.put("SpecDirectionsCode", specDirectionsCode);
        params.put("SpecSpecialityCode", specSpecialityCode);
        params.put("Filters", filters);

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/guides/faculties/specialties";
    }
}
