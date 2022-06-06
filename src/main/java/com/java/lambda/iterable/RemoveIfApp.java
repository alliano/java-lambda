package com.java.lambda.iterable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> datas = new ArrayList<String>();
        datas.addAll(List.of("Alliano","Arya","Gani","bayu","Irda","Daber","Ardiet","Faiz","Sendi"));
        datas.forEach(System.out::println);

        System.out.println("\n");
        //RemoveIf
        datas.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String arg0) {
                return arg0.length() > 5;
            }
        });
        datas.forEach(System.out::println);
    }
}
