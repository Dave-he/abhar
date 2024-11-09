package org.harm.common;

import java.io.StringReader;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

/**
 * @author hyx
 * @date 2024/11/9
 */
@Converter(autoApply = true)
public class JsonObjectConverter implements AttributeConverter<JsonObject, String> {

    @Override
    public String convertToDatabaseColumn(JsonObject attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.toString();
    }

    @Override
    public JsonObject convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        return Json.createReader(new StringReader(dbData)).readObject();
    }
}