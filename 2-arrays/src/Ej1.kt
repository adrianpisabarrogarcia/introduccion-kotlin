fun main() {
    var opcion = 0
    while (opcion != 4) {

        println(
            """
        1. Es primo
        2. Facgtorial
        3. Tabla de multiplicar
        4. Salir
       """
        )
        opcion = readLine()!!.toInt()
        when (opcion) {
            1 -> esPrimo(pedirNumero())
            2 -> println(factorial(pedirNumero()))
            3 -> tablaMultiplicar(pedirNumero())
            4 -> println("Saliendo...")
            else -> println("Opcion no valida")
        }

    }
}

//pedir un numero
fun pedirNumero(): Int {
    print("Ingrese un numero: ")
    return readLine()!!.toInt()
}


// si un numero es primo
fun esPrimo(numero: Int) {
    var esPrimo = true
    for (i in 2..numero - 1) {
        if (numero % i == 0) {
            esPrimo = false
        }
    }

    if (esPrimo) {
        println("El numero $numero es primo")
    } else {
        println("El numero $numero no es primo")
    }
}

// factorial de un numero
fun factorial(numero: Int): Int {
    var factorial = 1
    for (i in 1..numero) {
        factorial *= i
    }
    return factorial
}

// tabla de multiplicar
fun tablaMultiplicar(numero: Int) {
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}