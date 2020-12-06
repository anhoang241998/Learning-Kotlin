fun main() {

    val user = UserRepoImpl()
    user.saveUser(User())
    user.selectUserByID("abc")

    println(user.ageDefault)

}

// interface
class User {

}

interface IUserRepo {
    var ageDefault: Int

    fun saveUser(user: User)
    fun selectUserByID(userID: String) {
        println("call from interface")
    }
}

interface I1 {
}

interface I2 {

}


class UserRepoImpl: IUserRepo, I1, I2 {
    override var ageDefault: Int = 18


    override fun saveUser(user: User) {
        println("saveUser")
    }

    override fun selectUserByID(userID: String) {
        super.selectUserByID(userID)
        println("selectUserByID")
    }
}



