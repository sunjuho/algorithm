package baekjoon.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem05_2741 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
    }
}
