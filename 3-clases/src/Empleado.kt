class Empleado {
    var nombre: String? = null
    var apellidos: String? = null
    var fecNac: String? = null
    var fechaCotrato: String? = null

    constructor(nombre: String?, apellidos: String?, fecNac: String?, fechaCotrato: String?) {
        this.nombre = nombre
        this.apellidos = apellidos
        this.fecNac = fecNac
        this.fechaCotrato = fechaCotrato
    }

    constructor() {}

    override fun toString(): String {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecNac='" + fecNac + '\'' +
                ", fechaCotrato='" + fechaCotrato + '\'' +
                '}'
    }
}