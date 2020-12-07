fun main() {
    val myIntArray = arrayOf(3, 2, 6,4)
    println(myIntArray[0])
    println(myIntArray[1])
    println(myIntArray[2])
    println(myIntArray[3])

    val myStringArray = arrayOf("hello","guys", "abc")
    println(myStringArray[0])
    println(myStringArray[1])
    println(myStringArray[2])

    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val myNumber = 5
    println(if(array[3] < 4) array[myNumber + 1] else array[myNumber - 1])

}