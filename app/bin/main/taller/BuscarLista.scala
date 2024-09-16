package taller

import scala.annotation.tailrec
import scala.NoSuchElementException

class BuscarLista() {
  def buscarElemento(lista: List[Int], elemento: Int): Boolean = {
  lista match {
    case Nil => false
    case x :: xs => if (x == elemento) true else buscarElemento(xs, elemento)
   }
  }
}
  //metodo para hallar el mayor valor en una lista no vacia de enteros positivos
  //Recurcion de cola
class MaxIt {
  def maxIt(l: List[Int]): Int = {
    if (l.isEmpty) throw new NoSuchElementException("La lista no puede estar vacia")
    require(l.forall(_ >= 0), "La lista no puede contener números negativos")
    @tailrec
      def maxIt_nAux ( lista: List[Int] , max: Int ): Int = {

        if(lista.isEmpty) max
        else if (lista.head > max) maxIt_nAux(lista.tail, lista.head)
        else maxIt_nAux(lista.tail, max)
      }
      maxIt_nAux(l.tail, l.head)
  }
}
  //metodo para hallar el menor valor en una lista no vacia de enteros positivos con recursion lineal
class MaxLin {
  def maxLin(l: List[Int]): Int = {
    if (l.isEmpty) throw new NoSuchElementException("La lista no puede estar vacia")
    else if (l.tail.isEmpty) l.head // Si la lista tiene un solo elemento, ese es el máximo xd
    else l.head max maxLin(l.tail) //Compara el primer elemento con el máximo del resto
  }
}
