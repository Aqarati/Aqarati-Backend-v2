package com.aqarati.property.service;

import com.aqarati.property.model.Property;
import com.aqarati.property.repository.PropertyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertySearchService {

    private final PropertyRepository propertyRepository;

    public List<Property> searchPropertyByKeyword(String keyword){
        return propertyRepository.searchByKeyword(keyword);
    }

}
