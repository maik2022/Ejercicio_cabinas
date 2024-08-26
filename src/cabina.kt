class cabina(val id:Int, var numeroLlamadas:Int, var duracionTotal:Int, var costoTotal: Int) {

    // Creación de variables

    var costoCabinas: Int = 0
    var llamadasTotales: Int = 0
    var duracionTotalCabinas: Int = 0
    var costoPromedio: Int = 0

    // Función para registrar las llamadas.

    fun registrarLlamada(idCabina:Int, tipo:Int, duracion:Int){
        numeroLlamadas ++
        duracionTotal += duracion
        costoTotal += calcularCosto(tipo, duracion) //Llamo a la función de la misma clase para realizar el cálculo.
    }

    // Función para calcular el costo de la llamada.

    fun calcularCosto(tipo: Int, duracion: Int):Int{
        if (tipo == 1){

            return 50 * duracion

        }else if(tipo == 2){

            return 350 * duracion

        }else{

            return 150 * duracion

        }
    }

    // Función para mostrar la información de la cabina

    fun mostrarInformacion(){

            println("""
            *********************************
                Cabina: $id
                Número de llamadas: $numeroLlamadas
                Duración total de llamadas: $duracionTotal minutos
                Costo total de llamada: $costoTotal pesos
            *********************************
            """.trimMargin())
    }

    // Función para reiniciar la cabina.

    fun reiniciarCabina(){
        numeroLlamadas = 0
        duracionTotal = 0
        costoTotal = 0
        println("!!!La cabina número $id fue reiniciada!!!")
    }

}