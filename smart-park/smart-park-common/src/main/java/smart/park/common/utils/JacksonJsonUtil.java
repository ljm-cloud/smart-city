package smart.park.common.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonJsonUtil {

    public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }

    public static <T> T jsonToList(String json, TypeReference<T> valueType) {

        if (json == null) {
            return null;
        }

        json = json.trim();
        if (json.equals("")) {
            return null;
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, valueType);
        } catch (Exception e) {
            return null;
        }
    }

    public static <T> T jsonToBean(String json,Class<T> valueType){
        if (json==null){
            return null;
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, valueType);
        } catch (Exception e) {
            return null;
        }
    }

    public static String beanToJson(Object value){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(value);
        }catch (Exception e){
            return null;
        }
    }
}
