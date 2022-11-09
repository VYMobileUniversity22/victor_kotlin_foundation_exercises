import java.util.*

fun main(args: Array<String>) {

    val scanner  = Scanner(System.`in`)

    println("Bienvenido al creador de individuos")
    println("***********************************")
    println("Indique el nombre")
    val name = scanner.next()
    println("Indique la edad")
    val age = scanner.nextInt()
    println("Indique el genero (M o F)")
    val gender:Char = scanner.next().toString().first()
    println("Indique el peso en kilos")
    val weight = scanner.nextInt()
    println("Indique la estatura en centimetros")
    val height = scanner.nextInt()

    var individuo1 = Individual(name, age,gender,weight,height)
    var individuo2 = Individual(name, age,gender)
    var individuo3 = Individual()


    println("Individuo 1:")
    println(individuo1.toString())
    println("*********************")
    println("Individuo 2:")
    println(individuo2.toString())
    println("*********************")
    println("Individuo 2:")
    println(individuo2.toString())
    println("*********************")

    //creando la rama developer
    //creando la rama feature1


}