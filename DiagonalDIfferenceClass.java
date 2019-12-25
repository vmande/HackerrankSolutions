public class DiagonalDIfferenceClass {

  public static int diagonalDifference(int[][] arr, int N){

    int sum1 =0;
    int sum2 =0;
    arr = new int[N][N];
    for(int i=0; i < N ; i++){

        sum1 = sum1 + arr[i][i];

    }
    for(int i=N-1; i >=  0; i--){

        sum2 = sum2 + arr[i][N-i-1];

    }
return Math.abs(sum1-sum2);


  }
}
