package problems.baekjoon.level1;

import java.util.Scanner;

// Q. 불기 연도를 서기 연도로 변환한 결과를 출력한다.
public class P18108 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int year = sc.nextInt();
    sc.close();
    System.out.println(year - 543);
  }
}
