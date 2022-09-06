// 총 종류의 수에서 내가 고를 수 있는 포켓몬의 수(n/2) -> 종류의 수가 많다면 내가 고를수 있는 수
// 내가 고를 수 있는 종류의 수가 더 많다면 총 종류의 수 return
import java.util.HashSet;

public class prgrms_폰켓몬 {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int my_get = nums.length / 2 ;
        for(int x : nums){
            set.add(x);
        }
        int type_num = set.size();
        return Math.min(my_get, type_num);
    }
}