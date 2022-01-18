import com.sun.org.apache.bcel.internal.classfile.Utility.printArray

fun main(){

    val rows = readln()!!.toInt()
    val cols = readln()!!.toInt()

    val matrix = Array(rows) { IntArray(cols) }


    //Print the matrix
    printMatrix(matrix)

    //Matrix to Array
    var array = matrixToArray(matrix, rows, cols)

    //Print array
    printArray(array)

    //Remove repited elements
    removeRepited(array)


}

fun removeRepited(array: Array<Int>) {
    //array to mutable
    var arrayMutable = array.toMutableList()

    //Remove repited elements
    arrayMutable.removeAll { arrayMutable.count { it == it } > 1 }

    //print mutable list
    printArray(arrayMutable.toTypedArray())
}



fun matrixToArray(matrix: Array<IntArray>, rows: Int, cols: Int): Array<Int> {
    val numeroPosiciones = cols * rows
    val array = Array(numeroPosiciones){0}

    //recorre la matriz
    for(i in 0 until rows){
        for(j in 0 until cols){
            array[i * cols + j] = matrix[i][j]
        }
    }

    //Print the array
    return array

}

fun printMatrix(matrix: Array<IntArray>) {
    for(i in 0 until matrix.size){
        for(j in 0 until matrix[i].size){
            print("${matrix[i][j]} ")
        }
        println()
    }
}