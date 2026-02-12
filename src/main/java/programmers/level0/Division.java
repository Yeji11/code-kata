package programmers.level0;

/**
 * 문제: 두 수의 나눗셈
 * 풀이일: 2026-02-12
 */

public class Division {
        public int solution(int num1, int num2) {
            double answer = (double) num1 / num2 * 1000;
            return (int)answer;
        }
        public static void main(String[]args) {
            Division d = new Division();
            System.out.println(d.solution(3,2));
        }
    }
