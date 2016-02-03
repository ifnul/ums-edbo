package org.lnu.is.edbo.cal;

import com.google.common.collect.Multimap;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import static java.util.stream.Collectors.joining;

public abstract class AbstractGetEdboCommand<T> extends HystrixCommand<T> {

    private Class<T> clz;
    private RestTemplate restTemplate;
    private String baseUrl;

    /**
     * Basic constructor, which has all required params for
     * get http method operation.
     * @param name name of the hystrix command.Needed mostly for
     *             internal hystrix processes.
     * @param baseUrl base url of edbo service.
     *                ex.: http://localhost:8080/
     * @param clz clz of the future serialized object.
     * @param restTemplate restTemplate to do http operations.
     */
    public AbstractGetEdboCommand(String name, String baseUrl, Class<T> clz, RestTemplate restTemplate) {
        super(HystrixCommandGroupKey.Factory.asKey(name));
        this.clz = clz;
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    protected abstract Multimap<String, String> getParams();

    protected abstract String getApiUri();

    public MultiValueMap<String, String> getHeaders() {
        return new HttpHeaders();
    }

    @Override
    protected T run() throws Exception {
        final Multimap<String, String> paramsMap = getParams();
        String params = paramsMap.keySet().stream()
                .map(key -> {
                    String paramStr = paramsMap.get(key).stream()
                            .map(param -> String.format("%s=%s", key, param))
                            .collect(joining("&"));

                    return paramStr;
                }).collect(joining("&"));
        String url = String.format("%s%s?%s", baseUrl, getApiUri(), params);

        HttpEntity<T> entity = new HttpEntity<>(getHeaders());

        return restTemplate.exchange(url, HttpMethod.GET, entity, clz).getBody();
    }
}
