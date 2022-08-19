import java.util.Scanner;

// 설탕배달 2839번
// 3킬로그램과 5킬로그램 설탕 봉지로 설탕을 정확하면서 최대한 적은 봉지로 N킬로그램을 배달해야 한다.
// 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하라
// 입력: (3 ≤ N ≤ 5000)
// 출력: 배달해야하는 봉지의 최소 개수 / 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력
// <아이디어> sudo code
// 1.최대한 5로 나누어 떨어지는 지점을 구한다. --> ex) 21이라면 20 , 19라면 15 // N을 5로 나눈 값 * 5
// 2.그 후에 나머지를 구한다. 만약 나머지가 0이 아니라면 나머지가 3으로 떨어지는 지 확인한다.
// 3. 안 떨어진다면 -5를 한다.
// 4.위과정을 반복한다. 2~3 과정 반복
// 5. 만약 3으로 나누어 떨어졌다면 5로 나눈값과 3으로 나눈값을 각각저장해서 더한 후 출력한다.
// 6. 만약 5가 0이고 3으로도 나누어떨어지지 않는다면 -1을 출력한다.
public class BOJ_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int five_cnt = (N/5) ;
        int remain_sugar = N%5;
        int three_cnt = 0;
        while(remain_sugar != 0){
            if (remain_sugar % 3 == 0){
                three_cnt = remain_sugar / 3 ;
                break ;
            }else{
                if(five_cnt==0){
                    break;
                }else{
                    remain_sugar += 5 ;
                    five_cnt -- ;
                }
            }
        }

        if(five_cnt + three_cnt == 0){
            System.out.println(-1);
        }else{
            System.out.println(five_cnt + three_cnt);
        }

    }
}
