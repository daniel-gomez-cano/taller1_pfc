package taller

class Torre_hanoi{

    def movsTorresHanoi (n_discos : Int ): BigInt = {
        //formula que calcula 2 elevado al numero de discos - 1
        //Resultado igual al numero de movimientos
        BigInt(2).pow(n_discos) - 1
    }
    
    def listaTorresHanoi(n: Int, t1: Int, t2: Int, t3: Int): List[(Int, Int)] = {
        if (n == 0) {
            List()  //caso base
        } else {
            
            //Movimientos realizados para formar la torre en el centro, sin el ultimo disco
            val movimientos_anteriores = listaTorresHanoi(n - 1, t1, t3, t2)

            //Movimiento principal del disco mas grande a la ultima torre
            val movimientoPrincipal = List((t1, t3))

            //Movimientos realizados para llevar la torre del centro hasta la t3 final
            val movimientos_posteriores= listaTorresHanoi(n - 1, t2, t1, t3)
            
            // Combina todos los movimientos
            movimientos_anteriores ++ movimientoPrincipal ++ movimientos_posteriores
            
        }
    }   
}