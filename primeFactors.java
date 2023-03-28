import java.util.ArrayList;
import java.util.Scanner;
/* The number is ugly if it has prime factors only 2,3,5*/
public class primeFactors {
    public static void main (String[] args){
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(1);
        int number;
        boolean ugly = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer");
        number = input.nextInt();

        // Get Prime Factors
        for (int i =2; i<=number;i++){
            while (number % i ==0){
                primes.add(i);
                number = number/i;
            }
        }
        //Print out the prime factors
        for (int i: primes) {
            System.out.print(i + " ");
        }
        // check the ugliness of the number

        for (int i =0; i< primes.size();i++){
            if (primes.get(i)!=1 && primes.get(i)!=2 && primes.get(i)!=3 && primes.get(i)!=5){
                ugly = false;
            }
        }
        System.out.println("\n"+ugly);
    }
}
