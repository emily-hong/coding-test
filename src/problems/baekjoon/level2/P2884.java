package problems.baekjoon.level2;

import java.util.Scanner;

//Q. 알람시계
public class P2884 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hour = sc.nextInt();
    int minute = sc.nextInt();
    sc.close();

    minute -= 45;
    if(minute < 0) {
      minute += 60;
      hour--;
    }

    if(hour < 0) hour = 23;

    System.out.println(hour + " " + minute);
  }
}
