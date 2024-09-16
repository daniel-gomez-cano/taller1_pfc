package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner
import scala.NoSuchElementException

@RunWith(classOf[JUnitRunner])
class MaxItTest extends AnyFunSuite {
    val objMaxIt = new MaxIt()
    test("Encontrar el mayor en List(1, 2, 3, 4, 5)") {
        assert(objMaxIt.maxIt(List(1, 2, 3, 4, 5)) == 5)
    }
    test("Encontrar el mayor en List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)") {
        assert(objMaxIt.maxIt(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) == 10)
    }
    test("Encontrar el mayor en List(5,8,3,1,7,9,2,4,6)") {
        assert(objMaxIt.maxIt(List(5,8,3,1,7,9,2,4,6)) == 9)
    }
    test("Encontrar el mayor en List(3)") {
        assert(objMaxIt.maxIt(List(3)) == 3)
    }
    test("Cuando la lista está vacía") {
        assertThrows[NoSuchElementException]{
            objMaxIt.maxIt(List())
        }
    }
    test("Encontrar el mayor en una Lista Random"){
        val randomList = List.fill(20)(scala.util.Random.nextInt(100))
        val expectedMax = randomList.max
        assert(objMaxIt.maxIt(randomList) == expectedMax)
    }
}