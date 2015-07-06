package org.lnu.ums.facade.person;

import org.lnu.ums.resource.person.PersonFindRequest;
import org.lnu.ums.resource.person.EdboPersonResource;
import org.lnu.ums.resource.person.PersonResource;

import java.util.List;

/**
 * Interface for describing requests for edbo person.
 * @author ivanursul
 *
 */
public interface PersonFacade {

	/**
	 * Method for finding persons.
	 * @param request
	 * @return list of persons.
	 */
	List<EdboPersonResource> findPersons(PersonFindRequest request);

	/**
	 * Method for sending applicant to edbo.
	 * @param applicantId
	 * @param auto
	 * @return person resource with generated uid and utid.
	 */
	PersonResource createPerson(Long applicantId, Boolean auto);
	
}
