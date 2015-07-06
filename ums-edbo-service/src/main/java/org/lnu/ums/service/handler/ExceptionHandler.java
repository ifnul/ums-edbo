package org.lnu.ums.service.handler;

/**
 * Interface, that declares method for handling
 * exceptions from edbo.
 * @author ivanursul
 *
 */
public interface ExceptionHandler {

	/**
	 * Method for handling.
	 * @param sessionGUID
	 */
	void handle(String sessionGUID);
	
}
