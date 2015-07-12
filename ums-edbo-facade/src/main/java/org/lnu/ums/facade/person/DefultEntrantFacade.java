package org.lnu.ums.facade.person;

import org.lnu.ums.converter.Converter;
import org.lnu.ums.resource.person.EdboAutoEntrantResource;
import org.lnu.ums.resource.person.EdboManualEntrantResource;
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
	private Converter<EdboAutoEntrantResource, PersonEntrantAutoAdd> personEntrantAutoAddConverter;

	@Resource(name = "personEntrantAddConverter")
	private Converter<EdboManualEntrantResource, PersonEntrantAdd> personEntrantAddConverter;

	@Resource(name = "personService")
	private PersonService service;

	@Override
	public void createEntrantManually(final EdboManualEntrantResource resource) {
        PersonEntrantAdd personEntrantAdd = personEntrantAddConverter.convert(resource);
        ArrayOfDPersonAddRet entrant = service.createApplicantManually(personEntrantAdd);
        // todo: ivanursul - make call to main service for integration uid,utid, etc..
    }

    @Override
    public void createEntrantAutomatically(EdboAutoEntrantResource resource) {
        PersonEntrantAutoAdd personEntrantAutoAdd = personEntrantAutoAddConverter.convert(resource);
        ArrayOfDPersonAddRet entrant = service.createApplicantAutomatically(personEntrantAutoAdd);
        // todo: ivanursul - make call to main service for integration uid,utid, etc..
    }

}
