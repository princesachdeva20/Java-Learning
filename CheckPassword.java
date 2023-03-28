
import java.util.ArrayList;

public class CheckPassword {
    public static void main(String[]args){

       boolean correct = true;
       int count = 0;

        ArrayList<Character> password = new ArrayList<>(){{
            add('1');
            add('b');
            add('A');
            add('p');
            add('n');
            add('o');
            add('6');
            add('p');
        }
        };

        // Check the length of the password
       if (password.size()>=8){
          // check the password contains characters and digits only not special characters
           for (char a : password) {
               if (!Character.isLetterOrDigit(a)) {
                   correct = false;
                   break;
               }
       }
        }else correct = false;
        // count the number of digits in the password
       for (char b : password) {
            if (Character.isDigit(b)) {
                count++;
            }
        }
       // check if password has At-least two digits
        if (correct && count>=2){
            correct = true;
        }else correct = false;
        System.out.println(correct);
    }
}
