import Controller.Figura
import Model.*

fun main() {

    var opcion: Int
    val figura: Figura = Figura()
    do {
        println("Menu:")
        println("1. agregar Círculo")
        println("2. agregar Rectángulo")
        println("3. agregar Triángulo")
        println("4. calcular area de figuras")
        println("5. calcular diametro de circulos")
        println("6. calcular perimetro de rectangulos")
        print("Seleccione una opción: ")
        opcion = readln().toInt()
        when(opcion){
            1->{
                println("Cual es el radio del circulo")
                val radio = readln().toDouble()
                val circulo: Circulo = Circulo(radio)
                figura.addCirculo(circulo)
            }
            2->{
                println("Cual es la base del rectangulo")
                val base = readln().toDouble()
                println("Cual es la altura del rectangulo")
                val altura = readln().toDouble()
                val rectangulo: Rectangulo = Rectangulo(base,altura)
                figura.addRectangulo(rectangulo)
            }
            3->{
                println("Cual es la base del triangulo")
                val base = readln().toDouble()
                println("Cual es la altura del triangulo")
                val altura = readln().toDouble()
                val triangulo: Triangulo = Triangulo(base,altura)
                figura.addTriangulo(triangulo)
            }
            4->{
                println("1. Círculo")
                println("2. Rectángulo")
                println("3. Triángulo")
                print("Seleccione una opción: ")
                var subopcion = readln().toInt()
                when(subopcion){
                    1->{
                        println("area circulo")
                        figura.listaCirculo.forEach { println(it.calcularArea()) }
                    }
                    2->{
                        println("area rectangulo")
                        figura.listaRectangulo.forEach { println(it.calcularArea()) }
                    }
                    3->{
                        println("area triangulo")
                        figura.listaTriangulo.forEach { println(it.calcularArea()) }
                    }
                }
            }
            5->{
                println("diametro circulo")
                figura.listaCirculo.forEach { println(it.calcularDiametro()) }
            }
            6->{
                println("diametro rectangulo")
                figura.listaRectangulo.forEach { println(it.calcularPerimetro()) }
            }
        }
    }while(opcion!=6)
}