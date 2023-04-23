package day20inheritance;

public class PassByValue01 {
    public static void main(String[] args) {
        /*
        1) Java "pass by value" sayesinde variable larin orjinal degerlerini koruma altina alir.

         */

        double shirt = 100;

        double studentShirtPrice = discount("student",shirt);

        double veteranShirtPrice = discount("veteran",shirt);

        double seniorShirtPrice = discount("senior", shirt);

        System.out.println(shirt);
        System.out.println(studentShirtPrice);
        System.out.println(veteranShirtPrice);
        System.out.println(seniorShirtPrice);



    }

    public static double discount(String state, double price) {

        switch (state) {

            case "student":
                price = price * 0.90;
                break;

            case "veteran":
                price = price * 0.80;
                break;
            case "senior":
                price = price * 0.95;
                break;
            default:
                price = price;


        }
        return  price;
    }
}












