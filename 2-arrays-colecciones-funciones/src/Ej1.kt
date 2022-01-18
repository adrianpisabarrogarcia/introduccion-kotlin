import com.sun.org.apache.bcel.internal.classfile.Utility.printArray

fun main() {

    val size = 10
    val array = Array(size) { 0 }
    for (i in 0 until array.size) {
        //random value
        array[i] = (0..1000).random()
    }

    val menu = """
        Select: 
        1.- Print array
        2.- Max num of array
        3.- Min num of array
        4.- If exist num
        5.- Exit
    """

    //imput option
    var option = readLine()!!.toInt()
    do {
        println(menu)
        option = readLine()!!.toInt()
        when (option) {
            1 -> printArray(array)
            2 -> println("Max num of array: ${maxNum(array)}")
            3 -> println("Min num of array: ${minNum(array)}")
            4 -> {
                println("Enter a number: ")
                val num = readLine()!!.toInt()
                if (existNum(array, num)) {
                    println("The number $num exist in the array")
                } else {
                    println("The number $num not exist in the array")
                }
            }
        }

    }while (option != 5)
}

fun maxNum(array: Array<Int>): String {
    var max = array[0]
    for (i in 1 until array.size){
        if(array[i] > max){
            max = array[i]
        }
    }
    return max.toString()
}
fun minNum(array: Array<Int>): String {
    var min = array[0]
    for (i in 1 until array.size){
        if(array[i] < min){
            min = array[i]
        }
    }
    return min.toString()
}
fun existNum(array: Array<Int>, num: Int): Boolean {
    for (i in 0 until array.size){
        if(array[i] == num){
            return true
        }
    }
    return false
}



