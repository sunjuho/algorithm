package baekjoon.level15_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/15649

자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
- 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
*/

public class problem01_15649 {
	
	public static int[] answer;
	public static boolean[] visited;
	
	public static void solve(int n, int m, int depth){
		// 재귀하면서 맨 끝에 도달하면, m == depth면 출력하고 종료 return.
		if (m == depth){
			String str = "";
			for (int num : answer) {
				str += num + " ";
			}
			System.out.println(str);
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if(!visited[i]){
				visited[i] = true;
				answer[depth] = i + 1;
				solve(n, m, depth + 1);
				visited[i] = false;
			}
		}
	}

    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		
		// 1부터 n 까지 반복하면서 뿌리는 걸 m번 반복.
		answer = new int[m];
		// 근데 앞에 나온 숫자는 뿌리면 안 됨.
		// 숫자가 앞에 나왔는지. 이 숫자를 방문했는지 boolean 값이 있어야 함.
		visited = new boolean[n];

		// 목표 m.
		// 현재 위치 depth. 재귀하면서 depth가 m과 일치하게 되면 출력하고 종료.

		// n 과 m은 계속 가지고 있어야 함. depth는 재귀하면서 증가.
		solve(n, m, 0);
    }
}
