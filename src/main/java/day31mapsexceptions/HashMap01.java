package day31mapsexceptions;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        //Hashmap arkasinda calisan mekanizma nasildir

        HashMap<String,String> capitals = new HashMap<>();
        capitals.put("USA","Washington");
        capitals.get("USA");
        capitals.put("Italy","Rome");
        capitals.put("Turkiye", "Ankara");
        capitals.get("Turkiye");
        capitals.put("Italy","Florance");
        System.out.println("capitals.hashCode() = " + capitals.hashCode());
    }
}

