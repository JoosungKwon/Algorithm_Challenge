import java.util.Scanner;
// 호텔 정문으로부터 걷는 거리가 가장 짧도록 방을 배정후 N번째 손님의 방을 출력
// 호텔은 W 개의 방이 있는 H 층 건물이라고 가정하자 (1 ≤ H, W ≤ 99). (H x W)형태
// 엘리베이터는 가장 왼쪽, 정문에서 엘리베이터까지의 거리는 무시, 호텔의 정면 쪽에만 방 --> 문제를 단순화, 추상화
// 모든 인접한 두 방 사이의 거리는 같은 거리(거리 1)
// 엘리베이터를 타고 이동하는 거리는 신경 쓰지 않는다. 다만 걷는 거리가 같을 때에는 아래층의 방을 더 선호
// --> 2101 > 102, 301 < 201
// 즉, 손님이 묶는 순서는 101 201 301 ..9901, 102 202 302.. 9902, ... 9999
// 입력
// 첫줄에 T(테스트 케이스)
// 각 테스트 데이터는 한 행으로서 H, W, N (1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W)
// 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지
// 출력
// N 번째 손님에게 배정되어야 하는 방 번호
// 아이디어 sudo code
// 1. 손님을 층 수로 나눈다.
// 2.몫+1은 방, 나머지는 층. -->  설명 만약 6층 이라면 10번째 손님은 몫은 1 , 나머지는 4이다. 따라서 정답은 402
// 3. 나머지가 0이라면 층은 H로 치환, 방은 +1은 하지 않는다. 왜냐하면 딱 떨어지는 지점까지 그 층에 속함으로
// 4. 방번호는 format을 00으로 만든후 합쳐서 출력
public class BOJ_10250 {
    public static void main(String[] args) {
        int H, W, N, floor, room ;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //T(테스트 케이스)
        for(int i = 0; i < T; i++){ // 테스트 케이스 만큼 반복
            H = sc.nextInt(); // 호텔의 층 수
            W = sc.nextInt(); // 각 층의 방 수
            N = sc.nextInt(); // 몇 번째 손님
            floor = N % H == 0 ? H : N % H ; // 나머지는 층, 만약 나머지가 0이라면 H로 치환
            room = N % H == 0 ? (N / H) : (N / H) + 1 ; // 몫은 방, 만약 나머지가 0이 아니라면 +1
            System.out.printf("%d%s%n",floor,String.format("%02d",room)); // 방번호는 format을 00으로 만든후 합쳐서 출력
        }
    }
}
