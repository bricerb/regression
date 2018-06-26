package io.bricerb.otcregression.repo;

import com.google.gson.Gson;
import io.bricerb.otcregression.models.ItemEligibilityResponse;
import io.bricerb.otcregression.models.MemberDetailsResponse;
import io.bricerb.otcregression.utils.Utilities;

import java.io.FileReader;
import java.util.List;

public class Items {

    final private static String itemsDir = System.getProperty("user.dir") + "/data/items/";
    private Gson gson = new Gson();

    final private String defaultNotEligible = itemsDir + "ineligible/NotEligible.json";

    public ItemEligibilityResponse getItemEligibility (String upcNumber) {
        List<String> filesList = Utilities.deserialize(itemsDir);
        ItemEligibilityResponse response = new ItemEligibilityResponse();
        for (String fileName : filesList) {
            if (fileName.contains(".json")) {
                response = getItem(fileName);
                String[] filePath = fileName.split("/");
                if (filePath[filePath.length - 1].contains(String.valueOf(upcNumber))) {
                    break;
                }
                else {
                    response = getItem(defaultNotEligible);
                }
            }
        }
        return response;
    }

    public ItemEligibilityResponse getItem(String fileName) {
        ItemEligibilityResponse response = new ItemEligibilityResponse();
        try {
            response = gson.fromJson(new FileReader(fileName), ItemEligibilityResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
