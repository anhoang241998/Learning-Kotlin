fun main() {
    //null safety

    //TH1
//    var email: String = null
//    println(email)

    //TH2
//    var email: String = "ryan@gmail.com"
//    email = null

    var email: String ?= null
    println(email?.length) // check cho ta co phai null hay khong
//    println(email!!.length) // chac chan bien khac null

    var lap = makeLap()
    lap?.showPrice()

}

class Lap {
    fun showPrice() {
        println("show price function")
    }
}

fun makeLap(): Lap ?= Lap()



