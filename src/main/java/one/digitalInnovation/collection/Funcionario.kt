package main.java.one.digitalInnovation.collection

data class Funcionario(
        val name: String,
        val sex: String,
        val salary: Double
){
    override fun toString(): String =
            """
            -------------------------------------
            Nome: $name
            Sexo: $sex
            Salario: $salary
            --------------------------------------
        """.trimIndent()
}