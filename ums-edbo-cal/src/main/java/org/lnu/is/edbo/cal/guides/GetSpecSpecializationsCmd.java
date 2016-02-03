package org.lnu.is.edbo.cal.guides;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.lnu.is.edbo.cal.AbstractGetEdboCommand;
import org.springframework.web.client.RestTemplate;
import ua.edboservice.ArrayOfDSpecSpecialization;

public class GetSpecSpecializationsCmd extends AbstractGetEdboCommand<ArrayOfDSpecSpecialization> {

    private String sessionGUID;
    private String specDirectionsCode;
    private String specSpecialityCode;

    public GetSpecSpecializationsCmd(String baseUrl, RestTemplate restTemplate) {
        super("GetSpecSpecializationsCmd", baseUrl, ArrayOfDSpecSpecialization.class, restTemplate);
    }

    @Override
    protected Multimap<String, String> getParams() {
        Multimap<String, String> params = ArrayListMultimap.create();

        put(params, "SessionGUID", sessionGUID);
        put(params, "SpecDirectionsCode", specDirectionsCode);
        put(params, "SpecSpecialityCode", specSpecialityCode);


        return params;
    }

    @Override
    protected String getApiUri() {
        return "/api/guides/spec/specializations";
    }

    public void setSessionGUID(String sessionGUID) {
        this.sessionGUID = sessionGUID;
    }

    public void setSpecDirectionsCode(String specDirectionsCode) {
        this.specDirectionsCode = specDirectionsCode;
    }

    public void setSpecSpecialityCode(String specSpecialityCode) {
        this.specSpecialityCode = specSpecialityCode;
    }
}
