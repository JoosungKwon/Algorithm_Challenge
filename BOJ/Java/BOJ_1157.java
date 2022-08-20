// 입력: 알파벳 대소문자로 된 단어
// 출력: 이 단어에서 가장 많이 사용된 알파벳을 출력
// 단, 대문자와 소문자를 구분하지 않는다.
// counting 정렬을 이용해서 --> 리스트 인덱스를 A-Z숫자로 치환후 리스트 원소를 사용빈도로 두어 관리
// 그 후 Max값을 구하면서 동일한 값이 여러번 비교가 되면 break 아니면 char 형변환 후 출력
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args) {
        int[] ascii = new int[26];
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine() ;
        char[] word = w.toUpperCase().toCharArray();
        for(char c : word){
            int i = c - 65 ;
            ascii[i] += 1 ;
        }
        int max_value = Arrays.stream(ascii).max().getAsInt();
        boolean flag = false ;
        int max_idx = 0 ;
        for(int j =0 ; j<ascii.length; j++){
            if(ascii[j]==max_value){
                if(flag){
                    System.out.println("?");
                    System.exit(0);
                    break;
                }else{
                    max_idx = j ;
                    flag = true ;
                }

            }
        }
        System.out.println((char)(max_idx+65));
    }
}
