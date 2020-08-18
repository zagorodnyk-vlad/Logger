package com.vlad_zagorodnuk.controller;

import com.vlad_zagorodnuk.dto.ApiRequest;
import com.vlad_zagorodnuk.service.ApiService;
import com.vlad_zagorodnuk.view.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/check")
    public ApiResponse check(@RequestBody ApiRequest apiRequest) {
        return apiService.check(apiRequest);
    }
}
