import java.util.Scanner;
// 입력
// 첫 번째 줄에는 시 A (0 ≤ A ≤ 23), 분 B (0 ≤ B ≤ 59)와 초 C (0 ≤ C ≤ 59)
// 두 번째 줄에는 요리하는 데 필요한 시간 D (0 ≤ D ≤ 500,000)가 초 단위로 주어짐
// 출력
// 디지털 시계는 23시 59분 59초에서 1초가 지나면 0시 0분 0초가 된다.
public class BOJ_2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 주어지는 시
        int m = sc.nextInt(); // 주어지는 분
        int s = sc.nextInt(); // 주어지는 초
        int need_time = sc.nextInt(); // 필요한 시간(초)
        s +=  need_time % 60 ; // 주어지는 초 + (필요한 초) % 60 - > 초만 추출
        m += ((need_time / 60) % 60) + (s/60); // 주어지는 분 + ((필요한 초) / 60) %60 - > 분만 추출 + 초에서 60초 넘은 양
        h += (need_time / 3600) + (m/60) ; // 주어지는 시 + ((필요한 초) / 3600) - > 시만 추출 + 분에서 60초 넘은 양
        System.out.printf("%d %d %d%n",h%24,m%60,s%60);
    }
}
