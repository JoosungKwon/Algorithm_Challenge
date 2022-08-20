// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만들어라
// 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
// S에는 QR Code "alphanumeric" 문자만 들어있다.
// 입력
// 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)
// 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다.(1 ≤ S ≤ 20)
// char 배열로 입력받아 각 글자당 for 문으로 R번 sb에 쌓는다.
import java.util.Scanner;

public class BOJ_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < T; i++){
            StringBuilder sb = new StringBuilder();
            String[] Line = sc.nextLine().split(" ") ;
            int R = Integer.parseInt(Line[0]);
            char[] word = Line[1].toCharArray() ;
            for(char chr : word ){
                for(int j =0 ; j < R ; j++){
                    sb.append(chr);
                }
            }
            System.out.println(sb);
        }
    }
}
