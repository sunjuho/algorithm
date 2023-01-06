package baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/*
https://www.acmicpc.net/problem/1181

알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로
 */
public class Problem10_1181 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        String arr[] = new String[caseN];

        for (int i = 0; i < caseN; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) { // 글자수가 같으면 오름차순 정렬
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length() > 0 ? 1 : -1; // 길이가 다르면 길이순
                }
            }
        });

        for (int i = 0; i < caseN; i++) {
            // 중복 미출력
            if (i > 0 && arr[i].equals(arr[i - 1]))
                continue;
            System.out.println(arr[i]);
        }
    }
}
