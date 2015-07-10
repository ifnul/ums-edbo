package org.lnu.ums.converter.person.entrant;

import org.lnu.ums.converter.AbstractConverter;
import org.lnu.ums.resource.person.PersonResource;
import org.springframework.stereotype.Component;
import ua.edboservice.ArrayOfDPersonAddRet;

@Component("entrantConverter")
public class EntrantConverter extends AbstractConverter<ArrayOfDPersonAddRet, PersonResource> {

    @Override
    public PersonResource convert(final ArrayOfDPersonAddRet source, final PersonResource target) {
        return target;
    }

    @Override
    public PersonResource convert(final ArrayOfDPersonAddRet source) {
        return convert(source, new PersonResource());
    }

}
