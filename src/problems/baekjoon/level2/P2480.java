package problems.baekjoon.level2;

import java.util.Scanner;

public class P2480 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();

    if(a == b && a == c) {
      System.out.println(10000 + a * 1000);
    }else if (a == b && a != c || a == c && a != b) {
      System.out.println(1000 + a * 100);
    }else if (b == c && b != a) {
      System.out.println(1000 + b * 100);
    }else {
      int result = a;
      if(result < b) result = b;
      if(result < c) result = c;

      System.out.println(result * 100);
    }
  }
}
