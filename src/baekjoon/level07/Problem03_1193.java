package baekjoon.level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/1193

무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

1/1	1/2	1/3	1/4	1/5	…
2/1	2/2	2/3	2/4	…	…
3/1	3/2	3/3	…	…	…
4/1	4/2	…	…	…	…
5/1	…	…	…	…	…
…	…	…	…	…	…
이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 */
public class Problem03_1193 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        // num == 1에서 1/1이 될 수 있도록 변수 설정.
        int a = 2;
        int b = 0;
        boolean rightToLeft = false;

        for (int i = 0; i < num; i++) {
            if (rightToLeft) {
                a++;
                if (b > 1) {
                    b--;
                } else {
                    rightToLeft = false;
                }
            } else {
                b++;
                if (a > 1) {
                    a--;
                } else {
                    rightToLeft = true;
                }
            }
        }
        System.out.println(a + "/" + b);
    }
}
