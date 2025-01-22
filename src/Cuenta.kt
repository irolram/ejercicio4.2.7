class Cuenta(val numCuenta: Int, val saldoDisponible:Double) {


    fun comprobarMoroso(Persona:Persona):Boolean{
        var resultado = false
        for (cuentaindividual in cuentaBancaria.size){
            if (cuentaindividual <  0.0){
                resultado = false
            }else{
                resultado = true
            }
        }
        return resultado
    }
}