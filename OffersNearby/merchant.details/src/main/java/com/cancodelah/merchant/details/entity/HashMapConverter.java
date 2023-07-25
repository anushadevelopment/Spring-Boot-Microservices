package com.cancodelah.merchant.details.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashMapConverter implements AttributeConverter<Map<String, Object>, String> {

    @Autowired
    private Merchant merchant;
    @Override
    public String convertToDatabaseColumn(Map<String, Object> merchant) {

        ObjectMapper objectMapper = new ObjectMapper();

        String locationJson = null;
        try {
            locationJson = objectMapper.writeValueAsString(merchant);
        } catch (final JsonProcessingException e) {
            log.error("JSON writing error", e);
        }
        return locationJson;
    }
    @Override
    public Map<String, Object> convertToEntityAttribute(String locationInfoJSON) {

        Map<String, Object> locationInfo = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            locationInfo = objectMapper.readValue(locationInfoJSON,
                    new TypeReference<HashMap<String, Object>>() {});
        } catch (final IOException e) {
            log.error("JSON reading error", e);
        }
        return locationInfo;
    }
    @Convert(converter = HashMapConverter.class)
    private Map<String, Object> locationInfo;
}

