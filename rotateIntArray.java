import java.util.ArrayList;
    /*this is to rotate
            the elements of arraylist clockwise*/
public class rotateIntArray {
    public static void main (String[]args){
        ArrayList<Integer> rotate = new ArrayList<>();
        rotate.add(1);
        rotate.add(2);
        rotate.add(3);
        rotate.add(4);
        int temp;
       for (int i =0;i<2;i++){              // Rotate the arraylist clockwise two times
            temp = rotate.get(rotate.size()-1);
            rotate.remove(rotate.size()-1);
            rotate.add(0,temp);

        }
        for (int i=0; i < rotate.size();i++) {
            System.out.print(rotate.get(i)+" ");
        }
    }
}
