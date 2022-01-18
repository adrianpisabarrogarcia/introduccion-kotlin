/*
fun main(){
    //array de enteros

    val num1 = readln()!!.toInt()
    val num2 = readln()!!.toInt()
    val num3 = readln()!!.toInt()

    val listaMutable = mutableListOf<Int>()
    listaMutable.add(num1)
    listaMutable.add(num2)
    listaMutable.add(num3)

    //numero mas alto de los tres
    var max = 0
    //max num of kotlin
    listaMutable.max()?.let { max = it }
    println(max)

    for (i in listaMutable){
        if (i > max){
            max = i
        }
        if (i < min){
            min = i
        }
    }
    println("El numero mas alto es: $max")
    println("El numero mas bajo es: $min")


    for (i in listaMutable){
        if (i == max){
            listaMutable.remove(i)
        }
        if (i == min){
            listaMutable.remove(i)
        }
    }

    print("El número que no son el mas alto y el mas bajo es: "+listaMutable[0])
}
*/