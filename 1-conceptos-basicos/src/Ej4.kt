fun main(){
    var numero = readln()!!.toInt()
    var resta = numero * 2 - 1
    var numEspacios = 0
    for (i in 1..numero){
        for (j in 1..numEspacios){
            print(" ")
        }
        for (j in 1..resta){
            print("*")
        }
        for (j in 1..numEspacios){
            print(" ")
        }
        numEspacios++
        resta = resta - 2
        println()
    }
    numero--
    resta = 3
    numEspacios = numEspacios - 2
    for (i in 1..numero){
        for (j in 1..numEspacios){
            print(" ")
        }
        for (j in 1..resta){
            print("*")
        }
        for (j in 1..numEspacios){
            print(" ")
        }
        numEspacios--
        resta = resta + 2
        println()
    }
}