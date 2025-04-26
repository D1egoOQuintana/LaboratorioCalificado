package com.quintana.luis.laboratoriocalificado01

import org.junit.Test
import org.junit.Assert.*

class Ejercicio01KotlinTest {

    // Test para verificar si las palabras son anagramas
    @Test
    fun testAnagramas() {
        // Lógica de anagramas directamente en el test

        // Función para verificar si dos palabras son anagramas
        fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
            // Convertimos las palabras a minúsculas y las transformamos en arreglos de caracteres
            // Luego ordenamos las letras de cada palabra
            val palabra1Ordenada = palabra1.lowercase().toCharArray().sorted()
            val palabra2Ordenada = palabra2.lowercase().toCharArray().sorted()

            // Comparamos si las palabras ordenadas son iguales
            // Si son iguales, significa que las palabras son anagramas
            return palabra1Ordenada == palabra2Ordenada
        }

        // Aquí imprimimos los resultados en consola
        println("¿'listen' y 'silent' son anagramas? ${sonAnagramas("listen", "silent")}") // Salida esperada: true
        println("¿'hello' y 'world' son anagramas? ${sonAnagramas("hello", "world")}")   // Salida esperada: false
        println("¿'amor' y 'roma' son anagramas? ${sonAnagramas("amor", "roma")}")         // Salida esperada: true
        println("¿'hola' y 'mundo' son anagramas? ${sonAnagramas("hola", "mundo")}")       // Salida esperada: false
    }
}
