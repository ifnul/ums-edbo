package org.lnu.ums.facade.person;

import org.lnu.ums.converter.Converter;
import org.lnu.ums.resource.person.PersonFindRequest;
import org.lnu.ums.resource.person.EdboPersonResource;
import org.lnu.ums.resource.person.PersonResource;
import org.lnu.ums.service.person.PersonService;
import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.PersonsFind;

import java.util.List;

/**
 * Default implementation of edbo person facade.
 * @author ivanursul
 *
 */
public class DefultPersonFacade implements PersonFacade {

	private Converter<PersonFindRequest, PersonsFind> personFindResourceConverter;
	private Converter<ArrayOfDPersonsFind, List<EdboPersonResource>> arrayOfDPersonFindResourceConverter;
	
	private PersonService service;

	@Override
	public List<EdboPersonResource> findPersons(final PersonFindRequest request) {
		PersonsFind personsFind = personFindResourceConverter.convert(request);
		ArrayOfDPersonsFind persons = service.findPerson(personsFind);
		
		return arrayOfDPersonFindResourceConverter.convert(persons);
	}

	@Override
	public PersonResource createPerson(final EdboPersonResource resource, final Boolean auto) {
		return null;
	}

}
