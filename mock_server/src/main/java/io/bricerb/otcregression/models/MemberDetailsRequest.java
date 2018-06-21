package io.bricerb.otcregression.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MemberDetailsRequest {

    private String cardNumber;
    private String serialNumber;
    private String apiVersion;
    private String mobileAppVersion;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getMobileAppVersion() {
        return mobileAppVersion;
    }

    public void setMobileAppVersion(String mobileAppVersion) {
        this.mobileAppVersion = mobileAppVersion;
    }

    @Override
    public String toString() {
        return "MemberDetailsRequest{" +
                "cardNumber='" + cardNumber + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", apiVersion='" + apiVersion + '\'' +
                ", mobileAppVersion='" + mobileAppVersion + '\'' +
                '}';
    }
}
