/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class OperatorExample {
  def execute(): Unit = {
    println("<<OperatorsExample>>")
    arithmeticOperatorsExample()
    relationalOperatorsExample()
    logicalOperatorsExample()
    bitwiseOperatorsExample()
    println()
  }


  private def bitwiseOperatorsExample(): Unit = {
    val (x: Int, y: Int) = (240, 15)
    println(
      s"""<<bitwiseOperatorsExample>>
         |x = $x, y = $y
         |(x & y) = ${x & y}
         |(x | y) = ${x | y}
         |(x ^ y) = ${x ^ y}
         |(~x) = ${~x}
         |(x << 2) = ${x << 2}
         |(x >> 2) = ${x >> 2}
         |(x >>> 2) = ${x >>> 2}
         |
         |""".stripMargin)
  }

  private def logicalOperatorsExample() = {
    val (x: Boolean, y: Boolean, z: Boolean) = (true, false, true)
    println(
      s"""<<LogicalOperatorsExample>>
         |x = $x, y = $y, z = $z
         |(true && true) = ${true && true}
         |(true && false) = ${true && false}
         |(false && false) = ${false && false}
         |(true || true) = ${true || true}
         |(true || false) = ${true || false}
         |(false || false) = ${false || false}
         |!true = ${!true}
         |!false = ${!false}
         |
         |""".stripMargin)
  }

  private def relationalOperatorsExample() = {
    val (x: Double, y: Double, z: Double) = (10.toDouble, 5.toDouble, 123.toDouble)
    println(
      s"""<<RelationalOperatorsExample>>
         |x = $x, y = $y, z = $z
         |(x == y) = ${x == y}
         |(x != y) = ${x != y}
         |(x > y) = ${x > y}
         |(x < y) = ${x < y}
         |(x >= y) = ${x >= y}
         |(x <= y) = ${x <= y}
         |
         |""".stripMargin)
  }

  private def arithmeticOperatorsExample(): Unit = {
    val (x: Double, y: Double, z: Double) = (10.0, 5.toDouble, 100.toDouble)
    println(
      s"""<<ArithmeticOperatorsExample>>
         |x = $x, y = $y, z = $z
         |(x + y) = ${x + y}
         |(x - y) = ${x - y}
         |(x * y) = ${x * y}
         |(x / y) = ${x / y}
         |(x % y) = ${x % y}
         |
         |""".stripMargin)
  }
}
