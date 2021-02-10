## 형변환

- 값의 자료형을 바꾸는 것 (boolean 제외 - 논리형은 형변환 규칙에서 제외)
- 컴퓨터의 값 처리 원칙
  - 같은 종류 자료형만 대입 가능
  - **같은 종류 자료형만 계산 가능**
  - 계산의 결과도 같은 종류의 값이 나와야 함

    -> 이러한 원칙이 지켜지지 않은 경우에 형 변환이 필요함<br>
    <br><br>

**형변환 하고자 하는 값과 자료형의 표현 범위 차이에 따라 형변환 방법 다름**<br>
<br><br>

1. 자동 형변환
    - 값의 범위가 작은 자료형이 값의 범위가 큰 자료형으로 변환 by 컴파일러
    - 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산됨

        (같은 데이터 타입끼리만 연산을 수행하므로)<br>

        ```java
        int num1 = 10;
        long num2 = 20;

        //int result = num1 + num2;
        long result1 = num1 + num2; // 우변은 어차피 long형이므로 오류 안 남
        								  
        // int + long은 서로 다른 자료형이라(하나의 자료형끼리 연산하므로)
        // 데이터 손실이 발생하지 않는 int -> long 변환(더 큰 정수형)을 자동 수행 후 연산한다.
        ```

    - 정수는 실수로 자동 형변환됨
    - 문자는 int형으로 자동 형변환됨 (char형 → int형 `'A' -> 65` )

        ```java
        //문자 a의 unicode(97)을 출력하고자 하는 경우
        char var = 'a';
        System.out.println("-- 출력 예시 --");
        System.out.println("문자 a의 unicode : " + (int) var);
        ```
<br><br>

2. 강제 형변환 (명시적 형변환)
    - 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환
    - `(바꿀 자료형) 값;`
    - **데이터 손실** 발생 가능
    - 강제 형변환 규칙
        - 실수를 정수로 변경 시 강제 형변환이 필요하다. (값 손실 발생)

        ```java
        float fnum2 = 4.0f;
        //long lnum2 = fnum2;	
        // float(실수)는 4byte, long(정수)은 8byte임에도 자동 형변환이 불가능하다.
        // 소수점 자리 이하 데이터 손실 가능성 때문에
        long lnum2 = (long) fnum2;
        ```
        - 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다. 

        cf. 문자형 = 무조건 char (문자'열'은 String)<br>

        정수를 char 자료형에 강제 형변환해서 대입도 가능<br>

         `int num1 = 97; char ch2 = (char) num1; //ch2는 a`

        ```java
        char ch = 'a';
        byte bnum2 = (byte) ch; 
        // char 자료(2byte)보다 byte가 작은 크기이니깐 강제 형변환을 해야 한다.
        // byte bnum2 = 'a' 일 땐, 정수형(숫자 97)으로 받아들임
        // ch를 넣어줬을 땐 문자형으로 넣어주기 때문에 byte형으로 캐스팅을 해야 함
        short snum2 = (short) ch; 
        // 같은 2byte이어도 부호비트(sign bit)로 인한 값의 범위가 다르기 때문에
        ```

        - 논리형은 강제 형변환 규칙에서도 제외된다.

    - int 미만(byte, short)의 연산 처리 결과는 **무조건 int형**이다.

        ```java
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;
        		
        int result1 = byteNum1 + byteNum2; //3
        int result2 = byteNum2 + shortNum1; //5
        int result3 = shortNum1 + byteNum1; //4
        int result4 = shortNum1 + shortNum2; //7
        ```
<br><br>
    ### 다른 자료형끼리의 연산 using 자동 & 강제 형변환

    ```java
    int inum = 10;
    long lnum = 100;

    int isum = (int) (inum + lnum);
    int isum2 = inum + (int) lnum;  //무엇을 int로 형변환 함에 따라
    																//연산 결과가 다르게 나올 수 있음
    long lsum = inum + lnum;
    ```
<br><br>
    ### 형변환 사용 시 주의할 점

    데이터 손실에 유의해야 한다.<br>

    1. 의도하지 않은 데이터 손실

        ```java
        int inum = 290;
        byte bnum = (byte) inum;
        		
        System.out.println("inum : " + inum); // 290
        System.out.println("bnum : " + bnum); // 34 
        																			// byte로 강제형변환되면서 오버플로우 일어남
        ```

    2. 의도한 데이터 손실

    ```java
    double height = 178.4;
    int floorHeight = (int) height;
    		
    System.out.println("height : " + height);  // 178.4
    System.out.println("floorHeight : " + floorHeight);  //178
    ```
