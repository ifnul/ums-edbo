package org.lnu.ums.service;


import org.lnu.ums.manager.ServiceManager;
import org.lnu.ums.service.handler.ExceptionHandler;

/**
 * Abstract class for storing ServiceManager.
 * @author ivanursul
 *
 * @param <WEBSERVICE> web service class.
 */
public class BaseEdboService<WEBSERVICE> {

	private ServiceManager<WEBSERVICE> serviceManager;

	private String applicationKey;

	private Integer clearPreviousSession;

	private ExceptionHandler exceptionHandler;
	
	public ServiceManager<WEBSERVICE> getServiceManager() {
		return serviceManager;
	}

	public void setServiceManager(final ServiceManager<WEBSERVICE> serviceManager) {
		this.serviceManager = serviceManager;
	}

	public String getApplicationKey() {
		return applicationKey;
	}

	public void setApplicationKey(final String applicationKey) {
		this.applicationKey = applicationKey;
	}

	public Integer getClearPreviousSession() {
		return clearPreviousSession;
	}

	public void setClearPreviousSession(final Integer clearPreviousSession) {
		this.clearPreviousSession = clearPreviousSession;
	}

	public void setExceptionHandler(ExceptionHandler exceptionHandler) {
		this.exceptionHandler = exceptionHandler;
	}

	public <T> T handleResponse(T response, String sessionGUID) {
		if (response == null) {
			//exceptionHandler.handle(sessionGUID);
			// todo: Write exception handler.
			throw new RuntimeException("Null response from EDEBO");
		}

		return response;
	}

	public WEBSERVICE client() {
		return serviceManager.getWebServiceClient();
	}
	
}
