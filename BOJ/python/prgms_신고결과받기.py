#  유형 : 딕셔너리를 사용한 구현 유형
#  자료구조 : dict, set
#  알고리즘: 요구조건 구현
#  요구조건 : 1. 이용자를 신고하고 신고 결과에 따라서 정지 --> 신고 횟수 카운트 후 비교 연산하기
#            2. 동일 유저에 대한 신고는 1회로 처리 --> 중복 X
#            3. 신고한 유저와 정지정지된 유저와 신고받은 유저
# 1. 신고한 결과를 저장하기 위한 딕
# 2. 신고받은 결과 저장하기 위한 딕

def solution(id_list, report, K):
    report_dic = {name : set() for name in id_list}
    reported_dic = {name : set() for name in id_list}
    van_list = set()
    result = []
    for word in set(report):
        k,v = word.split(' ')
        reported_dic.get(v).add(k)
        report_dic.get(k).add(v)
        if len(list(reported_dic.get(v))) >= K :
            van_list.add(v)
    for name in id_list:
        result.append(len(list(report_dic.get(name).intersection(van_list))))
    return result