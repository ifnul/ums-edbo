package org.lnu.ums.rest.controller.entrant;

import org.lnu.ums.rest.controller.BaseController;
import org.lnu.ums.rest.controller.rest.model.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.API_URL + "/entrants")
public class EntrantController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(EntrantController.class);


    @RequestMapping(method = RequestMethod.POST)
    public String createEntrant() {
        return "Hello World";
    }

}
