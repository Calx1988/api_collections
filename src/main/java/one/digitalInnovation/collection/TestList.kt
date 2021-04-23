package main.java.one.digitalInnovation.collection

fun main() {
    val f1=Funcionario("José S.", 3200.00)
    val f2=Funcionario("Lucas A.", 3100.00)
    val f3=Funcionario("Pedro C.", 3500.00)
    val f4=Funcionario("Maria T.", 5000.00)
    val f5=Funcionario("Bruno S.", 2800.00)
    val f6=Funcionario("André D.", 3400.00)
    val f7=Funcionario("Marta N.", 3000.00)

    val funcionario= listOf<Funcionario>(f1, f2, f3, f4,f5,f6,f7)
    println("Listando funcionários:")
    funcionario.forEach{ println(it)}
    println("Listando funcionários por salário desc:")
    funcionario
            .sortedByDescending { it.salary }
            .forEach{ println(it)}
}

data class Funcionario(
    val name: String,
    val salary: Double
){
    override fun toString(): String =
        """
            Nome: $name
            Salario: $salary
        """.trimIndent()
}