package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        //Example 1: //Example 1: Ask user to enter his first and the last name and address then print them on the console.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your adress...");
        String adress = input.nextLine();

        System.out.println("Please enter your first name ....");
        String firstName=input.next();

        System.out.println("Please enter your last name...");
        String lastName=input.next();




        System.out.println("Your first name and last name is " + firstName +  " " + lastName);
        System.out.println(adress);



    }
}
