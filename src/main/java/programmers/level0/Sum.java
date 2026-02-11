package programmers.level0;

/**
 * 문제: 두 수의 합
 * 풀이일: 2026-02-11
 */

public class Sum {
    public int solution(int num1, int num2){
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }
    public static void main (String[]args) {
        Sum s = new Sum();
        System.out.println(s.solution(2,3));
    }
}
