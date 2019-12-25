package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BirthdayCandles {
  public static void main(String[] args) {
    int count =0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n = scanner.nextInt();
    ArrayList<Integer> al = new ArrayList<Integer>();

    for(int i=0; i < n;i++){
      al.add(scanner.nextInt());
    }

    Collections.sort(al);
    int max = al.get(n-1);
    for(int i=0; i < n;i++){
      if(al.get(i) == max){
        count++;
      }
    }
    System.out.println(count);
  }
}
