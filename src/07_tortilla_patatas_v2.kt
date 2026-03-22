fun main() {

    //creamos array con los productos basicos
    val ingredientes = arrayOf("patatas", "huevos", "aceite", "sal")
    val cantidades = Array<Int>(ingredientes.size) { 0 }

    //recorremos el array con un forEach
    ingredientes.forEach {
        println("Tienes ${it}? (s|n)")
        val respuesta = readLine()
        if (respuesta.equals("s", ignoreCase = true)){
            println("Cuantas unidades/cantidades tienes de ${it}?")
            val cantidad = readln()
            cantidades[ingredientes.indexOf(it)] = cantidad.toInt();
        } else {
            println("Cuantas unidades necesitas de ${it}?")
            val cantidad = readln()
            cantidades[ingredientes.indexOf(it)] = cantidad.toInt();
        }

    }

    //imprimimos los ingredientes y las cantidades
    println("Ingredientes y cantidades:")
    for (i in ingredientes.indices){
        println("${ingredientes[i]}: ${cantidades[i]}")
    }
}