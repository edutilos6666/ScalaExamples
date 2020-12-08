package com.edutilos.main;


object Example2 {
  def main(args:Array[String]): Unit = {
  println("hello world", "how are you")
    testShape()
  }




  def testShape(): Unit = {
    var (s1, s2, s3) = (new Triangle(10, 11, 12), new Rectangle(10, 20), new Circle(10))
    runShape(s1)
    runShape(s2)
    runShape(s3)
  }
  def runShape(shape:Shape): Unit = {
    println(shape.toString)
    println(s"Perimeter = ${shape.perimeter()}")
    println(s"Area = ${shape.area()}")
    println()
  }

  def testComplexNumber(): Unit = {
    var (cn1:ComplexNumber, cn2:ComplexNumber) = (new ComplexNumber(1,1), new ComplexNumber(2,2))
    var add:ComplexNumber = cn1 + cn2
    var subtract:ComplexNumber = cn1 - cn2
    var multiply:ComplexNumber = cn1 * cn2

    println(s"cn1 = ${cn1.toString}")
    println(s"cn2 = $cn2")
    println(s"add = $add")
    println(s"subtract = $subtract")
    println(s"multiply = $multiply")
  }

  def t2(): Unit = {
     val (x1:Double , x2:Double) = (10d , 3d)
    var add = StaticSimpleMath.add(x1, x2)
    var subtract = StaticSimpleMath.subtract(x1, x2)
    var multiply = StaticSimpleMath.multiply(x1, x2)
    var divide = StaticSimpleMath.divide(x1, x2)

    println(s"add = $add")
    println(s"subtract = $subtract")
    println(s"multiply = $multiply")
    println(s"divide = $divide")


    var ism = new InstanceSimpleMath
    add = ism.add(x1, x2)
    subtract = ism.subtract(x1, x2)
    multiply = ism.multiply(x1, x2)
    divide = ism.divide(x1, x2)
    println()
    println(s"add = $add")
    println(s"subtract = $subtract")
    println(s"multiply = $multiply")
    println(s"divide = $divide")
  }

  def t1(): Unit = {
    var (id:Long , name:String, age:Int, wage:Double, active:Boolean) = (1L, "foo", 10, 100.0, true)

    println(s"id = $id")
    println(s"name = $name")
    println(s"age = $age")
    println(s"wage = $wage")
    println(s"active = $active")
  }
}



class InstanceSimpleMath {
  def add(x1:Double , x2:Double):Double = {
    return x1 + x2
  }

  def subtract(x1:Double, x2:Double):Double = {
    return x1 - x2
  }

  def multiply(x1:Double, x2:Double):Double = {
    return x1 * x2
  }

  def divide(x1:Double, x2:Double):Double = x1 /x2
}

object StaticSimpleMath {
  def add(x1:Double , x2:Double):Double = {
    return x1 + x2
  }

  def subtract(x1:Double, x2:Double):Double = {
    return x1 - x2
  }

  def multiply(x1:Double, x2:Double):Double = {
    return x1 * x2
  }

  def divide(x1:Double , x2:Double):Double = {
    return x1 / x2
  }

}