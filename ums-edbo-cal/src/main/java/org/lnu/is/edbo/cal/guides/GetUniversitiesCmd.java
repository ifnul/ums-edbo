package org.lnu.is.edbo.cal.guides;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDUniversities;

public class GetUniversitiesCmd extends AbstractGetEdboCommand<ArrayOfDUniversities> {

    private String sessionGUID;
    private int idLanguage;
    private String actualDate;
    private String universityKode;
    private String universityName;

    public GetUniversitiesCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetUniversitiesCmd", baseUrl, ArrayOfDUniversities.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "Id_Language", String.valueOf(idLanguage));
        put(params, "ActualDate", actualDate);
        put(params, "UniversityKode", universityKode);
        put(params, "UniversityName", universityName);

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/guides/universities";
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

    public void setUniversityKode(String universityKode) {
        this.universityKode = universityKode;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
