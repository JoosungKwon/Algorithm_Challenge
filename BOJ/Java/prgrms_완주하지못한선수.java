
/**
 * 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion을 비교하여
 * 완주하지 못한 한명의 선수의 이름을 찾아라
 * ※주의
 * 동명이인이 있을 수 있다.
 * 리스트의 길이는 100,000 이하
 * 1. participant 리스트를 반복하며 Hash map에 put(이름, 수) -> 동명이인의 수를 체크하기 위해
 * 2. completion 리스트를 반복하면서 map에 있는지 없는지 확인
 * 3. 없다면 return key(이름)
 * 4. 있다면 숫자를 줄여나가고 난 후
 * 5. map을 다시 반복하면서 value가 1이 남은 key를 return
 * 최대 30만번 즉 3N -> O(N)
 */

import java.util.HashMap;

public class prgrms_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String name : participant){
            if(map.containsKey(name)){
                map.put(name,map.get(name)+1);
                continue;
            }
            map.put(name,1);
        }

        for(String name : completion){
            if(!map.containsKey(name)){
                return name;
            }
            map.put(name,map.get(name)-1);
        }
        for(String name : participant){
            if(map.get(name)==1){
                return name;
            }
        }
        String answer = "";
        return answer;
    }
}
