package taller

class Torre_hanoi{

    def movsTorresHanoi (n_mov : Int ): BigInt = {
        BigInt(2).pow(n_mov) - 1
    }
    
    def listaTorresHanoi (n_mov: Int, poste_Inicio: Char,poste_Final: Char,poste_medio: Char): Unit = {
    if (n_mov == 0) {println("No hay discos")} else 
      if(n_mov == 1){
      val movimientoDisco = List(poste_Inicio, poste_Final)
      
      println("Mueve "+n_mov+" Desde "+movimientoDisco(0)+" Hasta "+movimientoDisco(1))} else{
      
        val movimientosPrimeraParte = listaTorresHanoi(n_mov-1, poste_Inicio, poste_medio, poste_Final)
        
        val movimientoDisco = List(poste_Inicio, poste_Final)
        
        println("Mueve "+n_mov+" Desde "+movimientoDisco(0)+" Hasta "+movimientoDisco(1))
        
        val movimientosSegundaParte = listaTorresHanoi(n_mov-1, poste_medio, poste_Final,  poste_Inicio)
    }
    }

}