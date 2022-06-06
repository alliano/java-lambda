package com.java.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * contoh2 class interface yang dapat kita buat dengan lambda expresion
 * Consumer
 * Function
 * Predicate
 * dan masih banyak lagi 
 * untuk info lebih lanjut kunjungi link ini https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
 */
public class ConsumerApp {
    public static void main(String[] args) {
       Consumer<String> consumer = new Consumer<String>() {
           @Override
           public void accept(String arg0) {
               System.out.println(arg0);
               
           }
       };
       consumer.accept("astagfirullah ");

       //labda
       Consumer<String> consumer2 = (arg) -> System.out.println(arg);
       consumer2.accept("tobat ki");


       Function<String,Number> countLenght = new Function<String,Number>() {
        @Override
        public Number apply(String arg0) {
            return arg0.length();
        };
       };
       System.out.println(countLenght.apply("nama saya mustakim abdillah:V"));

       Function<String,Integer> func = (value) -> value.length();

       System.out.println(func.apply("mugensukoyomi"));

       Predicate<String> predicate = new Predicate<String>() {
        @Override   
        public boolean test(String arg0) {
            return arg0.isBlank();
        };
       };
       System.out.println(predicate.test("sindra tense"));
       System.out.println(predicate.test(""));


    }
    
    
    
}
