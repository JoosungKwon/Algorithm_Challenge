import java.util.HashMap;

/**
 * 성격 유형 검사지 --> 유형을 구분하는게 목적?
 * 4개 지표를 통해서 각 지표당 2개의 유형으로 분류 -> 총 16개의 경우의수
 * 자세히 보면 MBTI와 비슷함
 * 검사지에는 총 n개의 질문이 있고, 각 질문에는 7개의 선택지가 있다
 * 각 질문은 1가지 지표 -> 가운데를 기준으로 두 유형에 점수를 다르게 받는다
 * Ex) 1유형 --> 3 2 1 0 1 2 3 <-- 2유형
 * 주어지는 선택에서 3에서 절대값만큼 차이가 난다.
 * ※주의 : 단, 하나의 지표에서 각 성격 유형 점수가 같으면, 두 성격 유형 중 사전 순으로 빠른 성격 유형을 검사자의 성격 유형이라고 판단합니다.
 * 질문마다 판단하는 지표를 담은 1차원 문자열 배열 survey
 * survey의 원소는 "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA"
 * 선택한 결과를 담은 1차원 정수 배열 choices
 */

/**
 * 아이디어 (sudo code)
 * map을 통해 유형에 접근하자 -> key(유형)를 통해 접근이 가능하기 때문에
 * 유형을 사전 순으로 두고 맵으로 불러와서 비교해서 출력하자
 * 사전준비
 * 유형을 사전 순으로 담고 있는 배열
 * HashMap -> 선택지에 따라 유형에 빠르게 접근하고 점수를 업데이트 해주기 위함
 * StringBuilder -> 결과를 출력하기 위함
 * 1. map 객체를 유형을 담은 배열을 이용해 8가지 key(유형)와 0으로 초기화
 * 2. 주어지는 survey를 불러와서 survey[i]를 charAt(0~1)으로 나누어 가져와 key 변수에 담는다.
 * 3. choice[i]에 접근해서 선택결과가 4보다 작으면 key 절대값(선택결과 - 4)을 더해준다
 * 4. 2~3번 과정을 survey의 길이 만큼 반복한다.
 * 5. 다 끝나다면 유형 배열을 이용해 2배수 씩 읽어 온다
 * 6. 따라서 두개 유형을 1대 1로 비교해서 왼쪽이 크거나 같으면 (사전 순임으로 같아도 왼쪽 먼저) 왼쪽 원소를 sb에 append
 * 7. 위 조건에 따라 4개의 문자가 만들어졌으므로 sb 출력
 * */

public class prgrms_성격_유형_검사하기 {
    public String solution(String[] survey, int[] choices) {
        // 필요한 객체 및 필드 값 선언
        char[] type_arr = {'R','T','C','F','J','M','A','N'};
        HashMap<Character,Integer> type_result = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        // map초기화 작업
        for (char c : type_arr) type_result.put(c, 0);

        // 질문지 유형과 선택결과를 불러온다
        for(int i=0; i<survey.length; i++){
            char key = choices[i] < 4 ? survey[i].charAt(0): survey[i].charAt(1) ;  // 유형 타입
            int cnt = Math.abs(choices[i]-4); // 유형 점수
            type_result.put(key,type_result.get(key)+cnt);
        }
        //미리 사전 순서대로 정의한 유형 배열을 이용해 2개씩 읽어 온다.
        for(int i=0; i<type_arr.length; i+=2){
            int first = type_result.get(type_arr[i]);
            int second = type_result.get(type_arr[i+1]);
            if(first >= second){ // 유형 점수를 비교해서 점수가 큰 유형을 sb에 더해준다
                sb.append(type_arr[i]);
                continue;
            }
            sb.append(type_arr[i+1]);
        }

        String answer = new String(sb);
        return answer;
    }
}