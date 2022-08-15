# 큐를 직접 구현해보는 문제
# 구현해야 하는 명령어 : push, pop, size, empty, front, back
# 클래스를 이용해서 만들자
# python3로는 시간초과가 계속 나온다 pypy로 진행하는게 좋을듯 싶다..
#####################################################################################################
import sys
from collections import deque

class myqueue:
    # 생성자
    def __init__(self, *args):
        self.__queue = deque(args)
        self.__size = len(self.__queue)

    # push X: 정수 X를 큐에 넣는 연산이다.
    def push(self, x):
        self.__queue.append(x)
        self.__size += 1

    # pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다
    def pop(self):
        if self.empty():
            return -1
        self.__size -= 1
        return self.__queue.popleft()

    # size: 큐에 들어있는 정수의 개수를 출력한다.
    def size(self):
        return self.__size

    # empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
    def empty(self):
        return 1 if self.__size == 0 else 0

    # front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    def front(self):
        if self.empty():
            return -1
        return self.__queue[0]

    # back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    def back(self):
        if self.empty():
            return -1
        return self.__queue[self.__size-1]
#####################################################################################################
# 첫째 줄에는 명령의 수 N (1 ≤ N ≤ 2,000,000)이 주어진다.
# 1 <= 주어지는 정수의 크기 <= 100,000
myQueue = myqueue() # 만든 큐를 생성
N = int(sys.stdin.readline().rstrip()) # N 입력받기
for i in range(N): # N개의 명령을 입력받고 적절히 처리하기 위해
    cmd = list(sys.stdin.readline().split()) # push의 경우는 data도 주어지기 때문에 list로 변형 후 제어해야한다
    if cmd[0] == "push":
        data = int(cmd[1]) # 데이터를 숫자화 해줘야함
        myQueue.push(data)
    elif cmd[0] == "pop":
        sys.stdout.write(str(myQueue.pop())+"\n")
    elif cmd[0] == "size":
        sys.stdout.write(str(myQueue.size())+"\n")
    elif cmd[0] == "empty":
        sys.stdout.write(str(myQueue.empty())+"\n")
    elif cmd[0] == "front":
        sys.stdout.write(str(myQueue.front())+"\n")
    elif cmd[0] == "back":
        sys.stdout.write(str(myQueue.back())+"\n")
sys.stdout.flush()
sys.stdout.close()













