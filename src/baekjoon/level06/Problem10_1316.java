package baekjoon.level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/1316

그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
*/
public class Problem10_1316 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int wordCnt = Integer.parseInt(br.readLine());

        int groupCnt = 0;
        String str;
        boolean[] visit;
        boolean isGroup;
        // 문자를 받아서 n과 n-1을 비교 서로 다르면 n-1을 true로 하고, n이 true였다면 notGroup return. 
        
        for (int i = 0; i < wordCnt; i++) {
            str = br.readLine();
            visit = new boolean[26];
            isGroup = true;

            for (int j = 1; j < str.length() && isGroup; j++) {
                // 소문자 - 97
                // 이전에 나온 적 있는 문자면 isGroup false 처리.
                if (visit[str.charAt(j) - 97]) {
                    isGroup = false;
                }
                
                // 현재 문자가 직전 문자와 달라졌다면, 이전 문자가 다시 등장하면 안 됨.
                if(str.charAt(j-1) - str.charAt(j) != 0){
                    visit[str.charAt(j - 1) - 97] = true;
                }
            }

            if(isGroup) groupCnt++;
        }
        System.out.println(groupCnt);
    }
}
