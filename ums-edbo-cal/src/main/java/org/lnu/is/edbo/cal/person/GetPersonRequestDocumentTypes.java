package org.lnu.is.edbo.cal.person;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDPersonDocumentTypes;

public class GetPersonRequestDocumentTypes extends AbstractGetEdboCommand<ArrayOfDPersonDocumentTypes> {

    private String sessionGUID;
    private int idLanguage;
    private String actualDate;

    public GetPersonRequestDocumentTypes(String baseUrl, RestTemplate restTemplate) {
        super("GetPersonRequestDocumentTypes", baseUrl, ArrayOfDPersonDocumentTypes.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "Id_Language", String.valueOf(idLanguage));
        put(params, "ActualDate", actualDate);

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/persons/documents/types";
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
}
