package org.lnu.ums.service.handler;

import org.lnu.ums.service.handler.exception.ExceptionThrower;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ua.edboservice.EDBOPersonSoap;

import java.util.Map;

/**
 * Exception Handler for Person edbo.
 * @author ivanursul
 *
 */
@Component("edboPersonExceptionHandler")
public class DefaultExceptionHandler extends BaseExceptionHandler<EDBOPersonSoap> {
	private static final String NO_THROWER_MESSAGE = "There is no org.lnu.ums.service.handler for this type of edbo error code. Please, contact dev team with information about: errorCode:{0} , message: {1}";

	private static final Logger LOG = LoggerFactory.getLogger(DefaultExceptionHandler.class);

	private Map<Integer, ExceptionThrower> exceptionThrowers;
	
	@Override
	public void handle(final String sessionGUID) {
		/* // todo: fix after appropriate dependencies will be fadded
		EDBOPersonSoap client = getServiceManager().getWebServiceClient();
		ArrayOfDLastError lastError = client.getLastError(sessionGUID);
		
		for (DLastError error: lastError.getDLastError()) {
			LOG.error(MessageFormat.format("{0} {1}", error.getLastErrorDescription(), error.getLastErrorCode()));
			
			ExceptionThrower thrower = exceptionThrowers.get(error.getLastErrorCode());
			
			if (thrower == null) {
				throw new UnsupportedOperationException(MessageFormat.format(NO_THROWER_MESSAGE, error.getLastErrorCode(), error.getLastErrorDescription()));
			}
			
			thrower.throwException(error);
		}
		*/
	}

	public void setExceptionThrowers(final Map<Integer, ExceptionThrower> exceptionThrowers) {
		this.exceptionThrowers = exceptionThrowers;
	}

}
