package org.lnu.ums.facade.person;

import org.lnu.ums.resource.person.EntrantRequest;
import org.lnu.ums.resource.person.EdboPersonResource;
import org.lnu.ums.resource.person.PersonResource;

import java.util.List;

/**
 * Interface for describing requests for edbo person.
 * @author ivanursul
 *
 */
public interface EntrantFacade {

	/**
	 * Method for finding persons.
	 * @param request
	 * @return list of persons.
	 */
	List<EdboPersonResource> findEntrants(EntrantRequest request);

	/**
	 * Method for creating applicant.
	 * @param resource resource.
	 * @return person resource.
	 */
	PersonResource createEntrant(EdboPersonResource resource);
	
}
