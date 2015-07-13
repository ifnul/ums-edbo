package org.lnu.ums.service.respond;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service("respondService")
public class DefaultRespondService implements RespondService {

    @Resource
    private RestTemplate restTemplate;

    @Override
    public <ENTITY> ResponseEntity<ENTITY> post(final String url, final Object request, final Class<ENTITY> clz) {
        return restTemplate.postForEntity(url, request, clz);
    }
}
