// 숫자 카드 N개와 카드에 속해있는지 검새해야하는 숫자 M개가 주어진다.
// N(1 ≤ N ≤ 500,000) ,M(1 ≤ M ≤ 500,000) 카드는 +- 10,000,000
// 숫자 카드에 속해 있으면 1 아니면 0 + 공백
// 아이디어(sudo code)
// 0. Set을 사용. Stringbuilder 사용
// 1. N개의 숫자카드를 입력받아 Set에 넣는다.
// 2. M개의 숫자를 입력받으면서 하나씩 Set에 있는지 확인한다.
// 3. 있다면 1을 sb에 넣고, 아니면 0을 넣는다.


import java.util.HashSet;
import java.util.Scanner;

public class BOJ_10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int X = sc.nextInt();
            set.add(X);
        }
        int M = sc.nextInt();
        for(int j=0; j<M; j++){
            int Y = sc.nextInt();
            if(set.contains(Y)){
                sb.append(1+" ");
            }else{
                sb.append(0+" ");
            }
        }
        System.out.println(sb);
    }
}
