import scala.io.StdIn
import scala.util.Random

/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class VariablesExample {
  def execute(): Unit = {
    println("<<VariablesExample>>")
    example1()
    example2()
//    example3()
    println()
  }


  private def example3(): Unit = {
    print("Enter your id: ")
    val id = StdIn.readLong()
    print("Enter your name: ")
    val name = StdIn.readLine()
    print("Enter your age: ")
    val age = StdIn.readInt()
    print("Enter your wage: ")
    val wage = StdIn.readDouble()
    print("Enter your active: ")
    val active = StdIn.readBoolean()
    println(
      s"""<<example3>>
         |id = $id
         |name = $name
         |age = $age
         |wage = $wage
         |active = $active
         |
         |""".stripMargin)
  }

  private def example2(): Unit = {
    println("<<example2>>")
    var randomNumber = Random.nextInt()
    println(s"randomNumber = $randomNumber")
    randomNumber = Random.nextInt()
    println(s"randomNumber = $randomNumber")
    randomNumber = Random.nextInt(100)
    println(s"randomNumber = $randomNumber")
    randomNumber = Random.nextInt(100)
    println(s"randomNumber = $randomNumber")
    println()
  }

  private def example1(): Unit = {
    val id: Long = 1L
    val name: String = "foobar"
    val age: Int = 10
    val wage: Double = 100.0
    val active: Boolean = true

    println("<<example1>>")
    println(s"id = $id")
    println(s"name = $name")
    println(s"age = $age")
    println(s"wage = $wage")
    println(s"active = $active")

    println("\n<<or>>")
    println(
      s"""
        |id = $id
        |name = $name
        |age = $age
        |wage = $wage
        |active = $active
        |
        |""".stripMargin)
  }
}
