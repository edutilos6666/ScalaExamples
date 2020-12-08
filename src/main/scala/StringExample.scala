import java.util.Locale

/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class StringExample {
  def execute(): Unit = {
    println("<<StringExample>>")
    example1()
    println()
  }

  private def example1(): Unit = {
    val (s1, s2, s3, s4) = ("foo", "bar", "Foo", "foo".toUpperCase(Locale.GERMANY))

    println(
      s"""<<example1()>>
        |s1 = $s1
        |s2 = $s2
        |s3 = $s3
        |s4 = $s4
        |s1.compareTo(s2) = ${s1.compareTo(s2)}
        |s1.compareTo(s3) = ${s1.compareTo(s3)}
        |s1.compareToIgnoreCase(s3) = ${s1.compareToIgnoreCase(s3)}
        |s1.contentEquals(s3) = ${s1.contentEquals(s3)}
        |s1.startsWith("f") = ${s1.startsWith("f")}
        |s1.endsWith("o") = ${s1.endsWith("o")}
        |s1.contains("b") = ${s1.contains("b")}
        |s1.toUpperCase() = ${s1.toUpperCase()}
        |s3.toLowerCase() = ${s3.toLowerCase}
        |
        |""".stripMargin)
  }
}
