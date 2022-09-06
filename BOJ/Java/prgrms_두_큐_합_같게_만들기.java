import java.util.Queue;
import java.util.LinkedList;
/*
 * 주어지는 두개의 큐를 이용하며, -> 첫번째 값만 빼내고 마지막에만 넣을 수 있다.
 * 큐 안에 있는 원소를 이동하여 각 큐의 합을 같게 만든다. -> 개수 상관 X
 * 최소 이동의 횟수는? -> 최솟값 구하기
 * 이동 -> pop + insert
 * ※ 제한사항
 * 1 ≤ queue ≤ 300,000 -> n2이하 알고리즘
 * 1 ≤ queue의 원소≤ 10^9(10억)-> long으로
 * 각 큐의 원소 합을 같게 만들 수 없는 경우 return -1
 *
 * 아이디어 (sudo code)
 * 투포인터에서 아이디어를 얻어서...
 * 두개의 큐를 비교 ->  값이 큰쪽에서 작은 쪽으로 이동(1회)를 한다.
 * 다시 비교하면서 같아지는 지점에서 멈추고 cnt 를 출력
 * -> 할 수 없는 경우는 어떻게 판단하지?
 * -> 최대 경우의 수 즉, 이동 횟수가 주어지는 큐의 크기의 두배가 넘는다면 return -1;
 */

public class prgrms_두_큐_합_같게_만들기 {
    public static void main(String[] args) {
        int[] queue1 = {3,2,7,2};
        int[] queue2 = {4,6,5,1};
        int result = solution(queue1,queue2);
        System.out.println(result);
    }

    public static int solution(int[] q1, int[] q2) {
        // 사용하기 위한 값과 자료구조
        final int MAX_MOVE = 2 * q1.length;
        int cnt = 0;
        long sum1 = 0, sum2 = 0;
        Queue<Long> queue1 = new LinkedList<>();
        Queue<Long> queue2 = new LinkedList<>();

        // 사용하기 위한 값과 자료구조 값 셋팅(초기화)
        for(int i=0; i<q1.length; i++) {
            queue1.add((long)q1[i]);
            queue2.add((long)q2[i]);
            sum1 += q1[i];
            sum2 += q2[i];
        }

        // 메인 로직(알고리즘)
        long value ;
        while(cnt <= MAX_MOVE) {
            // 두가지 탈출 조건
            if(sum1 == sum2) {return cnt;}
            if(queue1.isEmpty() || queue2.isEmpty()){return -1;}

            if(sum1 > sum2) {
                value = queue1.poll();
                queue2.add(value);
                sum1 -= value;
                sum2 += value;
            }else {
                value = queue2.poll();
                queue1.add(value);
                sum1 += value;
                sum2 -= value;
            }

            cnt++;
        }
        return -1 ;
    }
}
