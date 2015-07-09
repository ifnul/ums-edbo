package org.lnu.ums.resource.person;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;

/**
 * Resource for storing resource.
 * @author ivanursul
 *
 */
public class EdboPersonResource implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idPerson;
    private int resident;
    private int idPersonName;
    private int idPersonSex;
    private int idLanguage;
    private int idPersonDocumentPasp;
    private int idPersonDocumentAtestat;
    private int idPersonTypeDict;
    
    private XMLGregorianCalendar birthday;
    private XMLGregorianCalendar personNameDateBegin;
    private XMLGregorianCalendar personNameDateEnd;
    private XMLGregorianCalendar pasportDate;
    private XMLGregorianCalendar atestatDate;

    private String personCodeU;
    private String lastName;
    private String firstName;
    private String middleName;
    private String fio;
    private String pasportSeries;
    private String pasportNumber;
    private String pasportIssued;
    private String atestatSeries;
    private String atestatNumber;
    private String personSexName;
    private String personTypeName;
    private String father;
    private String mother;
    private String fatherPhones;
    private String motherPhones;
    private String birthplace;
    private String languagesAreStudied;

    private Boolean autoCreate;

    public XMLGregorianCalendar getAtestatDate() {
        return atestatDate;
    }

    public void setAtestatDate(XMLGregorianCalendar atestatDate) {
        this.atestatDate = atestatDate;
    }

    public String getAtestatNumber() {
        return atestatNumber;
    }

    public void setAtestatNumber(String atestatNumber) {
        this.atestatNumber = atestatNumber;
    }

    public String getAtestatSeries() {
        return atestatSeries;
    }

    public void setAtestatSeries(String atestatSeries) {
        this.atestatSeries = atestatSeries;
    }

    public Boolean getAutoCreate() {
        return autoCreate;
    }

    public void setAutoCreate(Boolean autoCreate) {
        this.autoCreate = autoCreate;
    }

    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    public void setBirthday(XMLGregorianCalendar birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getIdLanguage() {
        return idLanguage;
    }

    public void setIdLanguage(int idLanguage) {
        this.idLanguage = idLanguage;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getIdPersonDocumentAtestat() {
        return idPersonDocumentAtestat;
    }

    public void setIdPersonDocumentAtestat(int idPersonDocumentAtestat) {
        this.idPersonDocumentAtestat = idPersonDocumentAtestat;
    }

    public int getIdPersonDocumentPasp() {
        return idPersonDocumentPasp;
    }

    public void setIdPersonDocumentPasp(int idPersonDocumentPasp) {
        this.idPersonDocumentPasp = idPersonDocumentPasp;
    }

    public int getIdPersonName() {
        return idPersonName;
    }

    public void setIdPersonName(int idPersonName) {
        this.idPersonName = idPersonName;
    }

    public int getIdPersonSex() {
        return idPersonSex;
    }

    public void setIdPersonSex(int idPersonSex) {
        this.idPersonSex = idPersonSex;
    }

    public int getIdPersonTypeDict() {
        return idPersonTypeDict;
    }

    public void setIdPersonTypeDict(int idPersonTypeDict) {
        this.idPersonTypeDict = idPersonTypeDict;
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

    public XMLGregorianCalendar getPasportDate() {
        return pasportDate;
    }

    public void setPasportDate(XMLGregorianCalendar pasportDate) {
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

    public String getPersonCodeU() {
        return personCodeU;
    }

    public void setPersonCodeU(String personCodeU) {
        this.personCodeU = personCodeU;
    }

    public XMLGregorianCalendar getPersonNameDateBegin() {
        return personNameDateBegin;
    }

    public void setPersonNameDateBegin(XMLGregorianCalendar personNameDateBegin) {
        this.personNameDateBegin = personNameDateBegin;
    }

    public XMLGregorianCalendar getPersonNameDateEnd() {
        return personNameDateEnd;
    }

    public void setPersonNameDateEnd(XMLGregorianCalendar personNameDateEnd) {
        this.personNameDateEnd = personNameDateEnd;
    }

    public String getPersonSexName() {
        return personSexName;
    }

    public void setPersonSexName(String personSexName) {
        this.personSexName = personSexName;
    }

    public String getPersonTypeName() {
        return personTypeName;
    }

    public void setPersonTypeName(String personTypeName) {
        this.personTypeName = personTypeName;
    }

    public int getResident() {
        return resident;
    }

    public void setResident(int resident) {
        this.resident = resident;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EdboPersonResource that = (EdboPersonResource) o;

        if (idLanguage != that.idLanguage) return false;
        if (idPerson != that.idPerson) return false;
        if (idPersonDocumentAtestat != that.idPersonDocumentAtestat) return false;
        if (idPersonDocumentPasp != that.idPersonDocumentPasp) return false;
        if (idPersonName != that.idPersonName) return false;
        if (idPersonSex != that.idPersonSex) return false;
        if (idPersonTypeDict != that.idPersonTypeDict) return false;
        if (resident != that.resident) return false;
        if (atestatDate != null ? !atestatDate.equals(that.atestatDate) : that.atestatDate != null) return false;
        if (atestatNumber != null ? !atestatNumber.equals(that.atestatNumber) : that.atestatNumber != null)
            return false;
        if (atestatSeries != null ? !atestatSeries.equals(that.atestatSeries) : that.atestatSeries != null)
            return false;
        if (autoCreate != null ? !autoCreate.equals(that.autoCreate) : that.autoCreate != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (birthplace != null ? !birthplace.equals(that.birthplace) : that.birthplace != null) return false;
        if (father != null ? !father.equals(that.father) : that.father != null) return false;
        if (fatherPhones != null ? !fatherPhones.equals(that.fatherPhones) : that.fatherPhones != null) return false;
        if (fio != null ? !fio.equals(that.fio) : that.fio != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (languagesAreStudied != null ? !languagesAreStudied.equals(that.languagesAreStudied) : that.languagesAreStudied != null)
            return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        if (mother != null ? !mother.equals(that.mother) : that.mother != null) return false;
        if (motherPhones != null ? !motherPhones.equals(that.motherPhones) : that.motherPhones != null) return false;
        if (pasportDate != null ? !pasportDate.equals(that.pasportDate) : that.pasportDate != null) return false;
        if (pasportIssued != null ? !pasportIssued.equals(that.pasportIssued) : that.pasportIssued != null)
            return false;
        if (pasportNumber != null ? !pasportNumber.equals(that.pasportNumber) : that.pasportNumber != null)
            return false;
        if (pasportSeries != null ? !pasportSeries.equals(that.pasportSeries) : that.pasportSeries != null)
            return false;
        if (personCodeU != null ? !personCodeU.equals(that.personCodeU) : that.personCodeU != null) return false;
        if (personNameDateBegin != null ? !personNameDateBegin.equals(that.personNameDateBegin) : that.personNameDateBegin != null)
            return false;
        if (personNameDateEnd != null ? !personNameDateEnd.equals(that.personNameDateEnd) : that.personNameDateEnd != null)
            return false;
        if (personSexName != null ? !personSexName.equals(that.personSexName) : that.personSexName != null)
            return false;
        if (personTypeName != null ? !personTypeName.equals(that.personTypeName) : that.personTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPerson;
        result = 31 * result + resident;
        result = 31 * result + idPersonName;
        result = 31 * result + idPersonSex;
        result = 31 * result + idLanguage;
        result = 31 * result + idPersonDocumentPasp;
        result = 31 * result + idPersonDocumentAtestat;
        result = 31 * result + idPersonTypeDict;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (personNameDateBegin != null ? personNameDateBegin.hashCode() : 0);
        result = 31 * result + (personNameDateEnd != null ? personNameDateEnd.hashCode() : 0);
        result = 31 * result + (pasportDate != null ? pasportDate.hashCode() : 0);
        result = 31 * result + (atestatDate != null ? atestatDate.hashCode() : 0);
        result = 31 * result + (personCodeU != null ? personCodeU.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (fio != null ? fio.hashCode() : 0);
        result = 31 * result + (pasportSeries != null ? pasportSeries.hashCode() : 0);
        result = 31 * result + (pasportNumber != null ? pasportNumber.hashCode() : 0);
        result = 31 * result + (pasportIssued != null ? pasportIssued.hashCode() : 0);
        result = 31 * result + (atestatSeries != null ? atestatSeries.hashCode() : 0);
        result = 31 * result + (atestatNumber != null ? atestatNumber.hashCode() : 0);
        result = 31 * result + (personSexName != null ? personSexName.hashCode() : 0);
        result = 31 * result + (personTypeName != null ? personTypeName.hashCode() : 0);
        result = 31 * result + (father != null ? father.hashCode() : 0);
        result = 31 * result + (mother != null ? mother.hashCode() : 0);
        result = 31 * result + (fatherPhones != null ? fatherPhones.hashCode() : 0);
        result = 31 * result + (motherPhones != null ? motherPhones.hashCode() : 0);
        result = 31 * result + (birthplace != null ? birthplace.hashCode() : 0);
        result = 31 * result + (languagesAreStudied != null ? languagesAreStudied.hashCode() : 0);
        result = 31 * result + (autoCreate != null ? autoCreate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EdboPersonResource{" +
                "atestatDate=" + atestatDate +
                ", idPerson=" + idPerson +
                ", resident=" + resident +
                ", idPersonName=" + idPersonName +
                ", idPersonSex=" + idPersonSex +
                ", idLanguage=" + idLanguage +
                ", idPersonDocumentPasp=" + idPersonDocumentPasp +
                ", idPersonDocumentAtestat=" + idPersonDocumentAtestat +
                ", idPersonTypeDict=" + idPersonTypeDict +
                ", birthday=" + birthday +
                ", personNameDateBegin=" + personNameDateBegin +
                ", personNameDateEnd=" + personNameDateEnd +
                ", pasportDate=" + pasportDate +
                ", personCodeU='" + personCodeU + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", fio='" + fio + '\'' +
                ", pasportSeries='" + pasportSeries + '\'' +
                ", pasportNumber='" + pasportNumber + '\'' +
                ", pasportIssued='" + pasportIssued + '\'' +
                ", atestatSeries='" + atestatSeries + '\'' +
                ", atestatNumber='" + atestatNumber + '\'' +
                ", personSexName='" + personSexName + '\'' +
                ", personTypeName='" + personTypeName + '\'' +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                ", fatherPhones='" + fatherPhones + '\'' +
                ", motherPhones='" + motherPhones + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", languagesAreStudied='" + languagesAreStudied + '\'' +
                ", autoCreate=" + autoCreate +
                '}';
    }
}
