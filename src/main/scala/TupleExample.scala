/**
 * created by  Nijat Aghayev on 09.12.20 
 */
class TupleExample {
  def execute(): Unit = {
    println("<<TupleExample>>")
    example1()
    println()
  }

  private def example1(): Unit = {
    val t1 = new Tuple1("foo")
    val t2 = new Tuple2("foo", 10)
    val t3 = new Tuple3("foo", 10, 100.0)
    val t4 = new Tuple4("foo", 10, 100.0, true)

    println(
      s"""<<example1>>
         |t1 = ${t1._1}
         |t2 = ${t2._1}, ${t2._2}
         |t3 = ${t3.productIterator.mkString("; ")}
         |t4 = ${t4.productIterator.mkString("; ")}
         |
         |""".stripMargin)
  }
}
