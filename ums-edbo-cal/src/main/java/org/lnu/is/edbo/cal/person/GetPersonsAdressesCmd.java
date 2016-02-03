package org.lnu.is.edbo.cal.person;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDPersonAddresses2;

public class GetPersonsAdressesCmd extends AbstractGetEdboCommand<ArrayOfDPersonAddresses2> {

    private String sessionGUID;
    private String actualDate;
    private int languageId;
    private String personCodeU;
    private int personAddressId;

    public GetPersonsAdressesCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetPersonsAdressesCmd", baseUrl, ArrayOfDPersonAddresses2.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "Id_Language", String.valueOf(languageId));
        put(params, "ActualDate", actualDate);
        put(params, "PersonCodeU", personCodeU);
        put(params, "Id_PersonAddress", String.valueOf(personAddressId));

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/persons/addresses";
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public void setPersonAddressId(int personAddressId) {
        this.personAddressId = personAddressId;
    }

    public void setPersonCodeU(String personCodeU) {
        this.personCodeU = personCodeU;
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }
}
