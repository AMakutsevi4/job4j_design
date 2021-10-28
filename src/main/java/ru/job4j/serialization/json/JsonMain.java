package ru.job4j.serialization.json;

import org.json.JSONArray;
import org.json.JSONObject;
import ru.job4j.serialization.java.Contact;

import java.util.ArrayList;
import java.util.List;

public class JsonMain {
    public static void main(String[] args) {

        JSONObject jsonEngine = new JSONObject("{\"power\":\"500\"}");

        List<String> list = new ArrayList<>();
        list.add("Student");
        list.add("Free");
        JSONArray jsnSpecification = new JSONArray(list);
        Car car = new Car("yokko", new Engine("500"),
                true, 5, "Rus", "USA", "Ind");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("brand", car.getBrand());
        jsonObject.put("engine", car.getEngine());
        jsonObject.put("addOptions", car.isAddOptions());
        jsonObject.put("yearsWarranty", car.getYearsWarranty());
        jsonObject.put("engine", jsonEngine);
        jsonObject.put("productions", jsnSpecification);

        System.out.println(jsonObject.toString());

        System.out.println(new JSONObject(car).toString());

    }
}
