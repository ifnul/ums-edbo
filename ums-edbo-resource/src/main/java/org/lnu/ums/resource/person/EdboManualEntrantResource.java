package org.lnu.ums.resource.person;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.ums.resource.EdboResource;

import java.io.Serializable;

/**
 * Resource for storing resource.
 * @author ivanursul
 *
 */
public class EdboManualEntrantResource extends EdboResource implements Serializable {
	private static final long serialVersionUID = 1L;

    private Long id;
    private Integer idPerson;
    private String sessionGUID;
    private Integer idLanguage;
    private Integer resident;
    private String birthday;
    private Integer idPersonSex;
    private String firstName;
    private String middleName;
    private String lastName;
    private String koatuuCode;
    private Integer idStreetType;
    private String adress;
    private String homeNumber;
    private String entrantDocumentSeries;
    private String entrantDocumentNumber;
    private String entrantDocumentDate;
    private String entrantDocumentValue;
    private String pasportSeries;
    private String pasportNumber;
    private String pasportIssued;
    private String pasportDate;
    private String birthCertificateSeries;
    private String birthCertificateNumber;
    private String birthCertificateDate;
    private String kodeSchool;
    private String phone;
    private String mobile;
    private String email;
    private String skype;
    private String icq;
    private Integer isForeinghEntrantDocumet;
    private Integer isNotCheckAttestat;
    private Integer idEntrantDocumnetType;
    private String entrantDocumnetUniversityKode;
    private String father;
    private String mother;
    private String fatherPhones;
    private String motherPhones;
    private String postIndex;
    private String birthplace;
    private String languagesAreStudied;
    private String entrantDocumentIssued;
    private Integer idEntrantDocumentsAwardType;
    private Integer allowProcessedPersonalData;
    private String posvidkaSeries;
    private String posvidkaNumber;
    private String posvidkaIssued;
    private String posvidkaDate;
    private Integer idCountry;

