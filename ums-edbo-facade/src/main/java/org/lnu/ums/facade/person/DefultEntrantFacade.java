package org.lnu.ums.facade.person;

import org.lnu.ums.converter.Converter;
import org.lnu.ums.resource.person.EntrantRequest;
import org.lnu.ums.resource.person.EdboPersonResource;
import org.lnu.ums.resource.person.PersonResource;
import org.lnu.ums.service.person.PersonService;
import org.springframework.stereotype.Component;
import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.EntrantFindContext;
import ua.edboservice.PersonEntrantAdd;
import ua.edboservice.PersonEntrantAutoAdd;

import javax.annotation.Resource;
import java.util.List;

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






















	private Converter<EntrantRequest, EntrantFindContext> entrantFindConverter;
	private Converter<ArrayOfDPersonsFind, List<EdboPersonResource>> entrantsPersonResourceConverter;
	@Override
	public List<EdboPersonResource> findEntrants(final EntrantRequest request) {
/*		EntrantFindContext personsFind = entrantFindConverter.convert(request);
		ArrayOfDPersonsFind entrants = service.findEntrants(personsFind);

		return entrantsPersonResourceConverter.convert(entrants);*/
		return null;
	}

}
