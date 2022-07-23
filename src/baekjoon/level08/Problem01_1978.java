package baekjoon.level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/1978

주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 */
public class Problem01_1978 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        int num = 1000;
        int primeCnt = 0;
        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i < num; i++) {
            // i가 소수이면,
            if (isPrime[i]) {
                // i의 배수는 소수가 아님.
                for (int j = i * i; j < isPrime.length; j += i) { // i가 5인 경우. 2 * 5, 3 * 5, 4 * 5는 이미 2와 3에서 false로 처리되었음.
                    isPrime[j] = false;
                }

            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 사실상 미사용.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            if (isPrime[Integer.parseInt(st.nextToken())]){
                primeCnt++;
            }
        }
        System.out.println(primeCnt);
    }
}
