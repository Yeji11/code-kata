package programmers.level0;

/**
 * 문제: 숫자 비교하기
 * 풀이일: 2026-02-11
 */

public class NumberComparator {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (num1 != num2) ? -1 : 1;
        return answer;
    }

    public static void main(String[] args) {
        NumberComparator n = new NumberComparator();
        System.out.println(n.solution(2, 3));
    }
}

