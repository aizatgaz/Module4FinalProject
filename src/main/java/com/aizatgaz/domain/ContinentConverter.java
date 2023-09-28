package com.aizatgaz.domain;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.NoSuchElementException;

/**
 * конвертёр для Enum'а Continent, которые находится в базе данных как Integer
 */

@Converter
public class ContinentConverter implements AttributeConverter<Continent, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Continent continent) {
        return continent.getId();
    }

    @Override
    public Continent convertToEntityAttribute(Integer integer) {
        for (Continent value : Continent.values()) {
            if (value.getId() == integer) {
                return value;
            }
        }
        throw new NoSuchElementException("Wrong integer");
    }
}
