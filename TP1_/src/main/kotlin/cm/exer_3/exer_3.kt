package org.example.cm.exer_3
fun main() {
    val alturas = generateSequence(100.0) { alturaAnterior ->
        alturaAnterior * 0.6
    }
        .filter { it >= 1.0 }
        .take(15)
        .toList()

    println(alturas.map { String.format("%.2f", it) })
}