import org.scalatest.funsuite.AnyFunSuite

class Ass1Test extends AnyFunSuite{
  val obj= new Ass1()

  test("Test1") {
    assert(obj.add(7, 7) == 14)
  }

  test("Test2") {
    assert(obj.sub(10, 5) == 5)
  }

  test("Test3") {
    assert(obj.mul(9, 9) == 81)
  }

  test("Test4"){
    assert(obj.divide(10, 5)== 2)
  }
}
}
