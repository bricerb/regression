package io.bricerb.otcregression.repo;

import com.google.gson.Gson;
import io.bricerb.otcregression.models.MemberDetailsResponse;
import io.bricerb.otcregression.utils.Utilities;

import java.io.FileReader;
import java.util.List;

public class Members {

    final private static String membersDir = System.getProperty("user.dir") + "/data/members/";
    private Gson gson = new Gson();

    public MemberDetailsResponse getMemberDetails(String cardNumber) {
        List<String> filesList = Utilities.deserialize(membersDir);
        MemberDetailsResponse response = new MemberDetailsResponse();
        for (String fileName : filesList) {
            response = getMember(fileName);
            String[] filePath = fileName.split("/");
            if (filePath[filePath.length-1].contains(String.valueOf(cardNumber)) || response.getSerialNumber().equals(String.valueOf(cardNumber))) {
                break;
            }
        }
        return response;
    }

    public MemberDetailsResponse getMember(String fileName) {
        MemberDetailsResponse response = new MemberDetailsResponse();
        try {
            response = gson.fromJson(new FileReader(fileName), MemberDetailsResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
