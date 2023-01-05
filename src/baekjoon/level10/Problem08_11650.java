package baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/11650

2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 */
public class Problem08_11650 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int caseN = Integer.parseInt(br.readLine());
        int index = 0;
        int arr[][] = new int[caseN][2];
        while (index < caseN) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[index][0] = Integer.parseInt(st.nextToken());
            arr[index][1] = Integer.parseInt(st.nextToken());
            index++;
        }

        // 2차원 배열 정렬 0열 다음 1열 기준(다중 배열 정렬)
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) { // 0열이 같으면 1열 기준으로 정렬
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        for (int[] a : arr) {
            System.out.println(a[0] + " " + a[1]);
        }
    }
}
