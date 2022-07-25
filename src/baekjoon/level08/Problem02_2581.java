package baekjoon.level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
https://www.acmicpc.net/problem/2581
 */
public class Problem02_2581 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int min = num;
        int sum = 0;

        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= num; i++) { // 9 9의 케이스. 등호 추가.
            // i가 소수이면,
            if (isPrime[i]) {
                // i의 배수는 소수가 아님.
                for (int j = i * i; j <= isPrime.length; j += i) { // i가 5인 경우. 2 * 5, 3 * 5, 4 * 5는 이미 2와 3에서 false로 처리되었음.
                    isPrime[j] = false;
                }
            }
        }

        for (int i = start; i <= num; i++) {
            if (isPrime[i]) {
                if (i < min) {
                    min = i;
                }
                sum += i;
            }
        }

        if (sum > 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}
