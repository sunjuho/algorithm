package baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
https://www.acmicpc.net/problem/1427

배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 */
public class Problem07_1427 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> numList = new ArrayList<>();

        int strLength = str.length;
        for (int i = 0; i < strLength; i++) {
            numList.add(Integer.parseInt(str[i]));
        }

        Collections.sort(numList, Collections.reverseOrder()); // 역순 정렬

        for (Integer num : numList) {
            sb.append(num);
        }

        System.out.println(sb);
    }
}
