# 배열


- **같은 자료형**의 변수들을 하나의 묶음으로 다루는 것

    다른 자료형을 보내고 싶으면 객체를 생성해야

- 배열은 저장된 값 마다 인덱스 번호가 부여됨. (0부터 시작)

    배열명 arr을 정하고 다음에 **방의 개수**를 무조건 정해야(초기화 시) - 방 개수 수정X

    `int[] arr = new int[5];`

    **같은 자료형의 타입**으로 만듦 → **방의 크기**는 동일

    **방의 번호** → **인덱스 번호** (0~)

- 세로로 쓰던 변수들을 가로로 줄 지어서 묶은 것 = 배열

<br><br>
cf. 자바의 참조자료형 데이터 타입 추가 설명
    참조자료형은 기본자료형과 달리 Stack에 직접 값을 할당하는 것이 아니고<br>
    - Stack - Heap의 주소를 참조<br>
    - Heap - 실제값을 올림<br>
    배열 변수는 힙 영역의 배열 객체를 참조<br>
    → 직접 값을 갖고 있지 않고 주소를 가지고 있는 자료형 = 참조 자료형
<br><br>
    **참조자료형의 특징**
    - new 키워드로 생성한 객체 → 배열도 객체에 속함<br>
    - String과 배열은 new 없이 객체를 생성할 수 없지만(??) 참조자료형에 속함<br>
    - class, array, interface, enummeration을 참조자료형이라고 한다.<br>
    → 배열의 객체는 실제 Stack 값을 갖고 있지 않고 Heap 영역의 주소를 가짐

<br><br>
cf. Student 클래스에서 새로운 객체 생성

    ```java
    Student s1 = new Student{};
    System.out.println("s1 변수가 Student 객체를 참조합니다.")

    Student s2 = new Student{};
    System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.")
    ```

    Student 클래스는 하나이지만 new 연산자를 사용한만큼 객체가 메모리에 생성됨.

    → 각각의 Student 객체는 완전히 독립된 서로 다른 객체이다

    ex.

    ```java
    int size = sc.nextInt();
    double[] darr = new double[size];

    darr = new double[30]; 
    // 배열의 사이즈 변경한 게 아니라, 새로운 배열 생성하고 
    // 그 주소값을 참조변수 darr에 덮어쓴 것
    ```
<br><br>
cf. new 연산자 : new 연산자는 heap 영역에 공간을 할당하고 발생한 heap의 주소값을 반환


## null

한번 할당된 배열은 지울 수 없다.

`darr = null;`

참조변수  darr은 더이상 주소값이 없어져 참조 불가능 

→ heap의 old영역으로 옮겨져 가비지 컬렉터가 삭제시킴

`System.out.println("삭제 후 darr의 길이 : " + darr.length);`

`NullPointerException` 발생 -> 길 잃은 곳에서 어떻게 갈 지 찾는 것

## 배열의 저장구조


- Stack

    자료형의 이름은 Stack이라는 방에 저장됨 (변수의 이름을 넣을 수 있음)

    변수의 메소드명이 저장됨

- Heap

     new 연산자로 생성된 개체는 메모리 힙 영역에 생성됨

    실제 값은 Heap 영역에 저장됨. (new를 통해)

    heap메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역

    cf. 인스턴스를 핸들하기 위해서는 **new 연산자**를 통해 참조값을 저장한 객체로만 접근이 가능

    `new int[4];`

    값을 가진 내용들은 똑같은 크기의 방 4개가 Heap에 저장됨(휘발성 - 메모리 공간에 올려두었다가 사라지는 것)

    선언된 상태이고 값을 넣어두진 않았음. - int[] arr

    new int[4]; 를 통해 int arr[]은 커다란 네모의 주소(0x1234)를 리턴값으로 받음. (그리고 인덱스로 찾아감)

    Heap에 방을 만들었을 때 그 메모리의 주소를 int[] arr에 보내줌

    Stack은 Heap의 주소값을 참조하고 있음.

    arr[0] 이라고 하면 Heap의 arr[0]의 주소값을 찾아옴.

    heap에는 값이 없는 상태로 못 들어감. 없으면 초기값이라도 자동으로 넣어짐 (int 형 배열이면 0이 채워짐)

    - 값의 형태별 기본값
