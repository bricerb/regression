package io.bricerb.otcregression.utils;

import com.google.gson.Gson;
import io.bricerb.otcregression.models.ItemEligibilityRequest;
import io.bricerb.otcregression.models.ItemEligibilityResponse;
import io.bricerb.otcregression.models.MemberDetailsRequest;
import io.bricerb.otcregression.models.MemberDetailsResponse;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utilities {

    public static List<String> deserializeMember(String base) {
        List<String> list = new ArrayList<>();
        try {
            List<File> filesInFolder = Files.walk(Paths.get(base))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());

            filesInFolder.forEach(file -> list.add(file.getPath()));
        } catch (Exception e) {
        }

        return list;
    }
}
