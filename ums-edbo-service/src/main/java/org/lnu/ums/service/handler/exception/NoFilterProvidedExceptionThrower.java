package org.lnu.ums.service.handler.exception;

import org.lnu.ums.service.exception.NoFilterProvidedException;
import org.springframework.stereotype.Component;
import ua.edboservice.DLastError;

/**
 * Exception Thrower for No Filter Provided Exception.
 * @author ivanursul
 *
 */
@Component("noFilterProvidedExceptionThrower")
public class NoFilterProvidedExceptionThrower implements ExceptionThrower {

	@Override
	public void throwException(final DLastError error) {
		throw new NoFilterProvidedException("No Filter Provided", error.getLastErrorDescription(), error.getLastErrorCode());
	}

}
