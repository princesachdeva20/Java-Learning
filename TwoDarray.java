public class TwoDarray {
    public static void main(String[] args){
        int value = 5;

        printMat(value);

    }

    public static void printMat(int n) {
        //write the code for making and printing the matrix here

        int [][] arr = new int [n][n]; //initialization of array

        //Set the values of two-dimensional arrays
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                // testing conditions of array
                if(i==j)
                    arr[i][j] = 0;
                else if (i<j)
                    arr[i][j]= 1;
                else
                    arr[i][j]= -1;
            }
        }
        // to Print the two-dimensional array
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}