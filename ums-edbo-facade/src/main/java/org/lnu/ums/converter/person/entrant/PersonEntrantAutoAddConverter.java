package org.lnu.ums.converter.person.entrant;

import org.lnu.ums.converter.AbstractConverter;
import org.lnu.ums.resource.person.EdboManualEntrantResource;
import org.springframework.stereotype.Component;
import ua.edboservice.PersonEntrantAutoAdd;

@Component("personEntrantAutoAddConverter")
public class PersonEntrantAutoAddConverter extends AbstractConverter<EdboManualEntrantResource, PersonEntrantAutoAdd> {

    @Override
    public PersonEntrantAutoAdd convert(final EdboManualEntrantResource source, final PersonEntrantAutoAdd target) {

        return target;
    }

    @Override
    public PersonEntrantAutoAdd convert(final EdboManualEntrantResource resource) {
        return convert(resource, new PersonEntrantAutoAdd());
    }

}
