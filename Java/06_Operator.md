## 산술 연산자

‘/‘ 연산 시 형 변환에 유의해야 함

수학 개념과 유사하게 곱하기와 나누기 연산이 더하기와 빼기보다 우선적으로 동작

```java
System.out.println("num1 + num2 = " + (num1 + num2));
System.out.println("num1 - num2 = " + (num1 = num2));
System.out.println("num1 * num2 = " + (num1 * num2));
System.out.println("num1 / num2 = " + (num1 / num2));
System.out.println("num1 % num2 = " + (num1 % num2));
```
<br><br>

## 복합 대입 연산자

원하는 숫자만큼 연산 가능

자기 자신의 값과 오른쪽에 있는 값을 연산 후, 연산 결과를 자기 자신에게 대입

대입연산자의 오른쪽에는 값, 왼쪽에는 공간

`num = num + 3;` == `num += 3;`

ex.

```java
num = num + 3;
num += 3;

num = num - 5;
num -= 5;

num = num * 2;
num *= 2;

// 산술 대입 연산자가 아닌 '-5'를 num에 대입한 것 (5를 뺀 것 X)
num =- 5;
System.out.println("num : " + num);
```
<br><br>
## 증감 연산자

피연산자 값에 1을 더하거나 빼는 연산자로 위치에 따라 결과값 다름

`++` : 1 증가의 의미

`--` : 1 감소의 의미

- 전위 연산 : `int b = ++a;`  지금 1 증가시키고 나중에 호출 시에도 1 증가분 이용
- 후위 연산 : `int b = a++;` 지금은 그대로 두고 나중에 호출 시에 1 증가분 이용

    괄호 안에 다음번에 호출되는 값 넣어주면 편함

ex.

```java
int num = 20;
System.out.println("num : " + num);
		
num++;	// 20(21)
System.out.println("num : " + num);	//21
		
++num;	// 22(22)
System.out.println("num : " + num);	//22
		
num--;	// 22(21)
System.out.println("num : " + num);	//21
		
--num;	// 20(20)
System.out.println("num : " + num);	//20
```
<br><br>
### 퀴즈

괄호 안에 다음 번에 호출하는 값 써줌 (esp. 후위 연산)

```java
int a = 10;
int b = 20;
int c = 30;
		
System.out.println(a++);
//10(11) = 10
		
System.out.println((++a) + (b++));
//12(12) + 20(21) = 32
		
System.out.println((a++) + (--b) + (--c));
//12(13) + 20(20) + 29 = 32 + 29 = 61
```

- pdf 퀴즈
<br><br>
## 비교 연산자

- 데이터가 같은지, 다른지, 혹은 대소 비교를 할 때 사용
- 항상 논리값(true, false)이 결과값
- ‘==‘과 ‘!=‘은 모든 자료형에 사용 가능
- >, >=, <, <=는 기본형 boolean과 참조형(String, 주소값)에 사용 불가능
<br><br>
### 비교 연산자의 종류 (값이 달라짐)

`==` : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환

`=!` : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환

`>` : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 아니면 false를 반환

`>=` :  왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true 아니면 false를 반환
`<` :  왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true 아니면 false를 반환
`<=` :  왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 true 아니면 false를 반환
<br><br>
### 1. 숫자값 비교 (정수, 실수 둘 다 해당됨)
<br><br>
### 2. 문자값 비교

유니코드의 정수형으로 비교 가능

```java
char ch1 = 'a'; //97
char ch2 = 'A'; //65

System.out.println("ch1과 ch2가 같지 않은지 비교 : " + (ch1 != ch2)); // true
System.out.println("ch1과 ch2보다 큰지 비교 : " + (ch1 > ch2)); // true
```
<br><br>
### 3. 논리값(boolean) 비교

==과 !=은 비교 가능하지만 대소비교(>, >=, <, <=)는 불가능

```java
boolean bool1 = true;
boolean bool2 = false;
System.out.println("=========== 논리값 비교 ===========");
System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2)); // false
System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2)) // true
```
<br><br>
### 4. 문자열값(String) 비교

문자열도 ==과 !=은 비교가 가능하지만 대소 비교는 불가능하다.

```java
String str1 = "java";
String str2 = "java";
System.out.println("=========== 문자열값 비교 ===========");
System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));
System.out.println("str1과 str2가 같지 않은지 비교 : " + (str1 != str2));
```

여기까지 읽음
<br><br>
## 논리 연산자

### 1. 논리 연결 연산자

