package com.vlad_zagorodnuk.service;

import com.vlad_zagorodnuk.dto.ApiRequest;
import com.vlad_zagorodnuk.view.ApiResponse;
import org.springframework.stereotype.Service;


@Service
public class ApiService {

    public ApiResponse check(ApiRequest apiRequest) {
        if (apiRequest == null || apiRequest.getId()!= 1) {
            return null;
        }
        return new ApiResponse("Test Testov");
    }
}
