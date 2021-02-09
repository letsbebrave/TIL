- 리터럴의 종류 (4)
    - 숫자

        정수, 실수(오차범위 존재 가능)

    - 문자

        문자는 예약어임

        ASCII 코드를 통해 a, b, c 라는 버튼을 눌렀을 때 입력값을 숫자로 표현함

        컴퓨터는 문자를 인식하지 못하고 숫자로만 인식할 수 있으므로 모든 문자에 대응되는 숫자들이 매칭되어 있다.

        ```java
        System.out.println("============= 문자와 정수의 연산 =============");
        		System.out.println('a' + 1); //'a'는 97 이므로 98
        		System.out.println('a' - 1); //96
        ```

              ASCII 코드 → 유니코드(문자 확장) 65,535개

        문자와 숫자는 산술계산이 가능 (문자와 숫자는 변환 가능)

        ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/65edbdb3-07ff-4afb-a4c3-b91e63e1a9b5/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/65edbdb3-07ff-4afb-a4c3-b91e63e1a9b5/Untitled.png)

        엔터는 13번 키코드를 가지고 있음. 내장된 입력값을 넣어주면 행동함.

    - 문자열

        문자열은 '+' 연산 외에는 다른 연산을 사용하지 못한다.

        **문자열 합치기 테스트**

        '+' 연산 방향은 왼쪽에서 오른쪽이다.

        ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cd255443-c9f5-4c72-9570-04318f7b9594/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cd255443-c9f5-4c72-9570-04318f7b9594/Untitled.png)

    - 논리
