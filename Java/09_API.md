## API

`Application Programming Interface` 의 약자

운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스

필요로 하는 클래스, 메소드, 인터페이스 등의 소스코드를 제공

lang, util 패키지에 기본적인 메소드 많음

[Java Platform SE 8](https://docs.oracle.com/javase/8/docs/api/)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/789831c7-6e75-4fd6-b345-1c7e915fcfd9/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/789831c7-6e75-4fd6-b345-1c7e915fcfd9/Untitled.png)

(왼쪽 열) 메소드 선언된 타입, 리턴값의 형식

(오른쪽 열) 메소드명, 매개변수

ex. lang 패키지의 Math 클래스의 abs 메소드 이용

```java
System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));
		// java.lang이라는 패키지의 Math 클래스의 abs 메소드 (풀패키지명)
		// java는 시작할 때 java.lang이라는 패키지 가지고 있음
		// HOW? 컴파일러가 import java.lang.*;를 자동으로 추가해서 컴파일해주기 때문

System.out.println("-1.25의 절대값 : " + (Math.abs(-1.25)));
```