`&&` (논리 AND) 연산자 : 두 피연산자가 모두 true일 때 true 반환 (AND)
`||` (논리 OR) 연산자 : 두 피연산자 중 하나만 true여도 true 반환 (OR)

a가 true이고 b가 false인 경우, a || b 에서 b값 측정 불필요

a가 false이고 b가 true인 경우, a && b에서 b값 측정 불필요

```java
int a = 10;
int b = 20;
int c = 30;
int d = 40;
System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + (a<b && c<d));
// true
```
<br><br>
### 2. 논리 부정 연산자

`!` : 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환한다.

현재 가지고 있는 논리값을 반대로

제어문 활용 시 많이 쓰임

```java
System.out.println("true의 논리 not 연산 : " + (!true)); // false
System.out.println("false의 논리 not 연산 : " + (!false));  // true
```
<br><br>
## 연산자 종류와 우선순위

- 연산자 종류와 우선순위.jpg
<br><br>
### AND 연산과 OR 연산의 특징

1. 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안한다.

연산 횟수를 줄이기 위해서는 &&연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 게 좋다.

```java
int num1 = 10;
int result1 = (false && ++num1 > 0)? num1 : num1;
System.out.println("&&실행 확인 : " + result1); // 10
```

2. 논리식 || 논리식 : 앞의 결과가 true이면 뒬르 실행 안한다.

연산 횟수를 줄이기 위해서는 ||연산의 경우 앞에 true가 나올 가능성이 높은 조건을 작성하는 편이 좋다.

```java
int num2 = 10;
int result2 = (true || ++num2 >0)? num2 : num2;
System.out.println("||실행 확인 : " + result2);
```
<br><br>
## 삼항연산자

`(조건식)? 참일 때 사용할 값1 : 거짓일 때 사용할 값2`

조건식은 반드시 결과가 true 또는 false가 나오게 작성해야 한다.

비교/논리 연산자가 주로 사용된다.

조건식을 먼저 생각하고, 참일 때와 거짓일 때 어떤 값을 줄지 생각하자.

**중첩 사용**도 가능

```java
int num3 = 5;
int num4 = 0;
int num5 = -5;
		
String result3 = (num3 > 0)? "양수다." : (num3 == 0)? "0이다" : "음수다.";
//참일 땐 거기서 끝나니까 false일 때 삼항연산자를 계속 추가(중첩)할 수 있음.
String result4 = (num4 > 0)? "양수다." : (num4 == 0)? "0이다" : "음수다.";
String result5 = (num5 > 0)? "양수다." : (num5 == 0)? "0이다" : "음수다.";
```

---
<br><br>
## 메소드

기능의 역할

어떤 값을 추가하느냐에 따라 결과값 다름

- 특정 작업을 수행하기 위한 명령문의 집합
- 수학에서의 함수와 비슷한 의미

```java
package com.greedy.section01.method;

public class Application1 {

	public static void main(String[] args) {
		//main 메소드를 먼저 실행
		
		// 메소드란?
		// 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
		
		// 1. 먼저 main() 메소드가 동작하는지 확인하기 위한 출력문
		System.out.println("main() 시작됨....");
		
		// 2. main method 밖에 하단에 methodA라는 메소드를 추가하고 호출해보자
		// 클래스명 사용할이름 = new 클래스명();		// 객체 생성
		// 사용할이름.메소드명(); 				// 메소드 호출
		
		Application1 app1 = new Application1();
		app1.methodA();
		//methodA() 호출 
		//1 //7 (호출한 부분으로 돌아가기 - 한번 호출하면 더이상 호출하지 않음)
		
		System.out.println("main() 종료됨...."); //8
		
	} //9

	public void methodA() {
	//접근제한자 public : 어디서든지 접근 가능
	//반환값 타입 void : methodA()를 호출한다음 어떠한 것도 하지 않겠음(값 반환 X)
	//메소드 이름 methodA: methodA()로 되어 있으면 메소드임
		System.out.println("methodA() 호출함.."); //2
		methodB(); //methodB()를 호출함. f3 누르면 밑에 하이라이트됨//3 //5 (호출한 부분으로 돌아가기)
	}//6
	
	public void methodB() {
		
		System.out.println("methodB() 호출함.."); //4
		
	}//5
}
```

---
<br><br>
## 디버깅

`F5` : Step into - 해당 스텝의 상세보기 (더 들어가서 보는 것)

`F6` : Step over - 다음 단계 보기
