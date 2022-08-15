import java.util.Scanner;

// 총 데이터의 개수는 항상 a^b개의 형태로 주어진다
// 입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다.
// 그 다음 줄부터 각각의 테스트 케이스에 대해 정수 a와 b가 주어진다. (1 ≤ a < 100, 1 ≤ b < 1,000,000)
// 아이디어 --> 1 ~ 10을 기준으로 순환 나머지(% 10)를 이용
// 각 숫자들은 곱해질 때마다(제곱이 될때마다) 규칙적으로 마지막 자리가 변할것이다.
// 예를 들어 2는 2 4 8 16 32 64 즉 5번을 기점으로 2 4 8 6 2 순환한다.
// 또한 11은 1과 같고 12는 2와 같다 % 10 사용
// sudo 코드
// 1. sc 입출력
// 2. 각 숫자 별 제곱 규칙에 따른 처리 Switch --> 찾아보니 규칙이 비슷하더라 / 대부분 5바뀌 이내로 순환하는 모습이 나온다
// 3. 규칙이 비슷하므로 간결한 처리
public class BOJ_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i< T ; i++) {
            int a = sc.nextInt() % 10; // 범위 제한 0 ~ 9 대신 0은 10으로
            int b = sc.nextInt() % 4 ; // 범위 제한 1 ~ 4 대신 0은 4으로
            System.out.println(a == 0 ? 10 :(int)Math.pow(a,b == 0 ? 4 : b) % 10);
        }
    }
}
            /*
            int x = 0;
            switch (a){
                case 0: System.out.println(10); break;
                case 1: System.out.println(1); break;
                case 2: x = b % 4 ; // 2: 2 4 8 16 32 --> 2 4 8 6 2
                        System.out.println(x == 0 ? 6 :(int)Math.pow(2,x) % 10);
                        break;
                case 3: x = b % 4 ; // 3: 3 9 27 81 243 --> 3 9 7 1 3
                    System.out.println(x == 0 ? 1 : (int)Math.pow(3,x) % 10);
                    break;
                case 4: x = b % 2 ; // 4: 16, 64 ,256 --> 4,6,4,6,4
                    System.out.println(x == 0 ? 6 : 4);
                    break;
                case 5: System.out.println(5); break;
                case 6: System.out.println(6); break;
                case 7: x = b % 4 ; // 7: 7 49 343 2401 16807 --> 7 9 3 1 7
                    System.out.println((int)Math.pow(7,x) % 10);
                    break;
                case 8: x = b % 4 ; // 8 64 512 4096 32768 --> 8 4 2 6 8
                    System.out.println((int)Math.pow(8,x) % 10);
                    break;
                case 9: x = b % 2 ; // 9: 9 81 729 --> 9 1
                    System.out.println(x == 0 ? 1 : 9);
                    break;
             */