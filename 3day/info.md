### 목록
- [FuncEx](#funcex)
    - [기본 함수](#기본-함수)
    - [일급 함수 | 고차 함수](#일급-함수--고차-함수)
    - [함수 매개변수](#함수-매개변수)
- [CollectionEx](#collectionex)
    - [Collection 내부 메서드](#collection-내부-메서드)
- [ClassEx](#classex)
    - [클래스 멤버 필드](#클래스-멤버-필드)
    - [클래스 멤버 함수](#클래스-멤버-함수)
    - [this 키워드](#this-키워드)
    - [초기화](#초기화)
    - [접근 제어자](#접근-제어자)
    - [Getter | Setter](#getter--setter)
    - [Object 키워드](#object-키워드)
    - [Data Class](#data-class)
- [InheritEx](#InheritEx)
    - [기본 형태](#기본-형태)
    - [인자 불일치](#인자-불일치)
    - [오버라이딩](#오버라이딩)
- [파일 설명](#파일-설명)

## FuncEx
### 기본 함수
```kotlin
fun 함수명() {
    함수 내용
}
```
- Unit : retunr 이 없음 = void
```fun 함수명(): Unit { 함수 내용 }```
- 표현식 ( 삼항 연산자 대치 )
```fun 함수명() = 함수 내용```
- 지역함수 ( 내부 함수 ) = 내부클래스
    ```kotlin
    fun 함수() {
        fun 내부함수() {
            // 1. 이름 있는 함수 
            // 2. 익명함수
        }
    }
    ```

---
### 일급 함수 | 고차 함수 
- 익명함수
    ```kotlin
    val result = fun(): {
        // 함수 내용
    }
    ``` 
- 람다함수
    ```kotlin
    val result: () -> Unit = { 함수 내용 }
    ```
- 함수 참조
    ```kotlin
    fun func() {
        println( "Call Function" )
    }
    val pl: () -> Unit = ::func
    ```
- 고차함수
    - 함수의 정의를 인자로 넘겨주는 함수
    ```kotlin
    fun function(func: (Int, Int) -> Int) {
        println( func(2,3) )
    }
    fun main() {
        function({ a, b -> a * b })
    }
    ```

---
### 함수 매개변수
- default parameter | named parameter
    - [default parameter] 함수의 매개변수에 기본값을 지정하는 것
    - [named parameter]:: 함수를 호출할 때 매개변수의 이름을 지정하여 값을 전달하는 것
    - 오버로딩 선언을 줄일 수 있다.
- 가변인자 : ```fun 함수(vararg arg:Type) { 함수내용 }```
    - vararg 키워드를 사용하여 여러 개의 인자를 받을 수 있다.
    - 가변 인자는 배열로 처리되며, 배열의 각 요소에 접근할 수 있다.
---
## CollectionEx
### Collection 내부 메서드
- filter
    - 조건에 맞는 요소만 추출
    ```kotlin
    var arrayList: List<Int> = arrayListOf( 1, 2, 3, 4, 5 )
    arrayList.filter { it % 2 == 0 } // 조건에 맞는 요소 추출
    arrayList.filterNot { it % 2 == 0 } // 조건에 맞지 않는 요소 추출
    arrayList.filterIndexed { index, i -> index % 3 == 0 } // 인덱스와 함께 필터링
    ```
- map
    - 집합에 대한 조작
    ```kotlin
    arrayList.map{ it * 2 } // 집합 전체 조작
    arrayList.mapIndexed{ index, i -> index + i } // 집합, 인덱스를 함께 조작
    ```
- 조건에 의한 검사
    ```kotlin
    arrayList.all{ it < 10 } 
    arrayList.any{ it < 10 }
    arrayList.none{ it < 10 }
    //...
    ```
- forEach
    - 각 요소에 대해 주어진 람다 함수를 실행
    ```kotlin
    arrayList.forEach ({ element ->
        println(element)
    })
    ```
- onEach
    - onEach는 컬렉션의 각 요소에 대해 주어진 람다 함수를 실행하고, 원래 컬렉션을 반환
    - forEach와 달리 onEach는 컬렉션을 변경하지 않고, 체이닝을 통해 다른 컬렉션 함수와 함께 사용 가능.
    ```kotlin
    arrayList
    .onEach { println(it) }
    .map { it * 2 }        
    .forEach { println(it) }
    ```
- 요소 선택
    ```kotlin
    arrayList.take( 3 )
    arrayList.takeLast( 3 )
    arrayList.takeWhile{ it < 5 } 
    //...
    ```
---
## ClassEx
### 클래스 멤버 필드
```kotlin
class Person {
    constructor() {}
    constructor( name: String ) {
        this.name = name
    }
    constructor( age: Int ) {
        this.age = age
    }
    constructor( name: String, age: Int ) {
        this.name = name
        this.age = age
    }
    var name: String = ""
    var age: Int = 0
}

// 축약
class Person constructor( name: String, age: Int ) {
    constructor() : this("Default Name", 0) 
    constructor(name: String) : this(name, 0)
    constructor(age: Int) : this("Default Name", age)
    var name: String = name
    var age: Int = age
}

// 축약
class Person( name: String, age: Int ) {
    constructor() : this("Default Name", 0) 
    constructor(name: String) : this(name, 0)
    constructor(age: Int) : this("Default Name", age)
    var name: String = name
    var age: Int = age
}

// 축약
class Person(val name: String, val age: Int ) {
    constructor() : this("Default Name", 0) 
    constructor(name: String) : this(name, 0)
    constructor(age: Int) : this("Default Name", age)
}

// 축약
class Person(val name: String = "Default Name", val age: Int = 0)
```

---
### 클래스 멤버 함수
```kotlin
class Student() {
    fun doFunc1() {
        var data: Int = 10 // 지역 변수
        println("Call doFunc1 : ${data}")
    }

    fun doFunc2( data1: Int ) {
        println("Call doFunc2 : ${data1}")
    }

    fun doFunc3( data1: Int, data2: String ) {
        println("Call doFunc3 : ${data1}, ${data2}")
    }
}
```
---
### this 키워드
- 자기 객체 참조
    ```kotlin
    class Student() {
        fun doFunc() {
            println( this )
        }
    }
    fun main() {
        var student: Student = Student()
        student.doFunc()
        println( student )
    }
    ```
    - 이 때 ```println( this )``` 과 ```println( student )``` 의 값은 같다

---
### 초기화
- init : 클래스 선언 생성자
    - 인자가 따로 존재하지 않는다
    ```kotlin
    class Person(val name: String = "Default Name", val age: Int = 0) {
        init {
            println("Person init")
        }
    }
    ```
- construct : 멤버 초기화
---
### 접근 제어자
- public
    - 모든 곳에서 접근 가능
    - 기본 접근 제어자
    ```kotlin
    public class MyClass {
        public val myProperty: Int = 0
        public fun myFunction() { }
    }
    ```
- internal
    - 같은 모듈 내에서만 접근 가능
    - 모듈은 함께 컴파일되는 Kotlin 파일들의 집합
    ```kotlin
    internal class MyClass {
        internal val myProperty: Int = 0
        internal fun myFunction() { }
    }
    ```
- protected
    - 클래스와 그 하위 클래스에서만 접근 가능
    - 최상위 선언에는 사용불가
    ```kotlin
    open class MyClass {
        protected val myProperty: Int = 0
        protected fun myFunction() { }
    }

    class SubClass : MyClass() {
        fun access() {
            println(myProperty) // 접근 가능
        }
    }
    ```
- private
    - 같은 클래스 내에서만 접근 가능
    - 최상위 선언에 사용하면 같은 파일 내에서만 접근 가능
    ```kotlin
    class MyClass {
        private val myProperty: Int = 0
        private fun myFunction() { }
    }

    private fun topLevelFunction() { }
    ```
---
### Getter | Setter
- Kotlin 에서는 기본적으로 모든 프로퍼티에 대해 자동적으로 Getter | Setter를 생성
- 명시적으로 Getter | Setter를 정의하지 않아도 되나 아래의 이유 등으로 사용됨
    - 추가 로직 수행 : getter와 setter에서 추가적인 로직을 수행
        ```kotlin
        var age = age
            get() {
                println("Call Age Get")
                return field
            }
            set(value) {
                println("Call Age Set")
                field = value
            }
        ```
    - 데이터 유효성 검사 : 값을 설정하기 전에 유효성 검사를 수행
        ```kotlin
        var age = age
            set(value) {
                if (value >= 0) {
                    field = value
                } else {
                    println("Invalid age")
                }
            }
        ```
    - 프로퍼티 접근 제어 : 프로퍼티는 공개적으로 읽을 수 있지만, 설정은 내부적으로만 가능하게 하는 등 접근제어자를 다르게 설정정
        ```kotlin
        var age = age
            private set
        ```
    - 프로퍼티 변경 감지 : 값이 변경될 때 특정 동작을 수행
        ```kotlin
        var age = age
            set(value) {
                field = value
                onAgeChanged()
            }

        fun onAgeChanged() {
            println("Age has been changed")
        }
        ```
---
### Object 키워드
- 싱글톤 패턴의 객체 정의
- 프로그램 전체에서 단 하나의 인스턴스로 존재
```kotlin
object Singleton {
    var name: String = "Default Name"
    var age: Int = 0

    fun printInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    // Singleton 객체 사용
    Singleton.name = "Alice"
    Singleton.age = 30
    Singleton.printInfo() // 출력: Name: Alice, Age: 30
}
```
---
### Companion Object
- Kotlin에서 클래스와 연관된 객체를 정의하는 데 사용되는 키워드
- 클래스 내에 선언되며, 해당 클래스의 모든 인스턴스에서 공유되는 정적 멤버를 정의
- Java 의 ```static``` 멤버와 유사한 역할
```kotlin
class MyClass {
    companion object {
        const val CONSTANT = "This is a constant"
        
        fun printMessage() {
            println("Hello from the companion object!")
        }
    }
}
fun main() {
    println(MyClass.CONSTANT)
    MyClass.printMessage()
}
```
```kotlin
// 팩토리 메서드 패턴
class MyClass private constructor(val name: String) {
    companion object {
        fun create(name: String): MyClass {
            return MyClass(name)
        }
    }
}

fun main() {
    val instance = MyClass.create("Alice")
    println(instance.name)
}
```
---
### Data Class
- Kotlin에서 데이터 저장을 목적으로 하는 클래스
- class는 데이터 보관 및 조작을 쉽게 하기 위해 몇 가지 기능을 자동으로 제공
- 주요 특징
    - 자동으로 생성되는 메서드
        - ```toString()```: ```print```시 객체의 내용을 문자열로 반환
            ```kotlin
            val user1 = User("Alice", 30)
            println(user1)
            ```
        - ```equals()```: 두 객체의 내용이 같은지 비교
            ```kotlin
            val user1 = User("Alice", 30)
            val user2 = User("Alice", 30)
            println(user1.equals(user2))
            ```
        - ```hashCode()```: 객체의 해시 코드를 반환
            ```kotlin
            val user1 = User("Alice", 30)
            println(user1.hashCode())
            ```
        - ```copy()```: 객체를 복사하여 새로운 객체를 생성
            - 객체 내부의 값이 변화하는 순간 분화되어 다른 HashCode 와 값을 가지게 된다
            ```kotlin
            val user1 = User("Alice", 30)
            val user2 = user1.copy()
            val user3 = user1.copy(name = "Oliber")
            ```
        - ```componentN()```: 객체의 프로퍼티를 순서대로 반환하는 메서드 (구조 분해 선언에 사용)
            ```kotlin
            val user = User("Alice", 30)
            val (name, age) = user
            ```
        ```kotlin
        var person1 = Person("tester1", 20, "Male")
        var person2 = Person("tester1", 20, "Male")
        println("person1.hashCode == person2.hashCode: " + (person1.hashCode() == person2.hashCode())) // true
        println("person1 == person2: " + (person1 == person2)) // true
        println("person1.equals(person2): " + person1.equals(person2)) // true

        person2.name = "tester2"

        println("person1.hashCode == person2.hashCode: " + (person1.hashCode() == person2.hashCode())) // false
        println("person1 == person2: " + (person1 == person2)) // false
        println("person1.equals(person2): " + person1.equals(person2)) // false
        ```
    - 주 생성자
        - data class는 반드시 주 생성자(primary constructor)를 가진다
        - 주 생성자에는 최소한 하나의 프로퍼티가 있어야 한다
    - 불변성
        - data class의 프로퍼티는 기본적으로 val로 선언하여 불변성을 유지하는 것이 일반적
        - 물론 필요에 따라 var로 선언 가능
```kotlin
data class Person( val name: String, val age: Int )

fun main() {
    var person2: Person = Person("tester2", 30)
    println(person2)
    println(person2.name)
    println(person2.age)

    var person3: Person = person.copy(name="tester3")
    println(person3)
    println(person3.name)
    println(person3.age)
}
```
---
## InheritEx
### 기본 형태
- 기존 클래스(부모 클래스 또는 상위 클래스)의 속성과 메서드를 새로운 클래스(자식 클래스 또는 하위 클래스)가 물려받아 재사용하고 확장할 수 있게 하는 기능
```kotlin
// 기본 형태
open class Animal() {
    init {
        println("Animal 생성자")
    }
}

open class Dog() : Animal() {
    init {
        println("Dog 생성자")
    }
}

class Jindo() : Dog() {
    init {
        println("Jindo 생성자")
    }
}

fun main() {
    var a: Animal = Animal()
    var d: Dog = Dog()
    var j: Jindo = Jindo()
}
```
---
### 인자 불일치
- 주 생성자 사용
    ```kotlin
    open class BasePerson(name: String, age: Int, club: String) {
        var name: String
        var age: Int
        var club: String
    }
    class FootballPlayer(name: String, age: Int) : BasePerson(name, age, "Manchester United") {
    }
    ```
- 생성자 사용
    ```kotlin
    open class BasePerson {
        var name: String
        var age: Int
        constructor(name: String) {
            this.name = name
        }
        constructor(name: String, age: Int) {
            this.name = name
            this.age = age
        }
    }
    class FootballPlayer : BasePerson {
        constructor(name: String) : super(name)
        constructor(name: String, age: Int) : super(name, age)
    }
    ```
---
### 오버라이딩
- 함수 덮어 쓰기기
    ```kotlin
    open class BasePerson() {
        open fun speakAge( age: Int ) {
        }
    }
    class FootballPlayer : BasePerson() {
        override fun speakAge( age: Int ) {
        }
    }
    ```
- Getter | Setter 오버라이딩딩
    ```kotlin
    open class BasePerson() {
        open var age: Int = 0
        get() = field
        set(value) {
            field = value
        }
    }
    class FootballPlayer : BasePerson() {
        override var age: Int = 0
        get() = field
        set(value) {
            field = value -5
        }
    }
    ```
---

## 파일 설명

**FuncEx01.kt**
- 함수 호출
- tailing comma

**FuncEx02.kt**
- default parameter
- named parameter

**FuncEx03.kt**
- 가변인자

**FuncEx04.kt**
- vararg 및 mutableList 를 이용한 Bubble Sort

**FuncEx05.kt**
- 람다식
- it은 람다식의 인자를 나타냄
- 람다식의 인자가 하나일 때는 it을 사용하여 인자를 생략할 수 있음

**FuncEx06.kt**
- 함수 참조

**FuncEx07.kt**
- 고차함수

**CollectionEx01.kt**
- filter
    - 조건 | !조건
    - 인덱스
    - Null 처리
- map
    - 집합에 대한 연산산
    - 인덱스
    - Null 처리
- 조건에 의한 검사
    - all | any | none | ...

**CollectionEx02.kt**
- forEach
- onEach
- 요소 선택
    - tack | takeLast | takeWhile | ...

**ClassEx01.kt**
- 클래스 선언

**ClassEx02.kt**
- 생성자 선언

**ClassEx03.kt**
- 생성자 오버로딩

**ClassEx04.kt**
- 생성자 오버로딩 축약

**ClassEx05.kt**
- 생성자 축약

**ClassEx06.kt**
- 멤버 함수 | 오버로드

**ClassEx07.kt**
- this 키워드

**ClassEx08.kt**
- init 클래스 생성 초기화

**ClassEx09.kt**
- getter | setter

**ClassEx10.kt**
- getter | setter 접근제어자

**ClassEx11.kt**
- getter | setter 초기값 설정정

**ClassEx12.kt**
- object 키워드를 이용한 싱글톤 객체 생성

**ClassEx13.kt**
- companion 키워드

**ClassEx14.kt**
- data class

**ClassEx15.kt**
- Copy 된 Data Class 간의 동일성 비교

**ClassEx16.kt**
- data class의 componentN() 를 이용한 구조 분해 선언

**InheritEx01.kt**
- 상속 클래스 기본 형태 및 초기화 순서

**InheritEx02.kt**
- 상속을 사용한 클래스 확장 예제

**InheritEx03.kt**
- 상속 클래스 간의 인자 갯수 불일치

**InheritEx04.kt**
- 상속 클래스 간의 생성자 오버로딩

**InheritEx05.kt**
- 상속 클래스 간의 오버라이딩
