package org.lnu.ums.service.login;

import org.lnu.ums.model.authentification.EdboAuthentication;
import org.lnu.ums.service.BaseEdboService;
import org.springframework.stereotype.Service;
import ua.edboservice.EDBOGuidesSoap;

/**
 * Service for loggin into edbo system.
 * @author ivanursul
 *
 */
public class DefaultAuthentificationService extends BaseEdboService<EDBOGuidesSoap> implements AuthentificationService {

	@Override
	public EdboAuthentication login(final EdboAuthentication auth) {
		EDBOGuidesSoap client = getServiceManager().getWebServiceClient();
		
		String sessionGuid = client.login(auth.getLogin(), auth.getPassword(), getClearPreviousSession(), getApplicationKey());
		String login = auth.getLogin();
		String password = auth.getPassword();
		
		return new EdboAuthentication(login, password, getApplicationKey(), getClearPreviousSession(), sessionGuid);
	}

	@Override
	public void logout(final EdboAuthentication authentification) {
		EDBOGuidesSoap client = getServiceManager().getWebServiceClient();
		client.logout(authentification.getSessionGUID());
	}

}
