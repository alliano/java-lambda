package com.java.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

import com.java.lambda.util.CountLongStr;
import com.java.lambda.util.StringUtil;
/**
 * Method references membantu kita mengakses suatu methoe secara tidak langsung
 * tetapi dengan nama dari method tersebut. Sebuah method reference dilambangkan 
 * dengan simbol :: (double colon). Sebuah method reference dapat digunakan untuk 
 * mengkases beberapa jenis seperti, static method, instance method, atau constructor 
 * menggunakan new operator.
 */
public class MethodReference {
    public static void main(String[] args) {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String arg0) {
                return StringUtil.isLowerCase(arg0);
            }
        };
        System.out.println(predicate.test("Bismilah"));
        System.out.println(predicate.test("bismilah"));

        Predicate<String> predicate2 = (value) -> StringUtil.isLowerCase(value);
        Predicate<String> predicate3 = StringUtil::isLowerCase; // => menggunakan method reference 

        System.out.println(predicate2.test("N"));
        System.out.println(predicate2.test("n"));
        System.out.println(predicate3.test("N"));
        System.out.println(predicate3.test("n"));

       
        Predicate<String> howLong = new Predicate<String>() {
            @Override
            public boolean test(String arg0) {
                CountLongStr lenght = new CountLongStr() {
                    @Override
                    public boolean longChar(String str) {
                        if (str.length() > 5){
                            return true;
                        }
                        return false;
                    };
                };
                return lenght.longChar(arg0);
            };
        };

        System.out.println("\n");
        System.out.println(howLong.test("ini password yang sangat aman"));
        System.out.println("\n");

        //method reference di parameter
        Function<String,String> func = new Function<String,String>() {
            @Override
            public String apply(String arg0) {
                return arg0.toUpperCase();                
            }
        };
        Function<String,String> func2 = String::toUpperCase;
        System.out.println(func.apply("nama saya alliano"));
        System.out.println(func2.apply("nama saya xiao"));
        
    
    }


    /**
    * untuk mengakses method reference tetapi method itu tidak statik maka kita 
    * bisa mengguanakan this.nama methot nya
    */
    public void run(){
        Predicate<String> isLower = new Predicate<String>() {
            @Override
            public boolean test(String arg0) {
                return MethodReference.this.isLowerCase(arg0);
            }
        };

        //ini mengakses method dari objectnya sendiri(nama class dari codeingan ini)
        MethodReference app = new MethodReference();
        //app disini bisa di ganti dengan object this::isLowerCase
        Predicate<String> islower2 = app::isLowerCase; //==> ini method non static(isLowercase)
        System.out.println(islower2.test("N"));
        System.out.println(isLower);
    }
  
    public boolean isLowerCase(String str) {
        for (char car : str.toCharArray()) {
            if (!Character.isLowerCase(car)){
                return true;
            }
        }
        return false;
    }
}
