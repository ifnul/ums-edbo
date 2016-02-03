package org.lnu.is.edbo.cal.guides;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;

// todo: ivanursul: Change to DELETE http method
public class LogoutCmd extends AbstractGetEdboCommand<String> {

    private String sessionGUID;

    public LogoutCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetUniversityFacultySpecialtiesCmd", baseUrl, String.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();
        put(params, "SessionGUID", sessionGUID);
        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/guides/logout";
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }
}
