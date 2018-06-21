package io.bricerb.otcregression.rest;

import io.bricerb.otcregression.models.MemberDetailsRequest;
import io.bricerb.otcregression.models.MemberDetailsResponse;
import io.bricerb.otcregression.repo.Members;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberDetails {

    Members members = new Members();

    @PostMapping(path = "/WebApi/GetMemberDetails")
    public MemberDetailsResponse getMemberDetails(@RequestBody MemberDetailsRequest request) {
        String cardNumber = request.getCardNumber() != null ? request.getCardNumber() : request.getSerialNumber();
        return members.getMemberDetails(cardNumber);
    }

}
