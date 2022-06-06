package com.java.lambda;

import com.java.simpleAction;

/**
 * lambda mirip dengan anoanymous function
 * tetapi sesungguhnya lamda adallah representasi dari anonymous class
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //sinbtax biasa saat kita mau instance sebuah interface
        simpleAction action = new simpleAction() {
            @Override
            public String action(String name) {
                return name;
            }
        };
        System.out.println(action.action("alliano"));


        // sintax lambda
        simpleAction action2 = (String name) -> {
            return "hallo ms hedeh gatau gw:v " + name;
        };
        System.out.println(action2.action("alliano"));

        /**
         * ada bebberapa short sintax java lambda
         * berikut ini adalah contoh nya
         */

         /**
          * kita bisa menuliskan sintax seperti ini tampa membuat kuung kurawal {} 
          * bahkan kita tidak perlu menuliskan return dan java otomatis mereturn kan
          * Tentunya user javascrip tidak asing dengan cara ini karna mirip dengan arrow function
          * 
          */
         simpleAction action3 = (String name) -> "hallo " + name; 
         System.out.println(action3.action("alliano"));

        /**
         * bahakan kita bisa tidak menulis tipe data dari parameter tersebut
         * maka secara default java mengetahuinya
         */
         simpleAction action4 = (name) -> "hallo " + name;
         System.out.println(action4.action("alliano"));
         
          /**
          * jika parameternya hanya 1 maka kita bisa menulisnya tapa tanda kurung () di parameter lambda nya
          */
         simpleAction action5 = name -> "hallo mr." + name;
         System.out.println(action5.action("alliano"));
    }
}
