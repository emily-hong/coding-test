package problems.baekjoon.level3;

import java.util.Scanner;

public class P8393 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt(); // 반복횟수
    int start = 1; // 현재 반복수
    int sum = 1; // 합계

    while(start < count) {
      start++;
      sum += start;
    }
    System.out.println(sum);
  }
}
