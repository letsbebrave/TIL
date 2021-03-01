# 클래스

- 서로 다른 자료형의 데이터들을 사용자(개발자) 정의로 하나로 묶어 새로운 타입을 정의
    - 참고 img
- 사용자 정의 타입
- 비슷한 변수(필드), 메소드를 그룹핑해놓은 정리정돈의 상자

- 변수 선언 및 객체 생성

    `자료형 참조변수명 = new 클래스명();` 

    객체(instance)를 heap 메모리 공간에 생성하는 구문

    heap 공간에 만들어진 객체 = `인스턴스`

    자료형이 클래스명과 동일한 이유 : 클래스명 = 사용자가 정의한 **데이터 타입**

    따라서 해당 클래스 객체를 만들어주려면 동일한 데이터 타입인 클래스 자료형을 넣어줌

    ex. `Member member = new Member();`

          자료형  참조변수명 = new 클래스명(생성자와 같음);

    **Member라는 데이터 타입을 형성했다는 사실이 중요**

    Member라는 타입의 객체를 만들려면 member의 타입이 Member( );이므로 둘의 타입을 맞춤

    Member();라는 객체를 생성해주려면 객체"변수를 선언"해 주려면 둘의 데이터 타입이 같아야 함
    Member라는 데이터 타입이 동일해야 member라는 객체변수 사용 가능

    따라서 Member member 이라고 앞에 쓰는 것.

- 참조연산자 `'.'`

    참조변수가 참고하고 잇는 `주소를 접근`한다는 의미

    필드에 접근하기 위해 `참조변수명.필드명`으로 접근

    메소드에 접근하기 위해 `참조변수명.메소드명()` 으로 접근

    ex.

    ```java
    Member member = new Member();
    System.out.println("member.id : " + member.id);
    // member 참조변수가 가지고 있는 주소를 통해 Member 클래스 객체에 도달
    // 그 안의 필드 id를 호출
    // 현재는 아무 값도 안 들어있으므로 기본값인 null 값 출력됨

    public class Member {
    							 String id;
    }
    ```

## 필드 = 인스턴스(객체) 변수 = 속성

- 객체의 데이터(정보)가 저장되는 곳
- 클래스 내부에는 메소드를 작성하지 않고 바로 변수를 작성할 수도 있음
- 변수 사용하듯 사용 가능

    ```java
    //필드에 접근 -> 변수 사용하듯 사용가능
    member.id = "user01";
    member.pwd = "pass01";
    member.name = "홍길동";
    member.age = 20;
    member.gender = '남';
    member.hobby = new String[] {"축구", "볼링", "테니스"};

    System.out.println("변경 후 member.id : " + member.id); // user01
    System.out.println("변경 후 member.pwd : " + member.pwd); //pass01
    System.out.println("변경 후 member.name : " + member.name);
    System.out.println("변경 후 member.age : " + member.age);
    System.out.println("변경 후 member.gender : " + member.gender);
    System.out.print("변경 후 member.hobby : ");
    for(int i = 0; i < member.hobby.length; i++) {
    			
    			System.out.print(member.hobby[i] + " ");
    	}
    		
    System.out.println();
    ```

- 필드 호출

    **객체는 필드로 접근**

    - [ ]  웬만하면 필드명으로 접근해주는 이유가 메소드로 값 수정하고 출력을 할 수 있는 메소드를 호출시켰을 때 전역변수인 필드로 통일해서 하기 위함?

    ```java
    Member member = new Member();

    System.out.println("member.id : " + member.id);
    // member라는 객체변수를 통해 Member 클래스에 접근하고
    // 그 안의 필드(인스턴스 변수, 속성)를 호출
    // heap에 생성된 객체는 기본값이 필수 이므로 null이 출력됨
    System.out.println("member.pwd : " + member.pwd);
    System.out.println("member.name : " + member.name);
    System.out.println("member.age : " + member.age);
    System.out.println("member.gender : " + member.gender);
    System.out.println("member.hobby : " + member.hobby);

    public class Member {

    	String id;
    	String pwd;
    	String name;
    	int age;
    	char gender;
    	String[] hobby;

    }
    ```

    - 참고 img

## 메소드

