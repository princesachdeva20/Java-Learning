import java.util.ArrayList;
class learnArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(5);
        original.add(0);
        original.add(9);
        original.add(7);
        original.add(0);
        original.add(20);
        System.out.println("Original Array before moving zeros in the front");
        for (Integer i : original) {
            System.out.print(i + "\t");
        }
        int index = 0;
        ArrayList<Integer> zeroToFront = new ArrayList<Integer>();
        for (int i = 0; i < original.size(); i++) {
            if (original.get(i) == 0) {
                zeroToFront.add(index, original.get(i));
                index++;
            }
        }
        for (int i = 0; i < original.size(); i++) {
            if (original.get(i) != 0) {
                zeroToFront.add(index, original.get(i));
                index++;

            }
        }
        System.out.println("Original Array After moving zeros in the front");
        for (Integer i : zeroToFront) {
            System.out.print(i + "\t");
        }
    }
}

