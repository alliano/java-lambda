package com.java.lambda.iterable;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;


public class MapForEach {
    public static void main(String[] args) {
        Map<String,String> data = new HashMap<>();
        data.put("firstName", "Alli");
        data.put("lastName", "hehe");
        data.put("address", "savana jaya");
        data.put("dream", "software engginer");
        data.put("major", "tekhnik informatika");
        data.put("collage", "Sanga buana University");

        //Anonymous class
        data.forEach(new BiConsumer<String,String>() {
            @Override
            public void accept(String arg0, String arg1) {
                System.out.println(arg0 + " : " + arg1 );
            }
        });

        //Lambda
       data.forEach((key, value) -> System.out.println(key+" : " + value));


    }
}
