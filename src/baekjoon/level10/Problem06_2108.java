package baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
https://www.acmicpc.net/problem/2108

수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.

산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이

N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
 */
public class Problem06_2108 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // 평균값 계산을 위해 sum 사용해서 / caseN > 반올림.
        // 중앙값 계산을 위해 sort해서 arr[(caseN - 1) / 2].
        // 최빈값 계산을 위해 카운팅 정렬을 사용.
        // 두번째로 작은 최빈값을 구하기 위해 boolean 변수 사용.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());

        int average; // 산술평균
        int median; // 중앙값
        int mode = 0; // 최빈값

        double sum = 0;
        boolean isFirst = true;
        int count = 0; // 최대 빈도 수

        int[] arr = new int[caseN]; // 중앙값 계산
        int[] countingSortArr = new int[8001]; // 최빈값 계산

        int n;
        for (int i = 0; i < caseN; i++) {
            n = Integer.parseInt(br.readLine());

            sum += n;
            arr[i] = n;
            countingSortArr[n + 4000]++;
        }

        Arrays.sort(arr);

        count = countingSortArr[0];
        for (int i = 1; i < 8001; i++) {
            // 최빈값 중 제일 작음.
            if (count < countingSortArr[i]) {
                mode = i - 4000;
                count = countingSortArr[i];
                isFirst = true;

                // 최빈값 중 두 번째로 작음.
            } else if (count == countingSortArr[i] && isFirst) {
                mode = i - 4000;
                isFirst = false;
            }
        }

        average = (int) Math.round(sum / caseN);
        median = arr[(caseN - 1) / 2];

        System.out.println(average);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(arr[caseN - 1] - arr[0]);
    }
}
