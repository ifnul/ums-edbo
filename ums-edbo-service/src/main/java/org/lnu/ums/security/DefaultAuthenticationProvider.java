package org.lnu.ums.security;

import org.lnu.ums.model.authentification.EdboAuthentication;
import org.lnu.ums.service.login.AuthentificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Default Authentication Provider.
 * @author ivanursul
 *
 */
@Component("edboAuthenticationProvider")
public class DefaultAuthenticationProvider implements AuthenticationProvider {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultAuthenticationProvider.class);

    @Resource(name = "edboAuthentificationService")
    private AuthentificationService edboAuthentificationService;

    @Override
    public boolean supports(final Class<?> clazz) {
    	return clazz.equals(UsernamePasswordAuthenticationToken.class);
    }

    @Override
    public Authentication authenticate(final Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();
        String password = authentication.getCredentials().toString();
        LOG.info(MessageFormat.format("Starting to authenticate edbo user with login: {0}", login));

        return getAuthentication(login, password);
    }

    private Authentication getAuthentication(final String login, final String password) {
        EdboAuthentication authentification = getEdboAuthentication(login, password);
        Collection<GrantedAuthority> authorities = getAuthorities();


        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(login, password, authorities);
        token.setDetails(authentification);

        return token;
    }

    private EdboAuthentication getEdboAuthentication(final String login, final String password) {
        EdboAuthentication auth = new EdboAuthentication();
        auth.setLogin(login);
        auth.setPassword(password);

        EdboAuthentication authentification = edboAuthentificationService.login(auth);

		return authentification;
	}

    private Collection<GrantedAuthority> getAuthorities() {
    	Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(""));
        return authorities;
    }

}
