/* 백트래킹 구현 문제
* 추가 조건: 고른 수열은 오름차순이어야 한다
* */
import java.util.Scanner;
import java.util.Stack;

public class BOJ_15650 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
        // N과 M 공백 기준으로 입력
        int N = input.nextInt();
        int M = input.nextInt();
        Stack<Integer> arr = new Stack<>(); //  스택 구조가 나중에 back할때 효율적
        backTracking(arr,N,M,0);
    }
    public static void backTracking(Stack<Integer> result, int range, int cnt, int start){
        // 탈출 조건 & 출력
        if(result.size()==cnt){ // 수열의 길이가 M개라면 출력
            StringBuilder sb = new StringBuilder(); // join
            for(int x : result){
                sb.append(x).append(" ");
            }
            System.out.println(sb);
        }
        // 메인 로직: for문과 재귀의 조합
        // start 매개변수를 선언, 수열을 오름차순으로 만들기 위해서
        for(int i = start+1; i<=range; i++){
                result.add(i);
                backTracking(result,range,cnt,i);
                result.pop();
        }
    }
}



