
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicDegree_4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicDegreeName_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryCode_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityCode_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisertationName_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicCouncilNumber_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicCouncil_8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateDefense_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolNumbet_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthdayYear_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Citizenship_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonSex_13" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFinishName_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityFinish_14" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFinishYear_15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialityByDiplom_16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DegreesAndTitles_17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OfficeOfInstitutionsGraduateSchool_18" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NameOfGraduateSchool_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearOfGraduation_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OfficeOfInstitutionsWork_21" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OfficeWorkName_22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkCity_23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkLevel_24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkBegin_25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OfficeOfInstitutionsCreate_26" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OfficeCreateName_27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateCity_28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector_FIO_29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector_Id_AcademicEducationDegreDetailType_30" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificDirector_Id_AcademicRank_31" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificDirector_AcademicRank_31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector_Id_OfficeOfInstitutions_32" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificDirector_OfficeName_33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificDirector_WorkLevel_34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Publications_Total_35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Publications_Witchout_36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Publications_Monograf_37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Publications_Articles_38" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Publications_Certificates_39" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent1_FIO_40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent1_Id_AcademicEducationDegreDetailType_41" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent1_Id_AcademicRank_42" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent1_AcademicRank_42" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent1_Id_OfficeOfInstitutions_43" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent1_OfficeName_44" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent1_Response_45" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent1_Observations_46" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent2_FIO_47" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent2_Id_AcademicEducationDegreDetailType_48" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent2_Id_AcademicRank_49" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent2_AcademicRank_49" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent2_Id_OfficeOfInstitutions_50" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent2_OfficeName_51" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent2_Response_52" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent2_Observations_53" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent3_FIO_54" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent3_Id_AcademicEducationDegreDetailType_55" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent3_Id_AcademicRank_56" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent3_AcademicRank_56" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent3_Id_OfficeOfInstitutions_57" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificOponent3_OfficeName_58" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent3_Response_59" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScientificOponent3_Observations_60" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observations_66" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositiveResponses_67" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NegativeResponses_68" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositiveMembers_69" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NegativeMembers_70" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositiveExperts_71" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NegativeExperts_72" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MembersList_73" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Visited_74" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Voted_75" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoctorsInProfile_76" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VotedYes_77" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VotedNo_78" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Falsed_79" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienseObject_80" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienseResult_81_82_83_84" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Languade_85" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date_of_PhD_86" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganistionDefenseName_81_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Form_82_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality_83_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoteResult_84_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName_EN_85_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName_EN_86_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName_EN_87_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganistionDefenseName_EN_88_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryName_EN_89_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName_EN_90_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO_AcademicConsilBoss_91_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO_SpecRada_Head_92_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "lastName1",
    "firstName2",
    "middleName3",
    "idAcademicDegree4",
    "academicDegreeName4",
    "scienceIndustryCode5",
    "scienceSpecialityCode6",
    "disertationName7",
    "academicCouncilNumber8",
    "idAcademicCouncil8",
    "dateDefense9",
    "protocolNumbet10",
    "birthdayYear11",
    "citizenship12",
    "idPersonSex13",
    "universityFinishName14",
    "idUniversityFinish14",
    "universityFinishYear15",
    "specialityByDiplom16",
    "degreesAndTitles17",
    "idOfficeOfInstitutionsGraduateSchool18",
    "nameOfGraduateSchool19",
    "yearOfGraduation20",
    "idOfficeOfInstitutionsWork21",
    "officeWorkName22",
    "workCity23",
    "workLevel24",
    "workBegin25",
    "idOfficeOfInstitutionsCreate26",
    "officeCreateName27",
    "createCity28",
    "scientificDirectorFIO29",
    "scientificDirectorIdAcademicEducationDegreDetailType30",
    "scientificDirectorIdAcademicRank31",
    "scientificDirectorAcademicRank31",
    "scientificDirectorIdOfficeOfInstitutions32",
    "scientificDirectorOfficeName33",
    "scientificDirectorWorkLevel34",
    "publicationsTotal35",
    "publicationsWitchout36",
    "publicationsMonograf37",
    "publicationsArticles38",
    "publicationsCertificates39",
    "scientificOponent1FIO40",
    "scientificOponent1IdAcademicEducationDegreDetailType41",
    "scientificOponent1IdAcademicRank42",
    "scientificOponent1AcademicRank42",
    "scientificOponent1IdOfficeOfInstitutions43",
    "scientificOponent1OfficeName44",
    "scientificOponent1Response45",
    "scientificOponent1Observations46",
    "scientificOponent2FIO47",
    "scientificOponent2IdAcademicEducationDegreDetailType48",
    "scientificOponent2IdAcademicRank49",
    "scientificOponent2AcademicRank49",
    "scientificOponent2IdOfficeOfInstitutions50",
    "scientificOponent2OfficeName51",
    "scientificOponent2Response52",
    "scientificOponent2Observations53",
    "scientificOponent3FIO54",
    "scientificOponent3IdAcademicEducationDegreDetailType55",
    "scientificOponent3IdAcademicRank56",
    "scientificOponent3AcademicRank56",
    "scientificOponent3IdOfficeOfInstitutions57",
    "scientificOponent3OfficeName58",
    "scientificOponent3Response59",
    "scientificOponent3Observations60",
    "observations66",
    "positiveResponses67",
    "negativeResponses68",
    "positiveMembers69",
    "negativeMembers70",
    "positiveExperts71",
    "negativeExperts72",
    "membersList73",
    "visited74",
    "voted75",
    "doctorsInProfile76",
    "votedYes77",
    "votedNo78",
    "falsed79",
    "scienseObject80",
    "scienseResult81828384",
    "languade85",
    "dateOfPhD86",
    "organistionDefenseName81New",
    "form82New",
    "speciality83New",
    "voteResult84New",
    "lastNameEN85New",
    "firstNameEN86New",
    "middleNameEN87New",
    "organistionDefenseNameEN88New",
    "scienceIndustryNameEN89New",
    "scienceSpecialityNameEN90New",
    "fioAcademicConsilBoss91New",
    "fioSpecRadaHead92New",
    "personCodeU",
    "universityKode"
})
@XmlRootElement(name = "AcademicCouncilSpecDecisionAdd")
public class AcademicCouncilSpecDecisionAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "LastName_1")
    protected String lastName1;
    @XmlElement(name = "FirstName_2")
    protected String firstName2;
    @XmlElement(name = "MiddleName_3")
    protected String middleName3;
    @XmlElement(name = "Id_AcademicDegree_4")
    protected int idAcademicDegree4;
    @XmlElement(name = "AcademicDegreeName_4")
    protected String academicDegreeName4;
    @XmlElement(name = "ScienceIndustryCode_5")
    protected String scienceIndustryCode5;
    @XmlElement(name = "ScienceSpecialityCode_6")
    protected String scienceSpecialityCode6;
    @XmlElement(name = "DisertationName_7")
    protected String disertationName7;
    @XmlElement(name = "AcademicCouncilNumber_8")
    protected String academicCouncilNumber8;
    @XmlElement(name = "Id_AcademicCouncil_8")
    protected int idAcademicCouncil8;
    @XmlElement(name = "DateDefense_9")
    protected String dateDefense9;
    @XmlElement(name = "ProtocolNumbet_10")
    protected String protocolNumbet10;
    @XmlElement(name = "BirthdayYear_11")
    protected String birthdayYear11;
    @XmlElement(name = "Citizenship_12")
    protected String citizenship12;
    @XmlElement(name = "Id_PersonSex_13")
    protected int idPersonSex13;
    @XmlElement(name = "UniversityFinishName_14")
    protected String universityFinishName14;
    @XmlElement(name = "Id_UniversityFinish_14")
    protected int idUniversityFinish14;
    @XmlElement(name = "UniversityFinishYear_15")
    protected String universityFinishYear15;
    @XmlElement(name = "SpecialityByDiplom_16")
    protected String specialityByDiplom16;
    @XmlElement(name = "DegreesAndTitles_17")
    protected String degreesAndTitles17;
    @XmlElement(name = "Id_OfficeOfInstitutionsGraduateSchool_18")
    protected int idOfficeOfInstitutionsGraduateSchool18;
    @XmlElement(name = "NameOfGraduateSchool_19")
    protected String nameOfGraduateSchool19;
    @XmlElement(name = "YearOfGraduation_20")
    protected String yearOfGraduation20;
    @XmlElement(name = "Id_OfficeOfInstitutionsWork_21")
    protected int idOfficeOfInstitutionsWork21;
    @XmlElement(name = "OfficeWorkName_22")
    protected String officeWorkName22;
    @XmlElement(name = "WorkCity_23")
    protected String workCity23;
    @XmlElement(name = "WorkLevel_24")
    protected String workLevel24;
    @XmlElement(name = "WorkBegin_25")
    protected String workBegin25;
    @XmlElement(name = "Id_OfficeOfInstitutionsCreate_26")
    protected int idOfficeOfInstitutionsCreate26;
    @XmlElement(name = "OfficeCreateName_27")
    protected String officeCreateName27;
    @XmlElement(name = "CreateCity_28")
    protected String createCity28;
    @XmlElement(name = "ScientificDirector_FIO_29")
    protected String scientificDirectorFIO29;
    @XmlElement(name = "ScientificDirector_Id_AcademicEducationDegreDetailType_30")
    protected int scientificDirectorIdAcademicEducationDegreDetailType30;
    @XmlElement(name = "ScientificDirector_Id_AcademicRank_31")
    protected int scientificDirectorIdAcademicRank31;
    @XmlElement(name = "ScientificDirector_AcademicRank_31")
    protected String scientificDirectorAcademicRank31;
    @XmlElement(name = "ScientificDirector_Id_OfficeOfInstitutions_32")
    protected int scientificDirectorIdOfficeOfInstitutions32;
    @XmlElement(name = "ScientificDirector_OfficeName_33")
    protected String scientificDirectorOfficeName33;
    @XmlElement(name = "ScientificDirector_WorkLevel_34")
    protected String scientificDirectorWorkLevel34;
    @XmlElement(name = "Publications_Total_35")
    protected String publicationsTotal35;
    @XmlElement(name = "Publications_Witchout_36")
    protected String publicationsWitchout36;
    @XmlElement(name = "Publications_Monograf_37")
    protected String publicationsMonograf37;
    @XmlElement(name = "Publications_Articles_38")
    protected String publicationsArticles38;
    @XmlElement(name = "Publications_Certificates_39")
    protected String publicationsCertificates39;
    @XmlElement(name = "ScientificOponent1_FIO_40")
    protected String scientificOponent1FIO40;
    @XmlElement(name = "ScientificOponent1_Id_AcademicEducationDegreDetailType_41")
    protected int scientificOponent1IdAcademicEducationDegreDetailType41;
    @XmlElement(name = "ScientificOponent1_Id_AcademicRank_42")
    protected int scientificOponent1IdAcademicRank42;
    @XmlElement(name = "ScientificOponent1_AcademicRank_42")
    protected String scientificOponent1AcademicRank42;
    @XmlElement(name = "ScientificOponent1_Id_OfficeOfInstitutions_43")
    protected int scientificOponent1IdOfficeOfInstitutions43;
    @XmlElement(name = "ScientificOponent1_OfficeName_44")
    protected String scientificOponent1OfficeName44;
    @XmlElement(name = "ScientificOponent1_Response_45")
    protected String scientificOponent1Response45;
    @XmlElement(name = "ScientificOponent1_Observations_46")
    protected String scientificOponent1Observations46;
    @XmlElement(name = "ScientificOponent2_FIO_47")
    protected String scientificOponent2FIO47;
    @XmlElement(name = "ScientificOponent2_Id_AcademicEducationDegreDetailType_48")
    protected int scientificOponent2IdAcademicEducationDegreDetailType48;
    @XmlElement(name = "ScientificOponent2_Id_AcademicRank_49")
    protected int scientificOponent2IdAcademicRank49;
    @XmlElement(name = "ScientificOponent2_AcademicRank_49")
    protected String scientificOponent2AcademicRank49;
    @XmlElement(name = "ScientificOponent2_Id_OfficeOfInstitutions_50")
    protected int scientificOponent2IdOfficeOfInstitutions50;
    @XmlElement(name = "ScientificOponent2_OfficeName_51")
    protected String scientificOponent2OfficeName51;
    @XmlElement(name = "ScientificOponent2_Response_52")
    protected String scientificOponent2Response52;
    @XmlElement(name = "ScientificOponent2_Observations_53")
    protected String scientificOponent2Observations53;
    @XmlElement(name = "ScientificOponent3_FIO_54")
    protected String scientificOponent3FIO54;
    @XmlElement(name = "ScientificOponent3_Id_AcademicEducationDegreDetailType_55")
    protected int scientificOponent3IdAcademicEducationDegreDetailType55;
    @XmlElement(name = "ScientificOponent3_Id_AcademicRank_56")
    protected int scientificOponent3IdAcademicRank56;
    @XmlElement(name = "ScientificOponent3_AcademicRank_56")
    protected String scientificOponent3AcademicRank56;
    @XmlElement(name = "ScientificOponent3_Id_OfficeOfInstitutions_57")
    protected int scientificOponent3IdOfficeOfInstitutions57;
    @XmlElement(name = "ScientificOponent3_OfficeName_58")
    protected String scientificOponent3OfficeName58;
    @XmlElement(name = "ScientificOponent3_Response_59")
    protected String scientificOponent3Response59;
    @XmlElement(name = "ScientificOponent3_Observations_60")
    protected String scientificOponent3Observations60;
    @XmlElement(name = "Observations_66")
    protected String observations66;
    @XmlElement(name = "PositiveResponses_67")
    protected String positiveResponses67;
    @XmlElement(name = "NegativeResponses_68")
    protected String negativeResponses68;
    @XmlElement(name = "PositiveMembers_69")
    protected String positiveMembers69;
    @XmlElement(name = "NegativeMembers_70")
    protected String negativeMembers70;
    @XmlElement(name = "PositiveExperts_71")
    protected String positiveExperts71;
    @XmlElement(name = "NegativeExperts_72")
    protected String negativeExperts72;
    @XmlElement(name = "MembersList_73")
    protected String membersList73;
    @XmlElement(name = "Visited_74")
    protected String visited74;
    @XmlElement(name = "Voted_75")
    protected String voted75;
    @XmlElement(name = "DoctorsInProfile_76")
    protected String doctorsInProfile76;
    @XmlElement(name = "VotedYes_77")
    protected String votedYes77;
    @XmlElement(name = "VotedNo_78")
    protected String votedNo78;
    @XmlElement(name = "Falsed_79")
    protected String falsed79;
    @XmlElement(name = "ScienseObject_80")
    protected String scienseObject80;
    @XmlElement(name = "ScienseResult_81_82_83_84")
    protected String scienseResult81828384;
    @XmlElement(name = "Languade_85")
    protected String languade85;
    @XmlElement(name = "Date_of_PhD_86")
    protected String dateOfPhD86;
    @XmlElement(name = "OrganistionDefenseName_81_new")
    protected String organistionDefenseName81New;
    @XmlElement(name = "Form_82_new")
    protected String form82New;
    @XmlElement(name = "Speciality_83_new")
    protected String speciality83New;
    @XmlElement(name = "VoteResult_84_new")
    protected String voteResult84New;
    @XmlElement(name = "LastName_EN_85_new")
    protected String lastNameEN85New;
    @XmlElement(name = "FirstName_EN_86_new")
    protected String firstNameEN86New;
    @XmlElement(name = "MiddleName_EN_87_new")
    protected String middleNameEN87New;
    @XmlElement(name = "OrganistionDefenseName_EN_88_new")
    protected String organistionDefenseNameEN88New;
    @XmlElement(name = "ScienceIndustryName_EN_89_new")
    protected String scienceIndustryNameEN89New;
    @XmlElement(name = "ScienceSpecialityName_EN_90_new")
    protected String scienceSpecialityNameEN90New;
    @XmlElement(name = "FIO_AcademicConsilBoss_91_new")
    protected String fioAcademicConsilBoss91New;
    @XmlElement(name = "FIO_SpecRada_Head_92_new")
    protected String fioSpecRadaHead92New;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the lastName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Sets the value of the lastName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName1(String value) {
        this.lastName1 = value;
    }

    /**
     * Gets the value of the firstName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName2() {
        return firstName2;
    }

    /**
     * Sets the value of the firstName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName2(String value) {
        this.firstName2 = value;
    }

    /**
     * Gets the value of the middleName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName3() {
        return middleName3;
    }

    /**
     * Sets the value of the middleName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName3(String value) {
        this.middleName3 = value;
    }

    /**
     * Gets the value of the idAcademicDegree4 property.
     * 
     */
    public int getIdAcademicDegree4() {
        return idAcademicDegree4;
    }

    /**
     * Sets the value of the idAcademicDegree4 property.
     * 
     */
    public void setIdAcademicDegree4(int value) {
        this.idAcademicDegree4 = value;
    }

    /**
     * Gets the value of the academicDegreeName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicDegreeName4() {
        return academicDegreeName4;
    }

    /**
     * Sets the value of the academicDegreeName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicDegreeName4(String value) {
        this.academicDegreeName4 = value;
    }

    /**
     * Gets the value of the scienceIndustryCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryCode5() {
        return scienceIndustryCode5;
    }

    /**
     * Sets the value of the scienceIndustryCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryCode5(String value) {
        this.scienceIndustryCode5 = value;
    }

    /**
     * Gets the value of the scienceSpecialityCode6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityCode6() {
        return scienceSpecialityCode6;
    }

    /**
     * Sets the value of the scienceSpecialityCode6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityCode6(String value) {
        this.scienceSpecialityCode6 = value;
    }

    /**
     * Gets the value of the disertationName7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisertationName7() {
        return disertationName7;
    }

    /**
     * Sets the value of the disertationName7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisertationName7(String value) {
        this.disertationName7 = value;
    }

    /**
     * Gets the value of the academicCouncilNumber8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilNumber8() {
        return academicCouncilNumber8;
    }

    /**
     * Sets the value of the academicCouncilNumber8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilNumber8(String value) {
        this.academicCouncilNumber8 = value;
    }

    /**
     * Gets the value of the idAcademicCouncil8 property.
     * 
     */
    public int getIdAcademicCouncil8() {
        return idAcademicCouncil8;
    }

    /**
     * Sets the value of the idAcademicCouncil8 property.
     * 
     */
    public void setIdAcademicCouncil8(int value) {
        this.idAcademicCouncil8 = value;
    }

    /**
     * Gets the value of the dateDefense9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDefense9() {
        return dateDefense9;
    }

    /**
     * Sets the value of the dateDefense9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDefense9(String value) {
        this.dateDefense9 = value;
    }

    /**
     * Gets the value of the protocolNumbet10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolNumbet10() {
        return protocolNumbet10;
    }

    /**
     * Sets the value of the protocolNumbet10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolNumbet10(String value) {
        this.protocolNumbet10 = value;
    }

    /**
     * Gets the value of the birthdayYear11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdayYear11() {
        return birthdayYear11;
    }

    /**
     * Sets the value of the birthdayYear11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdayYear11(String value) {
        this.birthdayYear11 = value;
    }

    /**
     * Gets the value of the citizenship12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship12() {
        return citizenship12;
    }

    /**
     * Sets the value of the citizenship12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship12(String value) {
        this.citizenship12 = value;
    }

    /**
     * Gets the value of the idPersonSex13 property.
     * 
     */
    public int getIdPersonSex13() {
        return idPersonSex13;
    }

    /**
     * Sets the value of the idPersonSex13 property.
     * 
     */
    public void setIdPersonSex13(int value) {
        this.idPersonSex13 = value;
    }

    /**
     * Gets the value of the universityFinishName14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFinishName14() {
        return universityFinishName14;
    }

    /**
     * Sets the value of the universityFinishName14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFinishName14(String value) {
        this.universityFinishName14 = value;
    }

    /**
     * Gets the value of the idUniversityFinish14 property.
     * 
     */
    public int getIdUniversityFinish14() {
        return idUniversityFinish14;
    }

    /**
     * Sets the value of the idUniversityFinish14 property.
     * 
     */
    public void setIdUniversityFinish14(int value) {
        this.idUniversityFinish14 = value;
    }

    /**
     * Gets the value of the universityFinishYear15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFinishYear15() {
        return universityFinishYear15;
    }

    /**
     * Sets the value of the universityFinishYear15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFinishYear15(String value) {
        this.universityFinishYear15 = value;
    }

    /**
     * Gets the value of the specialityByDiplom16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityByDiplom16() {
        return specialityByDiplom16;
    }

    /**
     * Sets the value of the specialityByDiplom16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityByDiplom16(String value) {
        this.specialityByDiplom16 = value;
    }

    /**
     * Gets the value of the degreesAndTitles17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegreesAndTitles17() {
        return degreesAndTitles17;
    }

    /**
     * Sets the value of the degreesAndTitles17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegreesAndTitles17(String value) {
        this.degreesAndTitles17 = value;
    }

    /**
     * Gets the value of the idOfficeOfInstitutionsGraduateSchool18 property.
     * 
     */
    public int getIdOfficeOfInstitutionsGraduateSchool18() {
        return idOfficeOfInstitutionsGraduateSchool18;
    }

    /**
     * Sets the value of the idOfficeOfInstitutionsGraduateSchool18 property.
     * 
     */
    public void setIdOfficeOfInstitutionsGraduateSchool18(int value) {
        this.idOfficeOfInstitutionsGraduateSchool18 = value;
    }

    /**
     * Gets the value of the nameOfGraduateSchool19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfGraduateSchool19() {
        return nameOfGraduateSchool19;
    }

    /**
     * Sets the value of the nameOfGraduateSchool19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfGraduateSchool19(String value) {
        this.nameOfGraduateSchool19 = value;
    }

    /**
     * Gets the value of the yearOfGraduation20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearOfGraduation20() {
        return yearOfGraduation20;
    }

    /**
     * Sets the value of the yearOfGraduation20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearOfGraduation20(String value) {
        this.yearOfGraduation20 = value;
    }

    /**
     * Gets the value of the idOfficeOfInstitutionsWork21 property.
     * 
     */
    public int getIdOfficeOfInstitutionsWork21() {
        return idOfficeOfInstitutionsWork21;
    }

    /**
     * Sets the value of the idOfficeOfInstitutionsWork21 property.
     * 
     */
    public void setIdOfficeOfInstitutionsWork21(int value) {
        this.idOfficeOfInstitutionsWork21 = value;
    }

    /**
     * Gets the value of the officeWorkName22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeWorkName22() {
        return officeWorkName22;
    }

    /**
     * Sets the value of the officeWorkName22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeWorkName22(String value) {
        this.officeWorkName22 = value;
    }

    /**
     * Gets the value of the workCity23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCity23() {
        return workCity23;
    }

    /**
     * Sets the value of the workCity23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCity23(String value) {
        this.workCity23 = value;
    }

    /**
     * Gets the value of the workLevel24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkLevel24() {
        return workLevel24;
    }

    /**
     * Sets the value of the workLevel24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkLevel24(String value) {
        this.workLevel24 = value;
    }

    /**
     * Gets the value of the workBegin25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkBegin25() {
        return workBegin25;
    }

    /**
     * Sets the value of the workBegin25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkBegin25(String value) {
        this.workBegin25 = value;
    }

    /**
     * Gets the value of the idOfficeOfInstitutionsCreate26 property.
     * 
     */
    public int getIdOfficeOfInstitutionsCreate26() {
        return idOfficeOfInstitutionsCreate26;
    }

    /**
     * Sets the value of the idOfficeOfInstitutionsCreate26 property.
     * 
     */
    public void setIdOfficeOfInstitutionsCreate26(int value) {
        this.idOfficeOfInstitutionsCreate26 = value;
    }

    /**
     * Gets the value of the officeCreateName27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCreateName27() {
        return officeCreateName27;
    }

    /**
     * Sets the value of the officeCreateName27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCreateName27(String value) {
        this.officeCreateName27 = value;
    }

    /**
     * Gets the value of the createCity28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateCity28() {
        return createCity28;
    }

    /**
     * Sets the value of the createCity28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateCity28(String value) {
        this.createCity28 = value;
    }

    /**
     * Gets the value of the scientificDirectorFIO29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirectorFIO29() {
        return scientificDirectorFIO29;
    }

    /**
     * Sets the value of the scientificDirectorFIO29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirectorFIO29(String value) {
        this.scientificDirectorFIO29 = value;
    }

    /**
     * Gets the value of the scientificDirectorIdAcademicEducationDegreDetailType30 property.
     * 
     */
    public int getScientificDirectorIdAcademicEducationDegreDetailType30() {
        return scientificDirectorIdAcademicEducationDegreDetailType30;
    }

    /**
     * Sets the value of the scientificDirectorIdAcademicEducationDegreDetailType30 property.
     * 
     */
    public void setScientificDirectorIdAcademicEducationDegreDetailType30(int value) {
        this.scientificDirectorIdAcademicEducationDegreDetailType30 = value;
    }

    /**
     * Gets the value of the scientificDirectorIdAcademicRank31 property.
     * 
     */
    public int getScientificDirectorIdAcademicRank31() {
        return scientificDirectorIdAcademicRank31;
    }

    /**
     * Sets the value of the scientificDirectorIdAcademicRank31 property.
     * 
     */
    public void setScientificDirectorIdAcademicRank31(int value) {
        this.scientificDirectorIdAcademicRank31 = value;
    }

    /**
     * Gets the value of the scientificDirectorAcademicRank31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirectorAcademicRank31() {
        return scientificDirectorAcademicRank31;
    }

    /**
     * Sets the value of the scientificDirectorAcademicRank31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirectorAcademicRank31(String value) {
        this.scientificDirectorAcademicRank31 = value;
    }

    /**
     * Gets the value of the scientificDirectorIdOfficeOfInstitutions32 property.
     * 
     */
    public int getScientificDirectorIdOfficeOfInstitutions32() {
        return scientificDirectorIdOfficeOfInstitutions32;
    }

    /**
     * Sets the value of the scientificDirectorIdOfficeOfInstitutions32 property.
     * 
     */
    public void setScientificDirectorIdOfficeOfInstitutions32(int value) {
        this.scientificDirectorIdOfficeOfInstitutions32 = value;
    }

    /**
     * Gets the value of the scientificDirectorOfficeName33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirectorOfficeName33() {
        return scientificDirectorOfficeName33;
    }

    /**
     * Sets the value of the scientificDirectorOfficeName33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirectorOfficeName33(String value) {
        this.scientificDirectorOfficeName33 = value;
    }

    /**
     * Gets the value of the scientificDirectorWorkLevel34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificDirectorWorkLevel34() {
        return scientificDirectorWorkLevel34;
    }

    /**
     * Sets the value of the scientificDirectorWorkLevel34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificDirectorWorkLevel34(String value) {
        this.scientificDirectorWorkLevel34 = value;
    }

    /**
     * Gets the value of the publicationsTotal35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationsTotal35() {
        return publicationsTotal35;
    }

    /**
     * Sets the value of the publicationsTotal35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationsTotal35(String value) {
        this.publicationsTotal35 = value;
    }

    /**
     * Gets the value of the publicationsWitchout36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationsWitchout36() {
        return publicationsWitchout36;
    }

    /**
     * Sets the value of the publicationsWitchout36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationsWitchout36(String value) {
        this.publicationsWitchout36 = value;
    }

    /**
     * Gets the value of the publicationsMonograf37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationsMonograf37() {
        return publicationsMonograf37;
    }

    /**
     * Sets the value of the publicationsMonograf37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationsMonograf37(String value) {
        this.publicationsMonograf37 = value;
    }

    /**
     * Gets the value of the publicationsArticles38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationsArticles38() {
        return publicationsArticles38;
    }

    /**
     * Sets the value of the publicationsArticles38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationsArticles38(String value) {
        this.publicationsArticles38 = value;
    }

    /**
     * Gets the value of the publicationsCertificates39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationsCertificates39() {
        return publicationsCertificates39;
    }

    /**
     * Sets the value of the publicationsCertificates39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationsCertificates39(String value) {
        this.publicationsCertificates39 = value;
    }

    /**
     * Gets the value of the scientificOponent1FIO40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent1FIO40() {
        return scientificOponent1FIO40;
    }

    /**
     * Sets the value of the scientificOponent1FIO40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent1FIO40(String value) {
        this.scientificOponent1FIO40 = value;
    }

    /**
     * Gets the value of the scientificOponent1IdAcademicEducationDegreDetailType41 property.
     * 
     */
    public int getScientificOponent1IdAcademicEducationDegreDetailType41() {
        return scientificOponent1IdAcademicEducationDegreDetailType41;
    }

    /**
     * Sets the value of the scientificOponent1IdAcademicEducationDegreDetailType41 property.
     * 
     */
    public void setScientificOponent1IdAcademicEducationDegreDetailType41(int value) {
        this.scientificOponent1IdAcademicEducationDegreDetailType41 = value;
    }

    /**
     * Gets the value of the scientificOponent1IdAcademicRank42 property.
     * 
     */
    public int getScientificOponent1IdAcademicRank42() {
        return scientificOponent1IdAcademicRank42;
    }

    /**
     * Sets the value of the scientificOponent1IdAcademicRank42 property.
     * 
     */
    public void setScientificOponent1IdAcademicRank42(int value) {
        this.scientificOponent1IdAcademicRank42 = value;
    }

    /**
     * Gets the value of the scientificOponent1AcademicRank42 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent1AcademicRank42() {
        return scientificOponent1AcademicRank42;
    }

    /**
     * Sets the value of the scientificOponent1AcademicRank42 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent1AcademicRank42(String value) {
        this.scientificOponent1AcademicRank42 = value;
    }

    /**
     * Gets the value of the scientificOponent1IdOfficeOfInstitutions43 property.
     * 
     */
    public int getScientificOponent1IdOfficeOfInstitutions43() {
        return scientificOponent1IdOfficeOfInstitutions43;
    }

    /**
     * Sets the value of the scientificOponent1IdOfficeOfInstitutions43 property.
     * 
     */
    public void setScientificOponent1IdOfficeOfInstitutions43(int value) {
        this.scientificOponent1IdOfficeOfInstitutions43 = value;
    }

    /**
     * Gets the value of the scientificOponent1OfficeName44 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent1OfficeName44() {
        return scientificOponent1OfficeName44;
    }

    /**
     * Sets the value of the scientificOponent1OfficeName44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent1OfficeName44(String value) {
        this.scientificOponent1OfficeName44 = value;
    }

    /**
     * Gets the value of the scientificOponent1Response45 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent1Response45() {
        return scientificOponent1Response45;
    }

    /**
     * Sets the value of the scientificOponent1Response45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent1Response45(String value) {
        this.scientificOponent1Response45 = value;
    }

    /**
     * Gets the value of the scientificOponent1Observations46 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent1Observations46() {
        return scientificOponent1Observations46;
    }

    /**
     * Sets the value of the scientificOponent1Observations46 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent1Observations46(String value) {
        this.scientificOponent1Observations46 = value;
    }

    /**
     * Gets the value of the scientificOponent2FIO47 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent2FIO47() {
        return scientificOponent2FIO47;
    }

    /**
     * Sets the value of the scientificOponent2FIO47 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent2FIO47(String value) {
        this.scientificOponent2FIO47 = value;
    }

    /**
     * Gets the value of the scientificOponent2IdAcademicEducationDegreDetailType48 property.
     * 
     */
    public int getScientificOponent2IdAcademicEducationDegreDetailType48() {
        return scientificOponent2IdAcademicEducationDegreDetailType48;
    }

    /**
     * Sets the value of the scientificOponent2IdAcademicEducationDegreDetailType48 property.
     * 
     */
    public void setScientificOponent2IdAcademicEducationDegreDetailType48(int value) {
        this.scientificOponent2IdAcademicEducationDegreDetailType48 = value;
    }

    /**
     * Gets the value of the scientificOponent2IdAcademicRank49 property.
     * 
     */
    public int getScientificOponent2IdAcademicRank49() {
        return scientificOponent2IdAcademicRank49;
    }

    /**
     * Sets the value of the scientificOponent2IdAcademicRank49 property.
     * 
     */
    public void setScientificOponent2IdAcademicRank49(int value) {
        this.scientificOponent2IdAcademicRank49 = value;
    }

    /**
     * Gets the value of the scientificOponent2AcademicRank49 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent2AcademicRank49() {
        return scientificOponent2AcademicRank49;
    }

    /**
     * Sets the value of the scientificOponent2AcademicRank49 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent2AcademicRank49(String value) {
        this.scientificOponent2AcademicRank49 = value;
    }

    /**
     * Gets the value of the scientificOponent2IdOfficeOfInstitutions50 property.
     * 
     */
    public int getScientificOponent2IdOfficeOfInstitutions50() {
        return scientificOponent2IdOfficeOfInstitutions50;
    }

    /**
     * Sets the value of the scientificOponent2IdOfficeOfInstitutions50 property.
     * 
     */
    public void setScientificOponent2IdOfficeOfInstitutions50(int value) {
        this.scientificOponent2IdOfficeOfInstitutions50 = value;
    }

    /**
     * Gets the value of the scientificOponent2OfficeName51 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent2OfficeName51() {
        return scientificOponent2OfficeName51;
    }

    /**
     * Sets the value of the scientificOponent2OfficeName51 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent2OfficeName51(String value) {
        this.scientificOponent2OfficeName51 = value;
    }

    /**
     * Gets the value of the scientificOponent2Response52 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent2Response52() {
        return scientificOponent2Response52;
    }

    /**
     * Sets the value of the scientificOponent2Response52 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent2Response52(String value) {
        this.scientificOponent2Response52 = value;
    }

    /**
     * Gets the value of the scientificOponent2Observations53 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent2Observations53() {
        return scientificOponent2Observations53;
    }

    /**
     * Sets the value of the scientificOponent2Observations53 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent2Observations53(String value) {
        this.scientificOponent2Observations53 = value;
    }

    /**
     * Gets the value of the scientificOponent3FIO54 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent3FIO54() {
        return scientificOponent3FIO54;
    }

    /**
     * Sets the value of the scientificOponent3FIO54 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent3FIO54(String value) {
        this.scientificOponent3FIO54 = value;
    }

    /**
     * Gets the value of the scientificOponent3IdAcademicEducationDegreDetailType55 property.
     * 
     */
    public int getScientificOponent3IdAcademicEducationDegreDetailType55() {
        return scientificOponent3IdAcademicEducationDegreDetailType55;
    }

    /**
     * Sets the value of the scientificOponent3IdAcademicEducationDegreDetailType55 property.
     * 
     */
    public void setScientificOponent3IdAcademicEducationDegreDetailType55(int value) {
        this.scientificOponent3IdAcademicEducationDegreDetailType55 = value;
    }

    /**
     * Gets the value of the scientificOponent3IdAcademicRank56 property.
     * 
     */
    public int getScientificOponent3IdAcademicRank56() {
        return scientificOponent3IdAcademicRank56;
    }

    /**
     * Sets the value of the scientificOponent3IdAcademicRank56 property.
     * 
     */
    public void setScientificOponent3IdAcademicRank56(int value) {
        this.scientificOponent3IdAcademicRank56 = value;
    }

    /**
     * Gets the value of the scientificOponent3AcademicRank56 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent3AcademicRank56() {
        return scientificOponent3AcademicRank56;
    }

    /**
     * Sets the value of the scientificOponent3AcademicRank56 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent3AcademicRank56(String value) {
        this.scientificOponent3AcademicRank56 = value;
    }

    /**
     * Gets the value of the scientificOponent3IdOfficeOfInstitutions57 property.
     * 
     */
    public int getScientificOponent3IdOfficeOfInstitutions57() {
        return scientificOponent3IdOfficeOfInstitutions57;
    }

    /**
     * Sets the value of the scientificOponent3IdOfficeOfInstitutions57 property.
     * 
     */
    public void setScientificOponent3IdOfficeOfInstitutions57(int value) {
        this.scientificOponent3IdOfficeOfInstitutions57 = value;
    }

    /**
     * Gets the value of the scientificOponent3OfficeName58 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent3OfficeName58() {
        return scientificOponent3OfficeName58;
    }

    /**
     * Sets the value of the scientificOponent3OfficeName58 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent3OfficeName58(String value) {
        this.scientificOponent3OfficeName58 = value;
    }

    /**
     * Gets the value of the scientificOponent3Response59 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent3Response59() {
        return scientificOponent3Response59;
    }

    /**
     * Sets the value of the scientificOponent3Response59 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent3Response59(String value) {
        this.scientificOponent3Response59 = value;
    }

    /**
     * Gets the value of the scientificOponent3Observations60 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificOponent3Observations60() {
        return scientificOponent3Observations60;
    }

    /**
     * Sets the value of the scientificOponent3Observations60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificOponent3Observations60(String value) {
        this.scientificOponent3Observations60 = value;
    }

    /**
     * Gets the value of the observations66 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservations66() {
        return observations66;
    }

    /**
     * Sets the value of the observations66 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservations66(String value) {
        this.observations66 = value;
    }

    /**
     * Gets the value of the positiveResponses67 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveResponses67() {
        return positiveResponses67;
    }

    /**
     * Sets the value of the positiveResponses67 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveResponses67(String value) {
        this.positiveResponses67 = value;
    }

    /**
     * Gets the value of the negativeResponses68 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeResponses68() {
        return negativeResponses68;
    }

    /**
     * Sets the value of the negativeResponses68 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeResponses68(String value) {
        this.negativeResponses68 = value;
    }

    /**
     * Gets the value of the positiveMembers69 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveMembers69() {
        return positiveMembers69;
    }

    /**
     * Sets the value of the positiveMembers69 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveMembers69(String value) {
        this.positiveMembers69 = value;
    }

    /**
     * Gets the value of the negativeMembers70 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeMembers70() {
        return negativeMembers70;
    }

    /**
     * Sets the value of the negativeMembers70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeMembers70(String value) {
        this.negativeMembers70 = value;
    }

    /**
     * Gets the value of the positiveExperts71 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveExperts71() {
        return positiveExperts71;
    }

    /**
     * Sets the value of the positiveExperts71 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveExperts71(String value) {
        this.positiveExperts71 = value;
    }

    /**
     * Gets the value of the negativeExperts72 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeExperts72() {
        return negativeExperts72;
    }

    /**
     * Sets the value of the negativeExperts72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeExperts72(String value) {
        this.negativeExperts72 = value;
    }

    /**
     * Gets the value of the membersList73 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembersList73() {
        return membersList73;
    }

    /**
     * Sets the value of the membersList73 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembersList73(String value) {
        this.membersList73 = value;
    }

    /**
     * Gets the value of the visited74 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisited74() {
        return visited74;
    }

    /**
     * Sets the value of the visited74 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisited74(String value) {
        this.visited74 = value;
    }

    /**
     * Gets the value of the voted75 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoted75() {
        return voted75;
    }

    /**
     * Sets the value of the voted75 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoted75(String value) {
        this.voted75 = value;
    }

    /**
     * Gets the value of the doctorsInProfile76 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorsInProfile76() {
        return doctorsInProfile76;
    }

    /**
     * Sets the value of the doctorsInProfile76 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorsInProfile76(String value) {
        this.doctorsInProfile76 = value;
    }

    /**
     * Gets the value of the votedYes77 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotedYes77() {
        return votedYes77;
    }

    /**
     * Sets the value of the votedYes77 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVotedYes77(String value) {
        this.votedYes77 = value;
    }

    /**
     * Gets the value of the votedNo78 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotedNo78() {
        return votedNo78;
    }

    /**
     * Sets the value of the votedNo78 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVotedNo78(String value) {
        this.votedNo78 = value;
    }

    /**
     * Gets the value of the falsed79 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFalsed79() {
        return falsed79;
    }

    /**
     * Sets the value of the falsed79 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFalsed79(String value) {
        this.falsed79 = value;
    }

    /**
     * Gets the value of the scienseObject80 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienseObject80() {
        return scienseObject80;
    }

    /**
     * Sets the value of the scienseObject80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienseObject80(String value) {
        this.scienseObject80 = value;
    }

    /**
     * Gets the value of the scienseResult81828384 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienseResult81828384() {
        return scienseResult81828384;
    }

    /**
     * Sets the value of the scienseResult81828384 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienseResult81828384(String value) {
        this.scienseResult81828384 = value;
    }

    /**
     * Gets the value of the languade85 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguade85() {
        return languade85;
    }

    /**
     * Sets the value of the languade85 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguade85(String value) {
        this.languade85 = value;
    }

    /**
     * Gets the value of the dateOfPhD86 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfPhD86() {
        return dateOfPhD86;
    }

    /**
     * Sets the value of the dateOfPhD86 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfPhD86(String value) {
        this.dateOfPhD86 = value;
    }

    /**
     * Gets the value of the organistionDefenseName81New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganistionDefenseName81New() {
        return organistionDefenseName81New;
    }

    /**
     * Sets the value of the organistionDefenseName81New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganistionDefenseName81New(String value) {
        this.organistionDefenseName81New = value;
    }

    /**
     * Gets the value of the form82New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm82New() {
        return form82New;
    }

    /**
     * Sets the value of the form82New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm82New(String value) {
        this.form82New = value;
    }

    /**
     * Gets the value of the speciality83New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciality83New() {
        return speciality83New;
    }

    /**
     * Sets the value of the speciality83New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciality83New(String value) {
        this.speciality83New = value;
    }

    /**
     * Gets the value of the voteResult84New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoteResult84New() {
        return voteResult84New;
    }

    /**
     * Sets the value of the voteResult84New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoteResult84New(String value) {
        this.voteResult84New = value;
    }

    /**
     * Gets the value of the lastNameEN85New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameEN85New() {
        return lastNameEN85New;
    }

    /**
     * Sets the value of the lastNameEN85New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameEN85New(String value) {
        this.lastNameEN85New = value;
    }

    /**
     * Gets the value of the firstNameEN86New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameEN86New() {
        return firstNameEN86New;
    }

    /**
     * Sets the value of the firstNameEN86New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameEN86New(String value) {
        this.firstNameEN86New = value;
    }

    /**
     * Gets the value of the middleNameEN87New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleNameEN87New() {
        return middleNameEN87New;
    }

    /**
     * Sets the value of the middleNameEN87New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleNameEN87New(String value) {
        this.middleNameEN87New = value;
    }

    /**
     * Gets the value of the organistionDefenseNameEN88New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganistionDefenseNameEN88New() {
        return organistionDefenseNameEN88New;
    }

    /**
     * Sets the value of the organistionDefenseNameEN88New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganistionDefenseNameEN88New(String value) {
        this.organistionDefenseNameEN88New = value;
    }

    /**
     * Gets the value of the scienceIndustryNameEN89New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryNameEN89New() {
        return scienceIndustryNameEN89New;
    }

    /**
     * Sets the value of the scienceIndustryNameEN89New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryNameEN89New(String value) {
        this.scienceIndustryNameEN89New = value;
    }

    /**
     * Gets the value of the scienceSpecialityNameEN90New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityNameEN90New() {
        return scienceSpecialityNameEN90New;
    }

    /**
     * Sets the value of the scienceSpecialityNameEN90New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityNameEN90New(String value) {
        this.scienceSpecialityNameEN90New = value;
    }

    /**
     * Gets the value of the fioAcademicConsilBoss91New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOAcademicConsilBoss91New() {
        return fioAcademicConsilBoss91New;
    }

    /**
     * Sets the value of the fioAcademicConsilBoss91New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOAcademicConsilBoss91New(String value) {
        this.fioAcademicConsilBoss91New = value;
    }

    /**
     * Gets the value of the fioSpecRadaHead92New property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOSpecRadaHead92New() {
        return fioSpecRadaHead92New;
    }

    /**
     * Sets the value of the fioSpecRadaHead92New property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOSpecRadaHead92New(String value) {
        this.fioSpecRadaHead92New = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

}
