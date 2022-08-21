import java.util.Scanner;
/* 크로아티아 문자를 구분하는 문제
* 예를 들어 "ljes=njak"은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
* 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
* 8개 크로아티아 문자 c=, c-, dz=, d-, lj, nj, s=, z=
* dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다.
* lj와 nj도 마찬가지이다.
* 위 목록에 없는 알파벳은 한 글자씩 센다
* S <= 100 , 알파벳 소문자와 '-', '='
* 아이디어(sudo code)
* 1. 문자열을 char 배열로 전횐한다.
* 2. 각 문자가 c,d,l,n,s,z인지 확인한다. switch
* 3. 문자 배열이 아직 남아 있다면 다음 글자를 확인한다.
* 4. 크로아티아 글자면 2개를 한글자로 처리(cnt +=1)
* 5. 아니면 글자하나당 cnt +=1
* --> replaceAll함수를 이용하면 훨씬 편하게 가능하다..
*/

public class BOJ_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = sc.nextLine().toCharArray() ;
        int len = word.length-1 ;
        int start = 0 ;
        int cnt = 0 ;

        while (start <= len){
            char chr = word[start] ;
            switch (chr){
                case 'd':
                    if( start+1 <= len && (word[start+1] == 'z' || word[start+1] == '-')){
                        if(word[start+1] == '-'){
                            cnt++ ; start += 2; break;
                        }
                        if(start+2 <= len && word[start+2] == '='){
                            cnt++ ; start += 3; break;
                        }
                    }
                    cnt ++ ; start ++; break;
                case 'l':
                case 'n':
                    if(start+1 <= len && word[start+1] == 'j'){
                        cnt++ ; start += 2; break;
                    }
                case 'c':
                    if(start+1 <= len && (word[start+1] == '=' || word[start+1] == '-')){
                        cnt++ ; start += 2; break;
                        }
                case 's':
                case 'z':
                    if(start+1 <= len && word[start+1] == '='){
                        cnt++ ; start += 2; break;
                        }
                default: cnt ++ ; start ++ ;
            }
        }
        System.out.println(cnt);
    }
}
