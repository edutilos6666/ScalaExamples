/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class ComplexNumber(var re: Double = 0, var im: Double = 0) {
  def +(other: ComplexNumber): ComplexNumber = {
    val res = new ComplexNumber()
    res.re = re + other.re
    res.im = im + other.im
    res
  }

  def -(other: ComplexNumber): ComplexNumber = {
    val res = new ComplexNumber()
    res.re = re - other.re
    res.im = im - other.im
    res
  }

  def *(other: ComplexNumber): ComplexNumber = {
    val res = new ComplexNumber()
    res.re = re*other.re - im*other.im
    res.im = re*other.im + im*other.re
    res
  }

  def /(other: ComplexNumber): ComplexNumber = {
    val res = this * new ComplexNumber(other.re, -other.im)
    res.re = res.re / (Math.pow(other.re, 2) + Math.pow(other.im, 2))
    res.im = res.im / (Math.pow(other.re, 2) + Math.pow(other.im, 2))
    res
  }



  override def toString: String = {
    val builder = new StringBuilder
    if(re > 0) builder ++= re.toString
    else if(re < 0) builder ++= "( " ++ re.toString ++ " )"
    if(re != 0 && im != 0) builder ++= " + "

    if(im > 0) builder ++= im.toString
    else if(im < 0) builder ++= "( " ++ im.toString ++ " )"
    if(im != 0) builder ++= " * i"

    builder.toString()
  }
}
