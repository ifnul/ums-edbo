package org.lnu.is.edbo.cal.guides;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDUniversityFacultetSpecialitiesQuotas;

public class GetUniversityFacultySpecialitiesQuotasCmd extends AbstractGetEdboCommand<ArrayOfDUniversityFacultetSpecialitiesQuotas> {

    private String sessionGUID;
    private int idLanguage;
    private String actualDate;
    private String universitySpecialitiesKode;
    private String idQuota;

    public GetUniversityFacultySpecialitiesQuotasCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetUniversityFacultySpecialitiesQuotasCmd", baseUrl, ArrayOfDUniversityFacultetSpecialitiesQuotas.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "Id_Language", String.valueOf(idLanguage));
        put(params, "ActualDate", actualDate);
        put(params, "UniversitySpecialitiesKode", universitySpecialitiesKode);
        put(params, "Id_Quota", idQuota);

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/guides/faculties/specialties/quotas";
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public void setIdLanguage(int idLanguage) {
        this.idLanguage = idLanguage;
    }

    public void setIdQuota(String idQuota) {
        this.idQuota = idQuota;
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }

    public void setUniversitySpecialitiesKode(String universitySpecialitiesKode) {
        this.universitySpecialitiesKode = universitySpecialitiesKode;
    }
}
