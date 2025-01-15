fun main(args: Array<String>) {
    args.forEach({
        print(it.slice(0..0).uppercase() + it.slice(1 until it.length) + " ")
    })
    println()

    println(args.joinToString(" ") { it.replaceFirstChar { it.uppercase() } })
}