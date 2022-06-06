package com.java.lambda.iterable;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {

        
        sayHello("hallo alliano");

        sayHello(null);
    }

    public static void sayHello(String name) {
        //memanggil class generic optional danmenmanggil method ofNullable dan 
        Optional.ofNullable(name).map(String::toUpperCase).ifPresent(System.out::println);

        //untuk menghandle yang datanya null kita bisa menggunakan ifPresentOrElse(ini menerima 2 paramenter expresion)
        Optional.ofNullable(name).map(val -> val.toUpperCase()).ifPresentOrElse(value -> System.out.println("Hallo " + value), () -> System.out.println("Hallo"));

        // Optional<String> optionalDatata = Optional.ofNullable(name);

        //Anonymous class
        // Optional<String> toUpper = optionalDatata.map(new Function<String,String>() {
        //     @Override
        //     public String apply(String arg0) {
        //         return arg0.toUpperCase();
        //     }
        // });

        //Lambda
        // Optional<String> toUpper = optionalDatata.map( (arg) -> arg.toUpperCase());
        // toUpper.ifPresent(value -> System.out.println("HAllo " + value));
    
    }
}
