package baekjoon.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class Problem07_4344 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Vector<Integer> v = new Vector<Integer>();

		int token;
		int sum = 0;
		double avg;
		float count;
		float rate;

		int caseN = Integer.parseInt(br.readLine());

		try {
			while (true) {
                for (int i = 0; i < caseN; i++) {
                    st = new StringTokenizer(br.readLine(), " ");

                    int person = Integer.parseInt((String) st.nextElement());
                    // System.out.println("person : " + person);

                    v.clear();
                    sum = 0;
                    count = 0f;

                    while (st.hasMoreElements()) {
                        token = Integer.parseInt(st.nextToken());
                        sum = sum + token;
                        v.addElement(token);
                    }
                    // 두 번째 수부터 합산하고 벡터에 add.

                    // System.out.println("사이즈 : " + v.size());

                    // System.out.println("합계 : " + sum);

                    avg = sum / person;

                    // System.out.println("평균 : " + avg);

                    for (int j = 0; j < v.size(); j++) {
                        if (v.get(j) > avg) {
                            count++;
                        }

                    }

                    // System.out.println("count : " + count);
                    rate = count / person * 100;
                    // System.out.println("rate : " + rate);
                    System.out.printf("%2.3f", rate);
                    System.out.println("%");

                } // 줄마다 반복.
                
                br.close();
			}

		} catch (NullPointerException e) {
			// br.readLine()에 입력값이 없으면, 윈도우에서 Ctrl+z로 지정.
			System.exit(0);
		} catch (Exception e) {
			e.toString();

		}
    }
}
