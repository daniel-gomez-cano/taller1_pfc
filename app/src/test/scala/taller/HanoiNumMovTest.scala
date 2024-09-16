package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TorresHanoiTest extends AnyFunSuite {
  val objTorresHanoi = new Torre_hanoi()

  test("Numero de movimientos con 3 discos") {
    assert(objTorresHanoi.movsTorresHanoi(3) === 7)
  }

  test("Numero de movimientos con 4 discos") {
    assert(objTorresHanoi.movsTorresHanoi(4) === 15)
  }

  test("Numero de movimientos con 5 discos") {
    assert(objTorresHanoi.movsTorresHanoi(5) === 31)
  }
}
