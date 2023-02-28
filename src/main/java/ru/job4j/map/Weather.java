package ru.job4j.map;

import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (Info i : list) {
            map.putIfAbsent(i.getCity(), 0);
            map.computeIfPresent(i.getCity(), (k, v) -> v + i.getRainfall());
        }
        for (String s : map.keySet()) {
            rsl.add(new Info(s, map.get(s)));
        }
        rsl.sort(Comparator.comparing(Info::getRainfall).reversed());
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }

        @Override
        public String toString() {
            return "Info{"
                    + "city='" + city + '\''
                    + ", rainfall=" + rainfall
                    + '}';
        }
    }
}
