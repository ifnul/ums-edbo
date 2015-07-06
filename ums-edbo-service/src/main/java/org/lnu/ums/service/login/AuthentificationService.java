package org.lnu.ums.service.login;

import org.is.lnu.edbo.model.authentification.EdboAuthentification;

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
	EdboAuthentification login(EdboAuthentification authentification);
	
	/**
	 * Method for logouting from system.
	 * @param authentification
	 */
	void logout(EdboAuthentification authentification);
	
}
