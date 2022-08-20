import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 알파벳 소문자로만 이루어진 단어 S가 주어진다. -> 아스키 97부터 123
// 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, --> 첫번째! 조건문으로 검사필요
// 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오. --> -1로 초기화
public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] lst = new int[26] ;
        Arrays.fill(lst,-1) ;
        String word = br.readLine();
        for(int j =0; j<word.length();j++){
            int ascii = word.charAt(j) ;
            if(lst[ascii -97] == -1){
                lst[ascii -97] = j ;
            }
        }
        for(int i : lst){
            sb.append(i+" ") ;
        }
        System.out.println(sb);
    }
}
