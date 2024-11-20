# 기본형 vs 참조형 데이터 타입
https://junhyunny.github.io/java/auto-boxing-performance-test/

### 기본형이란?
- 데이터 자체를 담는 자료형이라고 할 수 있다.
- int, boolean, 등등이 있음
- 따라서 console에 찍어보면 바로 실제 입력한 데이터를 확인 할 수 있다
- 자료형으로 사용하기 위해서는 wrapper class를 통해 자료형으로 사용할 수 있음.
- steck 메모리에 위치

### 자료형이란?
- 데이터의 위치를 담는 자료형
- String, Integer, Boolean, Date와 같이 객체를 생성해서 사용해야 한다.
- 연산이 불가능
- heap 메모리 영역에 위치

### 그럼 기본형을 사용할때 wrapper class는 언제 사용할까?
- 기본형을 Object로 변경해야 하는 경우
- generic에 사용해야 하는 경우!

### 그럼 우리가 사용할때 주의해야 하는 점은?
- 오토 언박싱에서 성능이슈를 주의해야 한다.
- 