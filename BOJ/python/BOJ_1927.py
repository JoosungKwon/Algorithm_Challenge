# heapq(힙) 자료구조를 사용해보는 문제
# 배열에 자연수 x를 넣는다.
# 배열에서 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
#
# 입력: 첫째 줄에는 연산의 개수 N(1 ≤ N ≤ 100,000)
# 만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고,
# x가 0이라면 배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우이다
# 출력 : 입력에서 0이 주어진 횟수만큼 답을 출력한다.
# 만약 배열이 비어 있는 경우인데 가장 작은 값을 출력하라고 한 경우에는 0을 출력하면 된다.

import heapq
import sys

N = int(sys.stdin.readline().rstrip())
heap = []
for i in range(N):
    x = int(sys.stdin.readline().rstrip())
    if not x:
        try:
            print(heapq.heappop(heap))
        except IndexError:
            print(0)
    else:
        heapq.heappush(heap,x)
