import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

  public static List<Integer>   compareTriple(List<Integer> a, List<Integer> b){
    int aliceCount = 0;
    int bobCount = 0;
    for(int i=0; i < 3; i++){
      int aliceScore = a.get(i);
      int bobScore = b.get(i);
      int temp = aliceCount > bobCount ? aliceCount ++ : bobCount++;
    }

    List<Integer> result = new ArrayList<>();
    result.add(aliceCount);
    result.add(bobCount);

    return  result;
  }
}
