package BOJ.JaeHoon;

import java.util.Scanner;

public class BOJ_15652 {
  public static int N;
  public static int M;
  public static int[] arr;
  public static boolean[] isUsed;
  public static StringBuffer sb = new StringBuffer();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    M = sc.nextInt();
    arr = new int[M];
    isUsed = new boolean[N+1];
    func(0, 0);
    System.out.println(sb);
  }
  public static void func(int depth,int k) {
    if(depth == M) {
      for(int i=0; i<M; i++) {
        sb.append(arr[i] + " ");
      }
      sb.append("\n");
      return;
    }
    for(int i=1; i<=N; i++) {
      if(k <= i) {
        arr[depth] = i;
        isUsed[i] = true;
        func(depth + 1,i);
        isUsed[i] = false;
      }
    }
  }
}
