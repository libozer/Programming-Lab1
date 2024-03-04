package org.example.postcodesearchservice.controller;

import org.example.postcodesearchservice.module.PostCode;
import org.example.postcodesearchservice.service.PostCodeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PostCodeController {
        private final PostCodeService postCodeService;

    public PostCodeController(PostCodeService postCodeService){
        this.postCodeService = postCodeService;
    }

    @GetMapping("/postcode/{title}")
    public PostCode getPostCodeByTitle(@PathVariable String title) {
        return postCodeService.getPostCodeData(title);
    }
}
