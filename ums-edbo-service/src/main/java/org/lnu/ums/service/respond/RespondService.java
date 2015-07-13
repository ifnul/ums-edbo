package org.lnu.ums.service.respond;

import org.springframework.http.ResponseEntity;

public interface RespondService {

    <ENTITY> ResponseEntity<ENTITY> post(String url, Object request, Class<ENTITY> clz);

}
