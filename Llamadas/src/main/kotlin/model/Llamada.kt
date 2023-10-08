package model
abstract class Llamada(val nOrigen: String, val nDestino: String, val duracionSegundos: Int) {
    abstract fun calcularCoste(): Double
}
