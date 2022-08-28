/* 백준 1764번 듣보잡
* N개의 명단과 M개의 명단이 주어질 때
* 공통의 명단을 출력하라
* 수와 그 명단을 사전순으로 출력
*  N, M <= 500,000
* */
/* 아이디어(sudo code)
* treeset과 교집합 연산을 이욯하는문제
* 1. import treeset
* 2. N개의 데이터가 들어있는 set 과 M개의 데이터가 들어있는 set
* 3. 출력 h1,h2의 교집합
* */



import java.util.TreeSet;
import java.util.Scanner;

public class BOJ_1764 {
    public static void main(String[] args) {
        TreeSet<String> set_N = new TreeSet<>();
        TreeSet<String> set_M = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        String[] Line = input.nextLine().split(" ");
        int N = Integer.parseInt(Line[0]);
        int M = Integer.parseInt(Line[1]);
        for(int i = 0; i<N; i++){
            set_N.add(input.nextLine());
        }
        for(int j = 0; j<M; j++){
            set_M.add(input.nextLine());
        }
        set_N.retainAll(set_M);
        System.out.println(set_N.size());
        for (String s : set_N) {
            System.out.println(s);
        }
    }
}
