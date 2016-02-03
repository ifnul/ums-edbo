package org.lnu.is.edbo.cal.person;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDPersonDocumentsSubjects;

public class GetPersonDocumentSubjectsCmd extends AbstractGetEdboCommand<ArrayOfDPersonDocumentsSubjects> {

    private String sessionGUID;
    private int idLanguage;
    private String actualDate;
    private int personId;
    private int personDocumentId;
    private int personDocumentTypeId;

    public GetPersonDocumentSubjectsCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetPersonDocumentSubjectsCmd", baseUrl, ArrayOfDPersonDocumentsSubjects.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "Id_Language", String.valueOf(idLanguage));
        put(params, "ActualDate", actualDate);
        put(params, "Id_PersonRequest", String.valueOf(personId));
        put(params, "Id_dPersonDocument", String.valueOf(personDocumentId));
        put(params, "Id_PersonDocumentType", String.valueOf(personDocumentTypeId));

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/persons/documents/subjects";
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public void setIdLanguage(int idLanguage) {
        this.idLanguage = idLanguage;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }
}
