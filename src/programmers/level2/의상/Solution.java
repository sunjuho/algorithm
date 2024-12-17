package programmers.level2.의상;

import java.util.HashMap;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> clothMap = new HashMap<>();
        for (String[] c : clothes) {
            String cate = c[1];
            clothMap.put(cate, clothMap.getOrDefault(cate, 0) + 1);
        }

        for (String cate : clothMap.keySet()) {
            answer *= (clothMap.get(cate) + 1); // 각 종류별 안 입는 선택지 + 무언가 입는 경우

        }
        return answer - 1; // 아무것도 안 입은 경우 제거
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[][] clothes1 = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
                { "green_turban", "headgear" } };
        String[][] clothes2 = { { "crow_mask", "face" }, { "blue_sunglasses", "face" }, { "smoky_makeup", "face" } };

        System.out.println(solution.solution(clothes1));
        System.out.println(solution.solution(clothes2));
    }
}
