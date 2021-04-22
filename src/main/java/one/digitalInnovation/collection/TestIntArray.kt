package main.java.one.digitalInnovation.collection

fun main() {
    val values=IntArray(5);
    values[0]=1;
    values[1]=8;
    values[2]=5;
    values[3]=0;
    values[4]=9;

    println("Iterando por uma variável.")
    for (value in values){
        println(value)
    }

    println("Iterando pelo forEach.")
    values.forEach {
        println(it)
    }

    println("Iterando pelo índice.")
    for (index in values.indices){
        println(values[index])
    }
}