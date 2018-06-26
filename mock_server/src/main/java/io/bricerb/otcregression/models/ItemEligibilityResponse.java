package io.bricerb.otcregression.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ItemEligibilityResponse implements Serializable {

    @SerializedName("itemDescription")
    private String itemDescription;

    @SerializedName("eligibleLimitedSpend")
    private String eligibleLimitedSpend;

    @SerializedName("listOfOfferDescriptions")
    private List<String> listOfOfferDescriptions;

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getEligibleLimitedSpend() {
        return eligibleLimitedSpend;
    }

    public void setEligibleLimitedSpend(String eligibleLimitedSpend) {
        this.eligibleLimitedSpend = eligibleLimitedSpend;
    }

    public List<String> getListOfOfferDescriptions() {
        return listOfOfferDescriptions;
    }

    public void setListOfOfferDescriptions(List<String> listOfOfferDescriptions) {
        this.listOfOfferDescriptions = listOfOfferDescriptions;
    }

    @Override
    public String toString() {
        return "ItemEligibilityResponse{" +
                "itemDescription='" + itemDescription + '\'' +
                ", eligibleLimitedSpend=" + eligibleLimitedSpend +
                ", listOfOfferDescriptions=" + listOfOfferDescriptions +
                '}';
    }
}