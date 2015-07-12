package org.lnu.ums.converter.person.entrant;

import org.lnu.ums.converter.AbstractConverter;
import org.lnu.ums.resource.person.EdboManualEntrantResource;
import org.springframework.stereotype.Component;
import ua.edboservice.PersonEntrantAdd;

/**
 * Created by ivanursul on 7/10/15.
 */
@Component("personEntrantAddConverter")
public class PersonEntrantAddConverter extends AbstractConverter<EdboManualEntrantResource, PersonEntrantAdd> {
    private static final String DELIMITER = ", ";

    @Override
    public PersonEntrantAdd convert(final EdboManualEntrantResource source, final PersonEntrantAdd target) {

        target.setAdress(source.getAdress());
        target.setAllowProcessedPersonalData(source.getAllowProcessedPersonalData());
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

    @Override
    public PersonEntrantAdd convert(final EdboManualEntrantResource source) {
        return convert(source, new PersonEntrantAdd());
    }

}
