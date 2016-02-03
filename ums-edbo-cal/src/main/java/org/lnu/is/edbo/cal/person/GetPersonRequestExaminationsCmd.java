package org.lnu.is.edbo.cal.person;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDPersonRequestExaminations;

public class GetPersonRequestExaminationsCmd extends AbstractGetEdboCommand<ArrayOfDPersonRequestExaminations> {

    private String sessionGUID;
    private int idLanguage;
    private String actualDate;
    private int personId;

    public GetPersonRequestExaminationsCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetPersonRequestExaminationsCmd", baseUrl, ArrayOfDPersonRequestExaminations.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "Id_Language", String.valueOf(idLanguage));
        put(params, "ActualDate", actualDate);
        put(params, "Id_PersonRequest", String.valueOf(personId));

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/persons/examinations";
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
