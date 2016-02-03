package org.lnu.is.edbo.cal;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDLanguages;

public class GetLanguagesCmd extends AbstractGetEdboCommand<ArrayOfDLanguages> {

    private String sessionGUID;

    public GetLanguagesCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetLanguagesCmd", baseUrl, ArrayOfDLanguages.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();
        put(params, "SessionGUID", sessionGUID);
        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/guides/languages";
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }
}
