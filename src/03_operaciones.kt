fun main() {

    var edad:Int = 40
    var intervalo:Int = 2
    val paso:Float = 2.5f
    var nombre:String = "Paco"
    var apellido:String = "Gomez"
    var numeroTxt:String = "40"

    //operaciones aritmeticas
    println("Edad+intervalo="+(edad+intervalo))
    println("Edad*intervalo="+(edad*intervalo))
    println("Edad/intervalo="+(edad/intervalo))
    println("Edad%intervalo="+(edad%intervalo))

    //conversiones automatica de operaciones
    println("Edad+paso=(Float)"+(edad+paso))
    println("Edad+paso=(Int)"+(edad+paso.toInt()))
    println("numeroTxt=(Int)"+(numeroTxt.toInt()))

    //concatenacion
    println(nombre+" "+apellido)


}