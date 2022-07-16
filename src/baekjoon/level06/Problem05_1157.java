package baekjoon.level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
https://www.acmicpc.net/problem/1157

알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 */
public class Problem05_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArray = br.readLine().split("");
        Map<String, Integer> map = new HashMap<String, Integer>();

        String upperCase;

        // 반복하면서 map에 담거나 +1
        for (String s : strArray) {
            upperCase = s.toUpperCase();
            if (map.get(upperCase) != null) {
                map.put(upperCase, map.get(upperCase) + 1);
            } else {
                map.put(upperCase, 1);
            }
        }

        int max = 0;
        String answer = "";
        int value;
        for (String key : map.keySet()) {
            value = map.get(key);

            if (value > max) {
                max = value;
                answer = key;
            } else if (value == max) {
                answer = "?";
            }
        }
        System.out.println(answer);
    }

}