package programmers.level0;

/**
 * 문제: 두 수의 몫
 * 풀이일: 2026-02-11
 */

public class Quotient {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1/num2;
        return answer;
    }
    public static void main (String[]args) {
        Quotient q = new Quotient();
        System.out.println(q.solution(10,2));

    }
}

