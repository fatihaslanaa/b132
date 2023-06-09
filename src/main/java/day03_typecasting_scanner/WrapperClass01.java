package day03_typecasting_scanner;

public class WrapperClass01 {



    /*
    Wrapper Class They are Non-Primitive data types . Non-Primitives have "values " and "methods"
    We can do many actions by using "methods" this is very useful.
    But primitives do not have any actions/methods with them.
     Java created a structre called Wrapper Class for primitives values and methods.

     Primitive Data       Wrapper class
     byte                 Byte
     short                Short
     int                  Integer
     long                 Long
     float                Float
     double               Double
     char                 Character
     boolean              Boolean



    */

    public static void main(String[] args) {
        int i= 12;// There is no method
        Integer number=456;//There are many methods


        char c= 'A';



        Character wc= 'A';

       //AutoBoxing: To convert "primitive data " to "wrapper class" of the primitive data
        byte b =23;
        System.out.println(b);
        Byte wb= b;
        wb.floatValue();

        System.out.println(wb.floatValue());//23.0




        //Unboxing: To convert "wrapper class" to "primitive data" of the wrapper class
        Short ws = 34;

        short s = ws;

        //How to get the minimum and maximum values of numeric data types in java
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);









    }


}

