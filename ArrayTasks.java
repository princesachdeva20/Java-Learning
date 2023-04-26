import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[]args){

        System.out.println("The Program is to calculate the sum of the integer elements\nin the array given by the user");
        int n , sum = 0;
        ArrayList<Integer> elements = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array");

        n = scan.nextInt();

        System.out.println("Enter The Elements of the Array");

        for (int i =0; i< n; i++) {
            int data = scan.nextInt();
            elements.add(i,data);
        }

        System.out.println("Elements in your array are :" );
            System.out.print(elements + " ");

        System.out.println("\nThe System is Calculating the sum of all the even numbers");

            for (Integer element : elements) {
            if (element % 2 == 0) {
                sum += element;
            }
        }
        System.out.println("The total of all the evan numbers is :" + sum);
    }
}
