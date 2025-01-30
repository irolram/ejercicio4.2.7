import Persona.Companion.CUENTAS_MAX
import kotlin.random.Random

class Persona(val DNI:String, val cuentaBancaria:MutableList <Cuenta> ) {

    init {
        require(DNI.length == 9 && DNI[8].isLetter()) { "DNI invalidado" }
        require(true){ "Cuenta bancaria invalidada" }
    }

companion object{
    val CUENTAS_MAX  = 3
}

}


fun añadirCuenta(cuentas:ArrayList<Cuenta>, persona:Persona){

    if(cuentas.size < 3){
        val numCuenta = "CU" + Random.nextInt(10000, 99999).toString()
        val saldoDisponible = 0.0

        val cuentaNueva = Cuenta(numCuenta, saldoDisponible)
        cuentas.add(cuentaNueva)
        println("Cuenta añadida a la persona con DNI: ${persona.DNI}")
    }else{
        println("Número de cuentas máxima (${CUENTAS_MAX}) alcanzado")
    }
}