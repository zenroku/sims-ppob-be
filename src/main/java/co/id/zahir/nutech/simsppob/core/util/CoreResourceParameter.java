package co.id.zahir.nutech.simsppob.core.util;

import co.id.zahir.nutech.simsppob.core.model.WhitelistEndpoint;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CoreResourceParameter {

    public static List<WhitelistEndpoint> getWhitelistEndpoint() {
        ObjectMapper om = new ObjectMapper();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream is = classLoader.getResourceAsStream("whitelist.json");

        try {
            return om.readValue(is, new TypeReference<>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }
}
