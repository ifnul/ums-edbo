package org.lnu.ums.service.person;

import org.lnu.ums.service.BaseEdboService;
import org.lnu.ums.service.handler.ExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.EDBOPersonSoap;
import ua.edboservice.PersonEntrantAdd;
import ua.edboservice.PersonEntrantAutoAdd;

@Component("personService")
public class DefaultPersonService extends BaseEdboService<EDBOPersonSoap> implements PersonService {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultPersonService.class);

    private ExceptionHandler exceptionHandler;

    @Override
    public ArrayOfDPersonAddRet createApplicantManually(final PersonEntrantAdd person) {
        LOG.info("Creating new person manually");

        EDBOPersonSoap client = getServiceManager().getWebServiceClient();

        ArrayOfDPersonAddRet response = client.personEntrantAdd(person.getSessionGUID(),
                person.getIdLanguage(),
                person.getResident(),
                person.getBirthday(),
                person.getIdPersonSex(),
                person.getFirstName(),
                person.getMiddleName(),
                person.getLastName(),
                person.getKOATUUCode(),
                person.getIdStreetType(),
                person.getAdress(),
                person.getHomeNumber(),
                person.getEntrantDocumentSeries(),
                person.getEntrantDocumentNumber(),
                person.getEntrantDocumentDate(),
                person.getEntrantDocumentValue(),
                person.getPasportSeries(),
                person.getPasportNumber(),
                person.getPasportIssued(),
                person.getPasportDate(),
                person.getBirthCertificateSeries(),
                person.getBirthCertificateNumber(),
                person.getBirthCertificateDate(),
                person.getKodeSchool(),
                person.getPhone(),
                person.getMobile(),
                person.getEmail(),
                person.getSkype(),
                person.getICQ(),
                person.getIsForeinghEntrantDocumet(),
                person.getIsNotCheckAttestat(),
                person.getIdEntrantDocumnetType(),
                person.getEntrantDocumnetUniversityKode(),
                person.getFather(),
                person.getFather(),
                person.getFatherPhones(),
                person.getMotherPhones(),
                person.getPostIndex(),
                person.getBirthplace(),
                person.getLanguagesAreStudied(),
                person.getEntrantDocumentIssued(),
                person.getIdEntrantDocumentsAwardType(),
                person.getAllowProcessedPersonalData(),
                person.getPosvidkaSeries(),
                person.getPosvidkaNumber(),
                person.getPosvidkaIssued(),
                person.getPosvidkaDate(),
                person.getIdCountry());

        if (response == null) {
            exceptionHandler.handle(person.getSessionGUID());
        }

        return response;
    }

    @Override
    public ArrayOfDPersonAddRet createApplicantAutomatically(final PersonEntrantAutoAdd person) {
        LOG.info("Creating new person automatically");
        EDBOPersonSoap client = getServiceManager().getWebServiceClient();

        ArrayOfDPersonAddRet arrayOfDPersonAddRet = client.personEntrantAutoAdd(person.getSessionGUID(),
                person.getIdLanguage(),
                person.getIdPersonSex(),
                person.getZNONumbers(),
                person.getZNODateGet(),
                person.getZNOPin(),
                person.getAttestatSeries(),
                person.getAttestatNumber(),
                person.getAttestatDate(),
                person.getAttestatValue(),
                person.getPasportSeries(),
                person.getPasportNumber(),
                person.getPasportIssued(),
                person.getPasportDate(),
                person.getBirthCertificateSeries(),
                person.getBirthCertificateNumber(),
                person.getBirthCertificateDate(),
                person.getKodeSchool(),
                person.getPhone(),
                person.getMobile(),
                person.getEmail(),
                person.getSkype(),
                person.getICQ(),
                person.getFather(),
                person.getMother(),
                person.getFatherPhones(),
                person.getMotherPhones(),
                person.getBirthplace(),
                person.getLanguagesAreStudied(),
                person.getIdEntrantDocumentsAwardType(),
                person.getAllowProcessedPersonalData());

        return arrayOfDPersonAddRet;
    }

    public void setExceptionHandler(final ExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }

}
