package programmers.level1.음양_더하기;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */
public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < signs.length; i++){
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        System.out.println(solution.solution(absolutes, signs));
    }
}
