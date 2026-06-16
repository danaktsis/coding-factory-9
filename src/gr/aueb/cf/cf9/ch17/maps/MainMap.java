package gr.aueb.cf.cf9.ch17.maps;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("GR", "Greece");              // insert
        countries.put("USA", "United States");
        countries.put("IT", "Italy");
        countries.put("GR", "Germany");             // update

        String country = countries.get("GR");
        System.out.println(country);

        countries.remove("USA");

        countries.forEach((key, value) -> System.out.println(key + " - " + value));

    }
}
