package org.lnu.ums.service.language;

import org.lnu.ums.model.authentification.Authentication;

/**
 * Interface for Languages in EDBO.
 * @author ivanursul
 *
 */
public interface EdboLanguageService {

	/**
	 * Method for getting default language.
	 * @param authentification
	 * @return default language id.
	 */
	Integer getDefaultLanguage(Authentication authentification);

}
