
import java.util.ArrayList;

public class CheckPassword {
    public static void main(String[]args){

       boolean correct = true;
       int count = 0;

        ArrayList<Character> password = new ArrayList<Character>(){{
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


       if (password.size()>=8){
           for (char a : password) {
               if (!Character.isLetterOrDigit(a)) {
                   correct = false;
                   break;
               }
       }
        }else correct = false;
        for (char b : password) {
            if (Character.isDigit(b)) {
                count++;
            }
        }
        if (correct && count>=2){
            correct = true;
        }else correct = false;
        System.out.println(correct);
    }
}
