class Empresa {
    var nombre: String? = null
    var anioFundacion: String? = null
    var listaEmpleados: MutableList<Empleado> = mutableListOf()

    constructor() {}
    constructor(nombre: String?, anioFundacion: String?, listaEmpleados: MutableList<Empleado>) {
        this.nombre = nombre
        this.anioFundacion = anioFundacion
        this.listaEmpleados = listaEmpleados
    }


    override fun toString(): String {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", anioFundacion='" + anioFundacion + '\'' +
                '}'
    }
}