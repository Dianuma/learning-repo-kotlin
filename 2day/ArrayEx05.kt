// fun main() {
// fun main(args: Array<Int>) { // Error: Kotlin: 'main' method must have a parameter of type Array<String>
fun main(args: Array<String>) {
    println("Start")
    println( args.contentToString() )
}