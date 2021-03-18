1. 모든 행 모든 컬럼 조회

    EMPLOYEE 테이블에서 모든 정보 조회

    `*`

    ```sql
    SELECT
            *
      FROM EMPLOYEE;
    ```

2. 원하는 컬럼 조회

SELECT 아래에 조회하고 싶은 컬럼을 써줌

```sql
SELECT
       EMP_ID
     , EMP_NAME
  FROM EMPLOYEE;
```

3. 원하는 행 조회

`WHERE 조건절`

테이블에서 조건을 만족하는 값을 가진 행을 골라냄

칼럼을 기준으로 조건을 걸어두고 충족하는 것 조회

ex. EMPLOYEE 테이블에서 부서코드가 D9인 사원 조회

여러 개의 조건을 만족해야 할 때 `AND` 나 `OR` 

**연산자 우선순위 (조건절은 하나로 봐야 함)**

 0.   괄호

1. 산술연산자
2. **연결연산자**
3. 비교연산자
4. IS NULL/IS NOT NULL, LIKE/NOT LIKE, IN/NOT IN
5. **BETWEEN AND/NOT BETWEEN AND**
6. NOT(논리연산자)
7. **AND**
8. **OR** (OR 먼저 하고 싶으면 괄호쳐야)

2 + 3 합치면

```sql
SELECT
       EMP_NAME
     , SALARY
     , JOB_CODE
  FROM EMPLOYEE
 WHERE JOB_CODE = 'J7'
    OR JOB_CODE = 'J2'
   AND SALARY >= 2000000

SELECT
       EMP_NAME
     , SALARY
     , JOB_CODE
  FROM EMPLOYEE
 WHERE (JOB_CODE = 'J7'
    OR JOB_CODE = 'J2')
   AND SALARY >= 2000000;

SELECT
       EMP_ID
     , EMP_NAME
     , DEPT_CODE
     , JOB_CODE
  FROM EMPLOYEE
 WHERE SALARY >= 3500000 
   AND SALARY <= 5500000;
```

4. 컬럼에 별칭 짓기

`AS`

별칭이 곧 `컬럼명`이 되는 것

띄어쓰기 쓰지 않으면 "" 안 써줘도 됨

별칭으로 호출 가능

```sql
SELECT 
        EMP_NAME AS 이름
      , SALARY * 12 AS "1년 급여(원)"
      , SALARY + (SALARY * NVL(BONUS, 0)) * 12 AS "총소득(원)"
   FROM EMPLOYEE;
```

5. 임의로 작성한 문자열을 컬럼을 만들기

```sql
SELECT
       EMP_ID
     , EMP_NAME
     , SALARY
     , '원' AS 단위 -- 별칭(컬럼명)을 안 붙여주면 '원'이 컬럼명
  FROM EMPLOYEE;

SELECT
       EMP_ID
     , EMP_NAME
     , HIRE_DATE
     , '재직중' AS 근무여부
  FROM EMPLOYEE
 WHERE ENT_YN = 'N';
```

6. `DISTINCT` 로 중복된 키워드값 제거하여 조회

SELECT절 바로 뒤에 써야

여러 컬럼을 묶어서 중복 제외

```sql
SELECT
       DISTINCT JOB_CODE
 , /*DISTINCT*/ DEPT_CODE
  FROM EMPLOYEE;
```

7. `IS NULL`로 NULL 값 조회 / `IS NOT NULL`로 NULL이 아닌지 조회

```sql
SELECT
       EMP_ID
     , EMP_NAME
     , SALARY
     , BONUS
  FROM EMPLOYEE
 WHERE BONUS IS NULL;

SELECT
       EMP_ID
     , EMP_NAME
     , SALARY
     , BONUS
  FROM EMPLOYEE
 WHERE BONUS IS NOT NULL;
```

8. 연결연산자(| |)로 여러 컬럼을 하나의 컬럼으로 연결 가능

하나의 문자열로 만들어서 하나의 컬럼으로 만듦

```sql
SELECT
       EMP_ID || EMP_NAME || SALARY
  FROM EMPLOYEE;

-- 컬럼과 리터럴 연결
SELECT
       EMP_NAME || '의 월급은 ' || SALARY || '원 입니다.' AS 결과
  FROM EMPLOYEE;
```

9. 비교연산자

= 같다, > 크다, < 작다, >= 크거나 같다, <= 작거나 같다

!=, ^=, <> 같지 않다

```sql
SELECT
       EMP_ID
     , EMP_NAME
     , DEPT_CODE
  FROM EMPLOYEE
-- WHERE DEPT_CODE != 'D9';
-- WHERE DEPT_CODE ^= 'D9';
 WHERE DEPT_CODE <> 'D9';
```

10. `BETWEEN AND` 으로 이상 이하 표현 가능

AND OR 보다 우선적

부정표현은 NOT을 컬럼명 앞이나 BETWEEN 앞에 붙이기

- 연산자 우선순위

```sql
SELECT
       EMP_ID
     , EMP_NAME
     , DEPT_CODE
     , JOB_CODE
  FROM EMPLOYEE
 WHERE (NOT) SALARY (NOT) BETWEEN 3500000 AND 5500000;
```

11. `LIKE` 연산자로 문자 패턴 일치하는 값 조회

`컬럼명 LIKE '문자패턴'`

문자패턴 : 

'글자%' - 글자로 시작하는 값

'%글자%' 글자가 포함된 값을 찾아옴

'%글자' - 글자로 끝나는 값

부정표현은 NOT을 컬럼명 앞이나 BETWEEN 앞에 붙이기

```sql
SELECT
       EMP_ID
     , EMP_NAME
     , HIRE_DATE
  FROM EMPLOYEE
 WHERE EMP_NAME LIKE '김%';

SELECT
       EMP_ID
     , EMP_NAME
     , HIRE_DATE
  FROM EMPLOYEE
-- WHERE EMP_NAME NOT LIKE '김%';
 WHERE NOT EMP_NAME LIKE '김%';
```

12. 와일드 카드

`_`: 글자 한자리

`%`: 0개 이상의 글자

`#`: 특수기호 앞에 써줌

```sql
SELECT
       EMP_ID
     , EMP_NAME
     , PHONE
  FROM EMPLOYEE
 WHERE PHONE LIKE '___9%';

SELECT
       EMP_ID
     , EMP_NAME
     , PHONE
  FROM EMPLOYEE
 WHERE PHONE LIKE '___9_______';

SELECT
       EMP_ID
     , EMP_NAME
     , EMAIL
  FROM EMPLOYEE
 WHERE EMAIL LIKE '___#_%' ESCAPE '#';
-- EMPLOYEE 테이블에서 _앞글자가 3자리인 이메일 주소를 가진
-- 사원의 사번, 이름, 이메일 주소 조회
```

13. `IN` 연산자로 비교하는 값 목록에 일치하는 값이 있는지 확인

부정표현은 `NOT IN`

```sql
SELECT
       EMP_NAME
     , DEPT_CODE
     , SALARY
  FROM EMPLOYEE
-- WHERE DEPT_CODE = 'D6'
--    OR DEPT_CODE = 'D8';
 WHERE DEPT_CODE IN('D6', 'D8');

-- 부서코드가 'D6'이거나 'D8'인 직원의
-- 이름, 부서, 급여를 조회하세요
```
