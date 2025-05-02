package com.ironhack.w2.d3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //ENUMS
        //CREAR UN OBJ DE TIPO USER
        User user1 = new User("Vero");
        System.out.println(user1);

        //HASHMAPS
        //son estructuras que se usan para definir clave:valor
        //clave como identificador (como el DNI por ej)
        // y valor sería el nombre de la persona
        Map<String, String> nationalleaders = new HashMap<>();
        nationalleaders.put("Ecuador", "Lenin Moreno");
        nationalleaders.put("India", "Ram Nath Kovind");
        nationalleaders.put("Japan", "Shigeru Ishiba");
        nationalleaders.put("Botswana", "Mokgweetsi Masisi");
        System.out.println(nationalleaders);
        System.out.println(nationalleaders.get("Ecuador"));

        nationalleaders.forEach((key, value) -> {
            System.out.println("key: " + key + "Value: " + value);
        });

        Country india = new Country("India", "New Delhi", 123000456, "Ram Nath Kovind");
        Country botswana = new Country("Botswana", "Gaborone", 12235456, "Mokgweetsi Masisi");
        Country japan = new Country("Japan", "Tokio", 120235456, "Shigeru Ishiba");
        Map<String, Country> countryMap = new HashMap<>();

        countryMap.put("India", india);
        countryMap.put("Botswana", botswana);
        countryMap.put("Japan", japan);

        System.out.println(countryMap);
        System.out.println(countryMap.get("Japan"));
        System.out.println(countryMap.get("Japan").getCapital());

    }
}
