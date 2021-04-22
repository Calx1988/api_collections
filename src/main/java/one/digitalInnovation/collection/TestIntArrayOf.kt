package main.java.one.digitalInnovation.collection

fun main() {
    val values= intArrayOf(5, 6, 8,10,1,11,13,3,12)
    println("Utilizando IntArrayOf:")
    values.forEach {
        println(it)
    }
    values.sort();
    println("\nArray sorted:")
    values.forEach {
        println(it)
    }
}