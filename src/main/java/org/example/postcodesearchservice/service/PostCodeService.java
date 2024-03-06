package org.example.postcodesearchservice.service;

import org.example.postcodesearchservice.module.PostCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostCodeService {

    private static final String API_BASE_URL = "https://api.zippopotam.us/us/";
    private final RestTemplate restTemplate;

    public PostCodeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PostCode getPostCodeData(String postcode) {
        if (!isValidPostcode(postcode)) {
            throw new IllegalArgumentException("Invalid postcode");
        }

        String apiUrl = API_BASE_URL + postcode;
        return restTemplate.getForObject(apiUrl, PostCode.class);
    }

    private boolean isValidPostcode(String postcode) {
        // Ваша логика валидации почтового индекса
        return postcode.matches("\\d{5}"); // Пример: проверка, что индекс состоит из 5 цифр
    }
}


