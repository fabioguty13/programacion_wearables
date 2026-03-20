fun main(){

    //declaramos las variables que vamos a usar
    var huevos = false
    var patatas = false
    var cebollas = false

    //preguntamos al usuario si tienes huevos
    println("Tienes huevos? [s|n]?")
    val respuesta_huevos = readln()
    if (respuesta_huevos.equals(other = "s", ignoreCase = true)){
        huevos = true
    }

    //preguntamos al usuario si tienes patatas
    println("Tienes patatas? [s|n]?")
    val respuesta_patatas = readln()
    if (respuesta_patatas.equals(other = "s", ignoreCase = true)){
        patatas = true
    }

    //preguntamos al usuario si tienes cebollas
    println("Tienes cebollas? [s|n]?")
    val respuesta_cebollas = readln()
    if (respuesta_cebollas.equals(other = "s", ignoreCase = true)){
        cebollas = true
    }

    //verificamos si tenemos todos los ingredientes
    if(huevos && patatas && cebollas){
        println("SALE TORTILLA!!!")
    } else {
        println("CORRE AL SUPER A POR LOS INGREDIENTES")
    }

}