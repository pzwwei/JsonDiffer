package br.com.felipe.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Class responsible to convert JSON
 */
@Component
public class JsonConverter {

    public Map<String, String> toMap(String json) {
        Gson gson = new Gson();
        Type jsonToMapToken = new TypeToken<Map<String, String>>(){}.getType();
        Map<String,String> jsonMap = gson.fromJson(json, jsonToMapToken);
        return jsonMap;
    }
}
