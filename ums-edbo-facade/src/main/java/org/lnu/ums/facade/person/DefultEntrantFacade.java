package org.lnu.ums.facade.person;

import org.lnu.ums.converter.Converter;
import org.lnu.ums.resource.person.EdboPersonResource;
import org.lnu.ums.resource.person.PersonResource;
import org.lnu.ums.service.person.PersonService;
import org.springframework.stereotype.Component;
import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.PersonEntrantAdd;
import ua.edboservice.PersonEntrantAutoAdd;

import javax.annotation.Resource;

/**
 * Default implementation of edbo person facade.
 * @author ivanursul
 *
 */
@Component("entrantFacade")
public class DefultEntrantFacade implements EntrantFacade {

	@Resource(name = "personEntrantAutoAddConverter")
	private Converter<EdboPersonResource, PersonEntrantAutoAdd> personEntrantAutoAddConverter;

	@Resource(name = "personEntrantAddConverter")
	private Converter<EdboPersonResource, PersonEntrantAdd> personEntrantAddConverter;

	@Resource(name = "entrantConverter")
    private Converter<ArrayOfDPersonAddRet, PersonResource> entrantConverter;

	@Resource(name = "personService")
	private PersonService service;

	@Override
	public PersonResource createEntrant(final EdboPersonResource resource) {
        Boolean autoCreate = resource.getAutoCreate();
        ArrayOfDPersonAddRet entrant;

        if (autoCreate) {
            PersonEntrantAutoAdd personEntrantAutoAdd = personEntrantAutoAddConverter.convert(resource);
            entrant = service.createApplicantAutomatically(personEntrantAutoAdd);
        } else {
            PersonEntrantAdd personEntrantAdd = personEntrantAddConverter.convert(resource);
            entrant = service.createApplicantManually(personEntrantAdd);
        }

		return entrantConverter.convert(entrant);
	}

}
