package baekjoon.level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int i = Integer.parseInt(st.nextToken());

		int x = Integer.parseInt(st.nextToken());

		StringTokenizer num = new StringTokenizer(br.readLine(), " ");
		int y = 0;
		boolean first = true;

		for (int j = 0; j < i; j++) {
			y = Integer.parseInt(num.nextToken());

			if (y < x && first) {
				first = false;
				bw.write(y + ""); // 단순 write(int)는 char를 int형으로 받아서 출력이라 의미없는 부분 추가.

			} else if (y < x) {
				bw.write(" " + y);
			}

		}

		bw.flush();
		br.close();
		bw.close();
    }
}
