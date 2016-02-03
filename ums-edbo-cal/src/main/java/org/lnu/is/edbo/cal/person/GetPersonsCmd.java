package org.lnu.is.edbo.cal.person;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDPersonsFind;

public class GetPersonsCmd extends AbstractGetEdboCommand<ArrayOfDPersonsFind> {

    private String sessionGUID;
    private int idLanguage;
    private String actualDate;
    private String fioMask;
    private String documentSeries;
    private String documentNumber;
    private String idsDocumentTypes;
    private int hundred;
    private String personCodeU;
    private String filters;

    public GetPersonsCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetPersonsCmd", baseUrl, ArrayOfDPersonsFind.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "Id_Language", String.valueOf(idLanguage));
        put(params, "ActualDate", actualDate);
        put(params, "fioMask", fioMask);
        put(params, "documentSeries", documentSeries);
        put(params, "documentNumber", documentNumber);
        put(params, "idsDocumentTypes", idsDocumentTypes);
        put(params, "hundred", String.valueOf(hundred));
        put(params, "personCodeU", personCodeU);
        put(params, "filters", filters);

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/persons";
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setDocumentSeries(String documentSeries) {
        this.documentSeries = documentSeries;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public void setFioMask(String fioMask) {
        this.fioMask = fioMask;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    public void setIdLanguage(int idLanguage) {
        this.idLanguage = idLanguage;
    }

    public void setIdsDocumentTypes(String idsDocumentTypes) {
        this.idsDocumentTypes = idsDocumentTypes;
    }

    public void setPersonCodeU(String personCodeU) {
        this.personCodeU = personCodeU;
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }
}
