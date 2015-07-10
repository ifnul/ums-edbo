package org.lnu.ums.manager;

import org.lnu.ums.exception.DisabledEDBOException;

/**
 * Web Service Manager for disabled contexts.
 * Will Throw exception if there will be disabled integration in the system.
 * @author ivanursul
 *
 * @param <WEBSERVICE> Web Service.
 */
//@Component("disabledWebServiceManager")
public class DisabledServiceManager<WEBSERVICE> implements ServiceManager<WEBSERVICE> {

	@Override
	public WEBSERVICE getWebServiceClient() {
		throw new DisabledEDBOException("EDBO integration is disabled");
	}

}
