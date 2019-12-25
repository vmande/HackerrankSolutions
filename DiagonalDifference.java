import java.util.Scanner;

public class DiagonalDifference {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the row and length dimension of array: ");
    int N = scanner.nextInt();
    int[][] arr = new int[N][N];

    System.out.println("Enter" + N * N + "array elements:");
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        arr[i][j] = scanner.nextInt();
      }
    }


    int result = DiagonalDIfferenceClass.diagonalDifference(arr, N);
    System.out.println(result);

  }
}
