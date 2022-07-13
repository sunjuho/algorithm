package baekjoon.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem13_2588 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		int d = (y / 100) % 10;
		int e = (y / 10) % 10;
		int f = y % 10;

		System.out.println(x * f);
		System.out.println(x * e);
		System.out.println(x * d);
		System.out.println(x * y);

		br.close();
    }
}