- Static

## 배열의 선언

자료형[] 변수명; (변수명 = 배열명)

자료형 변수명[]; 

→ 자료형을 맨 앞에 쓰기만 하면 []의 위치는 상관 없음

`int[] iarr;`

`char carr[];`

arr도 Heap에 만들어진 값을 Stack이 참조해서 쓰고 있는 것. 

like String이 참조형 변수인 것 처럼

배열도 Heap 영역에 방을 만들고 Stack이 참조해서 쓰는 것.

## 블럭

자바에서 지정한 기본값 외의 값으로 초기화를 하고 싶은 경우 블럭을 사용

블럭을 사용하는 경우에는 new를 사용하지 않아도 됨

 값의 갯수만큼 자동으로 크기를 설정

```java
int[] iarr2 = { 11, 22, 33, 44, 55 };
int[] iarr3 = new int[] { 11, 22, 33, 44, 55 };
// 원래대로 써준다음 뒤에 블럭 붙여줘도 동일

//==
//int[] iarr2 = new int[5];
		// iarr2[0] = 11;
		// iarr2[1] = 22;
		// iarr2[2] = 33;
		// iarr2[3] = 44;
		// iarr2[4] = 55;
```

```java
/* 문자열도 배열로 사용할 수 있다. */
		String[] sarr = {"apple", "banana", "grape", "orange"};
		
		for (int i = 0; i < sarr.length; i++) {
			System.out.println("iarr3[" + i + "]의 값 : " + sarr[i]);
		}
```

## hashcode()

Object의 hashCode() 메소드는 

객체의 메모리 번지(주소값)를 이용하여 10진수로 반환하여 생성한 객체의 고유한 정수값

→ 두 객체가 같은 주소를 참조하고 있는지(동일객체인지) 확인하기 위한 용도

cf. 동등객체 : 주소가 달라도 안에 값이 같으면 동등객체임

 동등객체를 동일객체 취급하기 위한 용도로 overriding(재정의)해서 사용됨

(`iarr`을 출력했을 때 나오는 실제 주소값과는 다름)

ex.

```java
System.out.println("iarr : " + iarr2); //16진수 주소값 출력
System.out.println("carr : " + carr2);
//iarr : [I@39ed3c8d
//carr : [C@71dac704

System.out.println("iarr의 hashcode : " + iarr2.hashCode()); //주소값을 10진수로 반환
System.out.println("carr의 hashcode : " + carr2.hashCode());
//iarr의 hashcode : 971848845
//carr의 hashcode : 1910163204
```

## 다차원 배열

- 다차원 배열은 2차원 이상의 배열을 의미
- 배열(행)의 인덱스마다 또 배열의 주소(열의 주소값)를 보관하는 배열을 의미

→ 즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미

`int[][] arr = new int[3][5];` 

`arr[1]` : 행은 열의 주소값을 가지고

`arr[1][0]` : 열은 실제값을 가짐 (아무것도 저장하지 않았으면 기본값 0 들어감)

([][]는 자료형만 앞에 있다면 어디에 두든 상관 없음)


1. 정변배열

`각각의 행`에 들어가는 `열의 배열 크기`가 동일

↔ 열의 개수가 행마다 다른 것은 `가변배열`

```java
// 정변배열
iarr1 = new int[][];
iarr1[0] = new int[5]; // 각각의 행에 새로운 번지개수가 5개인 배열(객체)을 만듦
iarr1[1] = new int[5];
iarr1[2] = new int[5];

// 가변배열
iarr2 = new int[3][];
iarr2[0] = new int[5];
iarr2[1] = new int[7];
iarr2[2] = new int[4];
```

# 배열의 복사

**`얕은 복사`**와 **`깊은 복사`**가 있음

언제 사용하는 건지 중요

