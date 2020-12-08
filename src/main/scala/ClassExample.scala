import scala.util.Random

/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class ClassExample {
  def execute(): Unit = {
    println("<<ClassExample>>")
    executeBoxExample()
    executeComplexNumberExample()
    executePointExample()
    println()
  }

  private def executePointExample(): Unit = {
    val p1 = new Point(10, 10, 10)
    val p2 = new Point(5, 5, 5)
    println(
      s"""<<executePointExample()>>
        |p1 = $p1
        |p2 = $p2
        |p1 + p2 = ${p1 + p2}
        |p1 - p2 = ${p1 - p2}
        |p1 * p2 = ${p1 * p2}
        |p1 / p2 = ${p1 / p2}
        |p1.distance(p2) = ${p1.distance(p2)}
        |p1.move(10, 10, 10) = ${p1.move(10, 10, 10)}
        |
        |""".stripMargin)


    val p4d1 = new Point4D(10, 10, 10, 10)
    val p4d2 = new Point4D(5, 5, 5, 5)
    println(
      s"""
         |p4d1 = $p4d1
         |p4d2 = $p4d2
         |p4d1 + p4d2 = ${p4d1 + p4d2}
         |p4d1 - p4d2 = ${p4d1 - p4d2}
         |p4d1 * p4d2 = ${p4d1 * p4d2}
         |p4d1 / p4d2 = ${p4d1 / p4d2}
         |p4d1.distance(p4d2) = ${p4d1.distance(p4d2)}
         |p4d1.move(10, 10, 10, 10) = ${p4d1.move(10, 10, 10, 10)}
         |
         |""".stripMargin)
  }

  private def executeComplexNumberExample(): Unit = {
    val cn1 = new ComplexNumber(10, 10)
    val cn2 = new ComplexNumber(5, 5)
    val cn3 = new ComplexNumber(10, 0)
    val cn4 = new ComplexNumber(0, 10)
    val cn5 = new ComplexNumber()
    val cn6 = new ComplexNumber(-10, -10)
    val cn7 = new ComplexNumber(-10, 0)
    val cn8 = new ComplexNumber(0, -10)
    println("<<executeComplexNumberExample>>")
    println(s"cn1 = $cn1")
    println(s"cn2 = $cn2")
    println(s"cn3 = $cn3")
    println(s"cn4 = $cn4")
    println(s"cn5 = $cn5")
    println(s"cn6 = $cn6")
    println(s"cn7 = $cn7")
    println(s"cn8 = $cn8")
    println(s"cn1 + cn2 = ${cn1 + cn2}")
    println(s"cn1 - cn2 = ${cn1 - cn2}")
    println(s"cn1 * cn2 = ${cn1 * cn2}")
    println(s"cn1 / cn2 = ${cn1 / cn2}")
    println()
  }

  private def executeBoxExample(): Unit = {
    val box1 = new Box(10, 10, 10)
    val box2 = new Box(5, 5, 5)
    val boxAdd = box1 + box2

    println("<<executeBoxExample>>")
    println(s"box1 = $box1")
    println(s"box2 = $box2")
    println(s"box1 + box2 = $boxAdd")
    println(s"box1 + box2 = ${box1 + box2}")
    println(s"box1 - box2 = ${box1 - box2}")
    println(s"box1 * box2 = ${box1 * box2}")
    println(s"box1 / box2 = ${box1 / box2}")
    println(s"box1 % box2 = ${box1 % box2}")
    println(s"box1 volume = ${box1.volume()}")
    println(s"box2 volume = ${box2.volume()}")
    println(s"box1 == box2 = ${box1 == box2}")
    println(s"box1 != box2 = ${box1 != box2}")
    println(s"box1 > box2 = ${box1 > box2}")
    println(s"box1 >= box2 = ${box1 >= box2}")
    println(s"box1 < box2 = ${box1 < box2}")
    println(s"box1 <= box2 = ${box1 <= box2}")
    println(s"-box1 = ${-box1}")
    println(s"+-box1 = ${+(-box1)}")
    println()

    box1.width = Random.nextDouble() * 100
    box1.length = Random.nextDouble() * 100
    box1.height = Random.nextDouble() * 100
    println(s"box1 = $box1")
    println()
  }
}
