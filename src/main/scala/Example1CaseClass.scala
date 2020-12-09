/**
 * created by  Nijat Aghayev on 08.12.20 
 */

class Example1CaseClass {

  def execute(): Unit = {
    example1()
  }

  private def example1(): Unit = {
    val p1 = new Person("foo", "bar")
    val p2  = new Person("foo", "bar")
    val p3 = new Person("FOO", "BAR")
    val p4 = new Person("pako", "deko")

    p1 match {
      case p3 => println(p3)
      case p4 => println(p4)
      case p2 => println(p2)
      case _ => println(s"could not find person: $p1")
    }
  }



}
private case class Person(fname: String, lname: String)
