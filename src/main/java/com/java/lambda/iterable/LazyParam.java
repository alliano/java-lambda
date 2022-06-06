package com.java.lambda.iterable;

import java.util.function.Supplier;

public class LazyParam {
    public static void main(String[] args) {

        testScore(90, "alliano");

        testScore2(90, () -> getName());

        
        /**
         * lalu bagai mana jika mathod getneme itu berjalanlambat cnth nya seperti 
         * get anme merequest data dari api
         * nah disini bari kita menggunakan lazy parameter
         */
        
    }

    public static void testScore(int skor, String name){
        if(skor > 80) {
            System.out.println("selamant " + name + " skor anda " + skor + " anda lulu");
        }else{
            System.out.println("maaf anda tidak lulus");
        }
       

    }
    //lazy parameter
    public static void testScore2(int skor, Supplier<String> name){
        if(skor > 80) {
            System.out.println("selamant " + name.get() + " skor anda " + skor + " anda lulus");
        }else{
            System.out.println("maaf anda tidak lulus");
        }
       
    } 

    public static String getName(){
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println(e);
            
        }
        return "Alliano";
    }
}