1. 얕은 복사 → 동일객체(주소값이 같음)

    Stack에 있는 배열의 주소값 하나를 여러 배열변수가 공유

    heap에 있는 기존의 배열을 참조

    ⇒ 두 개의 참조변수(arr1, arr2)는 동일한 배열의 주소값을 가짐

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9b9185f7-170b-4ed4-a789-4abfffa0effd/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9b9185f7-170b-4ed4-a789-4abfffa0effd/Untitled.png)

    얕은 복사는 stack에 저장되어 있는 배열의 주소값만 복사
    따라서, 두 개의 참조변수(arr1, arr2)는 동일한 배열의 주소값을 가짐

    ```java
    int[] originArr = {1,2,3,4,5};
    int[] copyArr = originArr;
    // 동일한 주소를 가진 동일 객체를 참조하고 있음

    // hashcode를 출력해보면 두 개의 참조 변수는 동일한 주소값을 가지고 있다.
    		System.out.println(originArr.hashCode());
    		System.out.println(copyArr.hashCode());
    ```

    cf. 근데 int[] arr2는 객체를 새로 형성한 게 아니고 선언만 해준 건데 "객체"라고 할 수 있나? 

    - 기존에 있던 객체를 참조 받고 있기 때문에 동일"객체"임

    - 얕은 복사의 활용

        1. 메소드 호출 시 인자로 사용하는 경우  

        2. 리턴값으로 동일한 배열을 리턴해주고 싶은 경우

        ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2eaa44fa-930c-420d-89ef-e3e0d175ff65/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2eaa44fa-930c-420d-89ef-e3e0d175ff65/Untitled.png)

        메소드 호출 시

        iarr의 주소값을 호출된 곳으로 리턴

        iarr의 주소값을 매개변수로 전달해줌

        둘 다 실제값이 아니라 동일한 주소값을 참조하는 것 → 얕은 복사

        - 배열을 매개변수로 받는 경우 참고 사이트

2. 깊은 복사 → 동등객체(타입과 값이 모두 같아야)

heap의 배열에 저장된 값을 복사해서 배열을 늘리거나 줄이고 싶을 때

새로운 배열에 배열 변수들을 복사

새 배열의 주소값을 이전에 있던 배열변수 `arr1`에 덮어줌

⇒ 기존 배열과 값은 같지만 주소값이 다름 (서로 다른 배열)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2e7bee48-8490-42c9-a795-3ea2995cb09f/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2e7bee48-8490-42c9-a795-3ea2995cb09f/Untitled.png)

- 깊은 복사 하는 방법 (4가지)
    1. for문을 이용해 동일한 인덱스의 값을 복사

        ```java
        int[] originArr = new int[] {1,2,3,4,5};	
        print(originArr); // 원본배열

        int[] copyArr1 = new int[10];
        		
        		for(int i = 0; i < originArr.length; i++) {
        			copyArr1[i] = originArr[i];
        		}
        	
        print(copyArr1); //1 2 3 4 5 0 0 0 0 0 
        ```

    2. Object클래스의 clone()메소드를 이용한 복사

        동일한 길이, 값을 가지는 배열이 생성 but 주소는 다름

        배열의 길이를 마음대로 조정하지 못하는 유일한 방법

        ```java
        int[] copyArr2 = originArr.clone();
        print(copyArr2); // 1 2 3 4 5
        ```

    3. System클래스의 arraycopy()메소드를 이용한 복사

        가장 높은 성능 (only for 배열)

        ```java
        int[] copyArr3 = new int[10];
        System.arraycopy(originArr, 0, copyArr3, 3, 5);
        							//원본배열 ,복사를 시작할 인덱스,
                      //복사본배열,복사본 배열에 넣기 시작할 인덱스 넘버,복사할 길이

        print(copyArr3); // 0 0 0 1 2 3 4 5 0 0
        ```

    4. Arrays의 copyOf()를 이용한 복사

        가장 많이 사용되는 방식(유연)

        ```java
        int[] copyArr4 = Arrays.copyOf(originArr, 7);
                                    //복사할 원본, 복사할 길이

        print(copyArr4); // 1 2 3 4 5 0 0
        ```
