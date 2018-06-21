package io.bricerb.otcregression.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemEligibilityRequest {


    @SerializedName("serialNumber")
    private String serialNumber;
    @SerializedName("retailer")
    private String retailer;
    @SerializedName("UPC")
    private String uPC;
    @SerializedName("ApiVersion")
    private String apiVersion;
    @SerializedName("mobileAppVersion")
    private String mobileAppVersion;
    @SerializedName("success")
    private boolean success;

    public boolean isSuccess() {return success; }

    public void setSuccess(Boolean success) { this.success = success; }

    public String getRetailer() {
        return retailer;
    }

    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    public void setuPC(String uPC) {
        this.uPC = uPC;
    }

    public String getUPC() { return uPC; }

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

    public String getSerialNumber() {

        return serialNumber;
    }

    @Override
    public String toString() {
        return "ItemEligibilityRequest{" +
                "serialNumber='" + serialNumber + '\'' +
                ", retailer='" + retailer + '\'' +
                ", uPC='" + uPC + '\'' +
                ", apiVersion='" + apiVersion + '\'' +
                ", mobileAppVersion='" + mobileAppVersion + '\'' +
                '}';
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

