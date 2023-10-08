package Model

class Triangulo(private var base: Double, private var altura: Double) {

    fun calcularArea(): Double{
        return (base*altura)/2
    }
}