- 객체의 기능을 담당
- 객체 간의 상호작용을 담당
- 메소드 호출 시 입력받은 인자를 매개변수로 받아 데이터를 입맛대로  수정할 수 있음

    ```java
    Monster monster3 = new Monster();

    monster3.name = "드라큘라";
    monster3.setHp(-200);
    // 체력이 마이너스이면 문제가 되므로 메소드를 통해
    // 수정하게 된 데이터 값을 갖는 필드로 리턴받음
    // 0을 리턴받음

    System.out.println("monster3 name : " + monster3.name);
    System.out.println("monster3 hp : " + monster3.hp);
    // 필드 변수로 호출
    // 필드 hp가 0이므로 0이 출력됨

    public class Monster{

    String name;
    int name; 

    public void setHp(int hp) {

    	if(hp > 0) {
    				System.out.println("양수 값이 입력되어 체력을 출력합니다");
    				this.hp = hp;
    	} else {
    			System.out.println("0보다 작거나 같은 값이 입력되어 체력을 0으로 만들어줍니다");
    			this.hp = 0; // -200을 매개변수로 받아서 필드 hp에 0 넣어줌
    		}
    		
    	}
    }
    ```

    ---

    6-2-4 ~

## 캡슐화(Encapsulation)

- 결합도를 낮추고, 유지보수성을 증가시키기 위해 필드의 직접 접근을 제한

    1)  필드에 `private` 접근제한자를 붙이고

    `private String kinds;`
    `private int hp`;

    2) `public`으로 접근을 허용한 메소드만 이용해서 간접적으로 접근하여 사용할 수 있도록 

- 클래스 작성 시 특별한 목적이 아닌 이상 캡슐화가 기본 원칙

```java
// 필드를 통한 직접접근
monster3.kinds = "두치";
monster3.hp = -500;
		
System.out.println("monster3 kinds : " + monster3.kinds);
System.out.println("monster3 hp : " + monster3.hp

// public 접근제한자 메소드를 통한 간접접근
Monster monster3 = new Monster();
monster3.setKinds("늑대인간");
monster3.setHp(300);
		
/* 값 출력을 위한 메소드 */
System.out.println(monster1.getInfo());
System.out.println(monster2.getInfo());
System.out.println(monster3.getInfo());

-------------------------------------------

public class Monster {
		//필드에 private 접근제한자 붙임 -> 필드로 다른 클래스에서 접근 불가
		private String kinds;
		private int hp;

//public 접근제한자 메소드 -> 메소드를 통한 간접 접근 허용
//값을 1) 수정 2) 리턴해줄 메소드 필요
public void setKinds(String kinds) {
		this.kinds = kinds;
	}

public void setHp(int hp) {
		if(hp > 0) {
			this.hp = hp;
		} else {
			this.hp = 0;
		}
	}

// 수정한 값을 다른 클래스로 리턴해주는 용도의 메소드
public String getInfo() {
		return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
	}
```

## 접근제한자

클래스 or 클래스의 멤버(필드, 메소드)에 참조연산자로 접근할 수 있는 범위를 제한

