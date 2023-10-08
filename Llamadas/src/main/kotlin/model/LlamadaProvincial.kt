package model

class LlamadaProvincial(nOrigen: String, nDestino: String, duracionSegundos: Int) :
    Llamada(nOrigen, nDestino, duracionSegundos) {
    override fun calcularCoste(): Double {
        val costoPorSegundo = 15 // 15 céntimos por segundo para llamadas provinciales
        return costoPorSegundo * duracionSegundos / 100.0 // Devolver el costo en euros
    }
}
