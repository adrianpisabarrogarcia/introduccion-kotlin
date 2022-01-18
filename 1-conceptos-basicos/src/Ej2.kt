fun main() {

    val numeroCorrecto = false
    val numero = readln()!!.toInt()

    if (numero < 8 && numero > 0) {
        //lista de dias de la semana
        val dias = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

        //imprimir el dia de la semana
        println("El día " + numero + " corresponde a: " + dias[numero - 1])
    } else {
        println("El numero introducido no es correcto")
    }

}