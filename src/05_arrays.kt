fun main(){

    //creacion de arrays
    val nombres = arrayOf("Paco","Francisco","Pancho","Pepe")
    val arrayVacio = emptyArray<Int>()

    println("nombres[0]=${nombres[0]}")

    /*el contenido del array es mutable*/
    val nuevoArray = Array<Float>( 10){1.0f}
    val simpleArray = Array<Int>( 3) {0}
    println("simpleArray="+simpleArray.joinToString())

    println("tamaño de nombres="+nombres.size)

    //Recorrer un array
    for (i in 0..nombres.size-1){
        println("nombres[$i]"+nombres[i])
    }
    for (i in nombres.indices){
        println("nombres[$i]"+nombres[i])
    }

    //recorrer un array con forEach
    nombres.forEach { println(it) }

}