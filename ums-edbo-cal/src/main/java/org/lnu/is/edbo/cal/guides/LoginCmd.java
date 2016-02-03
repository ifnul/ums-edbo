package org.lnu.is.edbo.cal.guides;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;

// todo: ivanursul: change to post http method
public class LoginCmd extends AbstractGetEdboCommand<String> {

    private String user;
    private String password;

    public LoginCmd(String baseUrl, RestTemplate restTemplate) {
        super("LoginCmd", baseUrl, String.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "User", user);
        put(params, "Password", password);

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/guides/login";
    }
}
