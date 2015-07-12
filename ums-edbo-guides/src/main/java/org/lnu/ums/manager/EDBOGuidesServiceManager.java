package org.lnu.ums.manager;

import ua.edboservice.EDBOGuidesSoap;

/**
 * Service manager, that returns EDBOGuidesSoap Client.
 * @author ivanursul
 *
 */
public class EDBOGuidesServiceManager implements ServiceManager<EDBOGuidesSoap> {

	private EDBOGuidesSoap edboGuidesSoap;
	
	@Override
	public EDBOGuidesSoap getWebServiceClient() {
		return edboGuidesSoap;
	}

	public void setEdboGuidesSoap(final EDBOGuidesSoap edboGuidesSoap) {
		this.edboGuidesSoap = edboGuidesSoap;
	}

}
