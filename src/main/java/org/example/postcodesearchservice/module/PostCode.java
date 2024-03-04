package org.example.postcodesearchservice.module;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PostCode {

    @JsonProperty("post code")
    private String post;
    @JsonProperty("country abbreviation")
    private String countryAbbreviation;

    @JsonProperty("country")
    private String country;
    @JsonProperty("places")
    private Data[] places;

    @Getter
    @Setter
    public static class Data {
        @JsonProperty("place name")
        private String placeName;
        @JsonProperty("longitude")
        private String longitude;
        @JsonProperty("state")
        private String state;
        @JsonProperty("state abbreviation")
        private String stateAbbreviation;
        @JsonProperty("latitude")
        private String latitude;
    }
}
