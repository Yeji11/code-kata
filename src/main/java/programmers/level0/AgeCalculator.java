package programmers.level0;

/**
 * 문제: 나이 출력
 * 풀이일: 2026-02-11
 */

public class AgeCalculator {
    public int solution(int age) {
        int answer = 0;
        int currentYear = 2022;
        answer = currentYear - age + 1;
        return answer;
    }
    public static void main(String[]args) {
        AgeCalculator a = new AgeCalculator();
        System.out.println(a.solution(40));
    }
}

