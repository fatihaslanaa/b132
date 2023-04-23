package loops;

public class WhileLoop01 {
    public static void main(String[] args) {

        int i =4;

        while(i<8){

            System.out.print(i + " ");

            i++;
        }

        System.out.println();


        // Example 2 : Type code to print add integers from 12 to 67 in the same line with a space between them

        int k = 12;

        while (k<68){

            if(k%2!=0){
                System.out.print(k + " ");
            }
            k++;

        }
        System.out.println();

        //Ex: Type code to find the sum of integers from 12 to 67
    int m = 12;
    int sum = 0;

    while (m<15){
        sum = sum + m;

        m++;
    }
        System.out.println(sum);

    }


}
