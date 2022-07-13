package baekjoon.level07;

import java.util.Scanner;

public class Problem07_2839 {
    public static void main(String[] args) {
        // 설탕 배달.
        // 3kg or 5kg 설탕 봉지. 최소 봉지 갯수 수하기. 3 ~ 5000.
        // 불가능하면 -1 출력. 4, 7의 경우.
                
        Scanner sc = new Scanner(System.in);
        
        int weight = sc.nextInt();
        
        sc.close();
                    
        System.out.print(solve(weight));    
    }

    public static int solve(int n){
        
        int[] satou = new int[5001];
        
        satou[3] = satou[5] = 1;
        satou[0] = satou[1] = satou[2] = satou[4] = 9999;
        
        for(int i = 6; i <= n; i++){
         satou[i] = Math.min(satou[i - 3], satou[i - 5]) + 1;
        }

        if(satou[n] > 5000){
            return -1;
        } else {
            return satou[n];
        }

    }
}
