import model.Centralita
import model.LlamadaLocal
import model.LlamadaNacional
import model.LlamadaProvincial

fun main() {
    val centralita = Centralita() // Crear una instancia de la centralita

    while (true) {
        println("\nMenú:")
        println("1. Registrar llamada local")
        println("2. Registrar llamada provincial")
        println("3. Registrar llamada nacional")
        println("4. Mostrar llamadas realizadas")
        println("5. Calcular costes totales")
        println("6. Salir")
        print("Elija una opción: ")

        when (val opcion = readLine()?.toIntOrNull() ?: 0) {
            1 -> {
                println("Ingrese número de origen:")
                val nOrigen = readLine() ?: ""
                println("Ingrese número de destino:")
                val nDestino = readLine() ?: ""
                println("Ingrese duración en segundos:")
                val duracionSegundos = readLine()?.toIntOrNull() ?: 0
                val llamada = LlamadaLocal(nOrigen, nDestino, duracionSegundos)
                centralita.registrarLlamada(llamada)
                println("Llamada local registrada con éxito.")
            }
            2 -> {
                println("Ingrese número de origen:")
                val nOrigen = readLine() ?: ""
                println("Ingrese número de destino:")
                val nDestino = readLine() ?: ""
                println("Ingrese duración en segundos:")
                val duracionSegundos = readLine()?.toIntOrNull() ?: 0
                val llamada = LlamadaProvincial(nOrigen, nDestino, duracionSegundos)
                centralita.registrarLlamada(llamada)
                println("Llamada provincial registrada con éxito.")
            }
            3 -> {
                println("Ingrese número de origen:")
                val nOrigen = readLine() ?: ""
                println("Ingrese número de destino:")
                val nDestino = readLine() ?: ""
                println("Ingrese duración en segundos:")
                val duracionSegundos = readLine()?.toIntOrNull() ?: 0
                println("Ingrese franja horaria (1, 2 o 3):")
                val franja = readLine()?.toIntOrNull() ?: 0
                val llamada = LlamadaNacional(nOrigen, nDestino, duracionSegundos, franja)
                centralita.registrarLlamada(llamada)
                println("Llamada nacional registrada con éxito.")
            }
            4 -> {
                println("\nLlamadas realizadas:")
                centralita.mostrarLlamadasRealizadas()
            }
            5 -> {
                val costoTotal = centralita.calcularCostesTotales()
                println("\nCoste total de las llamadas realizadas: $costoTotal euros")
            }
            6 -> {
                println("Saliendo del programa...")
                return
            }
            else -> {
                println("Opción no válida")
            }
        }
    }
}
