package problems.baekjoon.level1;

import java.util.Scanner;

public class P2588 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();

    System.out.println((a+b)%c);
    System.out.println(((a%c) + (b%c))%c);
    System.out.println((a*b)%c);
    System.out.println(((a%c) * (b%c))%c);
  }
}
