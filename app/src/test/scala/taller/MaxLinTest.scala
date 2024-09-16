package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner
import scala.NoSuchElementException

@RunWith(classOf[JUnitRunner])
class MaxLinTest extends AnyFunSuite {
    val objMaxLin = new MaxLin()
    test("Encontrar el mayor en List(1, 2, 3, 4, 5)") {
        assert(objMaxLin.maxLin(List(1, 2, 3, 4, 5)) == 5)
    }
    test("Encontrar el mayor en List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)") {
        assert(objMaxLin.maxLin(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) == 10)
    }
    test("Encontrar el mayor en List(5,8,3,1,7,9,2,4,6)") {
        assert(objMaxLin.maxLin(List(5,8,3,1,7,9,2,4,6)) == 9)
    }
    test("Encontrar el mayor en List(3)") {
        assert(objMaxLin.maxLin(List(3)) == 3)
    }
    test("Cuando la lista está vacía") {
        assertThrows[NoSuchElementException]{
            objMaxLin.maxLin(List())
        }
    }
    test("Encontrar el mayor en una Lista Random"){
        val randomList = List.fill(20)(scala.util.Random.nextInt(100))
        val expectedMax = randomList.max
        assert(objMaxLin.maxLin(randomList) == expectedMax)
    }
}
