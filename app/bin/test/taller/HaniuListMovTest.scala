package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MovsHanoiTest extends AnyFunSuite {
  val objMovsHanoi = new Torre_hanoi()

  test("Lista de movimientos con 0 discos") {
    assert(objMovsHanoi.listaTorresHanoi(0,1,2,3) === List())
  }

  test("Lista de movimientos con 1 discos") {
    assert(objMovsHanoi.listaTorresHanoi(1,1,2,3) === List((1,3)))
  }

  test("Lista de movimientos con 2 discos") {
    assert(objMovsHanoi.listaTorresHanoi(2,1,2,3) === List((1,2), (1,3), (2,3)))
  }

  test("Lista de movimientos con 3 discos") {
    assert(objMovsHanoi.listaTorresHanoi(3,1,2,3) === List((1,3), (1,2), (3,2), (1,3), (2,1), (2,3), (1,3)))
  }
}