## API

`Application Programming Interface` 의 약자

운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스

필요로 하는 클래스, 메소드, 인터페이스 등의 소스코드를 제공

lang, util 패키지에 기본적인 메소드 많음

[Java Platform SE 8](https://docs.oracle.com/javase/8/docs/api/)

ex. lang 패키지의 Math 클래스의 abs 메소드 이용

java.lang 패키지는 기본형이라 `java.lang.Math.abs();` 굳이 써줄 필요가 없다

(컴파일러가 `import.java.lang.* ;` 을 자동으로 추가해서 컴파일해줌)

그냥 메소드 호출만 하면 됨 `클래스명 메소드명();`

```java
System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));
		// java.lang이라는 패키지의 Math 클래스의 abs 메소드 (풀패키지명)
		// java는 시작할 때 java.lang이라는 패키지 가지고 있음
		// HOW? 컴파일러가 import java.lang.*;를 자동으로 추가해서 컴파일해주기 때문

System.out.println("-1.25의 절대값 : " + (Math.abs(-1.25)));
```

ex. lang 패키지의 Math 클래스의 max와 min 메소드, PI 이용

```java
System.out.println("10과 20중 더 작은 것은 : " + Math.min(10, 20));
System.out.println("20과 30중 더 큰 것은 : " + Math.max(20, 30));
		
System.out.println("원주율 : " + Math.PI);
```


<br> <br>
### 난수 발생

1. java.lang.Math.random( );

`Math.random();` 

lang 패키지의 Math 클래스의 random() 메소드 이용

0부터 1전까지 실수 형태의 난수를 발생시킴


ex. 
`System.out.println("난수 발생 : " + Math.random());`

 2.  java.util.Random.nextInt( int bound );

util 패키지의 Random 클래스의 nextInt( ) 메소드 이용

`nextInt(int bound)` : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 정수 형태로 반환

non-static 메소드이므로 객체 선언이 필요함
<br> <br>
### 난수의 활용

Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 실수값 반환

정수 형태의 값을 원하는 범위 만큼 발생시키는 경우
<br> <br>
### 원하는 범위의 난수를 구하는 공식

1. java.lang.Math.random( );

`(int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값`

0 <= Math.random() < 1 실수

0*10 <= (Math.random() * 10) + 1 < 1 * 10

1 <= (Math.random() * 10) + 1 < 11

```java
// 0 ~ 9까지의 난수 발생
int random1 = (int) (Math.random() * 10);
System.out.println("0 부터 9 사이의 난수 : " + random1);
		
// 1 ~ 10까지의 난수 발생
int random2 = (int) (Math.random() * 10) + 1;
System.out.println("1 부터 10 사이의 난수 : " + random2);
		
// 10 ~ 15까지의 난수 발생
int random3 = (int) (Math.random() * 6) + 10;
System.out.println("10 부터 15 사이의 난수 : " + random3);
		
// -128 ~ 127 까지의 난수 발생
//int random4 = (int) (Math.random() * 256) + (-128);
int random4 = (int) (Math.random() * 256) -128;
System.out.println("-128 부터 127까지의 난수 발생 : " + random4);
```
<br> <br>

2. java.util.Random.nextInt( int bound );

`random(random객체이름).nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값`

non-static 메소드 → 객체 생성 필요

```java
Random random = new Random();
		
// 0 부터 9까지의 난수 발생
int randomNumber1 = random.nextInt(10);
System.out.println("0 부터 9까지의 난수 : " + randomNumber1);
		
// 1 부터 10까지 난수 발생
int randomNumber2 = random.nextInt(10) + 1;
System.out.println("1 부터 10까지의 난수 : " + randomNumber2);
		
// 20 부터 45까지의 난수 발생
int randomNumber3 = random.nextInt(26) + 20;
System.out.println("20 부터 45까지의 난수 : " + randomNumber3);
		
// -128 부터 127까지의 난수 발생 127 -(-128) : 255 + 1
//int randomNumber4 = random.nextInt(256) - 128;
int randomNumber4 = new Random().nextInt(256) -128; // 객체를 생성하자마자 바로 메소드 호출이 가능하다.
System.out.println("-128 부터 127까지의 난수 : " + randomNumber4);
```

---
<br> <br>
## Scanner

`java.util 패키지에 Scanner 클래스(non-static)가 있다`

1. Scanner 클래스 객체 생성

    `Scanner sc = new Scanner(System.in);`

    import 구문

    `import java.util.Scanner;`  

    여기서 `[System.in](http://system.in)` 이란 `화면에서 입력을 받겠다`는 뜻

    Scanner 클래스는 화면뿐만 아니라 파일로부터도 입력을 받을 수 있음

    ⇒ 화면에서 정수형, 소수형과 같은 데이터 타입 입력받으려면 [System.in](http://system.in) 사용

    (Byte 단위로 읽고 자바의 표준입력스트림임)

2. Scanner 객체 사용

    자료형별 값 입력받기

    2 - 1. 문자열 입력받기

    - `String name = sc.nextLine();`

        **공백을 포함**한 한 줄 입력을 위한 개행문자(엔터) 전까지 문자열로 반환

        int 다음에 String 입력받거나 String 다음에 int 입력받으면 엔터가 포함되므로 오류남

        → `sc.nextLine( );` 사이에 넣어주기

        → 주로 많이 사용

    - `next();`

        **공백문자 포함 안 함**

        공백문자나 개행문자 전까지 읽어서 문자열로 반환

    ```java
    // nextLine();
    // 공백 포함
    System.out.println("인사말을 입력해주세요 : ");
    String greeting1 = sc.nextLine(); // 안녕하세요 반갑습니다.
    System.out.println(greeting1); // 안녕하세요 반갑습니다.

    // next();
    // 공백 제외
    System.out.println("인사말을 입력해주세요 : ");
    String greeting2 = sc.next(); // 안녕하세요 반갑습니다.
    System.out.println(greeting2); // 안녕하세요 (공백 제외하기 때문에 "반갑습니다." X)
    ```
<br> <br>
    2 -2. 문자형 값 입력받기

    `char ch = sc.nextLine().charAt(0);`

    문자열로 입력(`nextLine()`)받고 원하는 순번째 문자(`charAt(int index)`)를 분리해서 사용

    ```java
    //문자열로 입력받고
    sc.nextLine();
    System.out.println("아무 문자나 입력해주세요 : ");
    //원하는 순번째 문자를 분리해서 사용
    char ch = sc.nextLine().charAt(0);		//입력받음 문자열 중에 내가 원하는 위치
    System.out.println("입력하신 문자는 " + ch + "입니다.");
    ```
<br> <br>
    2 - 3. 정수형 값 입력받기

    - `nextInt();` 입력받은 값을 int형으로 반환

        `int age = sc.nextInt();`

        ```java
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");
        ```

    - `nextLong();` 입력받은 값을 long형으로 반환

        `long money = sc.nextLong();`

        ```java
        System.out.print("금액을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 " + money + " 원입니다.");
        ```
<br> <br>
    2 - 4. 실수형 값 입력받기

    - `nextFloat();` 입력받은 값을 float형으로 반환

        `float height = sc.nextFloat();`

        ```java
        System.out.println("키를 입력해주세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 " + height + "cm 입니다.");
        ```

    - `nextDouble();` 입력받은 값을 double형으로 반환

        `double number = sc.nextDouble();`

        ```java
        System.out.println("원하는 실수를 입력하세요 : ");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 " + number + "입니다.");
        ```
<br> <br>

    2 - 5. 논리형 값 입력받기

    `nextBoolean();` 입력받은 값을 boolean형으로 반환

    true, false 이외에 다른 값 입력 시 InputMismatchException 발생

    ```java
    System.out.println("참과 거짓 중에 한 가지를 true or false로 입력해주세요 : ");
    boolean isTrue = sc.nextBoolean();
    System.out.println("입력하신 논리값은 " + isTrue + "입니다.");
    ```
<br> <br>

3. Scanner 주의사항

    문자열을 받는 `next( ), nextLine()`은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어옴
<br> <br>

    3 - 1. `next()`로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때

    `next()` 와 `nextInt()` 사이에 `sc.nextLine()` 입력

    ```java
    System.out.print("문자열을 입력해주세요 : ");
    String str1 = sc.next(); //nextLine();이면 안전 //next(); 일때 안녕하세요 반갑습니다 쓰면 안됨. 공백이 있으면 버퍼 칸에 공백 이후 부분이 남아져 있어서 다음에 숫자 입력할 때 int형이 아니기 때문에 error일으킴.
    System.out.println("str1 : " + str1);
    		
    sc.nextLine();  //이거 써주면 next();에 공백 있는 문자열 입력해도 에러 안 일으킴.
    		
    System.out.print("숫자를 입력해주세요 : ");
    int num1 = sc.nextInt();
    System.out.println("num1 : " + num1);
    ```
<br> <br>

     3 - 2. 정수, 실수, 논리값 입력 후 `nextLine( )`으로 문자열 입력 받을 때
     `nextInt()` 와 `nextLine()` 사이에 `sc.nextLine()` 입력

	```java
	System.out.print("다시 숫자를 입력해주세요 : ");
	int num2 = sc.nextInt();
	System.out.println("num2 : " + num2);

	sc.nextLine();

	System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
	String str2 = sc.nextLine();
	System.out.println("str2 : " + str2);
	```
