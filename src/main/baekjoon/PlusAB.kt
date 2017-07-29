import java.util.*

fun main(agrs: Array<String>) {
    println("Hello World!")

    val reader = Scanner(System.`in`)
    print("A를 입력:")
    var inputA:Int = reader.nextInt()
    print("B를 입력:")
    var inputB:Int = reader.nextInt()

    println(sum(inputA, inputB))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}