import java.util.Scanner;

public class Staircase {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numInputs = scan.nextInt();
    scan.close();

    for(int i = 1; i <= numInputs; i++){ // rows

      int j = numInputs;

      // loop to print (size - i) spaces
      while(j-- > i) {
        System.out.print(" ");
      }
      // loop to print (i) #s
      while(j-- >= 0) {
        System.out.print("#");
      }

      System.out.println();
    }
    System.out.println("Hello");
  }

}