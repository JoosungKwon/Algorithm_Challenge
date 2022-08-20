// 방학은 총 L일이다. 수학은 총 B페이지, 국어는 총 A페이지를 풀어야 한다.
// 하루에 국어를 최대 C페이지, 수학을 최대 D페이지 풀 수 있다.
// 겨울 방학동안 숙제를 하지 않고 놀 수 있는 최대 날의 수는?
// 나누어 떨어지지 않으면 몫 +1 , 떨어지면 몫
// 수학과 국어중 날짜가 더 오래걸리는것에서 방학을 뺀값
import java.util.Scanner;
import java.lang.Math ;
public class BOJ_5532 {
    public static void main(String[] args) {
        int L, A,B,C,D ;
        Scanner sc =new Scanner(System.in);
        L = sc.nextInt() ;
        A = sc.nextInt() ;
        B = sc.nextInt() ;
        C = sc.nextInt() ;
        D = sc.nextInt() ;
        int kor = A % C == 0 ? A / C : (A / C) + 1 ;
        int math = B % D == 0 ? B / D : (B / D) + 1 ;
        int max_day = L - Math.max(kor,math);
        System.out.println(max_day);
    }
}
