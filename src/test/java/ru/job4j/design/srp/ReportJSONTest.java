package ru.job4j.design.srp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

import java.util.Calendar;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ReportJSONTest {

    @Test
    public void whenSupportJsonThenBooker() {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker = new Employee("Ivan", now, now, 100);
        store.add(worker);
        Report engine = new ReportBooker(store);
        SerializationSON json = new SerializationSON();
        final Gson gson = new GsonBuilder().create();
        String strJson = json.generate(engine.generate(e -> true));
        String rsl = gson.fromJson(strJson, String.class);
        assertThat(rsl, is(engine.generate(em -> true)));
    }
}