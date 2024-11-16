package POO

/*
* This is main function. Entry point of the application.
* */
fun main(args: Array<String>) {

    var personObj = Personne()
    personObj.name = "Steve"

    print("The name of the person is ${personObj.name}")
}

class Personne {

    var name: String = ""
}
