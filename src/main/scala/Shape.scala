package com.edutilos.main

/**
  * Created by edutilos on 21.06.17.
  */
abstract class Shape {
    def perimeter():Double
  def area():Double
}

class Triangle(val $a:Double , val $b:Double, val $c:Double)
 extends Shape {
  private var (a, b, c) = ($a, $b, $c)

  override  def perimeter(): Double = {
     return (a+b+c)
  }

  override def area(): Double =  {
    var S = perimeter()/2
    var prod = S*(S-a)*(S-b)*(S-c)
    // println(s"prod = $prod")
    return Math.sqrt(prod)
  }


  def getA():Double = a
  def getB():Double = b
  def getC():Double = c

  def setA($a:Double) = a = $a
  def setB($b:Double) = b = $b
  def setC($c:Double) = c = $c

  override def toString: String = s"Triangle($a,$b,$c)"
}


class Rectangle(val $a:Double , val $b:Double) extends Shape {

  private var (a, b) = ($a, $b)

  override def perimeter(): Double = 2*(a+b)

  override def area(): Double = a*b

  def getA():Double = a
  def getB():Double = b

  def setA($a:Double) = a = $a
  def setB($b:Double) = b = $b

  override def toString: String = s"Rectangle($a,$b)"
}

class Circle(val $r:Double) extends Shape {
   private var r = $r

  override def perimeter(): Double = 2*Math.PI* r
  override def area():Double = Math.PI* Math.pow(r, 2)

  def getR():Double = r
  def setR($r:Double) = r = $r

  override def toString: String = s"Circle($r)"
}


