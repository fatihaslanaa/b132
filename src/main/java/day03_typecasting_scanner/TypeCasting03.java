package day03_typecasting_scanner;

public class TypeCasting03 {
    public static void main(String[] args) {
        /*
There are types of data type in Java
1) Primitive Data Types ==> byte < short < int < long ‹ float < double ==>numaric primitive data tupes
boolean==> true or false char ==> for a single data
2)Non-Primitive dato types==> String ==> used for multiple different characters storage inside an object
String str = "Tom Hanks 123)?"
What are the differences between "Primitive Data Types" and "Non-Primitive Data Types"?
1)Primitive dato types have just volves but Non-Primitive Data Types have values and methods
2) Primitive Dato Types are created by Java, we cannot create a primitive data type
But we can create Non-Primitive dato tupes whenever we need
3) "Primitive data types uses lowercases in naming convention and Non-Primitive ones uses Upper case naming convention
4) USage of memory for primitive data types changes from data type to data type.

         */

        int a =23, i =12;

        String str = "Tom";
        System.out.println(a + i + str);
        System.out.println(str + a +i);

        System.out.println(str + (a+i));

      // byte < short < int < long< float< double

      //Type Casting

      /*
      Java  can put small data types into large date types automatically
      When you put small data type object into a large data type object,
      you are widening the small data type.

       */

        int m = 14;

        double d = m;

        /*
        2) Explicitly Narrowing
        Java does not pu large data types into small data types automatically. Java thinks this is risky.

        */

       int n=20;
       byte b=(byte) n;












    }
}
