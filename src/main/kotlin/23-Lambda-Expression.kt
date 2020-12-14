fun main() {
    var user = callApi(
            userId = "xyz",
            callback = ::callback
    )
    println(user)

    var user1 = callApi(
            userId = "def"
    ) { userId ->
        UserDemo(
                userId = userId,
                name = "Ryan",
                age = 25
        )
    }
    println(user1)

    var user2 = callApi(
            userId = "def"
    ) {
        UserDemo(
                userId = "abc",
                name = it,
                age = 27
        )
    }

    println(user2)

    var user3 = getApi(
            userName = "Nguyen hoang An",
            { userName: String, userAge: String ->
                UserDemo(
                        userName,
                        userAge,
                        23)
            },
            userAge = "23"
    )

    println(user3)

    var user4 = onePara(
            userName = "Nguyen Hoang An",
            {
                UserDemo(it, "ndsajdnas", 23)
            },
            23
    )
    println(user4)

}

data class UserDemo(
        val userId: String,
        val name: String,
        val age: Int
)

fun callApi(
        userId: String,
        callback: (String) -> UserDemo
): UserDemo = callback(userId)

fun callback(userId: String) = UserDemo(
        userId = userId,
        name = "Ryan",
        age = 25
)

fun getApi(
        userName: String,
        func: (String, String) -> UserDemo,
        userAge: String,
): UserDemo = func(userName, userAge)

fun onePara(
        userName: String,
        func: (String) -> UserDemo,
        userAge: Int
): UserDemo = func(userName)
