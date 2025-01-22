## 기본적인 컴파일 방법
```bash
kotlinc fileName.kt -include-runtime -d $fileName.jar
java -Dfile.encoding=UTF-8 -jar fileName.jar
```

## 파일 설명

**Ex01.kt | Ex02.kt | Hello.kt**
- kotlin 시작하는 법

**PrintEx01.kt**
- 출력

**IfEx01.kt**
- if 문 실습

**IfEx02.kt**
- 다중 else if 문 실습

**IfEx03.kt**
- if 문을 이용한 삼항연산자

**InputEx01.kt**
- readIn() 을 이용한 입력 받아오기

**NullEx01.kt**
- Null 이 들어갈 수 있는 변수 지정
    ```kotlin
    var nullableValue: String? = null
    var nullableValue: String!! = null
    ```

**OperatorEx01.kt**
- 기초 계산

**OperatorEx02.kt**
- 메소드식 사칙연산

**TypeCastingEx01.kt | TypeCastingEx02.kt**
- 기본적인 타입 캐스팅

**TypeEx01.kt**
- boolean 타입

**TypeEx02.kt**
- 숫자형 타입

**TypeEx03.kt**
- 2진법과 16진법법

**TypeEx04.kt**
- 내용 대입

**TypeEx05.kt**
- 변수의 타입 출력

**TypeEx06.kt**
- 캐릭터형 타입

**TypeEx07.kt**
- String | StringBuffer | StringBuilder

**TypeEx08.kt**
- String 의 여러 메소드
- substring
- split
- chunked
- lowercase | uppercase

**TypeEx09.kt**
- String 의 여러 메소드
- indexOf | lastIndexOf
- startsWith | endsWith | contains
- replace
- format
- trim

**TypeEx10.kt**
- StringBuilder 의 여러 메소드
- length
- capacity

**TypeEx11.kt**
- StringBuilder 의 여러 메소드
- append
- insert
- delete
- deleteCharAt

**TypeEx12.kt**
- String 의 여러 메소드
- reverse
- list 의 toString