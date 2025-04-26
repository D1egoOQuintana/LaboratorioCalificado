package com.quintana.luis.laboratoriocalificado01

import org.junit.Test
import org.junit.Assert.*

class Ejercicio02KotlinTest {

    // Test para contar cuántas vocales hay en una cadena de texto
    @Test
    fun testContarVocales() {
        // Lógica para contar las vocales en una cadena de texto

        // Función que cuenta las vocales en una cadena
        fun contarVocales(cadena: String): Int {
            // Definimos las vocales que vamos a contar
            val vocales = "aeiouAEIOU" // Incluimos tanto minúsculas como mayúsculas
            // Contamos cuántos caracteres de la cadena son vocales
            return cadena.count { it in vocales }
        }

        // Probamos con la cadena "Hola mundo", que tiene 4 vocales
        println("Número de vocales en 'Hola mundo': ${contarVocales("Hola mundo")}") // Salida esperada: 4

        // Probamos con la cadena "Kotlin es genial", que tiene 6 vocales
        println("Número de vocales en 'Kotlin es genial': ${contarVocales("Kotlin es genial")}") // Salida esperada: 6

        // Probamos con la cadena "AAAA", que tiene 4 vocales
        println("Número de vocales en 'AAAA': ${contarVocales("AAAA")}") // Salida esperada: 4

        // Probamos con una cadena sin vocales "bcdfg", que tiene 0 vocales
        println("Número de vocales en 'bcdfg': ${contarVocales("bcdfg")}") // Salida esperada: 0
    }
}
