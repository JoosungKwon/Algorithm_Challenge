/* 문제 분석
* 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾아라.
* Ex) M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61
* 입력
* 첫째 줄에 M, 둘째 줄에 N ( M <= N <= 10,000)
* 출력
* 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값
* 단, 없을 경우는 첫째 줄에 -1
 */

/* 아이디어(sudo code)
* 소수를 N까지 미리 찾아둔다.
* 그 후에 리스트에 담아뒀다가 M 이상 N이하의 값만 다 더한다.
* 1. for문으로 1부터 10,000까지(포함) 반복한다. --> 시간초과를 막기 위함 (미리 소수를 구별한다)
* 2. 다시 for문으로 반복하면서 에라토스테네스의 체의 알고리즘을 이용하여(배수를 삭제하는 알고리즘) 소수를 판별한다.
* 3. 따라서,리스트(소수가 담겨있는 <1~ 10000까지의 정수가 담겨 있던 배열>)에 남아 있는 값은 전부 소수이다.
* 4. N,M을 sc,nextInt()로 입력받는다.
* 5. for문을 통해 리스트를 N번까지 반복한다.
* 6. M보다 큰 값이 나온다면 해당 값을 최솟값으로 설정한다.
* 7. 만약 존재하지 않는 다면 -1로 초기화
* 6. 최솟값이 -1이라면 최솟값을 출력하고 종료한다.
* 7. 위 조건을 통과시 리스트에 첫번째 값을 최소값으로 설정한다.
* 8. 리스트를 반복하면서 M이상 N이하의 값이라면 결과에 더한다.
* 9. 만약 N이상의 값이 나오면 break
* 10. 반복문을 도는 동안 첫번째 더해지는 값은 최소값으로 설정한다.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2581 {
    public static void main(String[] args) {
        ArrayList<Integer> prime_number_lst = new ArrayList<>() ; // 소수가 저장될 리스트
        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 객체
        for(int i = 2; i<10001; i++){
            prime_number_lst.add(i); // 리스트를 2 ~ 10000의 값으로 초기화
        }
        // 에라토스테네스의 체 구현 부분
        // 이중 for문을 통해 배수를 제거하는 방식
        for(int j=2; j<10001; j++){
            for(int k = (int) Math.pow(j,2); k<10001; k+=j){// 제곱부터 시작해야 효율적
                 prime_number_lst.set(k-2,0); // 배수는 0으로 만든다. (리스트의 시작 인덱스는 0인 반면 값은 2이므로 2의 차이를 상쇄해줘야함)
            }
        }
        // 첫째 줄에 M, 둘째 줄에 N ( M <= N <= 10,000)
        int M = sc.nextInt();
        int N = sc.nextInt();
        int min_value = -1;
        for(int x = 0; x<=N-2; x++){
            if (prime_number_lst.get(x) >= M){
                min_value = x + 2;
                break;
            }
        }
        if(min_value > -1) { // 최솟값이 -1보다 큰경우에만 아니면 -1 출력 하고 종료
            int result = 0;
            for(int y = min_value-2; y<=N-2; y++){
                result += prime_number_lst.get(y) ;
            }
            System.out.println(result); // 소수의 합 출력
        }
            System.out.println(min_value);
    }
}
