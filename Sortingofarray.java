public class Sortingofarray {
    public static void main(String[] args) {

    int[] arr={5,7,2,1,0,8};
        for (int x=0;x< arr.length;x++){
            for (int i=0;i< arr.length-1;i++){
               int temp = arr[i];
               if (temp>arr[i+1]){
                   arr[i]=arr[i+1];
                   arr[i+1]= temp;
               }
            }
        }
        outputarray(arr);
    }
public static void outputarray(int[]array){
        for (int i:array){
            System.out.print(i + " ");
        }

}
}