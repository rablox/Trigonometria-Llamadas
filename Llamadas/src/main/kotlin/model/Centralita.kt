package model

class Centralita {
    private val llamadas = ArrayList<Llamada>()

    fun registrarLlamada(llamada: Llamada) {
        llamadas.add(llamada)
    }

    fun mostrarLlamadasRealizadas() {
        for (llamada in llamadas) {
            // Mostrar detalles de la llamada (nOrigen, nDestino, duracionSegundos, costo)
        }
    }

    fun calcularCostesTotales(): Double {
        var costoTotal = 0.0
        for (llamada in llamadas) {
            costoTotal += llamada.calcularCoste()
        }
        return costoTotal
    }
}
