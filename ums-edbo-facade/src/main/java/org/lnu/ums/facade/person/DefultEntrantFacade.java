package org.lnu.ums.facade.person;

import org.lnu.ums.converter.Converter;
import org.lnu.ums.resource.person.EdboAutoEntrantResource;
import org.lnu.ums.resource.person.EdboManualEntrantResource;
import org.lnu.ums.resource.person.PersonResource;
import org.lnu.ums.service.person.PersonService;
import org.lnu.ums.service.respond.RespondService;
import org.springframework.http.ResponseEntity;
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

    @Resource(name = "personResourceConverter")
    private Converter<ArrayOfDPersonAddRet, PersonResource> personResourceConverter;

	@Resource(name = "personService")
	private PersonService service;

    @Resource(name = "respondService")
    private RespondService respondService;

	@Override
	public void createEntrantManually(final EdboManualEntrantResource resource) {
        PersonEntrantAdd personEntrantAdd = personEntrantAddConverter.convert(resource);
        ArrayOfDPersonAddRet entrant = service.createApplicantManually(personEntrantAdd);
        PersonResource entrantResource = new PersonResource();

        personResourceConverter.convert(entrant, entrantResource);
        entrantResource.setId(resource.getId());

        //todo: Change generic to some specific class, when it will be ready.
        ResponseEntity<String> backendResponse = respondService.post(resource.getRespondUrl(), resource, String.class);
    }

    @Override
    public void createEntrantAutomatically(EdboAutoEntrantResource resource) {
        PersonEntrantAutoAdd personEntrantAutoAdd = personEntrantAutoAddConverter.convert(resource);
        ArrayOfDPersonAddRet entrant = service.createApplicantAutomatically(personEntrantAutoAdd);
        PersonResource entrantResource = new PersonResource();

        personResourceConverter.convert(entrant, entrantResource);
        entrantResource.setId(resource.getId());

        //todo: Change generic to some specific class, when it will be ready.
        ResponseEntity<String> backendResponse = respondService.post(resource.getRespondUrl(), resource, String.class);
    }

}
