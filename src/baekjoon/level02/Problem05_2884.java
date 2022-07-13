package baekjoon.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem05_2884 {
    public static void main(String[] args) throws IOException {
        // 시간 H는 0~23. 분M은 0~59.45분 전으로 출력. HH MM형식.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String hhmm = br.readLine();
        int idx = hhmm.indexOf(" ");
        int hh = Integer.parseInt(hhmm.substring(0, idx));

        int mm = Integer.parseInt(hhmm.substring(idx+1));
        // 시간과 분을 hh와 mm으로 대입.

        int nhh = (hh + 24);
        if (mm < 45) {
            mm += 15;
            nhh -= 1;

            System.out.println((nhh % 24) + " " + mm);
        } else {
            
            mm -= 45;
            System.out.println((hh % 24) + " " + mm);
            
        }

        br.close();
    }
}
