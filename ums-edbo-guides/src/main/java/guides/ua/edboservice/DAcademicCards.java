
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAcademicCards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicCards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OblikovNumberGov_5438" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeDisertation_5013" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReestrNumberGov_5438" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Poznacki_5256" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LetterNumber_5418" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LetterDate_5418" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FIO_UA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAspirantura_6642" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationDegreDetailType_7425" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationDegreDetailShortName_7425" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationDegreDetailFullName_7425" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode1_6444" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode2_6444" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality_6480" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateDefense_7434" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ShifrDisertation_7021" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicConsil1_Shifr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicConsil1_PhoneFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicConsil1_EmailWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicConsil1_Pidporydk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Defense_EDRPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Defense_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Defense_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Defense_Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Defense_EmailWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Defense_Pidporydk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Defense_ScienseSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Create_EDRPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Create_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Create_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Create_Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Create_EmailWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Create_Pidporydk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Work_EDRPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Work_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Work_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Work_Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Work_EmailWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Work_Pidporydk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleDisertation_9045_UA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleDisertation_9045_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleDisertation_9045_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Referat_9118_UA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Referat_9118_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Referat_9118_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector1_FIO_UA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector1_FIO_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector1_FIO_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector1_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificDirector1_AcademicEducationDegreDetailShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector1_AcademicEducationDegreDetailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector1_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector1_ScienceSpecialityClasifierCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector1_ScienceSpecialityClasifierCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector2_FIO_UA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector2_FIO_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector2_FIO_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector2_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificDirector2_AcademicEducationDegreDetailShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector2_AcademicEducationDegreDetailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector2_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector2_ScienceSpecialityClasifierCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector2_ScienceSpecialityClasifierCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector3_FIO_UA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector3_FIO_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector3_FIO_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector3_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificDirector3_AcademicEducationDegreDetailShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector3_AcademicEducationDegreDetailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector3_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector3_ScienceSpecialityClasifierCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector3_ScienceSpecialityClasifierCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent1_FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent1_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent1_AcademicEducationDegreDetailShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent1_AcademicEducationDegreDetailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent1_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent1_ScienceSpecialityClasifierCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent1_ScienceSpecialityClasifierCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent2_FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent2_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent2_AcademicEducationDegreDetailShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent2_AcademicEducationDegreDetailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent2_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent2_ScienceSpecialityClasifierCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent2_ScienceSpecialityClasifierCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent3_FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent3_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent3_AcademicEducationDegreDetailShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent3_AcademicEducationDegreDetailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent3_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent3_ScienceSpecialityClasifierCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent3_ScienceSpecialityClasifierCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent4_FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent4_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent4_AcademicEducationDegreDetailShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent4_AcademicEducationDegreDetailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent4_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent4_ScienceSpecialityClasifierCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent4_ScienceSpecialityClasifierCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossConsil_FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossConsil_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BossConsil_AcademicEducationDegreDetailShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossConsil_AcademicEducationDegreDetailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossConsil_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pidsumky_7443" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pages_5742" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dodatki_5751" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Images_5760" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tables_5778" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Jerela_5787" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Public_5481" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Patents_5472" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language_5715" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FleshSources_5743" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Files_5744" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rezultats_7344" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UAK_5634" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RubrikCode1_5616" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RubrikCode2_5616" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RubrikCode3_5616" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RubrikCode4_5616" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RubrikCode5_5616" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RubrikCode6_5616" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vidpovidal_6141" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIrektor_UKRNTI_6140" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Defense_PhoneFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Create_PhoneFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Work_PhoneFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Work_FizUrType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Organisation_Work_FizUrTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateSendToUkrNTI" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_AttestationDocumnet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateBindAttestationDocumnet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EDBO_PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDBO_Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EDBO_Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EDBO_Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EDBO_FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicCards", propOrder = {
    "idAcademicCards",
    "oblikovNumberGov5438",
    "typeDisertation5013",
    "reestrNumberGov5438",
    "poznacki5256",
    "letterNumber5418",
    "letterDate5418",
    "fioua",
    "fioen",
    "fioru",
    "isAspirantura6642",
    "idAcademicEducationDegreDetailType7425",
    "academicEducationDegreDetailShortName7425",
    "academicEducationDegreDetailFullName7425",
    "scienceSpecialityClasifierCode16444",
    "scienceSpecialityClasifierCode26444",
    "speciality6480",
    "dateDefense7434",
    "shifrDisertation7021",
    "academicConsil1Shifr",
    "academicConsil1PhoneFax",
    "academicConsil1EmailWeb",
    "academicConsil1Pidporydk",
    "organisationDefenseEDRPO",
    "organisationDefenseName",
    "organisationDefenseCity",
    "organisationDefenseLocation",
    "organisationDefenseEmailWeb",
    "organisationDefensePidporydk",
    "organisationDefenseScienseSector",
    "organisationCreateEDRPO",
    "organisationCreateName",
    "organisationCreateCity",
    "organisationCreateLocation",
    "organisationCreateEmailWeb",
    "organisationCreatePidporydk",
    "organisationWorkEDRPO",
    "organisationWorkName",
    "organisationWorkCity",
    "organisationWorkLocation",
    "organisationWorkEmailWeb",
    "organisationWorkPidporydk",
    "titleDisertation9045UA",
    "titleDisertation9045EN",
    "titleDisertation9045RU",
    "referat9118UA",
    "referat9118EN",
    "referat9118RU",
    "scientificDirector1FIOUA",
    "scientificDirector1FIOEN",
    "scientificDirector1FIORU",
    "scientificDirector1IdAcademicEducationDegreDetailType",
    "scientificDirector1AcademicEducationDegreDetailShortName",
    "scientificDirector1AcademicEducationDegreDetailName",
    "scientificDirector1Rang",
    "scientificDirector1ScienceSpecialityClasifierCode1",
    "scientificDirector1ScienceSpecialityClasifierCode2",
    "scientificDirector2FIOUA",
    "scientificDirector2FIOEN",
    "scientificDirector2FIORU",
    "scientificDirector2IdAcademicEducationDegreDetailType",
    "scientificDirector2AcademicEducationDegreDetailShortName",
    "scientificDirector2AcademicEducationDegreDetailName",
    "scientificDirector2Rang",
    "scientificDirector2ScienceSpecialityClasifierCode1",
    "scientificDirector2ScienceSpecialityClasifierCode2",
    "scientificDirector3FIOUA",
    "scientificDirector3FIOEN",
    "scientificDirector3FIORU",
    "scientificDirector3IdAcademicEducationDegreDetailType",
    "scientificDirector3AcademicEducationDegreDetailShortName",
    "scientificDirector3AcademicEducationDegreDetailName",
    "scientificDirector3Rang",
    "scientificDirector3ScienceSpecialityClasifierCode1",
    "scientificDirector3ScienceSpecialityClasifierCode2",
    "scientificOponent1FIO",
    "scientificOponent1IdAcademicEducationDegreDetailType",
    "scientificOponent1AcademicEducationDegreDetailShortName",
    "scientificOponent1AcademicEducationDegreDetailName",
    "scientificOponent1Rang",
    "scientificOponent1ScienceSpecialityClasifierCode1",
    "scientificOponent1ScienceSpecialityClasifierCode2",
    "scientificOponent2FIO",
    "scientificOponent2IdAcademicEducationDegreDetailType",
    "scientificOponent2AcademicEducationDegreDetailShortName",
    "scientificOponent2AcademicEducationDegreDetailName",
    "scientificOponent2Rang",
    "scientificOponent2ScienceSpecialityClasifierCode1",
    "scientificOponent2ScienceSpecialityClasifierCode2",
    "scientificOponent3FIO",
    "scientificOponent3IdAcademicEducationDegreDetailType",
    "scientificOponent3AcademicEducationDegreDetailShortName",
    "scientificOponent3AcademicEducationDegreDetailName",
    "scientificOponent3Rang",
    "scientificOponent3ScienceSpecialityClasifierCode1",
    "scientificOponent3ScienceSpecialityClasifierCode2",
    "scientificOponent4FIO",
    "scientificOponent4IdAcademicEducationDegreDetailType",
    "scientificOponent4AcademicEducationDegreDetailShortName",
    "scientificOponent4AcademicEducationDegreDetailName",
    "scientificOponent4Rang",
    "scientificOponent4ScienceSpecialityClasifierCode1",
    "scientificOponent4ScienceSpecialityClasifierCode2",
    "bossConsilFIO",
    "bossConsilIdAcademicEducationDegreDetailType",
    "bossConsilAcademicEducationDegreDetailShortName",
    "bossConsilAcademicEducationDegreDetailName",
    "bossConsilRang",
    "pidsumky7443",
    "pages5742",
    "dodatki5751",
    "images5760",
    "tables5778",
    "jerela5787",
    "public5481",
    "patents5472",
    "language5715",
    "fleshSources5743",
    "files5744",
    "rezultats7344",
    "uak5634",
    "rubrikCode15616",
    "rubrikCode25616",
    "rubrikCode35616",
    "rubrikCode45616",
    "rubrikCode55616",
    "rubrikCode65616",
    "vidpovidal6141",
    "dIrektorUKRNTI6140",
    "organisationDefensePhoneFax",
    "organisationCreatePhoneFax",
    "organisationWorkPhoneFax",
    "organisationWorkFizUrType",
    "organisationWorkFizUrTypeName",
    "dateCreate",
    "dateLastChange",
    "dateSendToUkrNTI",
    "idAttestationDocumnet",
    "dateBindAttestationDocumnet",
    "edboPersonCodeU",
    "edboIdPersonName",
    "edboIdPerson",
    "edboBirthday",
    "edbofio",
    "idUniversity",
    "universityFullName",
    "region"
})
public class DAcademicCards {

