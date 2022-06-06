package com.java.lambda;

import java.util.function.Supplier;
/**
 * 
 */
public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "ayam abkar";
            }
        };
        System.out.println(supplier.get());

        Supplier<String> supplier2 = () -> "makanan halal";
        System.out.println(supplier2.get());

        };
    }
    
