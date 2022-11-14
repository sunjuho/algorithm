package baekjoon.level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
https://www.acmicpc.net/problem/4948

베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 
 */
public class Problem05_4948 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 123456;
        int primeCnt = 0;

        boolean[] isPrime = new boolean[(2 * max) + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= (int) Math.sqrt(isPrime.length); i++) { // 9 9의 케이스. 등호 추가.
            // i가 소수이면,
            if (isPrime[i]) {
                // i의 배수는 소수가 아님.
                // i가 5인 경우. 2 * 5, 3 * 5, 4 * 5는 이미 2와 3에서 false로 처리되었음.
                for (int j = i * i; j <= isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        while (true) {
            primeCnt = 0;
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;

            for (int i = n + 1; i <= (2 * n); i++) {
                if (isPrime[i]) {
                    primeCnt++;
                }
            }
            sb.append(primeCnt).append("\n");
        }
        System.out.println(sb);
    }
}
