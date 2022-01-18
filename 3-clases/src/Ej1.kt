var listaEmpresas: MutableList<Empresa> = mutableListOf()

fun nuevaEmpresa(){
    //new company
    println("Ingrese el nombre de la empresa: ")
    var nombre = readLine()!!
    println("Ingrese el año de Fundacion: ")
    var anioFundacion = readLine()!!

    var listaEmpleados: MutableList<Empleado> = mutableListOf()
    val empresa = Empresa(nombre, anioFundacion, listaEmpleados)
    listaEmpresas.add(empresa)
}

fun mostrarEmpresas(){
    var num = 0
    for (empresa in listaEmpresas){
        println("${num} - ${empresa.toString()}")
        num++
    }
}

fun nuevoEmpleadoyAsignarloAEmpresa(){
    println("Ingrese el nombre del empleado: ")
    var nombre = readLine()!!
    println("Ingrese los apelldios del empleado: ")
    var apellidos = readLine()!!
    println("Ingrese la fecha de nacimiento del empleado: ")
    var fechaNac = readLine()!!
    println("Ingrese la fecha de contrato: ")
    var fechaContrato = readLine()!!

    val empleado = Empleado(nombre, apellidos, fechaNac, fechaContrato)
    val numeroEmpresa = escogeEmpresa()
    listaEmpresas[numeroEmpresa].listaEmpleados.add(empleado)
}

fun escogeEmpresa(): Int {
    var num = 0

    mostrarEmpresas()
    println("Ingrese el numero de la empresa: ")
    val numero = readLine()!!.toInt()

    return numero
}

fun listadoEmpresasyEmpleados(){
    println("---")
    for (empresa in listaEmpresas){
        println("Nombre: ${empresa.nombre}")
        println("Año de Fundación: ${empresa.anioFundacion}")
        for (empleado in empresa.listaEmpleados){
            println("Empleado: ${empleado.toString()}")
        }
        println("---")
    }
}

fun main(){


    //constant
    val menu = """
        1. Nueva empresa
        2. Empleado a empresa existente
        3. Listado de empresas
        4. Listado detallado de empresas y empleados
        5. Salir
        """.trimIndent()
    var opcion = 1
    while (opcion != 5) {
        println(menu)
        println("Seleccione una opcion: ")
        opcion = readLine()!!.toInt()
        when (opcion) {
            1 -> {
                nuevaEmpresa()
            }
            2 -> {
                nuevoEmpleadoyAsignarloAEmpresa()
            }
            3 -> {
                mostrarEmpresas()
            }
            4 -> {
                listadoEmpresasyEmpleados()
            }
            5 -> {
                println("Saliendo...")
            }
            else -> {
                println("Opcion incorrecta")
            }
        }
    }




}