package org.example.cm.exer_2

fun main(){
    try {
        print("Introduza o primeiro número: ")
        val a = readln().toInt()

        print("Introduza o segundo número: ")
        val b = readln().toInt()

        print("Introduza a operação (+, -, *, /, &&, ||, !, shl, shr): ")
        val operação = readln()

        when (operação) {
            "+" -> {
                val r = a + b
                println("Resultado: $a + $b = $r")
                println("Decimal: $r")
                println("Hexadecimal: ${r.toString(16)}")
            }

            "-" -> {
                val r = a - b
                println("Resultado: $a - $b = $r")
                println("Decimal: $r")
                println("Hexadecimal: ${r.toString(16)}")
            }

            "*" -> {
                val r = a * b
                println("Resultado: $a * $b = $r")
                println("Decimal: $r")
                println("Hexadecimal: ${r.toString(16)}")
            }

            "/" -> {
                if (b == 0) {
                    println("Erro: divisão por zero.")
                } else {
                    val r = a.toDouble() / b.toDouble()
                    println("Resultado: $a / $b = $r")
                }
            }

            "&&" -> {
                val r = (a != 0) && (b != 0)
                println("Resultado booleano: $r")
            }

            "||" -> {
                val r = (a != 0) || (b != 0)
                println("Resultado booleano: $r")
            }

            "!" -> {
                val r = !(a != 0)
                println("Resultado booleano: $r")
            }

            "shl" -> {
                val r = a shl b
                println("Resultado: $a shl $b = $r")
                println("Decimal: $r")
                println("Hexadecimal: ${r.toString(16)}")
            }

            "shr" -> {
                val r = a shr b
                println("Resultado: $a shr $b = $r")
                println("Decimal: $r")
                println("Hexadecimal: ${r.toString(16)}")
            }

            else -> {
                println("Operação inválida.")
            }
        }

    } catch (e: NumberFormatException) {
        println("Erro: introduziu um valor inválido.")
    } catch (e: Exception) {
        println("Erro: ${e.message}")
    }

}