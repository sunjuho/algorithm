package baekjoon.level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/1929

M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 */
public class Problem04_1929 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        // 최대숫자의 제곱근까지만 반복.
        // 자연수끼리의 곱이 되려면, 적어도 한 자연수는 제곱근 이하의 값이어야 함.
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            // i가 소수이면,
            if (isPrime[i]) {
                // i의 배수는 소수가 아님.
                // i가 5인 경우. 2 * 5, 3 * 5, 4 * 5는 이미 2와 3에서 false로 처리되었음.
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }

            }
        }

        for (int i = m; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }

    }
}
