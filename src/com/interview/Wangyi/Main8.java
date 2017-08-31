package com.interview.Wangyi;
import java.util.Scanner;

public class Main8 {
    final static int num = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int[][] dp = new int[n + 1][k + 1];
        dp[0][1]=1;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= k; j++) {
                sum += dp[i - 1][j];
                sum %= num;
            }
            for (int x = 1; x <= k; x++) {
                int sum2 = 0;
                for (int y = x + x; y <= k; y += x) {
                    sum2 += dp[i - 1][y];
                    sum2 %= num;
                }
                dp[i][x] = (sum - sum2 + num) % num;
            }

        }
        int result = 0;
        for (int i = 1; i <= k; i++) {
            result += dp[n][i];
            result %= num;
        }
        System.out.println(result);

    }
}
