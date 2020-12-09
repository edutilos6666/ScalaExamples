/**
 * created by  Nijat Aghayev on 09.12.20 
 */
class MapExample {
  def execute(): Unit = {
    println("<<MapExample>>")
    example1()
    println()
  }

  private def example1(): Unit = {
    var props: Map[String, String] = Map()
    props += ("id" -> "1")
    props += ("name"-> "foo")
    props += ("age" -> "10")
    props += ("wage"-> "100.0")
    props += ("active"-> "true")

    val propsKeys: Iterable[String] = props.keys
    val propsValues: Iterable[String] = props.values

    println(
      s"""<<example1>>
         |props = ${props.mkString("; ")}
         |propsKeys = ${propsKeys.mkString("; ")}
         |propsValues = ${propsValues.mkString("; ")}
         |
         |""".stripMargin)

  }
}
