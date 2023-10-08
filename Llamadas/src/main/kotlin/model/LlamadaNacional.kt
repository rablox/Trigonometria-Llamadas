package model

class LlamadaNacional(
    nOrigen: String, nDestino: String, duracionSegundos: Int, val franja: Int
) : Llamada(nOrigen, nDestino, duracionSegundos) {
    override fun calcularCoste(): Double {
        val costoPorSegundo = when (franja) {
            1 -> 20 // Tarifa por segundo en la franja 1
            2 -> 25 // Tarifa por segundo en la franja 2
            3 -> 30 // Tarifa por segundo en la franja 3
            else -> 0 // Valor predeterminado para franjas desconocidas
        }

        return costoPorSegundo * duracionSegundos / 100.0 // Devolver el costo en euros
    }
}
