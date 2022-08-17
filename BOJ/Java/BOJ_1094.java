import java.util.Scanner ;
//지민이가 가지고 있는 막대의 길이를 모두 더한다. --> 처음에는 64cm 막대 하나만 가지고 있다.
//이때, 합이 X보다 크다면, 아래와 같은 과정을 반복한다.
//가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
//만약, 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 버린다.
//이제, 남아있는 모든 막대를 풀로 붙여서 Xcm를 만든다.
// 예시 : X -> 50
// 64 > X --> 32 < X(50) // 32 keep X = 50 - 32 = 18
// 남은 32 --> 16 / 16 < X(18) 16 keep X = 18-16 = 2
// 16 -> 8 / 8 > X(2) 8 버림
// 8 -> 4 / 4 > X(2) 4 버림
// 4 --> 2 / 2 2 하나 버리고 2 keep X = 2-2 = 0
// 32(2^5) + 16(2^4) + 2(2^1) 110010
// 이 문제는 X를 이진수로 바꿨을 때의 1의 합을 출력하면 된다.

public class BOJ_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt() ;
        String binaryStr = Integer.toBinaryString(x);
        int cnt = 0 ;
        for(int i = 0 ; i < binaryStr.length(); i++){
            if(binaryStr.charAt(i) == 49){
                cnt ++ ; // 이진수로 변환된 문자열에서 1의 개수
            }
        }
        System.out.println(cnt);
    }
}
