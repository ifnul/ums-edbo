package org.lnu.ums.service.login;


import org.lnu.ums.model.authentification.Authentication;

/**
 * Interface, that describes login functionality.
 * @author ivanursul
 *
 */
public interface AuthentificationService {

	/**
	 * Method for authentification session in EDBO service.
	 * This method will return object with key field - sessionGUID.
	 * @param authentification
	 * @return authentification object with all required params.
	 */
    Authentication login(Authentication authentification);
	
	/**
	 * Method for logouting from system.
	 * @param authentication
	 */
	void logout(Authentication authentication);
	
}
