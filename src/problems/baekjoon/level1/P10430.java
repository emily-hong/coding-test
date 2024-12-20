package problems.baekjoon.level1;

import java.util.Scanner;

public class P10430 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    String str_b = b + "";

    for(int i = str_b.length() - 1; i >= 0; i--){
      int num = str_b.charAt(i) - '0';
      System.out.println(a * num);
    }
    System.out.println(a * b);
  }
}
