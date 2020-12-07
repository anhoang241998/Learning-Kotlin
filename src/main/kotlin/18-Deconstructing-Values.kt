fun main() {
    val video = Video(
            "Code4func",
            "http://code4func.com",
            "des"
    )

    // difficult
    val (title, link, description) = video
    println(title)
    println(link)
    println(description)

    val (position, salary) = Programmer(
            "Mobile Developer",
            2000,
            25
    )
    println(position)
    println(salary)


}

class Video(val title: String, val link: String, val des: String) {
    operator fun component1(): String = title
    operator fun component2(): String = link
    operator fun component3(): String = des
}

data class Programmer(val position: String, val salary: Int, val age: Int)