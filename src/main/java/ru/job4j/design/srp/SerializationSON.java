package ru.job4j.design.srp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SerializationSON implements Serialization {

    @Override
    public String generate(String filter) {
        final Gson gson = new GsonBuilder().create();
        return gson.toJson(filter);
    }
}
