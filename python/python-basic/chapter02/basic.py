'''
chapter02. 파이썬 프로그래밍의 기초, 자료형

숫자형: 정수형, 실수형, 8진수, 16진수
연산자: +, -, *, /, %, **, //

문자열: " ", ' ', """ """, ''' '''
연산자: +, *
함수: 
- len(), 인덱싱(-도 가능), 슬라이싱 [0:10], [:10], [10:], [10:-7], 
- count(), find(), index(), join(), upper(), lower() lstrip(), rstrip(), strip(), replace(), split()
* 문자열은 변경불가능한 자료형
포멧팅: %d, %s, %(s,d)

리스트: 
연산자: +, *
함수:
- len(), 인덱싱(-도 가능), 슬라이싱 [0:10], [:10], [10:], [10:-7], 
- del, append(), sort(), reverse(), index(), insert(), remove(), count(), extend()
'''

a = 10
b = 20
print(a + b); print(a - b); print(a * b); print(a / b); print(a % b); print(a ** b); print(a // b)

c = """
쌍따옴표 3개 또는 작은따옴표 3개는
줄바꿈이 일어날 때, 줄바꿈 데이터도 함께 저장한다.
"""
print(c)
d = "="
print(d*50)

print(len(c)) # len
print(c[1]); print(c[-2]) # 인덱싱
print(c[0:6])

# c[10] = 'a' # 에러 발생, 문자열은 변경불가능한 자료형
# print(c)

print("Hello %s %d" %("STR", 50)) # 포멧팅