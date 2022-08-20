import java.util.Scanner;

// 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
// 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
// 단어는 공백 한 개로 구분된다.
// 공백이 연속해서 나오는 경우 X
// 문자열은 공백으로 시작하거나 끝날 수 있다.
// 입력
// 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열(S) S < 1,000,000
// 출력
// 단어의 개수
// 입력시 split(" ") 이용하여 공백으로 구분해서 문자열을 입력받아 배열에 저장한다
// 그 후 배열의 길이 출력
public class BOJ_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Line = sc.nextLine().trim(); // 앞의 공백을 제거하기 위해
        if(Line.length() > 0 ){
            String[] word = Line.split(" ");
            System.out.println(word.length);
        } else {
            System.out.println(0); // 빈공백이 주어졌을 때 1로 출력되는 현상을 제거하기 위해
        }
    }
}
