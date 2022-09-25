T = int(input())
for tc in range(1,T+1):
    N, P = map(int, input().split())

    # 각 요소가 평균값에 가까우면 곱이 커진다.

    a = int(N // P) # 몫
    b = N % P   # 나머지

    max_candy = 1   # 최대 사탕의 개수

    for _ in range(P-b):   # (묶음 수 - 나머지) 만큼 a 곱해주기
        max_candy *= a
    for _ in range(b):     # 나머지만큼 (a+1) 곱해주기
        max_candy *= (a+1)

    print(f"#{tc} {max_candy}")
