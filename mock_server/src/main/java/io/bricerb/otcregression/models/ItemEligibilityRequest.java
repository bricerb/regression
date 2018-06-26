package io.bricerb.otcregression.models;

public class ItemEligibilityRequest {


    private String serialNumber;
    private String retailer;
    private String UPC;
    private String uPC;
    private String upc;
    private String ApiVersion;
    private String apiVersion;
    private String mobileAppVersion;
    private boolean success;

    public boolean isSuccess() {return success; }

    public void setSuccess(Boolean success) { this.success = success; }

    public String getRetailer() {
        return retailer;
    }

    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    public void setuPC(String UPC) {
        this.UPC = UPC;
    }

    public String getUPC() { return UPC; }

    public String getApiVersion() {
        return ApiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.ApiVersion = apiVersion;
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
                ", UPC='" + UPC + '\'' +
                ", uPC='" + uPC + '\'' +
                ", upc='" + upc + '\'' +
                ", ApiVersion='" + ApiVersion + '\'' +
                ", apiVersion='" + apiVersion + '\'' +
                ", mobileAppVersion='" + mobileAppVersion + '\'' +
                ", success=" + success +
                '}';
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

