import java.util.Scanner;
// 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
// X가 주어졌을 때, X번째 분수를 구하시오
// 입력: X(1 ≤ X ≤ 10,000,000)
// 출력: X번째 분수
// <아이디어>
// X가 몇번째 라인에 속하는지 알아야 한다.
//1 번째 (1의 분수) +2 -> 3번까지(2의 분수) + 3 --> 6번까지(3의 분수) --> 1,3,6,10,15
// -> sum(1~N)보다 작다면 N의 분수 X - sum(N-1) = i
// 지그재그 --> N이 2의 배수라면(%2==0) 작은값 / 큰값 부터 시작한다. 즉 1 + i / N - i 반대면 N - i  / 1 + i

public class BOJ_1193 {
    public static void main(String[] args) {
        int sum = 1, cnt = 1 ;
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt() ;
        while(sum < X){ //sum(1~cnt)보다 작다면 cnt의 분수
            cnt ++ ;
            sum += cnt ;
        }
        int i = X- (sum - cnt) - 1 ; // X - sum(cnt-1) - 1 = i 시작에서 몇칸 더 움직여야 하는가
        if(cnt %2==0){ // 2의 배수라면(%2==0) 작은값 / 큰값 부터 시작한다. 즉 1 + i / N - i 반대면 N - i  / 1 + i
            System.out.printf("%d/%d%n",1+i,cnt-i);
        }else{
            System.out.printf("%d/%d%n",cnt-i,1+i);
        }
    }
}
