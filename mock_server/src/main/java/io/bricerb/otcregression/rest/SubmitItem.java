package io.bricerb.otcregression.rest;

import io.bricerb.otcregression.models.SubmitItemRequest;
import io.bricerb.otcregression.models.SubmitItemResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubmitItem {

    @PostMapping(path = "/WebApi/ReportError")
    public SubmitItemResponse submitItem (@RequestBody SubmitItemRequest request) {
        return new SubmitItemResponse();
    }

}
