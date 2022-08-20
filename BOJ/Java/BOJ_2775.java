// a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다.
// 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
// 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력
// 입력
// 첫 번째 줄에 Test case의 수 T
// 두번째 줄부터 정수 k, 그 다음 줄에 정수 n (1 ≤ k, n ≤ 14)
// 출력
// 각각의 Test case에 대해서 해당 집에 거주민 수
// 아이디어
// 0층 1호 - i호 는 i 명씩 거주
// 1층 1호 - 1명 2호 - 3명(1+2) 3호 (1+2+3) 6명
// 2층 1호 - 1명 2호 - 4명 (1+3(1+2)) 3호 10명 (1+3(1+2)+6(1+2+3))
// 1호는 무조건 1명
// 재귀적 방법으로 해결가능? --> k와 n의 범위를 고려해보면 재귀적인 방법으로도 해결 가능할것 같다 -> dp이용

import java.util.Scanner;

public class BOJ_2775 {
    static int[][] apt = new int[15][15];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1 ; i < 15 ; i++ ){
            apt[0][i] = i;
        }
        for(int i = 0; i < T ; i++ ){
            int K = sc.nextInt();
            int N = sc.nextInt();
            int result = searchNum(K,N);
            System.out.println(result);
        }
    }
    static int searchNum(int floor, int arc){
        if(apt[floor][arc] == 0){
            for(int i = 1 ; i <= floor ; i++){
                int tmp = 0 ;
                for (int j = 1 ; j <= arc ; j++ ){
                    tmp += apt[i-1][j] ;
                    apt[i][j] = tmp ;
                }
            }
        }
        return apt[floor][arc] ;
    }
}
