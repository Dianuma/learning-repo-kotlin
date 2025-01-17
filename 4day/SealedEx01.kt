// Desc: Sealed class 예제
sealed class PersonState

class Running: PersonState()
class Walking: PersonState()
class Idle: PersonState()
// class Unknown: PersonState() // error: 'when' expression must be exhaustive. Add the 'is Unknown' branch or an 'else' branch.

fun getStateMessage( state: PersonState ) : String {
    return when (state) {
        is Running -> "Person is running"
        is Walking -> "Person is walking"
        is Idle -> "Person is idle"
    }
}

fun main() {
    var state1: Running = Running()
    var state2: PersonState = Walking() 
    println(getStateMessage(state1))
    println(getStateMessage(state2))
    println(getStateMessage(Idle()))
}