package main.java.one.digitalInnovation.collection

fun main() {
    val f1= Funcionario("José S.", "Masculino",3200.00)
    val f2= Funcionario("Lucas A.", "Masculino",3100.00)
    val f3= Funcionario("Pedro C.", "Masculino",3500.00)
    val f4= Funcionario("Maria T.", "Feminino",5000.00)
    val f5= Funcionario("Bruno S.", "Masculino",2800.00)
    val f6= Funcionario("André D.", "Masculino",3400.00)
    val f7= Funcionario("Marta N.", "Feminino",3000.00)
    val f8= Funcionario("Ana B.", "Feminino",3300.00)

    val repository=Repository<Funcionario>()
    repository.create(f1.name, f1)
    repository.create(f2.name,f2)
    repository.create(f3.name,f3)
    repository.create(f4.name,f4)
    repository.create(f5.name,f5)
    println(repository.findById(f2.name))

    println("\n--------------Displaying all data-----------\n")
    println(repository.findAll())

    println("\n--------------Removing Maria T and displaying all-----------\n")
    //why not working???
    // Got it! I can use extended functions.
    repository.remove(f4.name)
    println(repository.findAll())

}