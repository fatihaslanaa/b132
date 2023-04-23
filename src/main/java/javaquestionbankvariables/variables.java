package javaquestionbankvariables;

import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
//example 1
float book = 12.99F,noteBook= 23.45F,laptop=34.12F;
float totalPrice=2*book+4*noteBook+3*laptop;
        System.out.println("The total price is " + totalPrice);


        //example2
        Scanner input =new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        System.out.println("Before swapping:"+n1+"-"+n2);

        System.out.println();



       //example3
            /*
            Type a code to find the sum of the minimum value of the byte and the maximum value of short
            data types
            */

            byte min = Byte.MIN_VALUE;
            short max = Short.MAX_VALUE;
            System.out.println(min+max);

            //example4

            //Type a code to convert "103" String to byte and to convert "2351" String to short then print
            //teh difference on the console

            byte first = Byte.valueOf("113");
            short second = Short.valueOf("2351");
            System.out.println(second-first);



            //example5

       // mIAMI should be printed as Miami
        // miami should be printed as Miami1
        //MIAMI should be printed as Miami
        //mIaMi should be printed as Miami etc.

        String cityName = "mIAMI";
        String updatedCityName=cityName.trim().toLowerCase();
        updatedCityName = updatedCityName.substring(0,1).toUpperCase()+updatedCityName.substring(1);
        System.out.println(updatedCityName);














    }
}
