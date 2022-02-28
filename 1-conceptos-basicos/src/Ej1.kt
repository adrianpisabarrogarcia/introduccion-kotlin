fun main(){
    val menu = """
        1. Sumar
        2. Restar
        3. Multiplicar
        4. División
        5. Resto de una división
        6. Salir
    """
    print(menu)
    val opcion = readLine()!!.toInt()

    if (opcion < 6 && opcion > 0) {
        print("Introduce un número:")
        val num1 = readLine()!!.toInt()
        print("Introduce otro número:")
        val num2 = readLine()!!.toInt()
        when (opcion) {
            1 -> println("La suma es: ${num1 + num2}")
            2 -> println("La resta es: ${num1 - num2}")
            3 -> println("La multiplicación es: ${num1 * num2}")
            4 -> println("La división es: ${num1 / num2}")
            5 -> println("El resto es: ${num1 % num2}")
        }
    } else if (opcion == 6) {
        println("Salir")
    } else {
        println("Opción incorrecta")
    }

}