1. public(+) : 모든 패키지에 접근 허용
2. protected(#) : 동일 패키지에 접근 허용. 단, 패키지가 상속관계에 있는 경우 다른 패키지에서도 접근 가능.
3. default(~) : 동일 패키지에서만 접근 허용. (작성하지 않는 것이 default)
4. private(-) : 해당 클래스 내부에서만 접근 허용

    `private String kinds;`  `private int hp;`

- 클래스 다이어그램

# 객체 지향 언어

- 현실 세계는 사물이나 개념처럼 독립되고 구분되는 각각의 객체로 이루어져 있으며,
발생하는 모든 사건들은 객체 간의 상호작용이다.

    → 프로그래밍에 적용한 것이 객체 지향 언어

- 객체 : 카레이서, 자동
- 객체의 **상호작용(동작)** : `메소드`를 통해 기능을 주고 받을 수 있음

    ex. 주문 받기, 커피 리턴 = 메소드

- 메소드 간에 공유하는 **속성** : `필드`

`추상화` : 객체들을 공통점을 뽑아냄 → 내 목적에 맞는 행위를 뽑아냄 → 필드나 기능(메소드)로 선언

          이름, 나이, 점수, 성별                                인스턴스화 = heap 공간에 객체

(공통점을 뽑아 만든) 추상화된 클래스에         메모리라는 가상 공간에 값을 넣고 올림     

```java
public class Car {
		
		//메소드 간에 공유하는 속성은 "필드"로 작성
		private boolean isOn; //boolean의 초기값은 false
		private int speed;

		//구체적인 기능은 "메소드"로 작성 (필요할 때 꺼내 써서 유연성이 높음)
		public void startUp() {
		
			if(isOn) {
				// isOn의 값이 true일 때 실행
				System.out.println("이미 시동이 걸려 있습니다.");
			} else {
					// isOn의 값이 false일 때 실행하므로 true로 바꿔줘야 시동이 걸림
					this.isOn = true;
					// 전역변수 isOn을 true로 바꿔줘야!
					System.out.println("시동을 걸었습니다. 이제 출발 준비가 완료되었습니다.");
			}
		}

-----------------------------
/* CarRacer는 상호작용할 Car 클래스를 알고 있어야 한다. */
//CarRacer 클래스는 Car 클래스를 가지고 있어야 == Car 클래스 객체를 생성하고 가지고 있어야
//CarRacer가 Car의 메소드를 호출 -> 객체를 가지고 상호작용

public class CarRacer {

	public void startUp() {
			car.startUp();
		}

}
```

# 값 객체(Value Object)

- 행위(일반 기능)를 할 수 있는 클래스가 있고

    값(데이터)만 넣어주고 꺼내줄 수 있게 만든 클래스도 있음 = Value Object

    ex. 회원 정보

                                                                

- 메소드를 통해서만 데이터 수정 가능 (for 캡슐화 - 필드 접근 불가, 메소드로만 값 접근 가능)

 cf. 회원정보 객체 → 이 정보를 이동시켜야 → 데이터 위주의 클래스(VO)로 

데이터 전용 트랜젝션(VTO)이라고 데이터를 옮길 때만 사용됨

- 모든 필드를 `private` 으로 만든다 (캡슐화 작업을 위해)

    ```java
      private int number;			// 회원번호
    	private String name;		// 회원명
    	private int age;			// 나이
    	private char gender;		// 성별
    	private double height;		// 키
    	private double weight;		// 몸무게
    	private boolean isActivated;//회원탈퇴여부(활성화여부)
    ```

- `설정자(setter)` : 값을 수정할 때 사용됨
- `접근자(getter)` : 필요한 값을 요청, 갖고 올 때

## 설정자(setter)/접근자(getter)

### 설정자

필드값을 수정

호출 당시 전달되는 `매개변수의 값을 이용`하여 필드의 값을 변경

- 설정자(setter) 작성 규칙

    ```java
     [표현식]
     public void set필드명(매개변수) {
     		this.필드 = 매개변수;

    [작성예시]
     public void setName(String name) {
     		this.name = name;
    }
    ```

### 접근자

필드의 값을 반환받을 목적의 메소드 집합

- 접근자(getter) 작성 규칙
각 접근자는 하나의 필드에만 접근
필드에 접근해서 기록된 값을 return을 이용하여 반환하며,
이 때 반환타입은 반환하려는 값의 자료형과 일치해야 한다.

```java
[표현식]
 public 반환형 get필드명() {
			 	return 반환값;
 }

[작성예시]
public String getName() {
  		return this.name;
}

public double getWeight() {
			return weight;
}
```

## 생성자(Constructor)

객체 생성 시 필드 초기화 (값 대입, 변경) 목적으로 주로 사용됨

객체가 new 연산자를 통해 Heap 메모리 영역에 할당될 때 1회성으로 호출되는 리턴타입이 없는 메소드

호출 시 기본으로 만들어짐

<필드 초기화를 하는 이유>

동일한 클래스를 참조하는 객체의 경우, 필드에 선언된 값을 모두 똑같이 가지고 있지만, 

생성자(특히 매개변수가 있는 생성자)가 `형성되는 객체마다 필드의 값을 변경`해줌

애초에 `초기화` 가 `변수에 값을 대입해주는 것`

```java
// 기본생성자로 특별히 필드 값에 변화가 없음
public class School {
	String name = "지훈"
	int age = 27;
}

public static void main(String[] args) {

	School sc1 = new School();
	syso("sc1의 이름 : " + sc1.name); // 지훈
	syso("sc1의 나이 : " + sc1.age);  // 27

	School sc2 = new School();
	syso("sc2의 이름 : " + sc2.name); // 지훈
	syso("sc2의 나이 : " + sc2.age);  // 27

// 매개변수가 있는 생성자로 필드 값에 변화가 있음 (생성자를 통해 필드 초기화)
public class School {

	String name = "지훈";
	int age = 27;
}

public static void main(String[] args) {

	School sc1 = new School("후니", 28);
	syso("sc1의 이름 : " + sc1.name); // 후니
	syso("sc1의 나이 : " + sc1.age);  // 28

	School sc2 = new School("심지", 29);
	syso("sc2의 이름 : " + sc2.name); // 심지
	syso("sc2의 나이 : " + sc2.age);  // 29

}
```

### 생성자의 사용목적

1. 객체 생성 시점에 수행할 명령이 있는 경우 (다른 곳에 있는 것 갖다 쓸 수 있게 명령문 추가 가능)
2. 매개변수로 전달받은 값으로 필드를 초기화(필드에 값을 넣음)하여 객체 생성 가능
3. 작성한 생성자 외에 객체를 생성하는 방법을 제공하지 않는다는 의미를 가진다. 

→ 값이 필요한 부분이 있으면 매개변수 부분에 무조건 넣어줘야
→ 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 있음

++ 초기값 전달 강제화

### 생성자 작성방법

```java
[표현식]
 접근제한자 클래스명(매개변수) { // 기본생성자는 반환값 타입 지정 안 함. -> 기본생성자이기 때문
 		인스턴스 생성 시점에 수행할 명령 기술(주로 필드를 초기화)
 		this.필드명 = 매개변수;
```

### 기본생성자

- 생성자 함수에 매개변수가 없는 생성자
- 자료형별 초기값으로 필드를 초기화

    객체가 new 연산자를 통해 Heap 메모리 영역에 할당될 때 1회성으로 호출되는 리턴타입이 없는 메소드이므로 필드는 초기값이라도 무조건 가져야 함

- compiler에서 자동으로 추가됨

    but, 클래스에 `매개변수가 있는 생성자`가 하나라도 있는 경우

    기본생성자가 추가되지 않음 → 직접 기본생성자를 클래스에 써줘야 함

- 필드선언부와 메소드선언부 사이에 작성

### 매개변수가 있는 생성자

- 필드의 초기값을 사용자가 원하는 대로 설정하고 싶은 경우

    생성자의 호출 시 **인자로 값을 전달**하여 호출 가능

- 인자를 받아 필드를 초기화(필드에 값을 대입) 할 목적
- 객체를 필드를 초기화할 매개변수의 갯수에 따라 모두 만들어둬야 함

```java

// 다른 패키지에 존재하는 클래스 사용 시 패키지명을 포함한 클래스 이름을 사용
// 임포트
// cf. 클래스명 앞에 패키지명을 추가하지 않은 경우는 같은 패키지에 있기 때문

// -> java.util 패키지의 Date클래스를 이용하려면 패키지명을 추가해주어야
// Date클래스는 non-static 인스턴스라서 new?

User user3 = new User("user02","pass02","이순신", new java.util.Date());
System.out.println(user3.getInformation());

----
public class User {

private Date enrollDate;
// 필드로 사용자 정의형 데이터 타입인 "클래스"도 사용 가능
// 기본자료형 말고도 클래스 타입의 필드도 사용 가능

public User(String id, String pwd, String name, java.util.Date enrollDate) {
		this(id, pwd, name);
		//this()메소드를 통해 "this.id = id; this.pwd = pwd;, this.name = name;"을 줄여줌
		//맨 첫 줄에 선언해야함
		this.enrollDate = enrollDate;
		syso("User 클래스의 모든 필드를 초기화하는 생성자 호출함..")
}

public String getInformation() {
		return "Id = " + this.id + ", pwd = " + this.pwd + ", name = " + this.name + ", enrollDate = " + this.enrollDate;
	}
```

### 복사생성자를 호출하는 경우

얕은 복사 vs. 깊은 복사

- [Array](https://www.notion.so/Array-1c757d8f5bbc45499d47db967226cf12)

```java
User user4 = new User(user3);		
//user3 객체의 주소값을 매개변수로 넣어줌
//user4를 만들 때 생성자의 매개변수로 user3 객체의 주소값을 넣어준 것
//참조변수 user4의 값이 user3의 값과 동일하다는 뜻이 아님(둘다 heap에 생성되는 객체의 주소값을 가짐)

System.out.println(user4.getInformation());

// User 클래스의 다른 객체를 매개변수로 갖고 와서 새로운 인스턴스에
// 동일한 값으로 초기화해줌
// 이미 만들어진 동일한 타입의 인스턴스가 가지는 필드값을 이용해서 새로운 인스턴스 생성시 초기화값으로 이용
// --> 깊은 복사(다른 인스턴스인데 그 안의 필드값만 동일)

public User(User otherUser) { //user3 객체의 주소값 입력 시
		this.id = otherUser.id;	  //this.id = user3.id;
		this.pwd = otherUser.pwd;
		this.name = otherUser.id;
		this.enrollDate = otherUser.enrollDate;
		
		System.out.println("User 클래스의 복사생성자 호출함..");
		System.out.println("this의 hashcode : " + this.hashCode());
		System.out.println("otherUser의 hashcode : " + otherUser.hashCode());
		// hashcode가 다름
	}

---------------------------------------

//cf. 얕은복사 경우
User user5 = user3;
// 동일한 주소값을 가지므로 얕은 복사임
// 참조변수 user5 에 user3 객체의 주소값을 대입했으므로 동일한 주소값 가짐
System.out.println("user5의 hashcode : " + user5.hashCode());
```

추가 설명

[`this.id`](http://this.id) 와 `user.id`가 가진 주소값 동일

`this.hashCode()`는 `user.hashCode()`와 동일

객체가 만들어질 때 당시에 만들어진 것 this 주소값을 담고 있는 변수

- 깊은복사 vs. 얕은 복사
- 깊은복사 vs. 얕은복사 in 배열

## 객체 형성 시 생성자 vs. 설정자(setter)를 이용한 초기화

1. 생성자를 이용한 초기화

    `User user2 = new User("user01","pass01","홍길동");`

    장점 : 매개변수를 이용해서 단 한번의 호출로 인스턴스를 생성 및 초기화 가능

    단점 : 생성자를 매개변수의 갯수에 따라 모든 경우의 수로 만들어야 (객체를 여러번 만듦), 호출 시 인자가 많을 때 어떤 값이 어떤 필드 의미하는지 보기 어려움

2. 설정자(setter)를 이용한 초기화

`member.setName("홍길동");`

장점 : 개별 필드마다 하나씩 초기화해주므로 필드 초기화하는 각각의 값이 어떤 필들르 초기화하는지 볼 수 있음 (5개 필드값은 5개 setter를 통해 필드에 넣어줌)

단점 : 하나의 인스턴스 생성 시 여러 번 호출해줘야

cf. 변수 초기화 시, 매개변수 있는 생성자는 순서, 타입, 갯수 일치해야.

but setter는 순서 상관 X

```java
		/* 생성자를 이용한 초기화 */
		UserVO user1 = new UserVO("greedy","pass01","해인",new java.util.Date()); //여기에 매개변수를 넣어줘야 함. 아래의 getInformation 메소드엔 전달인자를 받아줄 매개변수가 선언되어 있지 않다.
		System.out.println(user1.getInformation());
		
		/* 기본생성자와 설정자를 이용한 초기화 */
		
		UserVO user2 = new UserVO();
		user2.setId("greedy");
		user2.setPwd("pass01");
		user2.setName("해인");
		user2.setEnrollDate(new java.util.Date());
		
		System.out.println(user2.getInformation());
```

## 자바빈(Java Bean)

JSP에서 배우게 될 표준 액션 태그로 접근할 수 있는 자바 클래스

웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법

그 때 사용할 수 있도록 규칙을 지정해놓은 java 클래스 == `자바빈`

- 자바빈 작성 규칙

    1. 자바빈은 특정 패키지에 속해있어야 한다.

    2. 멤버변수(필드)의 접근제어자는 private로 선언해야 한다.

    3. 기본생성자가 명시적으로 존재해야 한다. (매개변수가 있는 생성자는 선택사항)

    4. 멤버변수에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성돼야

    - 다른 클래스가 필드엔 접근이 안되므로 우회적인 방법(메소드)을 통해 값을 필드에 넣어주고 필드에서 값을 빼줘야 함

    5. 직렬화(Serializable구현)가 되어야 한다. (선택사항)

# 오버로딩(Overloading)

동일한 이름의 생성자나 메소드를 한 클래스 내에서 작성하는 것은 불가능

but,

매개변수의 선언부에 작성한 **매개변수의 타입, 갯수, 순서(메소드의 시그니처)**에 따라 

동일한 이름의 생성자

혹은 메소드를 한 클래스 내에 여러 개 작성 가능 == `오버로딩`

cf.0

메소드의 `시그니처` 란 `public void method(int num){}` 에서 `int num` 부분

접근제한자는 메소드 시그니처에 해당 X

→  접근제한자가 다르다고 해서 다른 메소드로 쳐주지 않음

ex. `public void test() {}` 와 `private void test() {}` 는 한 클래스 내에 작성 X

cf.1

매개변수의 변수명이 달라도 매개변수의 타입, 갯수, 순서가 같다면 동일한 메소드임

(변수명은 상관이 없음)

매개변수의 타입, 갯수, 순서 중 하나만 달라도 다른 메소드 or 생성자임

cf.2

오버로딩의 예시 : `printfln()` 메소드

매개변수의 데이터 타입이 다 다르지만, 하나의 메소드명 `println` 으로 출력 가능

### 오버로딩을 사용하는 이유

다양한 종류의 매개변수에 따라 다르게 처리해야 하는 여러 메소드들을 `동일한 이름`으로 관리하기 위해 사용

### 오버로딩의 조건

동일한 이름을 가진 메소드 파라미터 선언부에 

매개변수의 타입, 갯수, 순서를 다르게 작성

→ 메소드의 시그니처가 달라야 다른 메소드로 인식하기 때문

```java
public void test() {}
	
	//public void test() {} // 시그니처 가 동일한 경우 Compile Error를 발생시킨다.
	
	/* 접근제한자에 따른 오버로딩 성립 확인 */
	//private void test() {} //에러발생. Why? 접근제한자는 메소드 시그니처에 해당 X = 접근제한자가 다르다고 해서 다른 메소드로 쳐주지 않음
	
	/* 반환형에 따른 오버로딩 성립 확인 */
	//public int test() { return 0; } //에러발생. Why? 반환형은 메소드 시그니처에 해당 X
	
	/* 매개변수 유무에 따른 오버로딩 성립 확인 */ 
	public void test(int num) {} //파라미터 선언부는 메소드 시그니처에 해당
	
	//public void test(int num2) {} //에러발생. Why? 매개변수의 이름은 시그니처에 영향을 주지 않음
	
	/* 매개변수 갯수에 따른 오버로딩 성립 확인 */
	public void test(int num1, int num2) {}
	
	/* 매개변수 타입 변화에 따른 오버로딩 성립 확인 */
	public void test(int num, String name) {}
	
	/* 매개변수의 순서에 따른 오버로딩 성립 확인 */
	public void test(String name, int num) {}
```

## 매개변수(parameter)로 사용가능한 자료형

1. 기본자료형

    기본자료형은 인자로 전달하는 값의 자료형과 매개변수로 전달하는 값의 자료형이 동일

2. 기본자료형 배열

    ```java
    int[] iarr = new int[] {1,2,3,4,5};
    		System.out.println("인자로 전달하는 값 : " + iarr);
    		pt.testPrimaryTypeArrayParameter(iarr);

    ------
    public void testPrimaryTypeArrayParameter(int[] iarr) {
    //배열의 주소가 전달됨
    //즉 인자로 전달하는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가리킴(얕은 복사)
    System.out.println("매개변수로 전달받은 주소값 : " + iarr);

    /* 배열의 0번째 인덱스에 값 변경 */		
    iarr[0] = 99;

    System.out.print("변경 후 배열의 값 출력 : ");
    		for(int i = 0; i < iarr.length; i++) {
    			System.out.print(iarr[i] + " ");
    		}
    		System.out.println();
    }
    ```

3. 클래스자료형

클래스는 내가 만든 데이터 타입(사용자 정의형)으로, 넣어주는 매개변수에 따라 메소드를 통해 값을 필드에 넣어주거나 여러 계산을 해서 리턴 받을 수 있다.

```java
ParameterTest pt = new ParameterTest();

RectAngle r1 = new RectAngle(12.5, 22.5);
System.out.println("인자로 전달하는 값 : " + r1);

pt.testClassTypeParameter(r1);
------------
public class ParameterTest {
public void testClassTypeParameter(RectAngle rectAngle) { //클래스 RectAngle의 참조변수(객체,인스턴스) r1이 들어감
		
		/*
		 * 인스턴스도 주소가 전달된다.
		 * 즉, 인자로 전달하는 인스턴스와 매개변수로 전달받은 인스턴스는 *서로 동일한 인스턴스를 가리킨다*. (얕은복사)
		 */
		System.out.println("매개변수로 전달받은 값 : "  + rectAngle);
		
		/* 사각형의 넓이와 둘레 출력 */
		System.out.println("변경 전 사각형의 넓이와 둘레 ===============");
		rectAngle.calcArea();		//r1.calcArea(); 매개변수가 따로 없음. 기존에 r1 생성 시 입력한 필드값이 전역변수로서 그대로 사용됨.
		rectAngle.calcRound();
		
		/* 사각형의 너비와 높이를 변경 by setter */
		rectAngle.setWidth(100);	// 자동형변환 적용됨 // 클래스의 실제값 접근엔 . 참조연산자가 사용됨
		rectAngle.setHeight(100);  
		
		/* 사각형의 넓이와 둘레 출력 */
		System.out.println("변경 후 사각형의 넓이와 둘레 ===============");
		rectAngle.calcArea();
		rectAngle.calcRound();
		
		
		
	}
}
-------
public class RectAngle {
	private double width;
	private double height;

public RectAngle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) { // int형으로 width 전달인자를 넣어줘도 double형으로 자동형변환
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) { // int형으로 height 전달인자를 넣어줘도 double형으로 자동형변환
		this.height = height;
	}

public void calcArea() {
		
		double area = width * height;		//area라는 변수 선언
		
		System.out.println("이 사각형의 넓이는 " + area + "입니다.");
	}

public void calcRound() {
		
		double round = (width + height) * 2;	//round라는 변수 선언
		
		System.out.println("이 사각형의 둘레는 " + round + "입니다.");
	}
}

```

4. 클래스자료형 배열

뒤에서 배울 것임.

5. 가변인자(가변배열)

인자로 전달하는 값의 갯수가 정해지지 않은 경우 `가변배열`을 활용 가능 -> 모호성 발생 가능

가변배열은 몇 개가 매개변수로 전달될 지 모르는 상황이므로 `뒤쪽`에 `...`으로 작성해줘야

가변배열을 매개변수로 이용한 메소드(아래 예시의 경우 `testVariableLEngthArrayParameter`)는 둘 중 어떤 메소드를 호출하는 것인지에 대한 모호성 때문에 `오버로딩`하지 않는 것이 좋음 - 컴파일에러가 남

```java
pt.testVariableLengthArrayParameter("신사임당", new String[] {"테니스", "서예", "떡 썰기"});

public void testVariableLengthArrayParameter(String name, String...hobby) {
	System.out.println("취미의 갯수 : " + hobby.length);
			System.out.println("취미 : ");
			for(int i = 0; i < hobby.length; i++) {
				System.out.print(hobby[i] + " ");
			}
			System.out.println();

}
```

## 필드변수에 final 사용

final이라는 예약어는 변경 불가능이란 뜻

[Constant](https://www.notion.so/Constant-5e83b956b9cc4f43ba12dd089b19a3ce) 에서 상수를 `final int AGE;` 선언해주는 법을 배움

클래스를 생성하고 만드는 `필드`도 변수이므로 `final`을 사용해서 값을 픽스해 둘 수 있음

초기 인스턴스(객체)가 생성되고 나면 기본값 0이 필드에 들어가게 되는데, `final` 라면 그 초기화 이후 값 변경을 못 하므로 `선언하면서 초기화`를 해줘야 (compile error 발생)

- non-static field에 final 사용
    1. 선언과 동시에 초기화

        `private final int NON_STATIC_NUM = 1;`

    2. 생성자를 이용해서 초기화

        ```java
        private final String NON_STATIC_NAME;
        	// 객체 생성 시 가장 먼저 실행되는 메소드 = 기본 생성자
        	
        	public FinalFieldTest(String nonStaticName) {
        		
        		this.NON_STATIC_NAME = nonStaticName; //필드변수에 값 넣어줄 수 있음
        	}
        ```

- static field에 final 사용

    static에도 자바에서 지정한 기본값이 초기에 대입 → final 키워드 사용 시 초기화를 안 하면 에러가 발생

    `private static final int STATIC_Num = 1;`

