package io.bricerb.otcregression.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemEligibility {

    @PostMapping(path = "/WebApi/GetItemEligibility")
    public String getItemElgibility () {
        return "itemEligibility";
    }

}
