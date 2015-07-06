package org.lnu.ums.service.language;


import org.lnu.ums.model.authentification.Authentication;

/**
 * Default implementation of language service.
 * Mocked with default id.
 * @author ivanursul
 *
 */
public class DefaultEdboLanguageService implements EdboLanguageService {

	private static final Integer DEFAULT_LANGUAGE = 1;

	@Override
	public Integer getDefaultLanguage(final Authentication authentification) {
		return DEFAULT_LANGUAGE;
	}

}
