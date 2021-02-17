## Scanner

`java.util 패키지에 Scanner 클래스(non-static)가 있다`

1. Scanner 클래스 객체 생성

    `Scanner sc = new Scanner(System.in);`

    여기서 `[System.in](http://system.in)` 이란 화면에서 입력을 받겠다는 뜻

    Scanner 클래스는 화면뿐만 아니라 파일로부터도 입력을 받을 수 있음

    ⇒ 화면에서 정수형, 소수형과 같은 데이터 타입 입력받으려면 `[System.in](http://system.in)` 사용

    (Byte 단위로 읽고 자바의 표준입력스트림임)

2. Scanner 객체 사용

    `int num1 = sc.nextInt();` 입력받은 정수를 변수 num1에 저장
