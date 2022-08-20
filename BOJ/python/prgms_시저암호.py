# 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수
# 주어지는 문자열은 알파벳 소문자, 대문자, 공백
# n은 1 이상, 25이하인 자연수 --> 두번이상 반복X %사용하면 상관X
# s의 길이는 8000이하 --> 일반적인 반복문 사용가능
# a B z --> e F d / 공백은 아무리 밀어도 공백.
# sudo code
# 1. 문자열을 아스키 코드로 변환한다
# 2. 조건문으로 아스키 코드가 대문자인지 소문자인지 그외(공백)인지 구분한다
# 3. 대문자 -> -65 / 소문자 -97 을 해준다 (어떤 알파벳인지 알기 위함)
# 3.1 공백이라면 바로 7번으로 건너 뛴다
# 4. 해당 아스키 코드(s)에 n을 더해준다.
# 5. 그 후 %26 으로 연산하고, 그후에 대문자 -> +65 / 소문자 +97 을 해준다
# 6. 아스키 코드를 문자열로 바꾼다.
# 7. 정답 리스트에 append 한다.
# 8. 위 과정을 문자열 길이 만큼 반복한 후에 리스트를 join하여 출력한다.
def solution(s, n):
    result = []
    for c in s:
        asc = ord(c)
        if 65 <= asc <= 90:
            asc -= 65
            asc += n
            asc %= 26
            asc += 65
        elif 97 <= asc <= 122:
            asc -= 97
            asc += n
            asc %= 26
            asc += 97
        result.append(chr(asc))

    answer = "".join(result)
    return answer

print(solution("AB",1))