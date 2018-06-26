package io.bricerb.otcregression.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MemberDetailsResponse {

    @SerializedName("serialNumber")
    private String serialNumber;
    @SerializedName("cardBalance")
    private String cardBalance;
    @SerializedName("cardExpiration")
    private String cardExpiration;
    @SerializedName("customerSupportNumber")
    private String customerSupportNumber;
    @SerializedName("issuer")
    private String issuer;
    @SerializedName("program")
    private String program;
    @SerializedName("hasLimitedSpend")
    private String hasLimitedSpend;
    @SerializedName("hasOffers")
    private String hasOffers;
    @SerializedName("retailers")
    private List<String> retailers = null;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(String cardBalance) {
        this.cardBalance = cardBalance;
    }

    public String getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(String cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    public String getCustomerSupportNumber() {
        return customerSupportNumber;
    }

    public void setCustomerSupportNumber(String customerSupportNumber) {
        this.customerSupportNumber = customerSupportNumber;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getHasLimitedSpend() {
        return hasLimitedSpend;
    }

    public void setHasLimitedSpend(String hasLimitedSpend) {
        this.hasLimitedSpend = hasLimitedSpend;
    }

    public String getHasOffers() {
        return hasOffers;
    }

    public void setHasOffers(String hasOffers) {
        this.hasOffers = hasOffers;
    }

    public List<String> getRetailers() {
        return retailers;
    }

    public void setRetailers(List<String> retailers) {
        this.retailers = retailers;
    }

    @Override
    public String toString() {
        return "MemberDetailsResponse{" +
                "serialNumber='" + serialNumber + '\'' +
                ", cardBalance=" + cardBalance +
                ", cardExpiration='" + cardExpiration + '\'' +
                ", customerSupportNumber='" + customerSupportNumber + '\'' +
                ", issuer='" + issuer + '\'' +
                ", program='" + program + '\'' +
                ", hasLimitedSpend=" + hasLimitedSpend +
                ", hasOffers=" + hasOffers +
                ", retailers=" + retailers +
                '}';
    }
}