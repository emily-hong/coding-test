package problems.baekjoon.level2;

import java.util.Scanner;

// Q. 사분면 고르기
public class P14681 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();
    sc.close();

    if(x == 0 || y == 0) return;

    if(x > 0 && y > 0) System.out.println(1);
    else if (x < 0 && y > 0) System.out.println(2);
    else if (x < 0) System.out.println(3);
    else System.out.println(4);
  }
}
