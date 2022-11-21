package baekjoon.level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
https://www.acmicpc.net/problem/9020

1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다.
하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 수를 골드바흐 수라고 한다.
또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다.
10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오.
만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
 */
public class Problem06_9020 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        boolean[] isPrime = new boolean[10001];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= (int) Math.sqrt(isPrime.length); i++) { // 9 9의 케이스. 등호 추가.
            // i가 소수이면,
            if (isPrime[i]) {
                // i의 배수는 소수가 아님.
                // i가 5인 경우. 2 * 5, 3 * 5, 4 * 5는 이미 2와 3에서 false로 처리되었음.
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int caseN = Integer.parseInt(br.readLine());
        int n;

        while (caseN-- > 0) {
            n = Integer.parseInt(br.readLine());
            for (int i = n / 2; i >= 2; i--) {
                if (isPrime[i] && isPrime[(n - i)]) {
                    sb.append(i).append(" ").append((n - i)).append("\n");
                    break;
                }
            }
        }
        br.close();
        System.out.println(sb);
    }
}