    @XmlElement(name = "Id_AcademicCards")
    protected int idAcademicCards;
    @XmlElement(name = "OblikovNumberGov_5438")
    protected String oblikovNumberGov5438;
    @XmlElement(name = "TypeDisertation_5013")
    protected String typeDisertation5013;
    @XmlElement(name = "ReestrNumberGov_5438")
    protected String reestrNumberGov5438;
    @XmlElement(name = "Poznacki_5256")
    protected String poznacki5256;
    @XmlElement(name = "LetterNumber_5418")
    protected String letterNumber5418;
    @XmlElement(name = "LetterDate_5418", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar letterDate5418;
    @XmlElement(name = "FIO_UA")
    protected String fioua;
    @XmlElement(name = "FIO_EN")
    protected String fioen;
    @XmlElement(name = "FIO_RU")
    protected String fioru;
    @XmlElement(name = "IsAspirantura_6642")
    protected int isAspirantura6642;
    @XmlElement(name = "Id_AcademicEducationDegreDetailType_7425")
    protected int idAcademicEducationDegreDetailType7425;
    @XmlElement(name = "AcademicEducationDegreDetailShortName_7425")
    protected String academicEducationDegreDetailShortName7425;
    @XmlElement(name = "AcademicEducationDegreDetailFullName_7425")
    protected String academicEducationDegreDetailFullName7425;
    @XmlElement(name = "ScienceSpecialityClasifierCode1_6444")
    protected String scienceSpecialityClasifierCode16444;
    @XmlElement(name = "ScienceSpecialityClasifierCode2_6444")
    protected String scienceSpecialityClasifierCode26444;
    @XmlElement(name = "Speciality_6480")
    protected String speciality6480;
    @XmlElement(name = "DateDefense_7434", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDefense7434;
    @XmlElement(name = "ShifrDisertation_7021")
    protected String shifrDisertation7021;
    @XmlElement(name = "AcademicConsil1_Shifr")
    protected String academicConsil1Shifr;
    @XmlElement(name = "AcademicConsil1_PhoneFax")
    protected String academicConsil1PhoneFax;
    @XmlElement(name = "AcademicConsil1_EmailWeb")
    protected String academicConsil1EmailWeb;
    @XmlElement(name = "AcademicConsil1_Pidporydk")
    protected String academicConsil1Pidporydk;
    @XmlElement(name = "Organisation_Defense_EDRPO")
    protected String organisationDefenseEDRPO;
    @XmlElement(name = "Organisation_Defense_Name")
    protected String organisationDefenseName;
    @XmlElement(name = "Organisation_Defense_City")
    protected String organisationDefenseCity;
    @XmlElement(name = "Organisation_Defense_Location")
    protected String organisationDefenseLocation;
    @XmlElement(name = "Organisation_Defense_EmailWeb")
    protected String organisationDefenseEmailWeb;
    @XmlElement(name = "Organisation_Defense_Pidporydk")
    protected String organisationDefensePidporydk;
    @XmlElement(name = "Organisation_Defense_ScienseSector")
    protected String organisationDefenseScienseSector;
    @XmlElement(name = "Organisation_Create_EDRPO")
    protected String organisationCreateEDRPO;
    @XmlElement(name = "Organisation_Create_Name")
    protected String organisationCreateName;
    @XmlElement(name = "Organisation_Create_City")
    protected String organisationCreateCity;
    @XmlElement(name = "Organisation_Create_Location")
    protected String organisationCreateLocation;
    @XmlElement(name = "Organisation_Create_EmailWeb")
    protected String organisationCreateEmailWeb;
    @XmlElement(name = "Organisation_Create_Pidporydk")
    protected String organisationCreatePidporydk;
    @XmlElement(name = "Organisation_Work_EDRPO")
    protected String organisationWorkEDRPO;
    @XmlElement(name = "Organisation_Work_Name")
    protected String organisationWorkName;
    @XmlElement(name = "Organisation_Work_City")
    protected String organisationWorkCity;
    @XmlElement(name = "Organisation_Work_Location")
    protected String organisationWorkLocation;
    @XmlElement(name = "Organisation_Work_EmailWeb")
    protected String organisationWorkEmailWeb;
    @XmlElement(name = "Organisation_Work_Pidporydk")
    protected String organisationWorkPidporydk;
    @XmlElement(name = "TitleDisertation_9045_UA")
    protected String titleDisertation9045UA;
    @XmlElement(name = "TitleDisertation_9045_EN")
    protected String titleDisertation9045EN;
    @XmlElement(name = "TitleDisertation_9045_RU")
    protected String titleDisertation9045RU;
    @XmlElement(name = "Referat_9118_UA")
    protected String referat9118UA;
    @XmlElement(name = "Referat_9118_EN")
    protected String referat9118EN;
    @XmlElement(name = "Referat_9118_RU")
    protected String referat9118RU;
    @XmlElement(name = "ScientificDirector1_FIO_UA")
    protected String scientificDirector1FIOUA;
    @XmlElement(name = "ScientificDirector1_FIO_EN")
    protected String scientificDirector1FIOEN;
    @XmlElement(name = "ScientificDirector1_FIO_RU")
    protected String scientificDirector1FIORU;
    @XmlElement(name = "ScientificDirector1_Id_AcademicEducationDegreDetailType")
    protected int scientificDirector1IdAcademicEducationDegreDetailType;
    @XmlElement(name = "ScientificDirector1_AcademicEducationDegreDetailShortName")
    protected String scientificDirector1AcademicEducationDegreDetailShortName;
    @XmlElement(name = "ScientificDirector1_AcademicEducationDegreDetailName")
    protected String scientificDirector1AcademicEducationDegreDetailName;
    @XmlElement(name = "ScientificDirector1_Rang")
    protected String scientificDirector1Rang;
    @XmlElement(name = "ScientificDirector1_ScienceSpecialityClasifierCode1")
    protected String scientificDirector1ScienceSpecialityClasifierCode1;
    @XmlElement(name = "ScientificDirector1_ScienceSpecialityClasifierCode2")
    protected String scientificDirector1ScienceSpecialityClasifierCode2;
    @XmlElement(name = "ScientificDirector2_FIO_UA")
    protected String scientificDirector2FIOUA;
    @XmlElement(name = "ScientificDirector2_FIO_EN")
    protected String scientificDirector2FIOEN;
    @XmlElement(name = "ScientificDirector2_FIO_RU")
    protected String scientificDirector2FIORU;
    @XmlElement(name = "ScientificDirector2_Id_AcademicEducationDegreDetailType")
    protected int scientificDirector2IdAcademicEducationDegreDetailType;
    @XmlElement(name = "ScientificDirector2_AcademicEducationDegreDetailShortName")
    protected String scientificDirector2AcademicEducationDegreDetailShortName;
    @XmlElement(name = "ScientificDirector2_AcademicEducationDegreDetailName")
    protected String scientificDirector2AcademicEducationDegreDetailName;
    @XmlElement(name = "ScientificDirector2_Rang")
    protected String scientificDirector2Rang;
    @XmlElement(name = "ScientificDirector2_ScienceSpecialityClasifierCode1")
    protected String scientificDirector2ScienceSpecialityClasifierCode1;
    @XmlElement(name = "ScientificDirector2_ScienceSpecialityClasifierCode2")
    protected String scientificDirector2ScienceSpecialityClasifierCode2;
    @XmlElement(name = "ScientificDirector3_FIO_UA")
    protected String scientificDirector3FIOUA;
    @XmlElement(name = "ScientificDirector3_FIO_EN")
    protected String scientificDirector3FIOEN;
    @XmlElement(name = "ScientificDirector3_FIO_RU")
    protected String scientificDirector3FIORU;
    @XmlElement(name = "ScientificDirector3_Id_AcademicEducationDegreDetailType")
    protected int scientificDirector3IdAcademicEducationDegreDetailType;
    @XmlElement(name = "ScientificDirector3_AcademicEducationDegreDetailShortName")
    protected String scientificDirector3AcademicEducationDegreDetailShortName;
    @XmlElement(name = "ScientificDirector3_AcademicEducationDegreDetailName")
    protected String scientificDirector3AcademicEducationDegreDetailName;
    @XmlElement(name = "ScientificDirector3_Rang")
    protected String scientificDirector3Rang;
    @XmlElement(name = "ScientificDirector3_ScienceSpecialityClasifierCode1")
    protected String scientificDirector3ScienceSpecialityClasifierCode1;
    @XmlElement(name = "ScientificDirector3_ScienceSpecialityClasifierCode2")
    protected String scientificDirector3ScienceSpecialityClasifierCode2;
    @XmlElement(name = "ScientificOponent1_FIO")
    protected String scientificOponent1FIO;
    @XmlElement(name = "ScientificOponent1_Id_AcademicEducationDegreDetailType")
    protected int scientificOponent1IdAcademicEducationDegreDetailType;
    @XmlElement(name = "ScientificOponent1_AcademicEducationDegreDetailShortName")
    protected String scientificOponent1AcademicEducationDegreDetailShortName;
    @XmlElement(name = "ScientificOponent1_AcademicEducationDegreDetailName")
    protected String scientificOponent1AcademicEducationDegreDetailName;
    @XmlElement(name = "ScientificOponent1_Rang")
    protected String scientificOponent1Rang;
    @XmlElement(name = "ScientificOponent1_ScienceSpecialityClasifierCode1")
    protected String scientificOponent1ScienceSpecialityClasifierCode1;
    @XmlElement(name = "ScientificOponent1_ScienceSpecialityClasifierCode2")
    protected String scientificOponent1ScienceSpecialityClasifierCode2;
    @XmlElement(name = "ScientificOponent2_FIO")
    protected String scientificOponent2FIO;
    @XmlElement(name = "ScientificOponent2_Id_AcademicEducationDegreDetailType")
    protected int scientificOponent2IdAcademicEducationDegreDetailType;
    @XmlElement(name = "ScientificOponent2_AcademicEducationDegreDetailShortName")
    protected String scientificOponent2AcademicEducationDegreDetailShortName;
    @XmlElement(name = "ScientificOponent2_AcademicEducationDegreDetailName")
    protected String scientificOponent2AcademicEducationDegreDetailName;
    @XmlElement(name = "ScientificOponent2_Rang")
    protected String scientificOponent2Rang;
    @XmlElement(name = "ScientificOponent2_ScienceSpecialityClasifierCode1")
    protected String scientificOponent2ScienceSpecialityClasifierCode1;
    @XmlElement(name = "ScientificOponent2_ScienceSpecialityClasifierCode2")
    protected String scientificOponent2ScienceSpecialityClasifierCode2;
    @XmlElement(name = "ScientificOponent3_FIO")
    protected String scientificOponent3FIO;
    @XmlElement(name = "ScientificOponent3_Id_AcademicEducationDegreDetailType")
    protected int scientificOponent3IdAcademicEducationDegreDetailType;
    @XmlElement(name = "ScientificOponent3_AcademicEducationDegreDetailShortName")
    protected String scientificOponent3AcademicEducationDegreDetailShortName;
    @XmlElement(name = "ScientificOponent3_AcademicEducationDegreDetailName")
    protected String scientificOponent3AcademicEducationDegreDetailName;
    @XmlElement(name = "ScientificOponent3_Rang")
    protected String scientificOponent3Rang;
    @XmlElement(name = "ScientificOponent3_ScienceSpecialityClasifierCode1")
    protected String scientificOponent3ScienceSpecialityClasifierCode1;
    @XmlElement(name = "ScientificOponent3_ScienceSpecialityClasifierCode2")
    protected String scientificOponent3ScienceSpecialityClasifierCode2;
    @XmlElement(name = "ScientificOponent4_FIO")
    protected String scientificOponent4FIO;
    @XmlElement(name = "ScientificOponent4_Id_AcademicEducationDegreDetailType")
    protected int scientificOponent4IdAcademicEducationDegreDetailType;
    @XmlElement(name = "ScientificOponent4_AcademicEducationDegreDetailShortName")
    protected String scientificOponent4AcademicEducationDegreDetailShortName;
    @XmlElement(name = "ScientificOponent4_AcademicEducationDegreDetailName")
    protected String scientificOponent4AcademicEducationDegreDetailName;
    @XmlElement(name = "ScientificOponent4_Rang")
    protected String scientificOponent4Rang;
    @XmlElement(name = "ScientificOponent4_ScienceSpecialityClasifierCode1")
    protected String scientificOponent4ScienceSpecialityClasifierCode1;
    @XmlElement(name = "ScientificOponent4_ScienceSpecialityClasifierCode2")
    protected String scientificOponent4ScienceSpecialityClasifierCode2;
    @XmlElement(name = "BossConsil_FIO")
    protected String bossConsilFIO;
    @XmlElement(name = "BossConsil_Id_AcademicEducationDegreDetailType")
    protected int bossConsilIdAcademicEducationDegreDetailType;
    @XmlElement(name = "BossConsil_AcademicEducationDegreDetailShortName")
    protected String bossConsilAcademicEducationDegreDetailShortName;
    @XmlElement(name = "BossConsil_AcademicEducationDegreDetailName")
    protected String bossConsilAcademicEducationDegreDetailName;
    @XmlElement(name = "BossConsil_Rang")
    protected String bossConsilRang;
    @XmlElement(name = "Pidsumky_7443")
    protected String pidsumky7443;
    @XmlElement(name = "Pages_5742")
    protected String pages5742;
    @XmlElement(name = "Dodatki_5751")
    protected String dodatki5751;
    @XmlElement(name = "Images_5760")
    protected String images5760;
    @XmlElement(name = "Tables_5778")
    protected String tables5778;
    @XmlElement(name = "Jerela_5787")
    protected String jerela5787;
    @XmlElement(name = "Public_5481")
    protected String public5481;
    @XmlElement(name = "Patents_5472")
    protected String patents5472;
    @XmlElement(name = "Language_5715")
    protected String language5715;
    @XmlElement(name = "FleshSources_5743")
    protected String fleshSources5743;
    @XmlElement(name = "Files_5744")
    protected String files5744;
    @XmlElement(name = "Rezultats_7344")
    protected String rezultats7344;
    @XmlElement(name = "UAK_5634")
    protected String uak5634;
    @XmlElement(name = "RubrikCode1_5616")
    protected String rubrikCode15616;
    @XmlElement(name = "RubrikCode2_5616")
    protected String rubrikCode25616;
    @XmlElement(name = "RubrikCode3_5616")
    protected String rubrikCode35616;
    @XmlElement(name = "RubrikCode4_5616")
    protected String rubrikCode45616;
    @XmlElement(name = "RubrikCode5_5616")
    protected String rubrikCode55616;
    @XmlElement(name = "RubrikCode6_5616")
    protected String rubrikCode65616;
    @XmlElement(name = "Vidpovidal_6141")
    protected String vidpovidal6141;
    @XmlElement(name = "DIrektor_UKRNTI_6140")
    protected String dIrektorUKRNTI6140;
    @XmlElement(name = "Organisation_Defense_PhoneFax")
    protected String organisationDefensePhoneFax;
    @XmlElement(name = "Organisation_Create_PhoneFax")
    protected String organisationCreatePhoneFax;
    @XmlElement(name = "Organisation_Work_PhoneFax")
    protected String organisationWorkPhoneFax;
    @XmlElement(name = "Organisation_Work_FizUrType")
    protected int organisationWorkFizUrType;
    @XmlElement(name = "Organisation_Work_FizUrTypeName")
    protected String organisationWorkFizUrTypeName;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "DateSendToUkrNTI", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSendToUkrNTI;
    @XmlElement(name = "Id_AttestationDocumnet")
    protected int idAttestationDocumnet;
    @XmlElement(name = "DateBindAttestationDocumnet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBindAttestationDocumnet;
    @XmlElement(name = "EDBO_PersonCodeU")
    protected String edboPersonCodeU;
    @XmlElement(name = "EDBO_Id_PersonName")
    protected int edboIdPersonName;
    @XmlElement(name = "EDBO_Id_Person")
    protected int edboIdPerson;
    @XmlElement(name = "EDBO_Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar edboBirthday;
    @XmlElement(name = "EDBO_FIO")
    protected String edbofio;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Region")
    protected String region;

    /**
     * Gets the value of the idAcademicCards property.
     * 
     */
    public int getIdAcademicCards() {
        return idAcademicCards;
    }

    /**
     * Sets the value of the idAcademicCards property.
     * 
     */
    public void setIdAcademicCards(int value) {
        this.idAcademicCards = value;
    }

    /**
     * Gets the value of the oblikovNumberGov5438 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblikovNumberGov5438() {
        return oblikovNumberGov5438;
    }

    /**
     * Sets the value of the oblikovNumberGov5438 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOblikovNumberGov5438(String value) {
        this.oblikovNumberGov5438 = value;
    }

    /**
     * Gets the value of the typeDisertation5013 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDisertation5013() {
        return typeDisertation5013;
    }

    /**
     * Sets the value of the typeDisertation5013 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDisertation5013(String value) {
        this.typeDisertation5013 = value;
    }

    /**
     * Gets the value of the reestrNumberGov5438 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReestrNumberGov5438() {
        return reestrNumberGov5438;
    }

    /**
     * Sets the value of the reestrNumberGov5438 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReestrNumberGov5438(String value) {
        this.reestrNumberGov5438 = value;
    }

    /**
     * Gets the value of the poznacki5256 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoznacki5256() {
        return poznacki5256;
    }

    /**
     * Sets the value of the poznacki5256 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoznacki5256(String value) {
        this.poznacki5256 = value;
    }

    /**
     * Gets the value of the letterNumber5418 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterNumber5418() {
        return letterNumber5418;
    }

    /**
     * Sets the value of the letterNumber5418 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterNumber5418(String value) {
        this.letterNumber5418 = value;
    }

    /**
     * Gets the value of the letterDate5418 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLetterDate5418() {
        return letterDate5418;
    }

    /**
     * Sets the value of the letterDate5418 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLetterDate5418(XMLGregorianCalendar value) {
        this.letterDate5418 = value;
    }

    /**
     * Gets the value of the fioua property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOUA() {
        return fioua;
    }

    /**
     * Sets the value of the fioua property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOUA(String value) {
        this.fioua = value;
    }

    /**
     * Gets the value of the fioen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOEN() {
        return fioen;
    }

    /**
     * Sets the value of the fioen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOEN(String value) {
        this.fioen = value;
    }

    /**
     * Gets the value of the fioru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIORU() {
        return fioru;
    }

    /**
     * Sets the value of the fioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIORU(String value) {
        this.fioru = value;
    }

    /**
     * Gets the value of the isAspirantura6642 property.
     * 
     */
    public int getIsAspirantura6642() {
        return isAspirantura6642;
    }

    /**
     * Sets the value of the isAspirantura6642 property.
     * 
     */
    public void setIsAspirantura6642(int value) {
        this.isAspirantura6642 = value;
    }

    /**
     * Gets the value of the idAcademicEducationDegreDetailType7425 property.
     * 
     */
    public int getIdAcademicEducationDegreDetailType7425() {
        return idAcademicEducationDegreDetailType7425;
    }

    /**
     * Sets the value of the idAcademicEducationDegreDetailType7425 property.
     * 
     */
    public void setIdAcademicEducationDegreDetailType7425(int value) {
        this.idAcademicEducationDegreDetailType7425 = value;
    }

    /**
     * Gets the value of the academicEducationDegreDetailShortName7425 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDegreDetailShortName7425() {
        return academicEducationDegreDetailShortName7425;
    }

    /**
     * Sets the value of the academicEducationDegreDetailShortName7425 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDegreDetailShortName7425(String value) {
        this.academicEducationDegreDetailShortName7425 = value;
    }

    /**
     * Gets the value of the academicEducationDegreDetailFullName7425 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDegreDetailFullName7425() {
        return academicEducationDegreDetailFullName7425;
    }

    /**
     * Sets the value of the academicEducationDegreDetailFullName7425 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDegreDetailFullName7425(String value) {
        this.academicEducationDegreDetailFullName7425 = value;
    }

    /**
     * Gets the value of the scienceSpecialityClasifierCode16444 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityClasifierCode16444() {
        return scienceSpecialityClasifierCode16444;
    }

    /**
     * Sets the value of the scienceSpecialityClasifierCode16444 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityClasifierCode16444(String value) {
        this.scienceSpecialityClasifierCode16444 = value;
    }

    /**
     * Gets the value of the scienceSpecialityClasifierCode26444 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityClasifierCode26444() {
        return scienceSpecialityClasifierCode26444;
    }

    /**
     * Sets the value of the scienceSpecialityClasifierCode26444 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityClasifierCode26444(String value) {
        this.scienceSpecialityClasifierCode26444 = value;
    }

    /**
     * Gets the value of the speciality6480 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciality6480() {
        return speciality6480;
    }

    /**
     * Sets the value of the speciality6480 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciality6480(String value) {
        this.speciality6480 = value;
    }

    /**
     * Gets the value of the dateDefense7434 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDefense7434() {
        return dateDefense7434;
    }

    /**
     * Sets the value of the dateDefense7434 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDefense7434(XMLGregorianCalendar value) {
        this.dateDefense7434 = value;
    }

    /**
     * Gets the value of the shifrDisertation7021 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShifrDisertation7021() {
        return shifrDisertation7021;
    }

    /**
     * Sets the value of the shifrDisertation7021 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShifrDisertation7021(String value) {
        this.shifrDisertation7021 = value;
    }

    /**
     * Gets the value of the academicConsil1Shifr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicConsil1Shifr() {
        return academicConsil1Shifr;
    }

    /**
     * Sets the value of the academicConsil1Shifr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicConsil1Shifr(String value) {
        this.academicConsil1Shifr = value;
    }

    /**
     * Gets the value of the academicConsil1PhoneFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicConsil1PhoneFax() {
        return academicConsil1PhoneFax;
    }

    /**
     * Sets the value of the academicConsil1PhoneFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicConsil1PhoneFax(String value) {
        this.academicConsil1PhoneFax = value;
    }

    /**
     * Gets the value of the academicConsil1EmailWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicConsil1EmailWeb() {
        return academicConsil1EmailWeb;
    }

    /**
     * Sets the value of the academicConsil1EmailWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicConsil1EmailWeb(String value) {
        this.academicConsil1EmailWeb = value;
    }

    /**
     * Gets the value of the academicConsil1Pidporydk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicConsil1Pidporydk() {
        return academicConsil1Pidporydk;
    }

    /**
     * Sets the value of the academicConsil1Pidporydk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicConsil1Pidporydk(String value) {
        this.academicConsil1Pidporydk = value;
    }

    /**
     * Gets the value of the organisationDefenseEDRPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationDefenseEDRPO() {
        return organisationDefenseEDRPO;
    }

    /**
     * Sets the value of the organisationDefenseEDRPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationDefenseEDRPO(String value) {
        this.organisationDefenseEDRPO = value;
    }

    /**
     * Gets the value of the organisationDefenseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationDefenseName() {
        return organisationDefenseName;
    }

    /**
     * Sets the value of the organisationDefenseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationDefenseName(String value) {
        this.organisationDefenseName = value;
    }

    /**
     * Gets the value of the organisationDefenseCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationDefenseCity() {
        return organisationDefenseCity;
    }

    /**
     * Sets the value of the organisationDefenseCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationDefenseCity(String value) {
        this.organisationDefenseCity = value;
    }

    /**
     * Gets the value of the organisationDefenseLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationDefenseLocation() {
        return organisationDefenseLocation;
    }

    /**
     * Sets the value of the organisationDefenseLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationDefenseLocation(String value) {
        this.organisationDefenseLocation = value;
    }

    /**
     * Gets the value of the organisationDefenseEmailWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationDefenseEmailWeb() {
        return organisationDefenseEmailWeb;
    }

    /**
     * Sets the value of the organisationDefenseEmailWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationDefenseEmailWeb(String value) {
        this.organisationDefenseEmailWeb = value;
    }

    /**
     * Gets the value of the organisationDefensePidporydk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationDefensePidporydk() {
        return organisationDefensePidporydk;
    }

    /**
     * Sets the value of the organisationDefensePidporydk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationDefensePidporydk(String value) {
        this.organisationDefensePidporydk = value;
    }

    /**
     * Gets the value of the organisationDefenseScienseSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationDefenseScienseSector() {
        return organisationDefenseScienseSector;
    }

    /**
     * Sets the value of the organisationDefenseScienseSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationDefenseScienseSector(String value) {
        this.organisationDefenseScienseSector = value;
    }

    /**
     * Gets the value of the organisationCreateEDRPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationCreateEDRPO() {
        return organisationCreateEDRPO;
    }

    /**
     * Sets the value of the organisationCreateEDRPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationCreateEDRPO(String value) {
        this.organisationCreateEDRPO = value;
    }

    /**
     * Gets the value of the organisationCreateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationCreateName() {
        return organisationCreateName;
    }

    /**
     * Sets the value of the organisationCreateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationCreateName(String value) {
        this.organisationCreateName = value;
    }

    /**
     * Gets the value of the organisationCreateCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationCreateCity() {
        return organisationCreateCity;
    }

    /**
     * Sets the value of the organisationCreateCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationCreateCity(String value) {
        this.organisationCreateCity = value;
    }

    /**
     * Gets the value of the organisationCreateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationCreateLocation() {
        return organisationCreateLocation;
    }

    /**
     * Sets the value of the organisationCreateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationCreateLocation(String value) {
        this.organisationCreateLocation = value;
    }

    /**
     * Gets the value of the organisationCreateEmailWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationCreateEmailWeb() {
        return organisationCreateEmailWeb;
    }

    /**
     * Sets the value of the organisationCreateEmailWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationCreateEmailWeb(String value) {
        this.organisationCreateEmailWeb = value;
    }

    /**
     * Gets the value of the organisationCreatePidporydk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationCreatePidporydk() {
        return organisationCreatePidporydk;
    }

    /**
     * Sets the value of the organisationCreatePidporydk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationCreatePidporydk(String value) {
        this.organisationCreatePidporydk = value;
    }

    /**
     * Gets the value of the organisationWorkEDRPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationWorkEDRPO() {
        return organisationWorkEDRPO;
    }

    /**
     * Sets the value of the organisationWorkEDRPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationWorkEDRPO(String value) {
        this.organisationWorkEDRPO = value;
    }

    /**
     * Gets the value of the organisationWorkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationWorkName() {
        return organisationWorkName;
    }

    /**
     * Sets the value of the organisationWorkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationWorkName(String value) {
        this.organisationWorkName = value;
    }

    /**
     * Gets the value of the organisationWorkCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationWorkCity() {
        return organisationWorkCity;
    }

    /**
     * Sets the value of the organisationWorkCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationWorkCity(String value) {
        this.organisationWorkCity = value;
    }

    /**
     * Gets the value of the organisationWorkLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationWorkLocation() {
        return organisationWorkLocation;
    }

    /**
     * Sets the value of the organisationWorkLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationWorkLocation(String value) {
        this.organisationWorkLocation = value;
    }

    /**
     * Gets the value of the organisationWorkEmailWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationWorkEmailWeb() {
        return organisationWorkEmailWeb;
    }

    /**
     * Sets the value of the organisationWorkEmailWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationWorkEmailWeb(String value) {
        this.organisationWorkEmailWeb = value;
    }

    /**
     * Gets the value of the organisationWorkPidporydk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationWorkPidporydk() {
        return organisationWorkPidporydk;
    }

    /**
     * Sets the value of the organisationWorkPidporydk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationWorkPidporydk(String value) {
        this.organisationWorkPidporydk = value;
    }

    /**
     * Gets the value of the titleDisertation9045UA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDisertation9045UA() {
        return titleDisertation9045UA;
    }

    /**
     * Sets the value of the titleDisertation9045UA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDisertation9045UA(String value) {
        this.titleDisertation9045UA = value;
    }

    /**
     * Gets the value of the titleDisertation9045EN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDisertation9045EN() {
        return titleDisertation9045EN;
    }

    /**
     * Sets the value of the titleDisertation9045EN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDisertation9045EN(String value) {
        this.titleDisertation9045EN = value;
    }

    /**
     * Gets the value of the titleDisertation9045RU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDisertation9045RU() {
        return titleDisertation9045RU;
    }

    /**
     * Sets the value of the titleDisertation9045RU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDisertation9045RU(String value) {
        this.titleDisertation9045RU = value;
    }

    /**
     * Gets the value of the referat9118UA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferat9118UA() {
        return referat9118UA;
    }

    /**
     * Sets the value of the referat9118UA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferat9118UA(String value) {
        this.referat9118UA = value;
    }

    /**
     * Gets the value of the referat9118EN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferat9118EN() {
        return referat9118EN;
    }

    /**
     * Sets the value of the referat9118EN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferat9118EN(String value) {
        this.referat9118EN = value;
    }

    /**
     * Gets the value of the referat9118RU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferat9118RU() {
        return referat9118RU;
    }

    /**
     * Sets the value of the referat9118RU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferat9118RU(String value) {
        this.referat9118RU = value;
    }

    /**
     * Gets the value of the scientificDirector1FIOUA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector1FIOUA() {
        return scientificDirector1FIOUA;
    }

    /**
     * Sets the value of the scientificDirector1FIOUA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector1FIOUA(String value) {
        this.scientificDirector1FIOUA = value;
    }

    /**
     * Gets the value of the scientificDirector1FIOEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector1FIOEN() {
        return scientificDirector1FIOEN;
    }

    /**
     * Sets the value of the scientificDirector1FIOEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector1FIOEN(String value) {
        this.scientificDirector1FIOEN = value;
    }

    /**
     * Gets the value of the scientificDirector1FIORU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector1FIORU() {
        return scientificDirector1FIORU;
    }

    /**
     * Sets the value of the scientificDirector1FIORU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector1FIORU(String value) {
        this.scientificDirector1FIORU = value;
    }

    /**
     * Gets the value of the scientificDirector1IdAcademicEducationDegreDetailType property.
     * 
     */
    public int getScientificDirector1IdAcademicEducationDegreDetailType() {
        return scientificDirector1IdAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the scientificDirector1IdAcademicEducationDegreDetailType property.
     * 
     */
    public void setScientificDirector1IdAcademicEducationDegreDetailType(int value) {
        this.scientificDirector1IdAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the scientificDirector1AcademicEducationDegreDetailShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector1AcademicEducationDegreDetailShortName() {
        return scientificDirector1AcademicEducationDegreDetailShortName;
    }

    /**
     * Sets the value of the scientificDirector1AcademicEducationDegreDetailShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector1AcademicEducationDegreDetailShortName(String value) {
        this.scientificDirector1AcademicEducationDegreDetailShortName = value;
    }

    /**
     * Gets the value of the scientificDirector1AcademicEducationDegreDetailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector1AcademicEducationDegreDetailName() {
        return scientificDirector1AcademicEducationDegreDetailName;
    }

    /**
     * Sets the value of the scientificDirector1AcademicEducationDegreDetailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector1AcademicEducationDegreDetailName(String value) {
        this.scientificDirector1AcademicEducationDegreDetailName = value;
    }

    /**
     * Gets the value of the scientificDirector1Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector1Rang() {
        return scientificDirector1Rang;
    }

    /**
     * Sets the value of the scientificDirector1Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector1Rang(String value) {
        this.scientificDirector1Rang = value;
    }

    /**
     * Gets the value of the scientificDirector1ScienceSpecialityClasifierCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector1ScienceSpecialityClasifierCode1() {
        return scientificDirector1ScienceSpecialityClasifierCode1;
    }

    /**
     * Sets the value of the scientificDirector1ScienceSpecialityClasifierCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector1ScienceSpecialityClasifierCode1(String value) {
        this.scientificDirector1ScienceSpecialityClasifierCode1 = value;
    }

    /**
     * Gets the value of the scientificDirector1ScienceSpecialityClasifierCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector1ScienceSpecialityClasifierCode2() {
        return scientificDirector1ScienceSpecialityClasifierCode2;
    }

    /**
     * Sets the value of the scientificDirector1ScienceSpecialityClasifierCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector1ScienceSpecialityClasifierCode2(String value) {
        this.scientificDirector1ScienceSpecialityClasifierCode2 = value;
    }

    /**
     * Gets the value of the scientificDirector2FIOUA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector2FIOUA() {
        return scientificDirector2FIOUA;
    }

    /**
     * Sets the value of the scientificDirector2FIOUA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector2FIOUA(String value) {
        this.scientificDirector2FIOUA = value;
    }

    /**
     * Gets the value of the scientificDirector2FIOEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector2FIOEN() {
        return scientificDirector2FIOEN;
    }

    /**
     * Sets the value of the scientificDirector2FIOEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector2FIOEN(String value) {
        this.scientificDirector2FIOEN = value;
    }

    /**
     * Gets the value of the scientificDirector2FIORU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector2FIORU() {
        return scientificDirector2FIORU;
    }

    /**
     * Sets the value of the scientificDirector2FIORU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector2FIORU(String value) {
        this.scientificDirector2FIORU = value;
    }

    /**
     * Gets the value of the scientificDirector2IdAcademicEducationDegreDetailType property.
     * 
     */
    public int getScientificDirector2IdAcademicEducationDegreDetailType() {
        return scientificDirector2IdAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the scientificDirector2IdAcademicEducationDegreDetailType property.
     * 
     */
    public void setScientificDirector2IdAcademicEducationDegreDetailType(int value) {
        this.scientificDirector2IdAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the scientificDirector2AcademicEducationDegreDetailShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector2AcademicEducationDegreDetailShortName() {
        return scientificDirector2AcademicEducationDegreDetailShortName;
    }

    /**
     * Sets the value of the scientificDirector2AcademicEducationDegreDetailShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector2AcademicEducationDegreDetailShortName(String value) {
        this.scientificDirector2AcademicEducationDegreDetailShortName = value;
    }

    /**
     * Gets the value of the scientificDirector2AcademicEducationDegreDetailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector2AcademicEducationDegreDetailName() {
        return scientificDirector2AcademicEducationDegreDetailName;
    }

    /**
     * Sets the value of the scientificDirector2AcademicEducationDegreDetailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector2AcademicEducationDegreDetailName(String value) {
        this.scientificDirector2AcademicEducationDegreDetailName = value;
    }

    /**
     * Gets the value of the scientificDirector2Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector2Rang() {
        return scientificDirector2Rang;
    }

    /**
     * Sets the value of the scientificDirector2Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector2Rang(String value) {
        this.scientificDirector2Rang = value;
    }

    /**
     * Gets the value of the scientificDirector2ScienceSpecialityClasifierCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector2ScienceSpecialityClasifierCode1() {
        return scientificDirector2ScienceSpecialityClasifierCode1;
    }

    /**
     * Sets the value of the scientificDirector2ScienceSpecialityClasifierCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector2ScienceSpecialityClasifierCode1(String value) {
        this.scientificDirector2ScienceSpecialityClasifierCode1 = value;
    }

    /**
     * Gets the value of the scientificDirector2ScienceSpecialityClasifierCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector2ScienceSpecialityClasifierCode2() {
        return scientificDirector2ScienceSpecialityClasifierCode2;
    }

    /**
     * Sets the value of the scientificDirector2ScienceSpecialityClasifierCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector2ScienceSpecialityClasifierCode2(String value) {
        this.scientificDirector2ScienceSpecialityClasifierCode2 = value;
    }

    /**
     * Gets the value of the scientificDirector3FIOUA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector3FIOUA() {
        return scientificDirector3FIOUA;
    }

    /**
     * Sets the value of the scientificDirector3FIOUA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector3FIOUA(String value) {
        this.scientificDirector3FIOUA = value;
    }

    /**
     * Gets the value of the scientificDirector3FIOEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector3FIOEN() {
        return scientificDirector3FIOEN;
    }

    /**
     * Sets the value of the scientificDirector3FIOEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector3FIOEN(String value) {
        this.scientificDirector3FIOEN = value;
    }

    /**
     * Gets the value of the scientificDirector3FIORU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector3FIORU() {
        return scientificDirector3FIORU;
    }

    /**
     * Sets the value of the scientificDirector3FIORU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector3FIORU(String value) {
        this.scientificDirector3FIORU = value;
    }

    /**
     * Gets the value of the scientificDirector3IdAcademicEducationDegreDetailType property.
     * 
     */
    public int getScientificDirector3IdAcademicEducationDegreDetailType() {
        return scientificDirector3IdAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the scientificDirector3IdAcademicEducationDegreDetailType property.
     * 
     */
    public void setScientificDirector3IdAcademicEducationDegreDetailType(int value) {
        this.scientificDirector3IdAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the scientificDirector3AcademicEducationDegreDetailShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector3AcademicEducationDegreDetailShortName() {
        return scientificDirector3AcademicEducationDegreDetailShortName;
    }

    /**
     * Sets the value of the scientificDirector3AcademicEducationDegreDetailShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector3AcademicEducationDegreDetailShortName(String value) {
        this.scientificDirector3AcademicEducationDegreDetailShortName = value;
    }

    /**
     * Gets the value of the scientificDirector3AcademicEducationDegreDetailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector3AcademicEducationDegreDetailName() {
        return scientificDirector3AcademicEducationDegreDetailName;
    }

    /**
     * Sets the value of the scientificDirector3AcademicEducationDegreDetailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector3AcademicEducationDegreDetailName(String value) {
        this.scientificDirector3AcademicEducationDegreDetailName = value;
    }

    /**
     * Gets the value of the scientificDirector3Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector3Rang() {
        return scientificDirector3Rang;
    }

    /**
     * Sets the value of the scientificDirector3Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector3Rang(String value) {
        this.scientificDirector3Rang = value;
    }

    /**
     * Gets the value of the scientificDirector3ScienceSpecialityClasifierCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector3ScienceSpecialityClasifierCode1() {
        return scientificDirector3ScienceSpecialityClasifierCode1;
    }

    /**
     * Sets the value of the scientificDirector3ScienceSpecialityClasifierCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector3ScienceSpecialityClasifierCode1(String value) {
        this.scientificDirector3ScienceSpecialityClasifierCode1 = value;
    }

    /**
     * Gets the value of the scientificDirector3ScienceSpecialityClasifierCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirector3ScienceSpecialityClasifierCode2() {
        return scientificDirector3ScienceSpecialityClasifierCode2;
    }

    /**
     * Sets the value of the scientificDirector3ScienceSpecialityClasifierCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirector3ScienceSpecialityClasifierCode2(String value) {
        this.scientificDirector3ScienceSpecialityClasifierCode2 = value;
    }

    /**
     * Gets the value of the scientificOponent1FIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent1FIO() {
        return scientificOponent1FIO;
    }

    /**
     * Sets the value of the scientificOponent1FIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent1FIO(String value) {
        this.scientificOponent1FIO = value;
    }

    /**
     * Gets the value of the scientificOponent1IdAcademicEducationDegreDetailType property.
     * 
     */
    public int getScientificOponent1IdAcademicEducationDegreDetailType() {
        return scientificOponent1IdAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the scientificOponent1IdAcademicEducationDegreDetailType property.
     * 
     */
    public void setScientificOponent1IdAcademicEducationDegreDetailType(int value) {
        this.scientificOponent1IdAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the scientificOponent1AcademicEducationDegreDetailShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent1AcademicEducationDegreDetailShortName() {
        return scientificOponent1AcademicEducationDegreDetailShortName;
    }

    /**
     * Sets the value of the scientificOponent1AcademicEducationDegreDetailShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent1AcademicEducationDegreDetailShortName(String value) {
        this.scientificOponent1AcademicEducationDegreDetailShortName = value;
    }

    /**
     * Gets the value of the scientificOponent1AcademicEducationDegreDetailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent1AcademicEducationDegreDetailName() {
        return scientificOponent1AcademicEducationDegreDetailName;
    }

    /**
     * Sets the value of the scientificOponent1AcademicEducationDegreDetailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent1AcademicEducationDegreDetailName(String value) {
        this.scientificOponent1AcademicEducationDegreDetailName = value;
    }

    /**
     * Gets the value of the scientificOponent1Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent1Rang() {
        return scientificOponent1Rang;
    }

    /**
     * Sets the value of the scientificOponent1Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent1Rang(String value) {
        this.scientificOponent1Rang = value;
    }

    /**
     * Gets the value of the scientificOponent1ScienceSpecialityClasifierCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent1ScienceSpecialityClasifierCode1() {
        return scientificOponent1ScienceSpecialityClasifierCode1;
    }

    /**
     * Sets the value of the scientificOponent1ScienceSpecialityClasifierCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent1ScienceSpecialityClasifierCode1(String value) {
        this.scientificOponent1ScienceSpecialityClasifierCode1 = value;
    }

    /**
     * Gets the value of the scientificOponent1ScienceSpecialityClasifierCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent1ScienceSpecialityClasifierCode2() {
        return scientificOponent1ScienceSpecialityClasifierCode2;
    }

    /**
     * Sets the value of the scientificOponent1ScienceSpecialityClasifierCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent1ScienceSpecialityClasifierCode2(String value) {
        this.scientificOponent1ScienceSpecialityClasifierCode2 = value;
    }

    /**
     * Gets the value of the scientificOponent2FIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent2FIO() {
        return scientificOponent2FIO;
    }

    /**
     * Sets the value of the scientificOponent2FIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent2FIO(String value) {
        this.scientificOponent2FIO = value;
    }

    /**
     * Gets the value of the scientificOponent2IdAcademicEducationDegreDetailType property.
     * 
     */
    public int getScientificOponent2IdAcademicEducationDegreDetailType() {
        return scientificOponent2IdAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the scientificOponent2IdAcademicEducationDegreDetailType property.
     * 
     */
    public void setScientificOponent2IdAcademicEducationDegreDetailType(int value) {
        this.scientificOponent2IdAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the scientificOponent2AcademicEducationDegreDetailShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent2AcademicEducationDegreDetailShortName() {
        return scientificOponent2AcademicEducationDegreDetailShortName;
    }

    /**
     * Sets the value of the scientificOponent2AcademicEducationDegreDetailShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent2AcademicEducationDegreDetailShortName(String value) {
        this.scientificOponent2AcademicEducationDegreDetailShortName = value;
    }

    /**
     * Gets the value of the scientificOponent2AcademicEducationDegreDetailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent2AcademicEducationDegreDetailName() {
        return scientificOponent2AcademicEducationDegreDetailName;
    }

    /**
     * Sets the value of the scientificOponent2AcademicEducationDegreDetailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent2AcademicEducationDegreDetailName(String value) {
        this.scientificOponent2AcademicEducationDegreDetailName = value;
    }

    /**
     * Gets the value of the scientificOponent2Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent2Rang() {
        return scientificOponent2Rang;
    }

    /**
     * Sets the value of the scientificOponent2Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent2Rang(String value) {
        this.scientificOponent2Rang = value;
    }

    /**
     * Gets the value of the scientificOponent2ScienceSpecialityClasifierCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent2ScienceSpecialityClasifierCode1() {
        return scientificOponent2ScienceSpecialityClasifierCode1;
    }

    /**
     * Sets the value of the scientificOponent2ScienceSpecialityClasifierCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent2ScienceSpecialityClasifierCode1(String value) {
        this.scientificOponent2ScienceSpecialityClasifierCode1 = value;
    }

    /**
     * Gets the value of the scientificOponent2ScienceSpecialityClasifierCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent2ScienceSpecialityClasifierCode2() {
        return scientificOponent2ScienceSpecialityClasifierCode2;
    }

    /**
     * Sets the value of the scientificOponent2ScienceSpecialityClasifierCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent2ScienceSpecialityClasifierCode2(String value) {
        this.scientificOponent2ScienceSpecialityClasifierCode2 = value;
    }

    /**
     * Gets the value of the scientificOponent3FIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent3FIO() {
        return scientificOponent3FIO;
    }

    /**
     * Sets the value of the scientificOponent3FIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent3FIO(String value) {
        this.scientificOponent3FIO = value;
    }

    /**
     * Gets the value of the scientificOponent3IdAcademicEducationDegreDetailType property.
     * 
     */
    public int getScientificOponent3IdAcademicEducationDegreDetailType() {
        return scientificOponent3IdAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the scientificOponent3IdAcademicEducationDegreDetailType property.
     * 
     */
    public void setScientificOponent3IdAcademicEducationDegreDetailType(int value) {
        this.scientificOponent3IdAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the scientificOponent3AcademicEducationDegreDetailShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent3AcademicEducationDegreDetailShortName() {
        return scientificOponent3AcademicEducationDegreDetailShortName;
    }

    /**
     * Sets the value of the scientificOponent3AcademicEducationDegreDetailShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent3AcademicEducationDegreDetailShortName(String value) {
        this.scientificOponent3AcademicEducationDegreDetailShortName = value;
    }

    /**
     * Gets the value of the scientificOponent3AcademicEducationDegreDetailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent3AcademicEducationDegreDetailName() {
        return scientificOponent3AcademicEducationDegreDetailName;
    }

    /**
     * Sets the value of the scientificOponent3AcademicEducationDegreDetailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent3AcademicEducationDegreDetailName(String value) {
        this.scientificOponent3AcademicEducationDegreDetailName = value;
    }

    /**
     * Gets the value of the scientificOponent3Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent3Rang() {
        return scientificOponent3Rang;
    }

    /**
     * Sets the value of the scientificOponent3Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent3Rang(String value) {
        this.scientificOponent3Rang = value;
    }

    /**
     * Gets the value of the scientificOponent3ScienceSpecialityClasifierCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent3ScienceSpecialityClasifierCode1() {
        return scientificOponent3ScienceSpecialityClasifierCode1;
    }

    /**
     * Sets the value of the scientificOponent3ScienceSpecialityClasifierCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent3ScienceSpecialityClasifierCode1(String value) {
        this.scientificOponent3ScienceSpecialityClasifierCode1 = value;
    }

    /**
     * Gets the value of the scientificOponent3ScienceSpecialityClasifierCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent3ScienceSpecialityClasifierCode2() {
        return scientificOponent3ScienceSpecialityClasifierCode2;
    }

    /**
     * Sets the value of the scientificOponent3ScienceSpecialityClasifierCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent3ScienceSpecialityClasifierCode2(String value) {
        this.scientificOponent3ScienceSpecialityClasifierCode2 = value;
    }

    /**
     * Gets the value of the scientificOponent4FIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent4FIO() {
        return scientificOponent4FIO;
    }

    /**
     * Sets the value of the scientificOponent4FIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent4FIO(String value) {
        this.scientificOponent4FIO = value;
    }

    /**
     * Gets the value of the scientificOponent4IdAcademicEducationDegreDetailType property.
     * 
     */
    public int getScientificOponent4IdAcademicEducationDegreDetailType() {
        return scientificOponent4IdAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the scientificOponent4IdAcademicEducationDegreDetailType property.
     * 
     */
    public void setScientificOponent4IdAcademicEducationDegreDetailType(int value) {
        this.scientificOponent4IdAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the scientificOponent4AcademicEducationDegreDetailShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent4AcademicEducationDegreDetailShortName() {
        return scientificOponent4AcademicEducationDegreDetailShortName;
    }

    /**
     * Sets the value of the scientificOponent4AcademicEducationDegreDetailShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent4AcademicEducationDegreDetailShortName(String value) {
        this.scientificOponent4AcademicEducationDegreDetailShortName = value;
    }

    /**
     * Gets the value of the scientificOponent4AcademicEducationDegreDetailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent4AcademicEducationDegreDetailName() {
        return scientificOponent4AcademicEducationDegreDetailName;
    }

    /**
     * Sets the value of the scientificOponent4AcademicEducationDegreDetailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent4AcademicEducationDegreDetailName(String value) {
        this.scientificOponent4AcademicEducationDegreDetailName = value;
    }

    /**
     * Gets the value of the scientificOponent4Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent4Rang() {
        return scientificOponent4Rang;
    }

    /**
     * Sets the value of the scientificOponent4Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent4Rang(String value) {
        this.scientificOponent4Rang = value;
    }

    /**
     * Gets the value of the scientificOponent4ScienceSpecialityClasifierCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent4ScienceSpecialityClasifierCode1() {
        return scientificOponent4ScienceSpecialityClasifierCode1;
    }

    /**
     * Sets the value of the scientificOponent4ScienceSpecialityClasifierCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent4ScienceSpecialityClasifierCode1(String value) {
        this.scientificOponent4ScienceSpecialityClasifierCode1 = value;
    }

    /**
     * Gets the value of the scientificOponent4ScienceSpecialityClasifierCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent4ScienceSpecialityClasifierCode2() {
        return scientificOponent4ScienceSpecialityClasifierCode2;
    }

    /**
     * Sets the value of the scientificOponent4ScienceSpecialityClasifierCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent4ScienceSpecialityClasifierCode2(String value) {
        this.scientificOponent4ScienceSpecialityClasifierCode2 = value;
    }

    /**
     * Gets the value of the bossConsilFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBossConsilFIO() {
        return bossConsilFIO;
    }

    /**
     * Sets the value of the bossConsilFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBossConsilFIO(String value) {
        this.bossConsilFIO = value;
    }

    /**
     * Gets the value of the bossConsilIdAcademicEducationDegreDetailType property.
     * 
     */
    public int getBossConsilIdAcademicEducationDegreDetailType() {
        return bossConsilIdAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the bossConsilIdAcademicEducationDegreDetailType property.
     * 
     */
    public void setBossConsilIdAcademicEducationDegreDetailType(int value) {
        this.bossConsilIdAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the bossConsilAcademicEducationDegreDetailShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBossConsilAcademicEducationDegreDetailShortName() {
        return bossConsilAcademicEducationDegreDetailShortName;
    }

    /**
     * Sets the value of the bossConsilAcademicEducationDegreDetailShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBossConsilAcademicEducationDegreDetailShortName(String value) {
        this.bossConsilAcademicEducationDegreDetailShortName = value;
    }

    /**
     * Gets the value of the bossConsilAcademicEducationDegreDetailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBossConsilAcademicEducationDegreDetailName() {
        return bossConsilAcademicEducationDegreDetailName;
    }

    /**
     * Sets the value of the bossConsilAcademicEducationDegreDetailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBossConsilAcademicEducationDegreDetailName(String value) {
        this.bossConsilAcademicEducationDegreDetailName = value;
    }

    /**
     * Gets the value of the bossConsilRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBossConsilRang() {
        return bossConsilRang;
    }

    /**
     * Sets the value of the bossConsilRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBossConsilRang(String value) {
        this.bossConsilRang = value;
    }

    /**
     * Gets the value of the pidsumky7443 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPidsumky7443() {
        return pidsumky7443;
    }

    /**
     * Sets the value of the pidsumky7443 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPidsumky7443(String value) {
        this.pidsumky7443 = value;
    }

    /**
     * Gets the value of the pages5742 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPages5742() {
        return pages5742;
    }

    /**
     * Sets the value of the pages5742 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPages5742(String value) {
        this.pages5742 = value;
    }

    /**
     * Gets the value of the dodatki5751 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodatki5751() {
        return dodatki5751;
    }

    /**
     * Sets the value of the dodatki5751 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodatki5751(String value) {
        this.dodatki5751 = value;
    }

    /**
     * Gets the value of the images5760 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImages5760() {
        return images5760;
    }

    /**
     * Sets the value of the images5760 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImages5760(String value) {
        this.images5760 = value;
    }

    /**
     * Gets the value of the tables5778 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTables5778() {
        return tables5778;
    }

    /**
     * Sets the value of the tables5778 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTables5778(String value) {
        this.tables5778 = value;
    }

    /**
     * Gets the value of the jerela5787 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJerela5787() {
        return jerela5787;
    }

    /**
     * Sets the value of the jerela5787 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJerela5787(String value) {
        this.jerela5787 = value;
    }

    /**
     * Gets the value of the public5481 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublic5481() {
        return public5481;
    }

    /**
     * Sets the value of the public5481 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublic5481(String value) {
        this.public5481 = value;
    }

    /**
     * Gets the value of the patents5472 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatents5472() {
        return patents5472;
    }

    /**
     * Sets the value of the patents5472 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatents5472(String value) {
        this.patents5472 = value;
    }

    /**
     * Gets the value of the language5715 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage5715() {
        return language5715;
    }

    /**
     * Sets the value of the language5715 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage5715(String value) {
        this.language5715 = value;
    }

    /**
     * Gets the value of the fleshSources5743 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleshSources5743() {
        return fleshSources5743;
    }

    /**
     * Sets the value of the fleshSources5743 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleshSources5743(String value) {
        this.fleshSources5743 = value;
    }

    /**
     * Gets the value of the files5744 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiles5744() {
        return files5744;
    }

    /**
     * Sets the value of the files5744 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiles5744(String value) {
        this.files5744 = value;
    }

    /**
     * Gets the value of the rezultats7344 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRezultats7344() {
        return rezultats7344;
    }

    /**
     * Sets the value of the rezultats7344 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRezultats7344(String value) {
        this.rezultats7344 = value;
    }

    /**
     * Gets the value of the uak5634 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUAK5634() {
        return uak5634;
    }

    /**
     * Sets the value of the uak5634 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUAK5634(String value) {
        this.uak5634 = value;
    }

    /**
     * Gets the value of the rubrikCode15616 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubrikCode15616() {
        return rubrikCode15616;
    }

    /**
     * Sets the value of the rubrikCode15616 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubrikCode15616(String value) {
        this.rubrikCode15616 = value;
    }

    /**
     * Gets the value of the rubrikCode25616 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubrikCode25616() {
        return rubrikCode25616;
    }

    /**
     * Sets the value of the rubrikCode25616 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubrikCode25616(String value) {
        this.rubrikCode25616 = value;
    }

    /**
     * Gets the value of the rubrikCode35616 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubrikCode35616() {
        return rubrikCode35616;
    }

    /**
     * Sets the value of the rubrikCode35616 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubrikCode35616(String value) {
        this.rubrikCode35616 = value;
    }

    /**
     * Gets the value of the rubrikCode45616 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubrikCode45616() {
        return rubrikCode45616;
    }

    /**
     * Sets the value of the rubrikCode45616 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubrikCode45616(String value) {
        this.rubrikCode45616 = value;
    }

    /**
     * Gets the value of the rubrikCode55616 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubrikCode55616() {
        return rubrikCode55616;
    }

    /**
     * Sets the value of the rubrikCode55616 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubrikCode55616(String value) {
        this.rubrikCode55616 = value;
    }

    /**
     * Gets the value of the rubrikCode65616 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubrikCode65616() {
        return rubrikCode65616;
    }

    /**
     * Sets the value of the rubrikCode65616 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubrikCode65616(String value) {
        this.rubrikCode65616 = value;
    }

    /**
     * Gets the value of the vidpovidal6141 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVidpovidal6141() {
        return vidpovidal6141;
    }

    /**
     * Sets the value of the vidpovidal6141 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVidpovidal6141(String value) {
        this.vidpovidal6141 = value;
    }

    /**
     * Gets the value of the dIrektorUKRNTI6140 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIrektorUKRNTI6140() {
        return dIrektorUKRNTI6140;
    }

    /**
     * Sets the value of the dIrektorUKRNTI6140 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIrektorUKRNTI6140(String value) {
        this.dIrektorUKRNTI6140 = value;
    }

    /**
     * Gets the value of the organisationDefensePhoneFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationDefensePhoneFax() {
        return organisationDefensePhoneFax;
    }

    /**
     * Sets the value of the organisationDefensePhoneFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationDefensePhoneFax(String value) {
        this.organisationDefensePhoneFax = value;
    }

    /**
     * Gets the value of the organisationCreatePhoneFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationCreatePhoneFax() {
        return organisationCreatePhoneFax;
    }

    /**
     * Sets the value of the organisationCreatePhoneFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationCreatePhoneFax(String value) {
        this.organisationCreatePhoneFax = value;
    }

    /**
     * Gets the value of the organisationWorkPhoneFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationWorkPhoneFax() {
        return organisationWorkPhoneFax;
    }

    /**
     * Sets the value of the organisationWorkPhoneFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationWorkPhoneFax(String value) {
        this.organisationWorkPhoneFax = value;
    }

    /**
     * Gets the value of the organisationWorkFizUrType property.
     * 
     */
    public int getOrganisationWorkFizUrType() {
        return organisationWorkFizUrType;
    }

    /**
     * Sets the value of the organisationWorkFizUrType property.
     * 
     */
    public void setOrganisationWorkFizUrType(int value) {
        this.organisationWorkFizUrType = value;
    }

    /**
     * Gets the value of the organisationWorkFizUrTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationWorkFizUrTypeName() {
        return organisationWorkFizUrTypeName;
    }

    /**
     * Sets the value of the organisationWorkFizUrTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationWorkFizUrTypeName(String value) {
        this.organisationWorkFizUrTypeName = value;
    }

    /**
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreate(XMLGregorianCalendar value) {
        this.dateCreate = value;
    }

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
    }

    /**
     * Gets the value of the dateSendToUkrNTI property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSendToUkrNTI() {
        return dateSendToUkrNTI;
    }

    /**
     * Sets the value of the dateSendToUkrNTI property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSendToUkrNTI(XMLGregorianCalendar value) {
        this.dateSendToUkrNTI = value;
    }

    /**
     * Gets the value of the idAttestationDocumnet property.
     * 
     */
    public int getIdAttestationDocumnet() {
        return idAttestationDocumnet;
    }

    /**
     * Sets the value of the idAttestationDocumnet property.
     * 
     */
    public void setIdAttestationDocumnet(int value) {
        this.idAttestationDocumnet = value;
    }

    /**
     * Gets the value of the dateBindAttestationDocumnet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBindAttestationDocumnet() {
        return dateBindAttestationDocumnet;
    }

    /**
     * Sets the value of the dateBindAttestationDocumnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBindAttestationDocumnet(XMLGregorianCalendar value) {
        this.dateBindAttestationDocumnet = value;
    }

    /**
     * Gets the value of the edboPersonCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDBOPersonCodeU() {
        return edboPersonCodeU;
    }

    /**
     * Sets the value of the edboPersonCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDBOPersonCodeU(String value) {
        this.edboPersonCodeU = value;
    }

    /**
     * Gets the value of the edboIdPersonName property.
     * 
     */
    public int getEDBOIdPersonName() {
        return edboIdPersonName;
    }

    /**
     * Sets the value of the edboIdPersonName property.
     * 
     */
    public void setEDBOIdPersonName(int value) {
        this.edboIdPersonName = value;
    }

    /**
     * Gets the value of the edboIdPerson property.
     * 
     */
    public int getEDBOIdPerson() {
        return edboIdPerson;
    }

    /**
     * Sets the value of the edboIdPerson property.
     * 
     */
    public void setEDBOIdPerson(int value) {
        this.edboIdPerson = value;
    }

    /**
     * Gets the value of the edboBirthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEDBOBirthday() {
        return edboBirthday;
    }

    /**
     * Sets the value of the edboBirthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEDBOBirthday(XMLGregorianCalendar value) {
        this.edboBirthday = value;
    }

    /**
     * Gets the value of the edbofio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDBOFIO() {
        return edbofio;
    }

    /**
     * Sets the value of the edbofio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDBOFIO(String value) {
        this.edbofio = value;
    }

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
    }

    /**
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

}
