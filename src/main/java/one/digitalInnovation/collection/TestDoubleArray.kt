package main.java.one.digitalInnovation.collection

fun main() {
    println("Iterando com forEach:")
    val salarios = doubleArrayOf(1000.00, 1500.45, 2000.50, 2500.32)
    salarios.forEach { println(it) }

    println("Aumentando salários com forEachIndexed:")
    salarios.forEachIndexed { index, salario -> salarios[index] = salario * 1.1 }
    salarios.forEach { println(it) }
}