package com.java.lambda.iterable;

import java.util.List;
import java.util.function.Consumer;

public class IterableForEach {
    public static void main(String[] args) {
        
        List<String> datas = List.of("Alliano","Arya","irda","Faiz","Sendi");
        datas.forEach(new Consumer<String>() {
            @Override
            public void accept(String arg0) {
                System.out.println(arg0);
            }
        });



        //ForEach
        for (String str : datas) {
            System.out.println(str);
        }
        System.out.println("\n");
        //atau
        datas.forEach(arg -> {
            System.out.println(arg);
        });
        System.out.println("\n");


        //Anonymous class
        datas.forEach(new Consumer<String>() {
            @Override
            public void accept(String arg0) {
                System.out.println(arg0);
            }
        });
        System.out.println("\n");

        //menggunakan Lambda expresion
        datas.forEach(System.out::println);
    }
}
