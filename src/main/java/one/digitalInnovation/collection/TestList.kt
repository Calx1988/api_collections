package main.java.one.digitalInnovation.collection
import main.java.one.digitalInnovation.collection.Funcionario

fun main() {
    val f1= Funcionario("José S.", "Masculino",3200.00)
    val f2= Funcionario("Lucas A.", "Masculino",3100.00)
    val f3= Funcionario("Pedro C.", "Masculino",3500.00)
    val f4= Funcionario("Maria T.", "Feminino",5000.00)
    val f5= Funcionario("Bruno S.", "Masculino",2800.00)
    val f6= Funcionario("André D.", "Masculino",3400.00)
    val f7= Funcionario("Marta N.", "Feminino",3000.00)
    val f8= Funcionario("Ana B.", "Feminino",3300.00)


    val funcionario= listOf<Funcionario>(f1, f2, f3, f4,f5,f6,f7,f8)
    println("Listando funcionários:")
    funcionario.forEach{ println(it)}
    println("Listando funcionários por salário desc:")
    funcionario
            .sortedByDescending { it.salary }
            .forEach{ println(it)}

    println("Listando funcionários por sexo:")
    funcionario
            .groupBy { it.sex }
            .forEach{ println(it)}

}
