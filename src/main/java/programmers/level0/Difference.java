package programmers.level0;

/**
 * 문제: 두 수의 차
 * 풀이일: 2026-02-10
 */

public class Difference {
        public int solution(int num1, int num2) {
            int answer = 0;
            answer = num1 - num2;
            return answer;
        }
        public static void main(String[]args){
            Difference d = new Difference();
            System.out.println(d.solution(2,3));

    }
}
