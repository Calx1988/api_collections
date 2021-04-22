package main.java.one.digitalInnovation.collection

fun main() {
    val nomes=Array<String>(5){""}
    nomes[0]="Maria"
    nomes[1]="José"
    nomes[2]="Pedro"
    nomes[3]="Elizabete"
    nomes[4]="Zacharias"

    println("Iterando com for e in:")
    for (nome in nomes){
        println(nome)
    }

    nomes.sort();
    println("\nIterando com for e in (sorted):")
    for (nome in nomes){
        println(nome)
    }

    nomes.sortDescending()
    println("\nIterando com forEach(sorted desc):")
    nomes.forEach { println(it) }

    println("\nIterando com arrayOf:")
    val saints= arrayOf("Paulo", "João", "Maria", "Elizabete", "Lucas", "Pedro", "José", "Zacharias", "Marcos", "Maria Madalena")
    saints.forEach { println(it) }
}