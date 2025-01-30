class Cuenta(val numCuenta: String, saldoDisponible:Double) {

    var saldoDisponible: Double = 0.0
        get(){
                return field
            }


    fun transferirDinero(
        personaA: Persona,
        personaB: Persona,
        cuentaOrigen: String,
        cuentaDestino: String,
        cantidad: Double
    ): Boolean {



    }
    companion object{
        fun comprobarMoroso(Persona: Persona): Boolean {
            for (cuentaIndi in Persona.cuentaBancaria){
                if (cuentaIndi.saldoDisponible < 0.0){
                    return true
                }
            }
        return false
        }

    }


    fun sumarSaldo(cantidad: Double){
        saldoDisponible += cantidad

    }
    fun restarSaldo(cantidad: Double){
        saldoDisponible -= cantidad
    }
}