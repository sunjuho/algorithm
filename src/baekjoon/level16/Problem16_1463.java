package baekjoon.level16;

import java.util.Scanner;

public class Problem16_1463 {
    public static void main(String[] args) {
        // 1463. 1로 만들기.
        // -1 or /2 or /3 을 사용하여 가장 적은 횟수로 1을 만들기.
        // Dynamic Programming.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n >= 2){
        
            int[] dp = new int[n + 1];
            dp[1] = 0;
            
            for(int i = 2; i <= n; i++){
                dp[i] = dp[i - 1] + 1;
                if(i % 3 == 0){
                    dp[i] = Math.min(dp[i], dp[i / 3] + 1);
                }
                if(i % 2 == 0){
                    dp[i] = Math.min(dp[i], dp[i / 2] + 1);
                }
            }
            System.out.print(dp[n]);
        
        } else {
            System.out.print(0);
        }  
        sc.close();
    }
}
