package org.lnu.is.edbo.cal.person;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDPersonDocuments;

public class GetPersonDocumentsCmd extends AbstractGetEdboCommand<ArrayOfDPersonDocuments> {

    private String sessionGUID;
    private String actualDate;
    private int idLanguage;
    private String personCodeU;
    private int idPersonDocumentType;
    private int idPersonDocument;
    private String universityKode;
    private int isEntrantDocument;


    public GetPersonDocumentsCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetPersonDocumentsCmd", baseUrl, ArrayOfDPersonDocuments.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "Id_Language", String.valueOf(idLanguage));
        put(params, "ActualDate", actualDate);
        put(params, "PersonCodeU", personCodeU);
        put(params, "Id_PersonDocumentType", String.valueOf(idPersonDocumentType));
        put(params, "Id_PersonDocument", String.valueOf(idPersonDocument));
        put(params, "UniversityKode", universityKode);
        put(params, "PersonCodeU", personCodeU);
        put(params, "IsEntrantDocument", String.valueOf(isEntrantDocument));

        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/persons/documents";
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public void setIdLanguage(int idLanguage) {
        this.idLanguage = idLanguage;
    }

    public void setIdPersonDocument(int idPersonDocument) {
        this.idPersonDocument = idPersonDocument;
    }

    public void setIdPersonDocumentType(int idPersonDocumentType) {
        this.idPersonDocumentType = idPersonDocumentType;
    }

    public void setIsEntrantDocument(int isEntrantDocument) {
        this.isEntrantDocument = isEntrantDocument;
    }

    public void setPersonCodeU(String personCodeU) {
        this.personCodeU = personCodeU;
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }

    public void setUniversityKode(String universityKode) {
        this.universityKode = universityKode;
    }
}
