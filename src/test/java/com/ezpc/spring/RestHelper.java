package com.ezpc.spring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public class RestHelper {
    public static TestRestTemplate testRestTemplate;
    public static HttpHeaders headers = new HttpHeaders();
    public static ObjectMapper mapper = new ObjectMapper()
            .findAndRegisterModules()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public static <T> ResponseEntity<T> handle(String uri, HttpMethod method, Class<T> responseType) {
        return testRestTemplate.exchange(uri, method, new HttpEntity<>(headers), responseType);
    }

    public static <T> ResponseEntity<T> handleBody(String uri, Object body, HttpMethod method, Class<T> responseType) {

        try {
            System.out.println(method + " {{host}}" + uri);
            System.out.println("Content-Type: application/json");
            System.out.println();
            System.out.println(mapper.writeValueAsString(body));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return testRestTemplate.exchange(uri, method, new HttpEntity<>(body, headers), responseType);
    }
}
