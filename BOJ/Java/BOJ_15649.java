/* 백준 15649번 N과 M(1)
* 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하라
* 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
* 입력 : 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
* Ex) 3 2
* 출력 : 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다.
* 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
* 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
* Ex)
* 1 2
* 1 3
* 2 1
* 2 3
* 3 1
* 3 2
* */

/* 아이디어 (sudo code)
* 전형적인 백트래킹 - 완전탐색 문제
* 재귀적인 방법으로 도전
* */

import java.util.Scanner;
import java.util.Stack;

public class BOJ_15649 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        Stack<Integer> arr = new Stack<>();
        backTracking(arr,N,M);
    }
    public static void backTracking(Stack<Integer> result, int range, int cnt){
        if(result.size()==cnt){
            StringBuilder sb = new StringBuilder();
            for(int x : result){
                sb.append(x).append(" ");
            }
            System.out.println(sb);
        }

        for(int i = 1; i<=range; i++){
            if(!result.contains(i)){
                result.add(i);
                backTracking(result,range,cnt);
                result.pop();
            }
        }
    }
}
