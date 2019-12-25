import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
     long[] arr = new long[5];
     long result =0;
     for(int i=0; i< arr.length;i++){
       arr[i] = scanner.nextLong();
       result = result + arr[i];
     }
    Arrays.sort(arr);
    System.out.println((result - arr[4]) + " " + (result-arr[0]));
  }
}
