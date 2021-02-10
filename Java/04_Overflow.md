## 오버플로우

- 자료형 별 값의 최대 범위를 벗어나는 경우
- 최대값과 최소값이 꼬리를 물고 이어짐
- 발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킴

```java
byte num1 = 127;
System.out.println("num1 : " + num1);   // 127 : byte의 최대 저장 범위
num1++;			// 1증가
System.out.println("num1 overflow : " + num1); // -128 : byte의 최소 저장 범위
```
<br><br>
## 언더플로우

- 최소 범위보다 작은 수를 발생시키는 경우

    ```java
    byte num2 = -128;
    System.out.println("num2 : " + num2);		
    num2--;        // 1감소
    System.out.println("num2 underflow : " + num2);  // 127
    ```

**오버플로우와 언더플로우가 발생한다고 해서 컴파일 에러나 런타임 에러 발생하지 않음**

→ 최대값 혹은 최소값 범위를 고려해서 더 큰 자료형으로 결과값을 처리해야

```java
int firstNum = 1000000;	// 100만
int secondNum = 700000; // 70만

long longMulti = firstNum * secondNum;	
System.out.println("firstNum * secondNum = " + longMulti); // -79669248 
//이미 int로 우변에서 처리되어 오버플로우 된 값이 longMulti에 대입되었음
long result = (long)firstNum * secondNum;
	System.out.println("result : " + result);  //700000000000
```
