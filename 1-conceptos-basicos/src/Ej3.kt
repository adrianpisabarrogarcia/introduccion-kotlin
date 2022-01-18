fun main(){
    val numero = readLine()!!.toInt()

    for (i in 1..numero){
        var contador = 0
        for (j in 1..i){
            if (i % j == 0){
                contador++
            }
        }
        if (contador == 2){
            println(i)
        }
    }
}