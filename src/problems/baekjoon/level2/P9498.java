package problems.baekjoon.level2;

import java.util.Scanner;

// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력
public class P9498 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int score = sc.nextInt();
    sc.close();

    if(score >= 90) {
      System.out.println("A");
      return;
    }else if (score >= 80 ) {
      System.out.println("B");
      return;
    } else if (score >= 70) {
      System.out.println("C");
      return;
    } else if (score >= 60) {
      System.out.println("D");
      return;
    } else {
      System.out.println("F");
    }
  }
}
