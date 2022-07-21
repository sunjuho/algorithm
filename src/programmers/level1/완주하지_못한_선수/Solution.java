package programmers.level1.완주하지_못한_선수;

import java.util.Arrays;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
class Solution {
    public String solution(String[] participant, String[] completion) {
        // 완주하지 못한 선수 1.
        // 정렬해서 비교하다가 일치하지 않으면 완주 못한 선수.
        // 전부 일치했다면 마지막 참가자.
        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = participant[participant.length - 1];

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] participant = { "mislav", "stanko", "mislav", "ana" };
        String[] completion = { "stanko", "ana", "mislav" };

        System.out.println(solution.solution(participant, completion));

    }
}
