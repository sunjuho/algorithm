package programmers.level2.전화번호_목록;

import java.util.Arrays;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/42577
 */
public class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] phone_book1 = { "119", "97674223", "1195524421" };
        String[] phone_book2 = { "123", "456", "789" };
        String[] phone_book3 = { "12", "123", "1235", "567", "88" };

        System.out.println(solution.solution(phone_book1));
        System.out.println(solution.solution(phone_book2));
        System.out.println(solution.solution(phone_book3));
    }
}
