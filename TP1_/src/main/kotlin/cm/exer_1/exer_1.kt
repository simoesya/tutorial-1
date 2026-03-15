package org.example.cm.exer_1

fun main() {
    val quadradoa = IntArray(50){i -> (i+1)*(i+1)}
    for(i in quadradoa){
        println(i)
    }

    val quadradob = (1..50).map{it * it}
    println(quadradob)

    val quadradoc = Array(50){i -> (i+1)*(i+1)}
    for(i in quadradoc){
        println(i)
    }
}