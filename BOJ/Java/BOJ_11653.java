// 소인수 분해하기
/*
* 0. N을 입력받는다.
* 1. while N > 1 :
* 2. for 문으로 N번 반복한다.
* 3. 나눠 떨어지는 수를 찾는다.
* 4. 나눠 떨어지면 떨어진 값(i)을 출력하고 그 값 부터 다시 나눈다.
* 5. N /= i(나눌값)
 */

import java.util.Scanner;

public class BOJ_11653 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int x = 2;
        while (N > 1){
            for (;x<=N; x++){
                if(N%x==0){
                    System.out.println(x);
                    N /= x ;
                    break;
                }
            }
        }
    }
}
