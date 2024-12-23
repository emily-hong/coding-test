package problems.baekjoon.level1;

import java.util.Scanner;

public class P11382 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //int a = sc.nextInt(); // 입력값이 10¹²일 경우, 예외 발생

    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();

    System.out.println(a+b+c);
  }
}
