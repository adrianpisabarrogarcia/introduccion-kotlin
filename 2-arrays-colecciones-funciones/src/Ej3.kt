//create a mutable list
val list = mutableListOf<String>()

fun addElement() {
    println("Enter the element to add")
    list.add(readLine()!!)
}

fun addElementAtAPosition() {
    println("Enter the element to add")
    val element = readLine()!!
    println("Enter the position to add")
    val position = readLine()!!.toInt()
    list.add(position, element)
}

fun changePositionOfAnElement() {
    println("Enter the element to change")
    val element = readLine()!!
    println("Enter the new position")
    val position = readLine()!!.toInt()
    list.set(position, element)
}

fun searchAnElement() {
    println("Enter the element to search")
    val element = readLine()!!
    if(list.contains(element)){
        println("The element is in the list")
    }else{
        println("The element is not in the list")
    }
}

fun main(){

    val menu = """
        0.- Exit
        1.- Add a new element
        2.- Add a new element at a position defined by the user
        3.- Change the position of an element
        4.- Search an element
    """
    var option = 1
    while(option != 0){
        println(menu)
        option = readLine()!!.toInt()
        when(option){
            0 -> {
                println("Bye")
                break
            }
            1 -> {
                addElement()
                break
            }
            2 -> {
                addElementAtAPosition()
                break
            }
            3 -> {
                changePositionOfAnElement()
                break
            }
            4 -> {
                searchAnElement()
                break
            }
            else -> {
                println("Invalid option")
            }
        }

    }

}