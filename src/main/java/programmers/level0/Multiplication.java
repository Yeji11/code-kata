package programmers.level0;

/**
 * 문제: 두 수의 곱 구하기
 * 풀이일: 2026-02-11
 */

public class Multiplication {
        public int solution(int num1, int num2) {
            int answer = 0;
            answer = num1 * num2;
            return answer;
        }
        public static void main (String[]args) {
            Multiplication m = new Multiplication();
            System.out.println(m.solution(3,4));

    }
}
