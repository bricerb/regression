package io.bricerb.otcregression.rest;

import io.bricerb.otcregression.models.ItemEligibilityRequest;
import io.bricerb.otcregression.models.ItemEligibilityResponse;
import io.bricerb.otcregression.repo.Items;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemEligibility {

    Items items = new Items();

    @PostMapping(path = "/WebApi/GetItemEligibility")
    public ItemEligibilityResponse getItemElgibility (@RequestBody ItemEligibilityRequest request) {
        return items.getItemEligibility(request.getUPC());
    }

}
