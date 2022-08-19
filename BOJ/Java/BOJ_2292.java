import java.util.Scanner;

// 숫자 N(1 ≤ N ≤ 1,000,000,000)이 주어졌을 때
// 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하라
// 벌집은 6각형이므로 i*N 만큼 증가한다 초기 1부터 : 1(1) + 6 -> 7(2) + 12 -> 19(3) +18 --> 37 ...
// while을 이용하여 벌집의 크기를 늘려가며 N 값과 벌집의 크기를 비교한다.
public class BOJ_2292 {
    public static void main(String[] args) {
        int cnt = 1, bee_hive = 1; // 벌집의 크기와 단계를 저장하기 위한 변수
        Scanner sc = new Scanner(System.in); // 입력도구
        int N = sc.nextInt() ; // 입력값(N)
        while(N > bee_hive){ // N이 벌집의 크기보다 크다면 반복
            bee_hive += cnt * 6 ; // 반복하면서 벌집의 크기를 규칙에 맞게 증가
            cnt ++; // 단계를 하나씩 증가
        }
        System.out.println(cnt); // 몇번째 단계에 있는지 출력
    }
}
