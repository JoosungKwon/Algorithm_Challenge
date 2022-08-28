/* 백준 11478 서로 다른 부분 문자열의 개수
* 문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하라
* 부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
* Ex) ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개
 */
/* 아이디어(sudo code)
* subString과 set 자료구조를 이용한 문제
* 1. 문자열을 입력받는다.
* 2. 이중 포문으로 i = 0 ~ N, j = i ~ N을 더해서 만든다.
* 3. set에 add
* 4. set size를 출력
*/

import java.util.HashSet;
import java.util.Scanner;


public class BOJ_11478 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        for(int i = 0; i<word.length(); i++) {
            for(int j = i+1; j<word.length()+1; j++){
                set.add(word.substring(i,j)) ;
            }
        }
        System.out.println(set.size());
    }
}
