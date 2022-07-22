package baekjoon.level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/2775

평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.
이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라.
단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
 */
public class Problem06_2775 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // 1층 1호 == a == 1
        // 1층 2호 == a + b == 3
        // 1층 3호 == a + b + c == 6
        // 1층 4호 == a + b + c + d == 10

        // 2층 1호 == a
        // 2층 2호 == a + (a + b) == 2a + b == 4
        // 2층 3호 == a + (a + b) + (a + b + c) == 3a + 2b + c== 10
        // 2층 4호 == a + (a + b) + (a + b + c) + (a + b + c + d) == 4a + 3b + 2c + d == 20

        // 3층 2호 == a + (a + (a + b)) == 3a + b == 5
        // 3층 3호 == a + (a + (a + b)) + (a + (a + b) + (a + b + c)) == 6a + 3b + c == 15 == 2층 3호 + 3층 2호
        // 3층 4호 == a + (a + (a + b)) + (a + (a + b) + (a + b + c)) + (a + (a + b) + (a + b + c) + (a + b + c + d))
        //         == 10a + 6b + 3c + d == (1 + 2 + 3 + 4)a + (1 + 2 + 3)b + (1 + 2)c + (1)d == 35 == 2층 4호 + 3층 3호

        // k층 n호 == k-1층 n호 + k층 n-1호
        //         == (1 + ~~ + k)1 + (1 + ~~ + (k - 1))2 + (1 + ~~ + (k - 2))3 + ~~ + (1)n
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseN = Integer.parseInt(br.readLine());

        int k;
        int n;
        int[][] people;

        try {
            while (true) {
                for (int i = 0; i < caseN; i++) {

                    k = Integer.parseInt(br.readLine());
                    n = Integer.parseInt(br.readLine());
                    // 0층이 있으므로 층은 + 1
                    people = new int[k + 1][n];

                    // init people
                    for (int j = 0; j < n; j++) {
                        // 0층 n호는 j명.
                        people[0][j] = j + 1;
                    }
                    for (int j = 0; j < k + 1; j++) {
                        // k층 1호는 1명.
                        people[j][0] = 1;
                    }

                    for (int j2 = 1; j2 < k + 1; j2++) {
                        for (int j = 1; j < n; j++) {
                            people[j2][j] = people[j2 - 1][j] + people[j2][j - 1];
                        }
                    }

                    System.out.println(people[k][n - 1]);

                } // 줄마다 반복.
                br.close();
            }
        } catch (NullPointerException e) {
            // br.readLine()에 입력값이 없으면, 윈도우에서 Ctrl+z로 지정.
            System.exit(0);
        } catch (Exception e) {
            e.toString();
        }
    }
}
