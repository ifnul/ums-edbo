package org.lnu.ums.rest.controller.entrant;

import org.lnu.ums.facade.person.EntrantFacade;
import org.lnu.ums.resource.person.EdboPersonResource;
import org.lnu.ums.resource.person.PersonResource;
import org.lnu.ums.rest.controller.BaseController;
import org.lnu.ums.rest.controller.rest.model.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(Constants.API_URL + "/entrants")
public class EntrantController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(EntrantController.class);

    @Resource(name = "entrantFacade")
    private EntrantFacade entrantFacade;

    @RequestMapping(method = RequestMethod.POST)
    public PersonResource createEntrant(final EdboPersonResource resource) {
        LOGGER.info("Creating new entrant:{}", resource);
        return entrantFacade.createEntrant(resource);
    }

}
