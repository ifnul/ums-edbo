package org.lnu.is.edbo.cal.person;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDPersonOlympiadsAwards;

public class GetPersonOlympiadAwards extends AbstractGetEdboCommand<ArrayOfDPersonOlympiadsAwards> {

    private String sessionGUID;
    private String actualDate;
    private int languageId;
    private String personCodeU;
    private int idPersonRequestSeasons;

    public GetPersonOlympiadAwards(String baseUrl, RestTemplate restTemplate) {
        super("GetPersonOlympiadAwards", baseUrl, ArrayOfDPersonOlympiadsAwards.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "Id_Language", String.valueOf(languageId));
        put(params, "ActualDate", actualDate);
        put(params, "PersonCodeU", personCodeU);
        put(params, "Id_PersonRequestSeasons", String.valueOf(idPersonRequestSeasons));

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/persons/olympiads/awards";
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public void setIdPersonRequestSeasons(int idPersonRequestSeasons) {
        this.idPersonRequestSeasons = idPersonRequestSeasons;
    }

    public void setPersonCodeU(String personCodeU) {
        this.personCodeU = personCodeU;
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }
}
