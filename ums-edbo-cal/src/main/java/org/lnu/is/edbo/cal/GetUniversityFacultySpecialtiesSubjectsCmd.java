package org.lnu.is.edbo.cal;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialitiesSubjects2;

public class GetUniversityFacultySpecialtiesSubjectsCmd extends AbstractGetEdboCommand<ArrayOfDUniversityFacultetSpecialitiesSubjects2> {

    private String sessionGUID;
    private int idLanguage;
    private String actualDate;
    private String universitySpecialitiesKode;

    public GetUniversityFacultySpecialtiesSubjectsCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetUniversityFacultySpecialtiesCmd", baseUrl, ArrayOfDUniversityFacultetSpecialitiesSubjects2.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "Id_Language", String.valueOf(idLanguage));
        put(params, "ActualDate", actualDate);
        put(params, "UniversitySpecialitiesKode", universitySpecialitiesKode);

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/guides/faculties/subjects";
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public void setIdLanguage(int idLanguage) {
        this.idLanguage = idLanguage;
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }

    public void setUniversitySpecialitiesKode(String universitySpecialitiesKode) {
        this.universitySpecialitiesKode = universitySpecialitiesKode;
    }
}
