### Recursion - 순환(재귀함수) ###
- `Recursion` : 자기 자신을 호출하는 함수<br>
```
void func(_)
 {
  func(_);
  }
```
<br>
**recursion이 항상 무한루프에 빠지는 건 아니다**\
두 가지 조건 필요
1. `Base case` : 
적어도 하나의 recursion에 빠지지 않는 경우 필요 = 자기 자신을 호출하지 않는 경우<br>
```
public static void func(int k) {
  if (k<=0)
    return;
 ```
 2. `Recursive case` :  
 recursion을 반복하다보면 결국 base case로 수행해야 함 <br>
 ```
 else {
  System.out.println("Hello...");
  func(k-1);
 }
 ```


### 공부할만한 포인트 ###
return 된다는 게 뭐인지 찾아보기
---
### Ref. ###
혼자 공부하는 자바
