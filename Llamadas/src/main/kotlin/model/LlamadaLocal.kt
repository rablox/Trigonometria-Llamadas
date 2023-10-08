package model

class LlamadaLocal(nOrigen: String, nDestino: String, duracionSegundos: Int) :
    Llamada(nOrigen, nDestino, duracionSegundos) {
    override fun calcularCoste(): Double {
        return 0.0 // Llamadas locales no tienen costo
    }
}
