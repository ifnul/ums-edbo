package org.lnu.ums.rest.controller.entrant;

import org.lnu.ums.facade.person.EntrantFacade;
import org.lnu.ums.resource.person.EdboAutoEntrantResource;
import org.lnu.ums.resource.person.EdboManualEntrantResource;
import org.lnu.ums.rest.controller.BaseController;
import org.lnu.ums.rest.model.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
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

    @RequestMapping(value = "/manual", method = RequestMethod.POST)
    public ResponseEntity<Void> createEntrantManually(final EdboManualEntrantResource resource) {
        LOGGER.info("Creating new entrant:{}", resource);
        entrantFacade.createEntrantManually(resource);

        return ResponseEntity.accepted().build();
    }

    @RequestMapping(value = "/auto", method = RequestMethod.POST)
    public ResponseEntity<Void> createEntrantAutomatically(final EdboAutoEntrantResource resource) {
        LOGGER.info("Creating new entrant:{}", resource);
        entrantFacade.createEntrantAutomatically(resource);

        return ResponseEntity.accepted().build();
    }

}