    @Override
    public String getUri() {
        return String.format("/api/entrants/%d", idPerson);
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getAllowProcessedPersonalData() {
        return allowProcessedPersonalData;
    }

    public void setAllowProcessedPersonalData(Integer allowProcessedPersonalData) {
        this.allowProcessedPersonalData = allowProcessedPersonalData;
    }

    public String getBirthCertificateDate() {
        return birthCertificateDate;
    }

    public void setBirthCertificateDate(String birthCertificateDate) {
        this.birthCertificateDate = birthCertificateDate;
    }

    public String getBirthCertificateNumber() {
        return birthCertificateNumber;
    }

    public void setBirthCertificateNumber(String birthCertificateNumber) {
        this.birthCertificateNumber = birthCertificateNumber;
    }

    public String getBirthCertificateSeries() {
        return birthCertificateSeries;
    }

    public void setBirthCertificateSeries(String birthCertificateSeries) {
        this.birthCertificateSeries = birthCertificateSeries;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEntrantDocumentDate() {
        return entrantDocumentDate;
    }

    public void setEntrantDocumentDate(String entrantDocumentDate) {
        this.entrantDocumentDate = entrantDocumentDate;
    }

    public String getEntrantDocumentIssued() {
        return entrantDocumentIssued;
    }

    public void setEntrantDocumentIssued(String entrantDocumentIssued) {
        this.entrantDocumentIssued = entrantDocumentIssued;
    }

    public String getEntrantDocumentNumber() {
        return entrantDocumentNumber;
    }

    public void setEntrantDocumentNumber(String entrantDocumentNumber) {
        this.entrantDocumentNumber = entrantDocumentNumber;
    }

    public String getEntrantDocumentSeries() {
        return entrantDocumentSeries;
    }

    public void setEntrantDocumentSeries(String entrantDocumentSeries) {
        this.entrantDocumentSeries = entrantDocumentSeries;
    }

    public String getEntrantDocumentValue() {
        return entrantDocumentValue;
    }

    public void setEntrantDocumentValue(String entrantDocumentValue) {
        this.entrantDocumentValue = entrantDocumentValue;
    }

    public String getEntrantDocumnetUniversityKode() {
        return entrantDocumnetUniversityKode;
    }

    public void setEntrantDocumnetUniversityKode(String entrantDocumnetUniversityKode) {
        this.entrantDocumnetUniversityKode = entrantDocumnetUniversityKode;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getFatherPhones() {
        return fatherPhones;
    }

    public void setFatherPhones(String fatherPhones) {
        this.fatherPhones = fatherPhones;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getIcq() {
        return icq;
    }

    public void setIcq(String icq) {
        this.icq = icq;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdEntrantDocumentsAwardType() {
        return idEntrantDocumentsAwardType;
    }

    public void setIdEntrantDocumentsAwardType(Integer idEntrantDocumentsAwardType) {
        this.idEntrantDocumentsAwardType = idEntrantDocumentsAwardType;
    }

    public Integer getIdEntrantDocumnetType() {
        return idEntrantDocumnetType;
    }

    public void setIdEntrantDocumnetType(Integer idEntrantDocumnetType) {
        this.idEntrantDocumnetType = idEntrantDocumnetType;
    }

    public Integer getIdLanguage() {
        return idLanguage;
    }

    public void setIdLanguage(Integer idLanguage) {
        this.idLanguage = idLanguage;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public Integer getIdPersonSex() {
        return idPersonSex;
    }

    public void setIdPersonSex(Integer idPersonSex) {
        this.idPersonSex = idPersonSex;
    }

    public Integer getIdStreetType() {
        return idStreetType;
    }

    public void setIdStreetType(Integer idStreetType) {
        this.idStreetType = idStreetType;
    }

    public Integer getIsForeinghEntrantDocumet() {
        return isForeinghEntrantDocumet;
    }

    public void setIsForeinghEntrantDocumet(Integer isForeinghEntrantDocumet) {
        this.isForeinghEntrantDocumet = isForeinghEntrantDocumet;
    }

    public Integer getIsNotCheckAttestat() {
        return isNotCheckAttestat;
    }

    public void setIsNotCheckAttestat(Integer isNotCheckAttestat) {
        this.isNotCheckAttestat = isNotCheckAttestat;
    }

    public String getKoatuuCode() {
        return koatuuCode;
    }

    public void setKoatuuCode(String koatuuCode) {
        this.koatuuCode = koatuuCode;
    }

    public String getKodeSchool() {
        return kodeSchool;
    }

    public void setKodeSchool(String kodeSchool) {
        this.kodeSchool = kodeSchool;
    }

    public String getLanguagesAreStudied() {
        return languagesAreStudied;
    }

    public void setLanguagesAreStudied(String languagesAreStudied) {
        this.languagesAreStudied = languagesAreStudied;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getMotherPhones() {
        return motherPhones;
    }

    public void setMotherPhones(String motherPhones) {
        this.motherPhones = motherPhones;
    }

    public String getPasportDate() {
        return pasportDate;
    }

    public void setPasportDate(String pasportDate) {
        this.pasportDate = pasportDate;
    }

    public String getPasportIssued() {
        return pasportIssued;
    }

    public void setPasportIssued(String pasportIssued) {
        this.pasportIssued = pasportIssued;
    }

    public String getPasportNumber() {
        return pasportNumber;
    }

    public void setPasportNumber(String pasportNumber) {
        this.pasportNumber = pasportNumber;
    }

    public String getPasportSeries() {
        return pasportSeries;
    }

    public void setPasportSeries(String pasportSeries) {
        this.pasportSeries = pasportSeries;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    public String getPosvidkaDate() {
        return posvidkaDate;
    }

    public void setPosvidkaDate(String posvidkaDate) {
        this.posvidkaDate = posvidkaDate;
    }

    public String getPosvidkaIssued() {
        return posvidkaIssued;
    }

    public void setPosvidkaIssued(String posvidkaIssued) {
        this.posvidkaIssued = posvidkaIssued;
    }

    public String getPosvidkaNumber() {
        return posvidkaNumber;
    }

    public void setPosvidkaNumber(String posvidkaNumber) {
        this.posvidkaNumber = posvidkaNumber;
    }

    public String getPosvidkaSeries() {
        return posvidkaSeries;
    }

    public void setPosvidkaSeries(String posvidkaSeries) {
        this.posvidkaSeries = posvidkaSeries;
    }

    public Integer getResident() {
        return resident;
    }

    public void setResident(Integer resident) {
        this.resident = resident;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSessionGUID() {
        return sessionGUID;
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        EdboManualEntrantResource that = (EdboManualEntrantResource) o;

        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }
        if (idPerson != null ? !idPerson.equals(that.idPerson) : that.idPerson != null) {
            return false;
        }
        if (sessionGUID != null ? !sessionGUID.equals(that.sessionGUID) : that.sessionGUID != null) {
            return false;
        }
        if (idLanguage != null ? !idLanguage.equals(that.idLanguage) : that.idLanguage != null) {
            return false;
        }
        if (resident != null ? !resident.equals(that.resident) : that.resident != null) {
            return false;
        }
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) {
            return false;
        }
        if (idPersonSex != null ? !idPersonSex.equals(that.idPersonSex) : that.idPersonSex != null) {
            return false;
        }
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) {
            return false;
        }
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) {
            return false;
        }
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) {
            return false;
        }
        if (koatuuCode != null ? !koatuuCode.equals(that.koatuuCode) : that.koatuuCode != null) {
            return false;
        }
        if (idStreetType != null ? !idStreetType.equals(that.idStreetType) : that.idStreetType != null) {
            return false;
        }
        if (adress != null ? !adress.equals(that.adress) : that.adress != null) {
            return false;
        }
        if (homeNumber != null ? !homeNumber.equals(that.homeNumber) : that.homeNumber != null) {
            return false;
        }
        if (entrantDocumentSeries != null ? !entrantDocumentSeries.equals(that.entrantDocumentSeries) : that.entrantDocumentSeries != null) {
            return false;
        }
        if (entrantDocumentNumber != null ? !entrantDocumentNumber.equals(that.entrantDocumentNumber) : that.entrantDocumentNumber != null) {
            return false;
        }
        if (entrantDocumentDate != null ? !entrantDocumentDate.equals(that.entrantDocumentDate) : that.entrantDocumentDate != null) {
            return false;
        }
        if (entrantDocumentValue != null ? !entrantDocumentValue.equals(that.entrantDocumentValue) : that.entrantDocumentValue != null) {
            return false;
        }
        if (pasportSeries != null ? !pasportSeries.equals(that.pasportSeries) : that.pasportSeries != null) {
            return false;
        }
        if (pasportNumber != null ? !pasportNumber.equals(that.pasportNumber) : that.pasportNumber != null) {
            return false;
        }
        if (pasportIssued != null ? !pasportIssued.equals(that.pasportIssued) : that.pasportIssued != null) {
            return false;
        }
        if (pasportDate != null ? !pasportDate.equals(that.pasportDate) : that.pasportDate != null) {
            return false;
        }
        if (birthCertificateSeries != null ? !birthCertificateSeries.equals(that.birthCertificateSeries) : that.birthCertificateSeries != null) {
            return false;
        }
        if (birthCertificateNumber != null ? !birthCertificateNumber.equals(that.birthCertificateNumber) : that.birthCertificateNumber != null) {
            return false;
        }
        if (birthCertificateDate != null ? !birthCertificateDate.equals(that.birthCertificateDate) : that.birthCertificateDate != null) {
            return false;
        }
        if (kodeSchool != null ? !kodeSchool.equals(that.kodeSchool) : that.kodeSchool != null) {
            return false;
        }
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) {
            return false;
        }
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) {
            return false;
        }
        if (email != null ? !email.equals(that.email) : that.email != null) {
            return false;
        }
        if (skype != null ? !skype.equals(that.skype) : that.skype != null) {
            return false;
        }
        if (icq != null ? !icq.equals(that.icq) : that.icq != null) {
            return false;
        }
        if (isForeinghEntrantDocumet != null ? !isForeinghEntrantDocumet.equals(that.isForeinghEntrantDocumet) : that.isForeinghEntrantDocumet != null) {
            return false;
        }
        if (isNotCheckAttestat != null ? !isNotCheckAttestat.equals(that.isNotCheckAttestat) : that.isNotCheckAttestat != null) {
            return false;
        }
        if (idEntrantDocumnetType != null ? !idEntrantDocumnetType.equals(that.idEntrantDocumnetType) : that.idEntrantDocumnetType != null) {
            return false;
        }
        if (entrantDocumnetUniversityKode != null ? !entrantDocumnetUniversityKode.equals(that.entrantDocumnetUniversityKode) : that.entrantDocumnetUniversityKode != null) {
            return false;
        }
        if (father != null ? !father.equals(that.father) : that.father != null) {
            return false;
        }
        if (mother != null ? !mother.equals(that.mother) : that.mother != null) {
            return false;
        }
        if (fatherPhones != null ? !fatherPhones.equals(that.fatherPhones) : that.fatherPhones != null) {
            return false;
        }
        if (motherPhones != null ? !motherPhones.equals(that.motherPhones) : that.motherPhones != null) {
            return false;
        }
        if (postIndex != null ? !postIndex.equals(that.postIndex) : that.postIndex != null) {
            return false;
        }
        if (birthplace != null ? !birthplace.equals(that.birthplace) : that.birthplace != null) {
            return false;
        }
        if (languagesAreStudied != null ? !languagesAreStudied.equals(that.languagesAreStudied) : that.languagesAreStudied != null) {
            return false;
        }
        if (entrantDocumentIssued != null ? !entrantDocumentIssued.equals(that.entrantDocumentIssued) : that.entrantDocumentIssued != null) {
            return false;
        }
        if (idEntrantDocumentsAwardType != null ? !idEntrantDocumentsAwardType.equals(that.idEntrantDocumentsAwardType) : that.idEntrantDocumentsAwardType != null) {
            return false;
        }
        if (allowProcessedPersonalData != null ? !allowProcessedPersonalData.equals(that.allowProcessedPersonalData) : that.allowProcessedPersonalData != null) {
            return false;
        }
        if (posvidkaSeries != null ? !posvidkaSeries.equals(that.posvidkaSeries) : that.posvidkaSeries != null) {
            return false;
        }
        if (posvidkaNumber != null ? !posvidkaNumber.equals(that.posvidkaNumber) : that.posvidkaNumber != null) {
            return false;
        }
        if (posvidkaIssued != null ? !posvidkaIssued.equals(that.posvidkaIssued) : that.posvidkaIssued != null) {
            return false;
        }
        if (posvidkaDate != null ? !posvidkaDate.equals(that.posvidkaDate) : that.posvidkaDate != null) {
            return false;
        }
        return !(idCountry != null ? !idCountry.equals(that.idCountry) : that.idCountry != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (idPerson != null ? idPerson.hashCode() : 0);
        result = 31 * result + (sessionGUID != null ? sessionGUID.hashCode() : 0);
        result = 31 * result + (idLanguage != null ? idLanguage.hashCode() : 0);
        result = 31 * result + (resident != null ? resident.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (idPersonSex != null ? idPersonSex.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (koatuuCode != null ? koatuuCode.hashCode() : 0);
        result = 31 * result + (idStreetType != null ? idStreetType.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (homeNumber != null ? homeNumber.hashCode() : 0);
        result = 31 * result + (entrantDocumentSeries != null ? entrantDocumentSeries.hashCode() : 0);
        result = 31 * result + (entrantDocumentNumber != null ? entrantDocumentNumber.hashCode() : 0);
        result = 31 * result + (entrantDocumentDate != null ? entrantDocumentDate.hashCode() : 0);
        result = 31 * result + (entrantDocumentValue != null ? entrantDocumentValue.hashCode() : 0);
        result = 31 * result + (pasportSeries != null ? pasportSeries.hashCode() : 0);
        result = 31 * result + (pasportNumber != null ? pasportNumber.hashCode() : 0);
        result = 31 * result + (pasportIssued != null ? pasportIssued.hashCode() : 0);
        result = 31 * result + (pasportDate != null ? pasportDate.hashCode() : 0);
        result = 31 * result + (birthCertificateSeries != null ? birthCertificateSeries.hashCode() : 0);
        result = 31 * result + (birthCertificateNumber != null ? birthCertificateNumber.hashCode() : 0);
        result = 31 * result + (birthCertificateDate != null ? birthCertificateDate.hashCode() : 0);
        result = 31 * result + (kodeSchool != null ? kodeSchool.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (skype != null ? skype.hashCode() : 0);
        result = 31 * result + (icq != null ? icq.hashCode() : 0);
        result = 31 * result + (isForeinghEntrantDocumet != null ? isForeinghEntrantDocumet.hashCode() : 0);
        result = 31 * result + (isNotCheckAttestat != null ? isNotCheckAttestat.hashCode() : 0);
        result = 31 * result + (idEntrantDocumnetType != null ? idEntrantDocumnetType.hashCode() : 0);
        result = 31 * result + (entrantDocumnetUniversityKode != null ? entrantDocumnetUniversityKode.hashCode() : 0);
        result = 31 * result + (father != null ? father.hashCode() : 0);
        result = 31 * result + (mother != null ? mother.hashCode() : 0);
        result = 31 * result + (fatherPhones != null ? fatherPhones.hashCode() : 0);
        result = 31 * result + (motherPhones != null ? motherPhones.hashCode() : 0);
        result = 31 * result + (postIndex != null ? postIndex.hashCode() : 0);
        result = 31 * result + (birthplace != null ? birthplace.hashCode() : 0);
        result = 31 * result + (languagesAreStudied != null ? languagesAreStudied.hashCode() : 0);
        result = 31 * result + (entrantDocumentIssued != null ? entrantDocumentIssued.hashCode() : 0);
        result = 31 * result + (idEntrantDocumentsAwardType != null ? idEntrantDocumentsAwardType.hashCode() : 0);
        result = 31 * result + (allowProcessedPersonalData != null ? allowProcessedPersonalData.hashCode() : 0);
        result = 31 * result + (posvidkaSeries != null ? posvidkaSeries.hashCode() : 0);
        result = 31 * result + (posvidkaNumber != null ? posvidkaNumber.hashCode() : 0);
        result = 31 * result + (posvidkaIssued != null ? posvidkaIssued.hashCode() : 0);
        result = 31 * result + (posvidkaDate != null ? posvidkaDate.hashCode() : 0);
        result = 31 * result + (idCountry != null ? idCountry.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("idPerson", idPerson)
                .append("sessionGUID", sessionGUID)
                .append("idLanguage", idLanguage)
                .append("resident", resident)
                .append("birthday", birthday)
                .append("idPersonSex", idPersonSex)
                .append("firstName", firstName)
                .append("middleName", middleName)
                .append("lastName", lastName)
                .append("koatuuCode", koatuuCode)
                .append("idStreetType", idStreetType)
                .append("adress", adress)
                .append("homeNumber", homeNumber)
                .append("entrantDocumentSeries", entrantDocumentSeries)
                .append("entrantDocumentNumber", entrantDocumentNumber)
                .append("entrantDocumentDate", entrantDocumentDate)
                .append("entrantDocumentValue", entrantDocumentValue)
                .append("pasportSeries", pasportSeries)
                .append("pasportNumber", pasportNumber)
                .append("pasportIssued", pasportIssued)
                .append("pasportDate", pasportDate)
                .append("birthCertificateSeries", birthCertificateSeries)
                .append("birthCertificateNumber", birthCertificateNumber)
                .append("birthCertificateDate", birthCertificateDate)
                .append("kodeSchool", kodeSchool)
                .append("phone", phone)
                .append("mobile", mobile)
                .append("email", email)
                .append("skype", skype)
                .append("icq", icq)
                .append("isForeinghEntrantDocumet", isForeinghEntrantDocumet)
                .append("isNotCheckAttestat", isNotCheckAttestat)
                .append("idEntrantDocumnetType", idEntrantDocumnetType)
                .append("entrantDocumnetUniversityKode", entrantDocumnetUniversityKode)
                .append("father", father)
                .append("mother", mother)
                .append("fatherPhones", fatherPhones)
                .append("motherPhones", motherPhones)
                .append("postIndex", postIndex)
                .append("birthplace", birthplace)
                .append("languagesAreStudied", languagesAreStudied)
                .append("entrantDocumentIssued", entrantDocumentIssued)
                .append("idEntrantDocumentsAwardType", idEntrantDocumentsAwardType)
                .append("allowProcessedPersonalData", allowProcessedPersonalData)
                .append("posvidkaSeries", posvidkaSeries)
                .append("posvidkaNumber", posvidkaNumber)
                .append("posvidkaIssued", posvidkaIssued)
                .append("posvidkaDate", posvidkaDate)
                .append("idCountry", idCountry)
                .toString();
    }
}
