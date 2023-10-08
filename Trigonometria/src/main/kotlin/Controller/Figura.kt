package Controller

import Model.*

class Figura {
    lateinit var listaCirculo: ArrayList<Circulo>
    lateinit var listaRectangulo: ArrayList<Rectangulo>
    lateinit var listaTriangulo: ArrayList<Triangulo>

    init {
        listaCirculo = ArrayList()
        listaRectangulo = ArrayList()
        listaTriangulo = ArrayList()
    }

    fun addCirculo(circulo: Circulo) {
        listaCirculo.add(circulo)
    }

    fun addRectangulo(rectangulo: Rectangulo) {
        listaRectangulo.add(rectangulo)
    }

    fun addTriangulo(triangulo: Triangulo) {
        listaTriangulo.add(triangulo)
    }
}
