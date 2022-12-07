package baekjoon.level09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/2563

가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다.
이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.

예를 들어 흰색 도화지 위에 세 장의 검은색 색종이를 그림과 같은 모양으로 붙였다면 검은색 영역의 넓이는 260이 된다.
 */
public class Problem02_2563 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int caseN = Integer.parseInt(br.readLine());
        boolean[][] drawingPaper = new boolean[100][100];

        int n;
        int m;
        int l;
        int area = 0;

        while (caseN-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            for (int i = 0; i < 10; i++) {
                l = m;
                for (int j = 0; j < 10; j++) {
                    drawingPaper[n][l] = true;
                    l++;
                }
                n++;
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (drawingPaper[i][j] == true) {
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}
