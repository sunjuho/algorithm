package baekjoon.level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem05_1157_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            // A ~ Z의 캐릭터 값은 65 ~ 90. arr[0]을 arr['A']로 사용하기 위해 -65
            arr[str.charAt(i) - 65]++;
        }

        int max = 0;
        char answer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer = (char) (i + 65);
            } else if (arr[i] == max) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}
