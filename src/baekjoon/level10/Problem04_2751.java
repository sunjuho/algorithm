package baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
https://www.acmicpc.net/problem/2751

N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */
public class Problem04_2751 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());

        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < caseN; i++) {
            numList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numList);

        for (Integer num : numList) {
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}