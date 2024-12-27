import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dice1 = sc.nextInt();
    int dice2 = sc.nextInt();
    int dice3 = sc.nextInt();

    Set<Integer> values = new HashSet<>();
    values.add(dice1);
    values.add(dice2);
    values.add(dice3);

    if(values.size() == 1) {
      // 세개 값이 모두 같음
      System.out.println(values);

    }else if(values.size() == 2) {
      // 두개 값이 같음
      System.out.println(values);

    }else {
      // 모두 다름
      System.out.println();
    }
  }
}