package org.lnu.ums.service.person;

import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.PersonEntrantAdd;
import ua.edboservice.PersonEntrantAutoAdd;

/**
 * Interface, that describes methods for finding person by specific parameters.
 * This methid
 * ЄДБО гавно.
 * @author ivanursul
 *
 */
public interface PersonService {

	/**
	 * Method for manual creation of person.
	 * @param person
	 * @return Array of Returned Persons.
	 */
	ArrayOfDPersonAddRet createApplicantManually(PersonEntrantAdd person);
	
	/**
	 * Method for automatic creation of person.
	 * @param person
	 * @return Array of Returned Persons.
	 */
	ArrayOfDPersonAddRet createApplicantAutomatically(PersonEntrantAutoAdd person);
}
