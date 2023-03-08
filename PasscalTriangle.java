public class PasscalTriangle {
    public static void main(String[] args){
        int i,j,n=5;
        int [][] arr = new int[n][n];
        for(i=0;i<n;i++){
            arr[i][0]=1;
        }
        for (i=1;i<n;i++){
            for(j=1;j<n;j++){
                if(i>j) {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                    else if (i==j) {
                        arr[i][j]=1;
                }
                    else {
                        arr[i][j]= 0;
                }

            }
        }
        for (i=0;i<n;i++) {
            for (j = 0; j <=i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
