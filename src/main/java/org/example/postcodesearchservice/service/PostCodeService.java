package org.example.postcodesearchservice.service;

import org.example.postcodesearchservice.module.PostCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostCodeService {

    private static final String API_URL = "https://api.zippopotam.us/us/%s";
    private final RestTemplate restTemplate;

    public PostCodeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public PostCode getBooksData(String postcode) {
        String apiUrl = String.format(API_URL, postcode);
        return restTemplate.getForObject(apiUrl, PostCode.class);
    }
}


