package org.lnu.ums.facade.person;

import org.lnu.ums.converter.Converter;
import org.lnu.ums.resource.person.EdboPersonFindRequest;
import org.lnu.ums.resource.person.EdboPersonResource;
import org.lnu.ums.resource.person.PersonResource;
import org.lnu.ums.service.person.EdboPersonService;
import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.PersonsFind;

import java.util.List;

/**
 * Default implementation of edbo person facade.
 * @author ivanursul
 *
 */
public class DefultPersonFacade implements PersonFacade {

	private Converter<EdboPersonFindRequest, PersonsFind> personFindResourceConverter;
	private Converter<ArrayOfDPersonsFind, List<EdboPersonResource>> arrayOfDPersonFindResourceConverter;
	
	private EdboPersonService service;

	@Override
	public List<EdboPersonResource> findPersons(final EdboPersonFindRequest request) {
		PersonsFind personsFind = personFindResourceConverter.convert(request);
		ArrayOfDPersonsFind persons = service.findPerson(personsFind);
		
		return arrayOfDPersonFindResourceConverter.convert(persons);
	}

	@Override
	public PersonResource createPerson(final Long entrantId, final Boolean auto) {
	    return null;
    }
}
