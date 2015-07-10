package org.lnu.ums.facade.person;

import org.lnu.ums.resource.person.EdboPersonResource;
import org.lnu.ums.resource.person.PersonResource;

/**
 * Interface for describing requests for edbo person.
 * @author ivanursul
 *
 */
public interface EntrantFacade {

	/**
	 * Method for creating applicant.
	 * @param resource resource.
	 * @return person resource.
	 */
	PersonResource createEntrant(EdboPersonResource resource);
	
}
