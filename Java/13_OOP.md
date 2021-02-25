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
