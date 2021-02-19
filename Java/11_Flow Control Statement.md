# 제어문

## 조건문

1. If문

    조건식이 무조건 참일 때만 실행

    ```java
    if(조건식) {
    		 		//조건식이 true일 때 실행할 명령문;
    		    //조건식 false일 때 실행하고 싶으면 조건식 앞에 ! 붙인다
    }
    ```

    cf. 메소드의 리턴값이 boolean일 때도 조건식으로 넣어줄 수 있음. 

    ex. `if(myCar.isLeftGas()) {`

2. If-else문

    참이거나 거짓일 때 `둘 중 하나는 무조건 실행`시켜줘야 할 때 이용

    if문은 조건식의 결과값이 참(true)이면 if { }안에 있는 코드를 실행하고,

    조건식의 결과 값이 거짓(false)이면 else { }안에 있는 코드를 실행한다.

    ```java
    if(조건식) {
    			조건식이 true일 때 실행할 명령문;
     } else {
    		  조건식이 false일 때 실행할 명령문;
     }
    ```
    3. if-else-if 문

    여러 개의 조건을 제시하여 그 중 `한 가지를 반드시 실행`시키고 싶은 경우 사용

    ```java
    [if-else-if문 표현식]
    if(조건식1) {
            조건식1이 true일 때 실행할 명령문;
    } else if(조건식2) {
            조건식1이 false이고 조건식2가 true일 때 실행할 명령문;
    } else {
        위의 조건 2개가 모두 거짓인 경우 실행할 명령문;
            반드시 하나는 실행시켜야 할 때 사용
    }
    ```


# Switch문

- `정확하게 일치하는 경우`만 비교할 수 있으며 대소비교를 할 수 없다.
- switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값
(실수와 논리는 비교 X)
- `break;`를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킴

```java
switch(비교할변수) {
	case 비교값1 : 비교할변수가 비교값1과 일치하는 경우 실행할 구문; 
	break;
	case 비교값2 : 비교할변수가 비교값2와 일치하는 경우 실행할 구문; 
	break;
	default: case에 모두 해당하지 않는 경우 실행할 구문; 
	break;
 }
```

- 정수 두 개와 연산 기호 입력 받아서 계산하는 계산기
- 음료를 입력하면 음료와 투입해야 하는 금액 써주는 자판기

cf. 문자열의 비교

`equals()` 사용

```java
if(product.equals("사과") || product.equals("바나나") || product.equals("복숭아") || product.equals("키위") {
}
//문자열 비교는 equals()를 사용해야 한다. 
//product는 int이고 안에 있는 인자는 String이므로 주소값이 다름
//따라서 equals()메소드로 안에 있는 값으로 비교해주어야
```

## 조건문 퀴즈

- hard - Application02

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/211e6382-3feb-4922-a40a-02b0a83e4ee8/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/211e6382-3feb-4922-a40a-02b0a83e4ee8/Untitled.png)

product(나는 name) 변수를 한 번만 쓸 거면 위처럼 써주면 된다.

---

# 반복문

### 1. for문

`조건식을 만족하는 경우`에 실행됨

```java
for(초기식; 조건식; 증감식) {
			**조건식을 만족하는 경우** 수행될 문장;
			// 조건식이 만족되지 않는 경우 반복을 멈춤
}
```

- for문의 흐름

    초기식 - 조건식 - 수행문장 - 증감식 - 조건식 - 수행문장

    - for문 흐름.jpg

```java
for (int i = 1; i <= 10; i++) {
			System.out.print( i + " 번째 학생의 이름을 입력해주세요 : ");
			String student = sc.nextLine();		
			//같은 지역 공간 안에서 동일한 변수명 입력 못해서 그랬던건데 
			//이건 어차피 반복할 때마다 새롭게 입력되므로 굳이 안해줘도 ok
			System.out.println(i + " 번째 학생의 이름은 : " + student + "입니다.");
}
		
		System.out.println("10명의 학생 이름을 입력받고 출력하는 기능을 완료했습니다.");
```
    
## 반복문

# While문

몇 번 반복되는지 모르고 While문 안의 조건식을 true 값으로 만들어 놓은 다음,

반복 끝나면 밖으로 나가게 할 때 사용

for문으로 스위치 가능해야

```java
While문

초기식;
while(조건식) {
	조건을 만족하는 경우 수행할 구문(반복할 구문);
	**증감식;** <- 증감식 반드시 써주기!!!
	//증감식 이후 조건식으로 올라가서 참이면 다시 실행
	//증감식 이후 조건식 충족 안하면 나감
 }
```

## doWhile문

```java
초기식;
do {
	1회차에는 무조건 한번은 실행, 이후엔 조건식 확인 후 조건 만족하는 경우에만
	구문 수행(반복됨)

	증감식;
	 } while(조건식);
```

# 분기문

## Break문 vs. Return문

- break문

    반복문(for, while) 내에서 `가장 인접한 반복문`을 빠져나올 때 사용

    단, switch문은 반복문은 아니지만 예외적으로 사용

    → 자신이 `포함된 가장 가까운 반복문`을 빠져나감

    ex. 이중으로 for문 중 내부 for문에 있으면 바깥쪽 for문으로 나옴

    ex. for문 안에 if문 있으면 for문 밖으로 나옴

    - cf. 가능한 경우 (무한정 더할 때)

    무한 루프를 한번에 나가버리는 경우

    ```java
    label:		//label:을 해놓으면 무한 루프를 아예 나가버림
    		for(;;) {
    			for(int i = 0; i < 10; i++) {
    				System.out.println(i);
    				
    				if(i == 3) {
    					break label; //break는 원래 가장 인접한 반복문을 나감 
    											 //but label 때문에 다 나감
    				}
    			}
    		}
    ```

- return문

    쓰여진 `해당 함수에서의 탈출`을 의미 

    ex. 반복문을 포함하는 메소드 자체를 종료

    반복문이 여러 개 있어도 모든 반복문을 빠져나옴. 완전히 종료시킴.

## Continue문

반복문 내에서만 사용 가능

`continue 아래 부분은 실행하지 않고` 해당 반복문을 다시 실행

→ 해당 반복문의 반복회차를 중간에 멈추고 다시 `해당 반복문의 증감식`으로 돌아가게 해준다

반복문 내에서 특정 조건을 만족하는 경우를 `제외`하려고 할 때 이용

for문 : 해당 반복문의 증감식으로 이동

while(do-while)문: 해당 반복문의 조건식으로 이동

```java
// 구구단 2~9단까지 출력
// 단 각 단의 수가 짝수인 경우 출력을 생략
		
		for(int dan = 2 ; dan < 10; dan++) {
			
			for(int su = 1; su < 10; su++) {
				if(su % 2 ==0) {
					continue; // su가 짝수인 경우 해당 회차의 반복내용을 건너뛰고 
										// su의 증감식으로 이동
				}
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println();
		}
```
