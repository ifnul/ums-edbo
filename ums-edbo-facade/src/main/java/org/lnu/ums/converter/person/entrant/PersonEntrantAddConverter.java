package org.lnu.ums.converter.person.entrant;

import org.lnu.ums.converter.AbstractConverter;
import org.lnu.ums.resource.person.EdboPersonResource;
import org.springframework.stereotype.Component;
import ua.edboservice.PersonEntrantAdd;

/**
 * Created by ivanursul on 7/10/15.
 */
@Component("personEntrantAddConverter")
public class PersonEntrantAddConverter extends AbstractConverter<EdboPersonResource, PersonEntrantAdd> {

    @Override
    public PersonEntrantAdd convert(final EdboPersonResource source, final PersonEntrantAdd target) {
        return target;
    }

    @Override
    public PersonEntrantAdd convert(final EdboPersonResource source) {
        return convert(source, new PersonEntrantAdd());
    }

}
