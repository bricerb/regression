package io.bricerb.otcregression.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SubmitItemRequest implements Serializable {


    @SerializedName("SerialNumber")
    private String serialNumber;
    @SerializedName("UPC")
    private String upc;
    @SerializedName("ItemDescription")
    private String itemDescription;
    @SerializedName("OfferDescription")
    private String offerDescription;
    @SerializedName("Retailer")
    private String retailer;
    @SerializedName("Comments")
    private String comments;
    @SerializedName("ShouldBePaidFor")
    private Boolean shouldBePaidFor;
    @SerializedName("ShouldHaveDiscount")
    private Boolean shouldHaveDiscount;
    @SerializedName("ApiVersion")
    private String apiVersion;
    @SerializedName("MobileAppVersion")
    private String mobileAppVersion;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getRetailer() {
        return retailer;
    }

    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getShouldBePaidFor() {
        return shouldBePaidFor;
    }

    public void setShouldBePaidFor(Boolean shouldBePaidFor) {
        this.shouldBePaidFor = shouldBePaidFor;
    }

    public Boolean getShouldHaveDiscount() {
        return shouldHaveDiscount;
    }

    public void setShouldHaveDiscount(Boolean shouldHaveDiscount) {
        this.shouldHaveDiscount = shouldHaveDiscount;
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
}
