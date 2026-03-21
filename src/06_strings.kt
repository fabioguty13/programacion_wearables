import java.util.Locale.getDefault

fun main(){

    //texto multilinea

    val text =""" 
            En kotlin, las cadenas de texto se representan con el tipo string.
             las cadenas pueden contener caracteres unicode y se pueden definir uitlizando com....        
            """
    println(text)

    //interpolacion de cadenas
    val i = 10
    println("i = $i")

    var letters = arrayOf("a","b","c","d","e")
    println("Letters : $letters")

    //concatena cadenas
    val firstName = "John"
    val lastName = "Doe"
    val fullName = "$firstName $lastName"
    val fullName2 = firstName + " " + lastName
    println("Full Name: $fullName")

    //imprimie el tamaño de una cadena
    println("Length of full Name: ${fullName.length}")

    //comprueba si una cadena esta vacia
    val emptyString = ""
    println("Is emptyString empty? ${emptyString.isEmpty()}")

    //conversion de mayusculas y minusculas
    val mixedCase = "Kotlin Programming"
    println("Uppercase: ${mixedCase.uppercase( getDefault())}")
    println("Uppercase: ${mixedCase.lowercase( getDefault())}")

    //buscar una subcadena
    val sentence = "Kotlin is a great programming language"
    println("Does the sentence contain 'great'? ${sentence.contains("great")}")

    //comparar dos cadenas
    val str1 = "Hello"
    val str2 = "hello"
    println("Are str1 and str2 equal? ${str1.equals(str2)}")
    println("Are str1 and str2 equal? ${str1.equals(str2, ignoreCase = true)}")
}