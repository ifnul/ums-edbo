package org.lnu.ums.service.login;

import org.lnu.ums.model.authentification.Authentication;
import org.lnu.ums.service.BaseEdboService;
import ua.edboservice.EDBOGuidesSoap;

/**
 * Service for loggin into edbo system.
 * @author ivanursul
 *
 */
public class DefaultAuthentificationService extends BaseEdboService<EDBOGuidesSoap> implements AuthentificationService {

	@Override
	public Authentication login(final Authentication auth) {
		EDBOGuidesSoap client = getServiceManager().getWebServiceClient();
		
		String sessionGuid = client.login(auth.getLogin(), auth.getPassword(), getClearPreviousSession(), getApplicationKey());
		String login = auth.getLogin();
		String password = auth.getPassword();
		
		return new Authentication(login, password, getApplicationKey(), getClearPreviousSession(), sessionGuid);
	}

	@Override
	public void logout(final Authentication authentification) {
		EDBOGuidesSoap client = getServiceManager().getWebServiceClient();
		client.logout(authentification.getSessionGUID());
	}

}
