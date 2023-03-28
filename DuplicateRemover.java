import java.util.ArrayList;

class DuplicatesRemover {
    public static void removeDuplicates(ArrayList<Character> arrList) {
        //write your code here
        for (int i=1;i<arrList.size();i++){
            for(int j=0; j<i;j++)
                if(arrList.get(i)==arrList.get(j)){
                    arrList.remove(i);
                    i--;
                }
        }
    }
        public static void main (String[] args)
        {
            ArrayList<Character> input = new ArrayList<Character>();
            System.out.println("Array List before calling removeDuplicates");
            for (int i = 0; i < input.size(); i++){
                System.out.print(input.get(i)+ "  ");
            }
            System.out.println();
            removeDuplicates(input);
            System.out.println("Array List after calling removeDuplicates");
            for (int i = 0; i < input.size(); i++){
                System.out.print(input.get(i)+ "  ");
            }
            System.out.println();
            System.out.println("\"\\Hello World\\\"");
        }
}

