// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력
// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다
// 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어
// aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
// 입력
// 첫째 줄에 단어의 개수 N <= 100
// 둘째 줄부터 N개의 줄에 단어
// 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
// 출력
// 첫째 줄에 그룹 단어의 개수
// 아이디어(sudo code)
// 0.int[26] - 알파벳 별로 이전에 등장했는지 체크하기 위한 리스트 ;
// 1. 문자열을 char[] 로 치환 --> 각 글자별로 조건을 검사하기 위함
// 2. 각 문자 별로 조건검사
// 2.1. 만약 이미 리스트에 등장했던 문자가 나온다면 break
// 2.2 while 다음문자가 같지 않을때까지 반복
// 3. 나오지 않는다면 result ++

import java.util.Scanner;

public class BOJ_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int T = Integer.parseInt(sc.nextLine()) ;
        for(int i=0; i<T; i++) {

            int[] alphabet_arr = new int[26]; // 알파벳 별로 이전에 등장했는지 체크하기 위한 리스트 ;
            char[] word = sc.nextLine().toCharArray(); // 입력받은 문자열(단어)을 char[] 로 치환
            int start = 0; // pointer 역할
            boolean valid = true ; // valid의 결과를 체크하기 위함
            while (start < word.length) { // 각 문자 별로 조건검사
                int w = word[start] - 97;
                if (alphabet_arr[w] == 1){valid = false; break;} //만약 이미 리스트에 등장했던 문자가 나온다면 break
                alphabet_arr[w] = 1 ; // 한번 등장했음을 체크
                while(start+1 < word.length&& w == (word[start+1] - 97)){start++;} // --> 다음문자가 같지 않을때까지 반복
                start++; // 다음으로 넘어감
            }
            if(valid) result++ ; // 조건검사를 통과했다면 ++
        }
        System.out.println(result);
    }
}
