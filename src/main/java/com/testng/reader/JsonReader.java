package com.testng.reader;

import java.io.IOException;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.testng.modelos.User;

public class JsonReader {
    private final static String JSON_FILE_PATH = "src/main/resources/data/user.json";

    public static User leerUsuarioJson() {
        final var objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(JSON_FILE_PATH), User.class);
        } catch (IOException IOException) {
            throw new RuntimeException("Error al leer el archivo JSON: " + JSON_FILE_PATH, IOException);

    }
}
}
