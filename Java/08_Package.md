## 패키지

- 서로 관련 있는 클래스 또는 인터페이스의 묶음(그룹)
- 유사한 기능을 모아놓음
- 같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르면 동일한 이름을 가진 클래스를 만들 수 있음
<br><br>

### 다른 패키지에 있는 메소드를 사용하는 경우

- 클래스명 앞에 패키지명을 명시해서 풀 클래스 이름으로 사용
- new 뒤에 나오는 메소드 앞에도 풀클래스 이름 사용
- 같은 패키지의 메소드를 부를 때는 클래스명을 생략 → 그래서 굳이 안 써준 것

```java
// * non-static 메소드의 경우
com.greedy.section01.method.Calculator calc = new com.greedy.section01.method.Calculator();
int min = calc.minNumberOf(30, 20);
System.out.println("30과 20 중 더 작은 값은 : " + min);
		
// * static 메소드의 경우
int max = com.greedy.section01.method.Calculator.maxNumberOf(30, 20);
System.out.println("30과 20 중 더 큰 값은 : " + max);
```
<br><br>
## 임포트

> 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명(풀클래스명)을 생략하고 사용할 수 있도록 하는 것이 import 구문

상단에 import 구문 작성 

`import com.greedy.section01.method.Calculator;`

```java
package com.greedy.section02_package_and_import;
//이게 import 구문
import com.greedy.section01.method.Calculator;
public class Application2 {
	public static void main(String[] args) {
```

- non-static method인 경우

    ```java
    package com.greedy.section02_package_and_import;
    //패키지 선언문 아래
    //non-static method인 경우 사용하려는 클래스까지 import문 작성
    import com.greedy.section01.method.Calculator;
    //클래스는 * 표시 가능

    public class Application2 {
    	public static void main(String[] args) {
    		Calculator calc = new Calculator();
    		int min = calc.minNumberOf(50, 60);
    		System.out.println("50과 60 중 더 작은 값은 : " + min);
    ```

- static method인 경우

    ```java
    package com.greedy.section02_package_and_import;

    //static import의 경우 static method까지 전부 써줘야 한다. (ctrl space)
    import static com.greedy.section01.method.Calculator.maxNumberOf;

    public class Application2 {
    	public static void main(String[] args) {
    		int max2 = Calculator.maxNumberOf(100, 200);
    								//클래스명(Calculator) 생략가능
    		System.out.println("100과 200 중 더 큰 값은 : " + max2);
    ```
