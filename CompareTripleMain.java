import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTripleMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();

    int a0 = scanner.nextInt();
    int a1 = scanner.nextInt();
    int a2 = scanner.nextInt();
    int b0 = scanner.nextInt();
    int b1 = scanner.nextInt();
    int b2 = scanner.nextInt();

    ArrayList<Integer> array1 = new ArrayList<>();
    array1.add(a0);
    array1.add(a1);
    array1.add(a2);

    ArrayList<Integer> array2 = new ArrayList<>();
    array2.add(b0);
    array2.add(b1);
    array2.add(b2);


   List<Integer> resultNew = CompareTriplets.compareTriple(a,b);
    System.out.println(resultNew);
  }
}
