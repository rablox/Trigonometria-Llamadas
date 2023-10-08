package Model

class Circulo(private var radio: Double) {

    fun calcularArea(): Double{
        return Math.PI*(radio*radio)
    }

    fun calcularDiametro(): Double{
        return 2 * radio
    }

}
