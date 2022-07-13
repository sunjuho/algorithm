package baekjoon.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem02_9498 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int jumsu = Integer.parseInt(br.readLine());

		String result = jumsu > 59 ? "D" : "F";
		result = jumsu > 69 ? "C" : result;
		result = jumsu > 79 ? "B" : result;
		result = jumsu > 89 ? "A" : result;

		System.out.println(result);
    }
}
