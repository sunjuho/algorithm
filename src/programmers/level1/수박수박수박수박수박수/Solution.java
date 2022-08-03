package programmers.level1.수박수박수박수박수박수;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */
class Solution {
    public String solution(int n) {
        String answer = "";

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                answer += "수박";
            }
        } else {
            for (int i = 0; i < (n - 1) / 2; i++) {
                answer += "수박";
            }
            answer += "수";
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 7;

        System.out.println(solution.solution(n));

    }
}