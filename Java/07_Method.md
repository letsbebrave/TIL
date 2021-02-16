## 메소드

- 특정 작업을 수행하기 위한 명령문의 집합
- 메소드를 실행하고 종료 후에는 다시 호출한 곳으로 되돌아 옴 (한번만 호출함)
- 메소드가 어디로 이동하는지 잘 모르겠을 때 `F3` 누르기
- 메소드 선언부

    `public void methodA ()`

    `접근제한자` public

    `반환값 타입` void : methodA()를 호출한 다음 어떤 것도 하지 않겠음 (값 반환 X, 출력O)

    `메소드 이름` methodA : methodA()로 되어 있음 메소드임

1. 객체 생성

`클래스명 사용할이름 = new 클래스명();`

`Application1 app1 = new Application1();` 

2. 메소드 호출

`사용할 이름.메소드명();` 

`app1.methodA();`

ex.

```java
// 클래스명 사용할이름 = new 클래스명();   
// 메소드를 쓰려면 객체 생성 (다른 클래스 Application1안의 메소드 쓰겠다)
// 사용할이름.메소드명(); 				
// 메소드 호출
		
Application1 app1 = new Application1();
app1.methodA();
```

 

- 메소드끼리 서로가 서로를 호출 가능

`methodB();`

`methodC();`

```java
public void methodB() {
System.out.println("methodB() 호출함..");
methodC();
```

## 전달인자(argument)와 매개변수(parameter)

- 전달인자

    다른 메소드 블럭으로 값을 넘겨줄 때 (메소드 간 값을 공유해야 하는 경우), 

    `메소드 호출 시 사용하는 괄호`를 이용해서 `값을 전달`가능.

- 매개변수

    메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수

    메소드에서 받아줄 값

    일종의 지역변수

    ```java
    public void testMethod(String name, int age, final char gender) {
    												
    																			//매개변수 final 키워드 사용 가능
    																			//상수 네이밍 규칙을 안 따라도 ok
    }
    ```

### 변수의 종류

어느 위치, 예약어가 무엇인지에 따라 명명규칙 다름

1. 지역변수 

    현재까지 우리가 배운 모든 것, 선언한 메소드 블럭 내에서만 사용 가능

2. 매개변수 

    원래는 그 지역 내에서만 지역변수가 사용되는데, 매개변수를 통해 다른 메소드 블럭 내에서도 사용 가능

3. 전역변수(필드)

    클래스 사이의 변수

4. 클래스(static)변수

    상시로 메모리 공간에 상주, 필요 시 호출

    `클래스명.메소드명();`

    동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능

    `메소드명();`

- 전달인자로 값 전달하는 경우

    호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형과 갯수, 순서가 일치하게 값을 넣어 호출해야.

    ```java
    Application3 app3 = new Application3();
    app3.testMethod(10);

    //호출하려는 메소드의 매개변수 = int 형, 1개
    public void testMethod(int age) { 
    						//매개변수: 메소드 기능을 위해 필요한 변수 & 지역변수
    					  //기본형 타입 8개, 참조형 타입, 배열 등등을 넣을 수 있음
    						//어떤 값을 입력받아서 호출하고 싶을 때 
    		System.out.println("당신의 나이는 " + age + "세 입니다.");

    	}
    ```

- 변수에 저장한 값 전달하는 경우

    ```java
    int age = 20;
    app3.testMethod(age);
    }

    //자동형변환 이용 가능
    byte byteAge = 10;
    app3.testMethod(byteAge);

    //강제형변환 이용 가능 -> 반드시 매개변수 선언부 타입에 맞춰야
    long longAge = 80;
    app3.testMethod((int)longAge);

    //연산결과를 활용 가능
    app3.testMethod(age * 3);

    public void testMethod(int age) {
    System.out.println("당신의 나이는 " + age + "세 입니다.");	
    	}
    ```

- 여러 개의 전달인자를 이용한 메소드 호출

    ```java
    // 여러 개의 매개변수를 가진 메소드 호출
    Application4 app4 = new Application4();
    app4.testMethod("홍길동",20,'남');

    // 변수에 저장된 값을 전달하여 호출 가능
    String name = "유관순";
    int age = 20;
    char gender = '여';
    app4.testMethod(name, age, gender);  //ctrl space하고 고르면 자동완성됨
    }

    public void testMethod(String name, int age, final char gender) {
    System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세이며, 성별은 " + gender + "입니다.");
    }
    ```

