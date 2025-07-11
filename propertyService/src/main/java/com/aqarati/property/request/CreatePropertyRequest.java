package com.aqarati.property.request;

import com.aqarati.property.model.PropertyCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

import com.aqarati.property.model.PropertyStatus;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePropertyRequest {

    private String name;
    private String description;
    private Double price;
    private List<String> features;
    private PropertyCategory propertyCategory;
    private LocationRequest location;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class LocationRequest {
        private Double latitude;
        private Double longitude;
        private String city;
        private String district;
    }
}
