fun calculaCuadrado() {
    print("Ingrese un entero:")
    val valor = readLine()!!.toInt()
    val cuadrado = valor * valor
    println("El cuadrado es $cuadrado")
}

fun calcularProducto() {
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    val producto = valor1 * valor2
    println("El producto de los valores es: $producto")
}

fun main(parametro: Array<String>) {
    calculaCuadrado()
    calcularProducto()
}

