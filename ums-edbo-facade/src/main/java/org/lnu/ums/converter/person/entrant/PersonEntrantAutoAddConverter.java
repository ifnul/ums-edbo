package org.lnu.ums.converter.person.entrant;

import org.lnu.ums.converter.AbstractConverter;
import org.lnu.ums.resource.person.EdboPersonResource;
import org.springframework.stereotype.Component;
import ua.edboservice.PersonEntrantAutoAdd;

@Component("personEntrantAutoAddConverter")
public class PersonEntrantAutoAddConverter extends AbstractConverter<EdboPersonResource, PersonEntrantAutoAdd> {

    @Override
    public PersonEntrantAutoAdd convert(final EdboPersonResource source, final PersonEntrantAutoAdd target) {

        return target;
    }

    @Override
    public PersonEntrantAutoAdd convert(final EdboPersonResource resource) {
        return convert(resource, new PersonEntrantAutoAdd());
    }

}
