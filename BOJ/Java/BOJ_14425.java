/* 백준 14425번 문자열 집합
* 입력으로 주어지는 M개의 문자열 중에서 집합 S(N개의 입력으로 미리주어짐)에 포함되어 있는 것이 총 몇 개인지 구하시오
* <입력>
* 첫째 줄에 문자열의 개수 N과 M (1 ≤ N ≤ 10,000, 1 ≤ M ≤ 10,000)
* 다음 N개의 줄에는 집합 S에 포함되어 있는 문자열들이 주어진다.
* 다음 M개의 줄에는 검사해야 하는 문자열들이 주어진다.
* 입력으로 주어지는 문자열은 알파벳 소문자로만 이루어져 있으며, 길이는 500을 넘지 않는다.
* 집합 S에 같은 문자열이 여러 번 주어지는 경우는 없다.
* <출력>
* 첫째 줄에 M개의 문자열 중에 총 몇 개가 집합 S에 포함되어 있는지 출력한다.
* <요약>
* 주어지는 N개의 단어로 이루어진 집합 S에 대해서 주어지는 M개의 단어가 몇개나 포함되는지 구하라
*/

/* 아이디어(sudo code)
* hashset함수를 이용한 search 문제
*  1. import hashset
*  2. N,M을 입력받는다
*  3. N개의 입력을  hashset에 넣는다.
*  4. for문으로 M개의 입력을 받는동안
*  5. 주어지는 입력이 set에 포함 되어있는지 확인 contain()
*  6. true면 cnt +=1
*  7/ print(cnt)
*  */
import java.util.HashSet ;
import java.util.Scanner;

public class BOJ_14425 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); // hashset 선언
        Scanner input = new Scanner(System.in); // 입렦 장치
        int cnt = 0; // 결과(개수 카운트) 변수
        String[] Line = input.nextLine().split(" "); // 공백을 기준으로 주어지는 입력
        int N = Integer.parseInt(Line[0]); // 앞쪽 N
        int M = Integer.parseInt(Line[1]); // 뒷쪽 M
        for(int i= 0; i<N; i++){
            set.add(input.nextLine()); // N개의 단어 집합
        }
        for(int j =0; j<M; j++){
            if(set.contains(input.nextLine())){ // 만약 입력 받은 문자열이 포함되어 있다면 카운트 +1
                cnt ++;
            }
        }
        System.out.println(cnt); // 포함된 개수 출력
    }
}
