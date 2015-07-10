package org.lnu.ums.converter.person.entrant;

import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.address.PersonAddress;
import org.lnu.ums.converter.AbstractConverter;
import org.lnu.ums.dao.PersonRepository;
import org.lnu.ums.resource.person.EdboPersonResource;
import org.springframework.stereotype.Component;
import ua.edboservice.PersonEntrantAdd;

import javax.annotation.Resource;

/**
 * Created by ivanursul on 7/10/15.
 */
@Component("personEntrantAddConverter")
public class PersonEntrantAddConverter extends AbstractConverter<EdboPersonResource, PersonEntrantAdd> {
    private static final String DELIMITER = ", ";

    @Resource
    private PersonRepository personRepository;

    @Override
    public PersonEntrantAdd convert(final EdboPersonResource source, final PersonEntrantAdd target) {
        Person person = personRepository.findOne(source.getPersonId());

        String address = getAddress(person);
        Integer allowProcessPersonalData = getAllowProcessPersonalData(person);

        target.setAdress(address);
        target.setAllowProcessedPersonalData(allowProcessPersonalData);
        target.setBirthCertificateDate("");
        target.setBirthCertificateNumber("");
        target.setBirthCertificateSeries("");
        target.setBirthday("");
        target.setBirthplace("");
        target.setEmail("");
        target.setEntrantDocumentDate("");
        target.setEntrantDocumentIssued("");
        target.setEntrantDocumentNumber("");
        target.setEntrantDocumentSeries("");
        target.setEntrantDocumentValue("");
        target.setEntrantDocumnetUniversityKode("");
        target.setFather("");
        target.setFatherPhones("");
        target.setFirstName("");
        target.setHomeNumber("");
        target.setICQ("");
        target.setIdCountry(1);
        target.setIdEntrantDocumentsAwardType(1);
        target.setIdEntrantDocumnetType(1);
        target.setIdLanguage(1);
        target.setIdPersonSex(1);
        target.setIdStreetType(1);
        target.setIsForeinghEntrantDocumet(1);
        target.setIsNotCheckAttestat(1);
        target.setKOATUUCode("");
        target.setKodeSchool("");
        target.setLanguagesAreStudied("");
        target.setLastName("");
        target.setMiddleName("");
        target.setMobile("");
        target.setMother("");
        target.setMotherPhones("");
        target.setPasportDate("");
        target.setPasportIssued("");
        target.setPasportNumber("");
        target.setPasportSeries("");
        target.setPhone("");
        target.setPostIndex("");
        target.setPosvidkaDate("");
        target.setPosvidkaIssued("");
        target.setPosvidkaNumber("");
        target.setResident(1);
        target.setSkype("");

        target.setSessionGUID("ЗНАЮ, шо це таке, беру це на себе :)");

        return target;
    }

    private Integer getAllowProcessPersonalData(final Person person) {
        return 1;
    }

    private String getAddress(final Person person) {
        StringBuilder addressStr = new StringBuilder();

        if (person.getAdresses() != null || !person.getAdresses().isEmpty()) {
            PersonAddress address = person.getAdresses().stream().findFirst().get();

            addressStr.append(address.getAddressType().getName());
            addressStr.append(DELIMITER);
            addressStr.append(address.getStreet());
            addressStr.append(DELIMITER);
            addressStr.append(address.getApartment());
            addressStr.append(DELIMITER);
            addressStr.append(address.getZipCode());
        }

        return addressStr.toString();
    }


    @Override
    public PersonEntrantAdd convert(final EdboPersonResource source) {
        return convert(source, new PersonEntrantAdd());
    }

}
