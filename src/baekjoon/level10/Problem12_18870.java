package baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/10814

수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.

Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.

X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
 */
public class Problem12_18870 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // n개의 좌표 입력.
        // 중복 제거해서 정렬하고, 정렬된 키값에 순서대로 랭크 부여.
        // 원형 배열을 랭크로 치환해서 출력.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
        int origin[] = new int[caseN];

        // 원형 배열에 담으면서, 중복제거될 hashSet에도 add
        int n;
        for (int i = 0; i < caseN; i++) {
            n = Integer.parseInt(st.nextToken());
            origin[i] = n;
            hashSet.add(n);
        }

        // 입력이 끝난 HashSet을 ArrayList로 담은 뒤, Collections.sort()를 이용하여 오름차순 정렬.
        ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
        Collections.sort(arrayList);

        // 정렬된 좌표값에 0부터 랭크 부여.
        int rank = 0;
        for (int key : arrayList) {
            rankMap.put(key, rank);
            rank++;
        }

        // 원형 배열을 랭크로 치환해서 출력.
        for (int key : origin) {
            sb.append(rankMap.get(key)).append(" ");
        }
        System.out.println(sb);
    }
}
