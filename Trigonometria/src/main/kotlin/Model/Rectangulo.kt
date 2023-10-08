package Model

class Rectangulo(private var base: Double,private var altura: Double) {

    fun calcularArea(): Double{
        return base*altura
    }

    fun calcularPerimetro(): Double{
        return 2*(base+altura)
    }
}