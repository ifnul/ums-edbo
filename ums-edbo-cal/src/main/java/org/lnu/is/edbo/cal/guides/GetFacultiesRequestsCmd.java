package org.lnu.is.edbo.cal.guides;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDUniversityFacultetsRequests2;

public class GetFacultiesRequestsCmd extends AbstractGetEdboCommand<ArrayOfDUniversityFacultetsRequests2> {

    private String sessionGUID;
    private int idLanguage;
    private String actualDate;
    private int idPersonRequestSeasons;
    private String universitySpecialitiesKode;
    private String personCodeU;
    private int hundred;
    private String minDate;
    private int idPersonRequestStatusType1;
    private int idPersonRequestStatusType2;
    private int idPersonRequestStatusType3;
    private int idPersonEducationForm;
    private String universityKode;
    private int idQualification;
    private String filters;

    public GetFacultiesRequestsCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetFacultiesRequestsCmd", baseUrl, ArrayOfDUniversityFacultetsRequests2.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "Id_Language", String.valueOf(idLanguage));
        put(params, "Id_PersonRequestSeasons", String.valueOf(idPersonRequestSeasons));
        put(params, "UniversitySpecialitiesKode", universitySpecialitiesKode);
        put(params, "PersonCodeU", personCodeU);
        put(params, "Hundred", String.valueOf(hundred));
        put(params, "MinDate", minDate);
        put(params, "Id_PersonRequestStatusType1", String.valueOf(idPersonRequestStatusType1));
        put(params, "Id_PersonRequestStatusType2", String.valueOf(idPersonRequestStatusType2));
        put(params, "Id_PersonRequestStatusType3", String.valueOf(idPersonRequestStatusType3));
        put(params, "Id_PersonEducationForm", String.valueOf(idPersonEducationForm));
        put(params, "UniversityKode", universityKode);
        put(params, "Id_Qualification", String.valueOf(idQualification));
        put(params, "Filters", filters);

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/guides/faculties";
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
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

    public void setIdPersonRequestStatusType1(int idPersonRequestStatusType1) {
        this.idPersonRequestStatusType1 = idPersonRequestStatusType1;
    }

    public void setIdPersonRequestStatusType2(int idPersonRequestStatusType2) {
        this.idPersonRequestStatusType2 = idPersonRequestStatusType2;
    }

    public void setIdPersonRequestStatusType3(int idPersonRequestStatusType3) {
        this.idPersonRequestStatusType3 = idPersonRequestStatusType3;
    }

    public void setIdQualification(int idQualification) {
        this.idQualification = idQualification;
    }

    public void setMinDate(String minDate) {
        this.minDate = minDate;
    }

    public void setPersonCodeU(String personCodeU) {
        this.personCodeU = personCodeU;
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }

    public void setUniversityKode(String universityKode) {
        this.universityKode = universityKode;
    }

    public void setUniversitySpecialitiesKode(String universitySpecialitiesKode) {
        this.universitySpecialitiesKode = universitySpecialitiesKode;
    }
}