## Return

- 해당 메소드를 종료하고, 자신을 호출한 메소드로 복귀하는 예약어(함수)
- void일 땐 원래 있던 메소드로 돌아감 - 명시적으로 작성하지 않아도 자동 추가됨
- 반환 값(리턴 값)을 가지고 자신을 호출한 메소드로 돌아갈 수 있음 (메소드 선언부에 선언된 리턴타입과 일치해야) = 메소드 선언부에 리턴타입을 명시해주어야 return값 반환 가능
- 모든 메소드 내부에는 return;이 존재  = 메소드는 항상 마지막에 return 명령어가 존재

```java
//void의 경우
public void testMethod() {
		System.out.println("testMethod() 동작 확인....");
	
		//return;  <- void일 때만 return 생략됨, 호출했던 곳으로 돌아감
}

//변수를 새로 설정해서 리턴값 담는 경우
String returnText = app6.testMethod();  //리턴값이 String형이므로 String으로 받음
System.out.println(returnText);
}

public String testMethod() {
				return "hello World";
}

//변수에 저장하지 않고 바로 리턴값 출력하는 경우
System.out.println(app6.testMethod());
}

public String testMethod() {
				return "hello World";
}
```

## 매개변수와 리턴값 복합 활용

숫자 두 개를 매개변수로 입력 받아 연산하는 메소드

```java
int first = 20;
int second = 10;
Application7 app7 = new Application7();
System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first, second));
// 리턴값을 변수에 저장하지 않고 바로 메소드 호출해서 출력하는 경우
}

public int plusTwoNumbers(int first, int second) {
															//매개변수
		return first + second;
}
```

- 메소드 흐름.jpg
- 결과값을 변수 result에 넣고 return값 받는 경우
- String 형태로 리턴값 받는 경우

- cf. Return

## Static 메소드 호출

public과 void 사이에 static이라는 키워드 사용 가능

static 메소드와 non-static 메소드의 동작 흐름은 동일

1. static 메소드를 호출하는 방법

    `클래스명. 메소드명();`

    동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능 (다른 클래스에 위치할 경우 반드시 클래스명을 써주어야)

    `메소드명();`

    ex1.

    ```java
    public static void main(String[] args) {
    System.out.println("10과 20의 합 : " + Application8.sumTwoNumber(10, 20));
    																			//클래스명.메소드명();
    //동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능
    System.out.println("20과 30의 합 : " + sumTwoNumber(20, 30));
    }

    public static int sumTwoNumber(int first, int second) {
    		return first + second;
    }

    ```

    ex2. 다른 클래스에 작성한 메소드 호출하는 경우

    ```java
    int max = Calculator.maxNumberOf(first, second);
    System.out.println("두 수 중 최대값은 : " + max);
    ```

    - static 메소드도 non-static 메소드처럼 호출은 가능

        but 권장하지 않음.

        static 메소드는 항상 상주하는 메소드이기 때문에 메모리를 잡아먹고, 

        non-static 메소드로 만들어 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못한 동작(ex. 오류)을 유발할 수 있기 때문에 사용을 제한

2. non-static 메소드를 호출하는 방법

    `클래스명 사용할이름 = new 클래스명();` 로 객체 생성하고

    `사용할이름.메소드명();` 로 메소드 호출

    ex. 다른 클래스에 작성한 메소드 호출하는 경우

    ```java
    Calculator calc = new Calculator();         //다른 곳의 Calculator 클래스 객체 생성
    int min = calc.minNumberOf(first, second);  //변수 설정 없이 리턴값 받아옴
    System.out.println("두 수 중 최소값은 : " + min); //디버그에서 보면 여기에 리턴값이 들어감
    ```

    ```java
    public class Calculator {
    	public int minNumberOf(int first, int second) {
    		return (first > second)? second : first; //리턴값 여기서 받아옴
    	}
    }

    ```
