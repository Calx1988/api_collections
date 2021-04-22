package main.java.one.digitalInnovation.collection

fun main() {
    println("Iterando com forEach:")
    val salarios = doubleArrayOf(1000.00, 1500.45, 2300.50, 2500.32, 2650.00, 1960.00, 2670.00, 3400.00)
    salarios.forEach { println(it) }

    println("Aumentando salários com forEachIndexed:")
    salarios.forEachIndexed { index, salario -> salarios[index] = salario * 1.1 }
    salarios.forEach { println(it) }

    println("Maior salário:")
    println(salarios.max());
    println("Menor salário:")
    println(salarios.min());
    println("Média de salários:")
    println(salarios.average());
    println("Salários maiores que R$2.500,00:")
    val salarioMaiorQue2500=salarios.filter { it>=2500.00 }
    salarioMaiorQue2500.forEach{ println(it)}
    val salarioMenorQue2500=salarios.filter { it<2500.00 }
    println("Quantidade de salários menores que R$2.500,00:")
    println(salarioMenorQue2500.count())

}