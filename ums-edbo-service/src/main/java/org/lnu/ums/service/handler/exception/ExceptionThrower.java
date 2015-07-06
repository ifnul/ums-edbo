package org.lnu.ums.service.handler.exception;

import ua.edboservice.DLastError;

/**
 * Interface for throwing exceptions.
 * @author ivanursul
 *
 */
public interface ExceptionThrower {

	/**
	 * Method for throwing org.lnu.ums.service.exception.
	 * @param error
	 */
	void throwException(DLastError error);

}
