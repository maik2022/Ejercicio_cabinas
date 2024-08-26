fun main() {

    // Creación e inicialización de las variables necesarias.

    var opcion: Int = 0
    var cabina: Int = 0
    var tipo: Int = 0
    var duracion: Int = 0

    // Creación de las instancias de la clase cabina

    val cabina_1 = cabina(1, 0,0,0)
    val cabina_2 = cabina(2, 0,0,0)
    val cabina_3 = cabina(3, 0,0,0)
    val cabina_4 = cabina(4, 0,0,0)
    val cabina_5 = cabina(5, 0,0,0)

    while (opcion != 5){

        try {
            println("""
            *********************************    
                Bienvenidos
                Menú Principal
                1. Registrar Llamada
                2. Ver información de una cabina especifica
                3. Ver consolidado de todas las cabinas
                4. Reiniciar una cabina
                5. Salir
            **********************************""".trimMargin())
            print("Elija la opción requerida: ")
            opcion = readln().toInt()

            when (opcion){
                1 -> {
                    print("Digite el número de la cabina (1-5): ")
                    cabina = readln().toInt()

                    print("Digite el tipo de plan: 1. Llamada local, 2. Larga distancia y 3. Celular: ")
                    tipo = readln().toInt()

                    if (tipo <= 0 || tipo > 3){
                        while (tipo <= 0 || tipo > 3){
                            println("No escogió una opción válida, inténtelo de nuevo.")
                            print("Digite el tipo de plan: 1. Llamada local, 2. Larga distancia y 3. Celular: ")
                            tipo = readln().toInt()
                        }
                    }

                    print("Digite la duración de la llamada en minutos: ")
                    duracion = readln().toInt()

                    when (cabina){
                        1 -> cabina_1.registrarLlamada(cabina, tipo, duracion)
                        2 -> cabina_2.registrarLlamada(cabina, tipo, duracion)
                        3 -> cabina_3.registrarLlamada(cabina, tipo, duracion)
                        4 -> cabina_4.registrarLlamada(cabina, tipo, duracion)
                        5 -> cabina_5.registrarLlamada(cabina, tipo, duracion)
                        else -> println("!!!No escogió una opción valida inténtelo de nuevo!!!")
                    }
                }
                2 -> {
                    print("Digite el número de la cabina (1-5): ")
                    cabina = readln().toInt()

                    when (cabina){
                        1 -> cabina_1.mostrarInformacion()
                        2 -> cabina_2.mostrarInformacion()
                        3 -> cabina_3.mostrarInformacion()
                        4 -> cabina_4.mostrarInformacion()
                        5 -> cabina_5.mostrarInformacion()
                        else -> println("!!!No escogió una opción valida inténtelo de nuevo!!!")
                    }
                }
                3 -> {
                    println("""
                    *********************************
                    Costo Total de todas las cabinas: ${cabina_1.costoTotal+cabina_2.costoTotal+cabina_3.costoTotal+
                                                        cabina_4.costoTotal+cabina_5.costoTotal} pesos
                    Número Total de llamadas realizadas: ${cabina_1.numeroLlamadas+cabina_2.numeroLlamadas+cabina_3.numeroLlamadas+
                                                           cabina_4.numeroLlamadas+cabina_5.numeroLlamadas}
                    Duración total de llamadas: ${cabina_1.duracionTotal+cabina_2.duracionTotal+cabina_3.duracionTotal+
                                                           cabina_4.duracionTotal+cabina_5.duracionTotal} minutos
                    Costo promedio por minuto: ${(cabina_1.costoTotal+cabina_2.costoTotal+cabina_3.costoTotal+
                            cabina_4.costoTotal+cabina_5.costoTotal)/(cabina_1.duracionTotal+cabina_2.duracionTotal+cabina_3.duracionTotal+
                            cabina_4.duracionTotal+cabina_5.duracionTotal)} pesos
                    *********************************
                    """.trimMargin())
                }
                4 ->{
                    print("Digite el número de la cabina que desea reiniciar (1-5): ")
                    cabina = readln().toInt()

                    when (cabina){
                        1 -> cabina_1.reiniciarCabina()
                        2 -> cabina_2.reiniciarCabina()
                        3 -> cabina_3.reiniciarCabina()
                        4 -> cabina_4.reiniciarCabina()
                        5 -> cabina_5.reiniciarCabina()
                        else -> println("!!!No escogió una opción valida inténtelo de nuevo!!!")
                    }

                }
                5 -> opcion = 5
                else -> println("!!!Opción invalida. Por favor ingrese una opción del menú!!!")
            }
        }catch(e: NumberFormatException){  // Esta excepción ocurre cuando la cadena ingresada no se puede analizar como un número entero
            println("!!Entrada no valida. Por favor ingrese un número entero!!")
        }
    }
}