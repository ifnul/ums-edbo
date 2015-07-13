package org.lnu.ums.converter.person;

import org.lnu.ums.converter.AbstractConverter;
import org.lnu.ums.resource.person.PersonResource;
import org.springframework.stereotype.Component;
import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.DPersonAddRet;

import java.math.BigDecimal;
import java.util.List;

@Component("personResourceConverter")
public class PersonResourceConverter extends AbstractConverter<ArrayOfDPersonAddRet, PersonResource> {

    @Override
    public PersonResource convert(final ArrayOfDPersonAddRet source, final PersonResource target) {

        List<DPersonAddRet> persons = source.getDPersonAddRet();
        if (persons.size() > 0) {
            DPersonAddRet person = persons.get(BigDecimal.ZERO.intValue());

            target.setUid(Long.valueOf(person.getIdPerson()));
            target.setUtid(person.getPersonCodeU());
        }

        return target;
    }

    @Override
    public PersonResource convert(final ArrayOfDPersonAddRet arrayOfDPersonAddRet) {
        return convert(arrayOfDPersonAddRet, new PersonResource());
    }
}
