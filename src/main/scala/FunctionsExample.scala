/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class FunctionsExample {
  def execute(): Unit = {
    println("<<FunctionsExample>>")
    varArgFunctionExample()
    functionWithDefaultParameterValuesExample()
    functionWithNamesArgumentsExample()
    recursiveFunctionExample()
    higherOrderFunctionExample()
    nestedFunctionExample()
    anonymousFunctionExample()
    partiallyAppliedFunctionExample()
    functionCurryingExample()
    println()
  }

  private def functionCurryingExample(): Unit = {
    println("<<functionCurryingExample()>>")
    def add (x: Double)(y: Double): Double= {
     x + y
    }

    def subtract (x: Double)(y: Double): Double = x - y
    def multiply (x: Double)(y: Double): Double = x * y
    def divide (x: Double)(y: Double): Double = x / y
    def modulo (x: Double)(y: Double): Double = x % y


    val (x, y) = (10.toDouble, 5.toDouble)
    println(s"$x + $x = ${add(x)(y)}")
    println(s"$x - $y = ${subtract(x)(y)}")
    println(s"$x * $y = ${multiply(x)(y)}")
    println(s"$x / $y = ${divide(x)(y)}")
    println(s"$x % $y = ${modulo(x)(y)}")
    println()

  }

  private def partiallyAppliedFunctionExample(): Unit = {
    println("<<partiallyAppliedFunctionExample()>>")
    val printProperties = (id: Long, name: String, age: Int, wage: Double, active: Boolean) => {
      println(
        s"""<<Properties>>
          |id = $id
          |name = $name
          |age = $age
          |wage = $wage
          |active = $active
          |
          |""".stripMargin)
    }


    val printPropertiesWithoutId =  printProperties(0L, _, _, _, _)
    val printPropertiesWithoutIdName = printProperties(0L, "", _, _, _)
    val printPropertiesWithoutIdNameAge = printProperties(0L, "", 0, _, _)
    val printPropertiesWithoutIdNameAgeWage = printProperties(0L, "", 0, 0.toDouble, _)

    printProperties(1L , "foo", 10, 100.0, true)
    printPropertiesWithoutId("foo", 10, 100.0, true)
    printPropertiesWithoutIdName(10, 100.0, true)
    printPropertiesWithoutIdNameAge(100.0, true)
    printPropertiesWithoutIdNameAgeWage(true)


    println()
  }

  private def anonymousFunctionExample(): Unit = {
    println("<<anonymousFunctionExample()>>")
    val add = (x: Double, y: Double)=> x + y
    val subtract = (x: Double, y: Double)=> x - y
    val multiply = (x: Double, y: Double)=> x * y
    val divide = (x: Double, y: Double)=> x / y
    val modulo = (x: Double, y: Double)=> x % y
    val mathOperation = (x: Double, y: Double, opSign: String, op: (Double, Double)=> Double)=> {
      println(s"$x $opSign $y = ${op(x, y)}")
    }
    val (x,y) = (10.toDouble, 3.toDouble)
    mathOperation(x, y, "+", add)
    mathOperation(x, y, "-", subtract)
    mathOperation(x, y, "*", multiply)
    mathOperation(x, y, "/", divide)
    mathOperation(x, y, "%", modulo)
    println()
  }


  private def nestedFunctionExample(): Unit = {
    println("<<nestedFunctionExample()>>")
    def add(x: Double, y: Double): Double = x + y
    def subtract(x: Double, y: Double): Double = x - y
    def multiply(x: Double, y: Double): Double = x * y
    def divide(x: Double, y: Double): Double = x / y
    def modulo(x: Double, y: Double): Double = x % y
    def mathOperation (x: Double, y: Double, opSign: String, op: (Double, Double)=> Double) {
      println(s"$x $opSign $y = ${op(x,y)}")
    }
    val (x, y) = (10.toDouble, 5.toDouble)
    mathOperation(x, y, "+", add)
    mathOperation(x, y, "-", subtract)
    mathOperation(x, y, "*", multiply)
    mathOperation(x, y, "/", divide)
    mathOperation(x, y, "%", modulo)
    println()
  }


  private def higherOrderFunctionExample() = {
    println("<<higherOrderFunctionExample>>")

    def mathOperation( x: Double, y: Double, opSign: String, fn: (Double, Double)=> Double): Unit = {
      println(s"$x $opSign $y = ${fn(x,y)}")
    }

    val (x, y) = (10.toDouble, 4.toDouble)
    mathOperation(x, y, "+", add)
    mathOperation(x, y, "-", subtract)
    mathOperation(x, y, "*", multiply)
    mathOperation(x, y, "/", divide)
    mathOperation(x, y, "%", modulo)
    println()
  }



  private def add(x: Double, y: Double): Double = {
    x + y
  }

  private def subtract(x: Double, y: Double): Double = {
    x - y
  }

  private def multiply(x: Double, y: Double): Double = {
    x * y
  }

  private def divide(x: Double, y: Double): Double = {
    x / y
  }
  private def modulo(x: Double, y: Double): Double = {
    x % y
  }

  private def recursiveFunctionExample(): Unit = {
    println("recursiveFunctionExample()>>")
    var i = 0
    for(i <- 1 to 10) {
      print(s"$i! = ${factorial(i)}; ")
    }
    println()
    println("<<fibonacci>>")
    for(i <- 1 to 10) {
      print(s"${fibonacci(i)}; ")
    }
    println()
  }


  private def fibonacci(n: BigInt): BigInt = {
    if(n <= 1) n
    else fibonacci(n - 1) + fibonacci(n -2)
  }

  private def factorial(n: BigInt): BigInt = {
    if(n <= 1) 1
    else n * factorial(n-1)
  }

  private def functionWithNamesArgumentsExample(): Unit = {
    println("<<functionWithNamesArgumentsExample()>>")
    addNumbers(n2 = 100, n1 = 123)
    addNumbers(n1 = 12, n2 = 21)
    println()
  }

  private def functionWithDefaultParameterValuesExample(): Unit = {
    println("<<functionWithDefaultParameterValuesExample()>>")
    addNumbers()
    addNumbers(100)
    addNumbers(100, 200)
    println()
  }

  private def addNumbers(n1: Double = 10, n2: Double = 5): Unit = {
    println(s"$n1 + $n2 = ${n1 + n2}")
  }

  private def varArgFunctionExample(): Unit = {
    println("<<varArgFunctionExample()>>")
    printNames("foo", "bar")
    printNames("foo", "bar", "bim")
    printNames("foo", "bar", "bim", "pako")
    println()
  }

  private def printNames(names: String*): Unit = {
    println(names.mkString("; "))
  }
}
