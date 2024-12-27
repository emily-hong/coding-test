package problems.baekjoon.level2;

import java.util.Scanner;

public class P2525 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hour = sc.nextInt();
    int minute = sc.nextInt();
    int input = sc.nextInt();

    minute += input;
    if(minute > 59) {
      hour += minute/60;
      minute %= 60;
    }

    hour %= 24;

    System.out.println(hour + " " + minute
    );
  }
}
