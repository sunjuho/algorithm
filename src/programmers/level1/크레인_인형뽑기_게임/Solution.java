package programmers.level1.크레인_인형뽑기_게임;

import java.util.ArrayList;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/64061
 */

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<>();
        int column;
        for (int i = 0; i < moves.length; i++) {
            column = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][column] > 0) {
                    // basket += board[j][column];
                    // basket의 마지막과 동일하면 basket의 마지막을 없애고, 다르면 추가.
                    if (basket.size() > 0 && basket.get(basket.size() - 1) == board[j][column]) {
                        basket.remove(basket.size() - 1);
                        answer += 2;
                    } else {
                        basket.add(board[j][column]);
                    }
                    board[j][column] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
                { 3, 5, 1, 3, 1 } };
        int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
        // moves 따라서 1일 경우 [0][0], [1][0] ~ 순으로 찾아서 값이 0이 아닌 경우 0으로 바꾸고 해당 수를 쌓음.
        System.out.println(solution.solution(board, moves));
    }
}
