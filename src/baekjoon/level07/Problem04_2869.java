package baekjoon.level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/2869

땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
 */
public class Problem04_2869 {
    public static void main(String[] args) throws IOException {
        // (n * A) - ( (n-1) * B ) >= V
        // (n * (A - B)) + B >= V
        // n * (A - B) >= V - B
        // n >= (V - B) / (A - B)
        // n = Math.ceil( (V - B) / (A - B) )
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double v = Integer.parseInt(st.nextToken());

        double answer = ((v - b) / (a - b));
        System.out.println((int) Math.ceil(answer));
    }

}
