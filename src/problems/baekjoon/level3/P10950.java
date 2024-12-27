package problems.baekjoon.level3;

import java.util.Scanner;

public class P10950 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int start = 0;
    while(start < count) {
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      System.out.println(num1+num2);
      start++;
    }
  }
}
