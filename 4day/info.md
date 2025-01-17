## 목록
- [컴파일](#컴파일)
- [PolyEx](#polyex)
    - [다형성](#다형성)
- [AbstractEx](#abstractex)
    - [추상 클래스](#추상-클래스)
- [InterfaceEx](#interfaceex)
    - [인터페이스](#인터페이스)
- [ExtensionEx](#extensionex)
    - [확장](#확장)
- [NestedEx](#nestedex)
    - [중첩 클래스](#중첩-클래스)
- [InnerEx](#innerex)
    - [내부 클래스](#내부-클래스)
- [EnumEx](#enumex)
    - [열거형 클래스](#열거형-클래스)
- [SealedEx](#sealedex)
    - [Sealed 클래스](#sealed-클래스)
- [ScopeEx](#scopeex)
    - [범위 함수](#범위-함수)
- [ExceptionEx](#exceptionex)
    - [예외 처리](#예외-처리)
- [파일 내용](#파일-내용)

---
## 컴파일
```Bash
kotlinc filename.kt
java filenameKt
```
- 장점
    - 간단하고 빠르게 Kotlin 파일을 컴파일하고 실행 가능
    - 별도의 JAR 파일을 만들 필요 없음
- 단점
    - 여러 파일로 구성된 프로젝트에서는 관리가 어렵다
    - 외부 라이브러리를 포함하기 어렵다
```Bash
kotlinc filename.kt -d filename.jar
kotlin -classpath filename.jar filenameKt
```
- 장점
    - JAR 파일을 생성하여 배포 및 실행이 용이
    - Kotlin 런타임을 사용하여 실행하므로 Kotlin 특화 기능을 사용 가능
- 단점
    - JAR 파일을 생성하는 과정이 추가
```bash
kotlinc filename.kt -d filename.jar
java -jar filename.jar
```
- 장점
    - JAR 파일을 생성하여 배포 및 실행이 용이
    - Java 런타임을 사용하여 실행하므로 Java 환경에 익숙한 사용자에게 친숙
    - 외부 라이브러리를 포함하기 쉽다
- 단점
    - JAR 파일을 생성하는 과정이 추가
    - Kotlin 런타임을 포함하지 않으므로, Kotlin 표준 라이브러리를 포함해야 할 수도 있다
---
## 상속
- 기본적인 자료형의 확장
- 공통적인 부분의 추출
- 자식 클래스로 부모 클래스를 확장
    - 상속
    - extention 함수 / 속성
        ```kotlin
        fun 확장클래스.함수명 : 리턴{}
        ```
- 다형 : 형변환 - is | as
- 추상 : abstract | interface

---
## PolyEx
### 다형성
- 하나의 객체가 여러 가지 형태를 가질 수 있는 능력
```kotlin
// Desc: 다형성 예제
open class Drink {}
class Cola : Drink() {}
fun main() {
    // 다형성
    var drink: Drink = Cola()
}
```
- is 형변환
    - 객체가 특정 타입인지 확인
    - 조건이 참이면 해당 타입으로 스마트 캐스트
- as 형변환
    - 명시적으로 객체를 특정 타입으로 캐스팅하는 데 사용
    - 캐스팅이 실패하면 ClassCastException이 발생
```kotlin
// 형변환
if (drink is Cola) {
    // 실행
} else {}
if (drink2 is Cider) {} else {
    // 실행
}
// as 형변환
var drink3 = drink1 as Cola
```
---
## AbstractEx
### 추상 클래스
- 하나 이상의 추상 메서드를 포함하는 클래스
    - 추상 메서드는 구현이 없는 메서드
    - 추상 메서드는 서브 클래스에서 반드시 구현해야 된다
- 추상 클래스 자체는 인스턴스화할 수 없으며, 주로 공통된 기능을 서브 클래스에 제공하기 위해 사용
- 특징
    - 하나 이상의 추상 메서드를 가질 수 있다
    - 추상 클래스는 인스턴스화 불가
    - 서브 클래스는 추상 클래스의 모든 추상 메서드를 구현
    - 추상 클래스는 일반 메서드와 속성도 가질 수 있다
```kotlin
// 추상 클래스 정의
abstract class Animal {
    // 추상 메서드
    abstract fun sound()

    // 일반 메서드
    fun sleep() {
        println("The animal is sleeping")
    }
}

// 서브 클래스에서 추상 메서드 구현
class Dog : Animal() {
    override fun sound() {
        println("Bark")
    }
}

class Cat : Animal() {
    override fun sound() {
        println("Meow")
    }
}

fun main() {
    val dog: Animal = Dog()
    val cat: Animal = Cat()

    dog.sound() // 출력: Bark
    dog.sleep() // 출력: The animal is sleeping

    cat.sound() // 출력: Meow
    cat.sleep() // 출력: The animal is sleeping
}
```
---
## InterfaceEx
### 인터페이스
- 클래스가 구현해야 하는 메서드의 집합을 정의하는 추상 타입
- 다중 상속을 지원하며, 클래스가 특정 인터페이스를 구현하면 그 인터페이스에 정의된 모든 메서드를 구현해야한다
- 특징
    - 인터페이스는 메서드와 속성의 집합을 정의
    - 인터페이스에 정의된 메서드는 기본적으로 추상 메서드
    - 인터페이스는 다중 상속을 지원
    - 인터페이스는 구현을 제공하지 않지만, Kotlin에서는 기본 구현을 제공
```kotlin
// 인터페이스 정의
interface Animal {
    fun sound()
    fun sleep() {
        println("The animal is sleeping")
    }
}

// 인터페이스 구현
class Dog : Animal {
    override fun sound() {
        println("Bark")
    }
}

class Cat : Animal {
    override fun sound() {
        println("Meow")
    }
}

fun main() {
    val dog: Animal = Dog()
    val cat: Animal = Cat()

    dog.sound() // 출력: Bark
    dog.sleep() // 출력: The animal is sleeping

    cat.sound() // 출력: Meow
    cat.sleep() // 출력: The animal is sleeping
}
```
```kotlin
// 다중 상속
interface Runner {
    fun run()
}
interface Eater {
    fun eat()
}
class Dog : Runner, Eater {
    override fun run() {println("개가 달린다")}
    override fun eat() {println("개가 먹는다")}
}
fun main() {
    var d: Dog = Dog()
    d.run()
    d.eat()
}
```
---
## ExtensionEx
### 확장
- 클래스에 새로운 기능을 추가하는 방법
    - 확장 함수
        - 기존 클래스에 새로운 메서드를 추가하는 기능
        - 클래스의 인스턴스처럼 호출할 수 있지만, 실제로는 정적으로 분해
        ```kotlin
        fun String.addExclamation(): String {
            return this + "!"
        }

        fun main() {
            val greeting = "Hello"
            println(greeting.addExclamation()) // 출력: Hello!
        }
        ```
    - 확장 속성
        - 기존 클래스에 새로운 속성을 추가하는 기능
        - 실제로는 필드가 아니며, getter와 setter를 통해 동작
        ```kotlin
        val <T> List<T>.lastIndex: Int
            get() = this.size - 1

        fun main() {
            val list = listOf(1, 2, 3)
            println(list.lastIndex) // 출력: 2
        }
        ```
    - `infix` 함수
        - 중위 표기법을 사용하여 호출할 수 있는 함수
        - 하나의 파라미터를 가질 수 있다
        - 함수 호출 시 점(.)과 괄호(())를 생략가능
        ```kotlin
        // infix 확장 함수 정의
        infix fun Int.times(str: String): String {
            return str.repeat(this)
        }

        fun main() {
            // 일반 함수 호출
            println(2.times("Hello ")) // 출력: Hello Hello 

            // infix 함수 호출
            println(2 times "Hello ") // 출력: Hello Hello 
        }
        ```
---
## NestedEx
### 중첩 클래스
- 다른 클래스 내부에 정의된 클래스
- 기본적으로 외부 클래스의 인스턴스와 독립적으로 동작
- 외부 클래스의 인스턴스에 접근 불가
- 외부 클래스의 인스턴스를 생성하지 않아도 내부 클래스 인스턴스화 가능
```kotlin
class Outer {
    private val bar: Int = 1

    // 중첩 클래스
    class Nested {
        fun foo() = 2
    }
}

fun main() {
    val nested = Outer.Nested()
    println(nested.foo()) // 출력: 2
}
```
---
## InnerEx
### 내부 클래스
- 다른 클래스 내부에 정의된 클래스
- 외부 클래스의 인스턴스에 접근할 수 있는 내부 클래스
- 외부 클래스와 내부 클래스 간의 강한 결합을 허용
- 내부 클래스를 인스턴스화하려면 먼저 외부 클래스의 인스턴스를 생성
```kotlin
class Outer {
    private val bar: Int = 1

    // 내부 클래스
    inner class Inner {
        fun foo() = bar
    }
}

fun main() {
    val outer = Outer()
    val inner = outer.Inner()
    println(inner.foo()) // 출력: 1
}
```
---
## EnumEx
### 열거형 클래스
- 열거형 타입을 정의하는 데 사용
- 상수 집합을 정의하며, 각 상수는 고유한 객체
- 프로퍼티와 메서드를 가질 수 있다
- 열거형 상수는 콤마(,)로 구분
- `when` 표현식에서 모든 상수를 처리하도록 보장 가능
```kotlin
enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun main() {
    val direction = Direction.NORTH

    when (direction) {
        Direction.NORTH -> println("북쪽")
        Direction.SOUTH -> println("남쪽")
        Direction.EAST -> println("동쪽")
        Direction.WEST -> println("서쪽")
    }
}
```
```kotlin
// 메서드를 가진 열겨형 클래스
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    val color = Color.RED
    println(color.containsRed()) // 출력: true
}
```
---
## SealedEx
### Sealed 클래스
- 상속이 제한된 클래스 계층을 정의
- `sealed` 클래스의 모든 하위 클래스는 같은 파일 내에 정의되어야 한다
- 추상 클래스와 유사하지만, 하위 클래스의 정의를 제한
- `when` 표현식에서 `sealed` 클래스의 모든 하위 클래스를 처리하도록 보장 가능
```kotlin
sealed class Result

class Success(val data: String) : Result()
class Error(val exception: Exception) : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> println("Success: ${result.data}")
        is Error -> println("Error: ${result.exception.message}")
    }
}

fun main() {
    val success = Success("Data loaded successfully")
    val error = Error(Exception("Something went wrong"))

    handleResult(success) // 출력: Success: Data loaded successfully
    handleResult(error)   // 출력: Error: Something went wrong
}
```
---
## ScopeEx
### 범위 함수
- 객체의 컨텍스트 내에서 코드를 실행할 수 있게 해주는 함수
- 범위 함수는 객체를 임시로 다른 이름으로 참조하거나, 객체의 속성과 메서드에 더 간결하게 접근할 수 있도록 한다
- Kotlin에서 제공하는 주요 범위 함수는 `let`, `run`, `with`, `apply`, `also` 등이 있다
- 객체를 인자로 받아 람다 블록을 실행
- 람다 블록 내에서 객체를 it으로 참조
- 주요 범위 함수
    - `let`
        - 객체를 인자로 받아 람다 블록을 실행
        - 람다 블록 내에서 객체를 it으로 참조
        - 마지막 표현식의 결과를 반환
        - 주로 사용되는 경우: 객체를 임시 변수로 사용하거나, null 검사
        ```kotlin
        val name = "Kotlin"
        name?.let {
            println("The name is $it")
        }
        ```
    - `run`
        - 객체를 인자로 받아 람다 블록을 실행
        - 람다 블록 내에서 객체를 this로 참조
        - 마지막 표현식의 결과를 반환
        - 주로 사용되는 경우: 객체 초기화와 계산 결과를 반환
        ```kotlin
        val greeting = "Hello"
        val result = greeting.run {
            this + " Kotlin"
        }
        println(result)
        ```
    - `with`
        - 객체를 인자로 받아 람다 블록을 실행
        - 람다 블록 내에서 객체를 this로 참조
        - 마지막 표현식의 결과를 반환
        - 객체를 호출할 때 사용하지 않고, 함수 호출 시 객체를 전달
        - 주로 사용되는 경우: 객체의 여러 속성을 사용
        ```kotlin
        val person = Person("Alice", 25)
        val result = with(person) {
            "Name: $name, Age: $age"
        }
        println(result)
        ```
    - `apply`
        - 객체를 인자로 받아 람다 블록을 실행
        - 람다 블록 내에서 객체를 `this`로 참조
        - 객체 자신을 반환
        - 주로 사용되는 경우: 객체의 속성을 설정
        ```kotlin
        val person = Person().apply {
            name = "Alice"
            age = 25
        }
        println(person)
        ```
    - also
        - 객체를 인자로 받아 람다 블록을 실행
        - 람다 블록 내에서 객체를 `it`으로 참조
        - 객체 자신을 반환
        - 주로 사용되는 경우: 객체의 속성을 설정하거나, 추가적인 작업을 수행
        ```kotlin
        val name = "Kotlin"
        name.also {
            println("The name is $it")
        }
        ```
---
## ExceptionEx
### 예외 처리
- 프로그램 실행 중 발생할 수 있는 예외적인 상황(에러)을 처리
- 프로그램이 비정상적으로 종료되지 않도록 하는 방법
- Kotlin에서는 try, catch, finally 블록을 사용하여 예외를 처리 가능
- 주요 키워드
    - try 블록: 예외가 발생할 수 있는 코드를 작성
    - catch 블록: 예외가 발생했을 때 실행되는 코드를 작성
    - finally 블록: 예외 발생 여부와 상관없이 항상 실행되는 코드를 작성
    - throw 키워드: 예외를 직접 던질 때 사용
```kotlin
// 기본 구조
try {
    // 예외가 발생할 수 있는 코드
} catch (e: Exception) {
    // 예외를 처리하는 코드
} finally {
    // 예외 발생 여부와 상관없이 항상 실행되는 코드
}
```
- 여러 종류의 예외를 처리하기 위해 여러 개의 catch 블록을 사용 가능
```kotlin
fun main() {
    try {
        val numbers = listOf(1, 2, 3)
        println(numbers[5])
    } catch (e: IndexOutOfBoundsException) {
        println("인덱스 범위를 벗어났습니다: ${e.message}")
    } catch (e: Exception) {
        println("예외가 발생했습니다: ${e.message}")
    } finally {
        println("이 블록은 항상 실행됩니다.")
    }
}
```
- throw 키워드를 사용하여 예외를 직접 던질 수 있음
```kotlin
fun validateAge(age: Int) {
    if (age < 0) {
        throw IllegalArgumentException("나이는 0보다 작을 수 없습니다.")
    }
}

fun main() {
    try {
        validateAge(-1)
    } catch (e: IllegalArgumentException) {
        println("예외가 발생했습니다: ${e.message}")
    }
}
```
---

## 파일 내용

**PolyEx01.kt**
- 다형성 예제

**AbstractEx01.kt**
- 추상클래스 예제

**AbstractEx02.kt**
- 추상클래스의 상속

**InterfaceEx01.kt**
- 인터페이스 

**InterfaceEx02.kt**
- 인터페이스 예제

**ExtensionEx01.kt**
- 확장 함수 예제

**ExtensionEx02.kt**
- 기존 클래스에 확장 함수 추가

**ExtensionEx03.kt**
- infix 함수 예제

**ExtensionEx04.kt**
- infix 함수 예제

**NestedEx01.kt**
- 중첩 클래스 예제

**InnerEx01.kt**
- 내부 클래스 예제

**EnumEx01.kt**
- 열거형 클래스 예제

**EnumEx02.kt**
- 열거형 클래스 예제

**SealedEx01.kt**
- Sealed Class 예제

**ScopeEx01.kt**
- 범위 함수 예제

**ScopeEx02.kt**
- 범위 함수 예제

**ExceptionEx01.kt**
- 예외 처리 예제