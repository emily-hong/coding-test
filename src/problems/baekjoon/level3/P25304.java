package problems.baekjoon.level3;

import java.util.Scanner;

public class P25304 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int X = sc.nextInt(); // 총금액
    int N = sc.nextInt(); // 물건 개수
    int sum = 0;

    for(int i = 0; i < N; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      sum += a * b;
    }

    if(X == sum) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
