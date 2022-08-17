import java.util.Scanner;
//달팽이는 낮에 A미터 올라갈 수 있다.
// 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
// 또, 정상에 올라간 후에는 미끄러지지 않는다.
// 입력
// 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
// 출력
// 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
// --> 일반적인 구현으로 풀면 시간초과
// (V / A - B)+1
public class BOJ_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt() ;
        int B = sc.nextInt() ;
        int V = sc.nextInt() - A ; // 마지막 전까지 올라가는데 걸리는 기간을 구하기 위해
        int result = (V % (A - B) == 0 ? V / (A - B) : (V / (A - B)) + 1) ; // 마지막 전까지 올라가는데 걸리는 기간이 딱 떨어지면 몫 아니면 몫 + 1 (why? 하루 더 올라가야하니까)
        result = (result == 0 ? V == 0 ? 0 : 1 : result); // 마지막을 빼고 올라가는데 걸리는 기간 --> 만약 0 이라면 2A >= V or V == A
        System.out.println(result + 1); // 마지막을 빼고 올라가는데 걸리는 기간 + 마지막 올라가는 날(하루)
    }
}
