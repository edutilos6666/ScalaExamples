/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class Point(var x: Double = 0, var y: Double = 0, var z: Double =  0) {

  def +(other: Point): Point = {
    val res = new Point()
    res.x = x + other.x
    res.y = y + other.y
    res.z = z + other.z
    res
  }

  def -(other: Point): Point = {
    val res = new Point()
    res.x = x - other.x
    res.y = y - other.y
    res.z = z - other.z
    res
  }

  def *(other: Point): Point = {
    val res = new Point()
    res.x = x * other.x
    res.y = y * other.y
    res.z = z * other.z
    res
  }

  def /(other: Point): Point = {
    val res = new Point()
    res.x = x / other.x
    res.y = y / other.y
    res.z = z / other.z
    res
  }

  def distance(other:Point): Double = {
    Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2) + Math.pow(z - other.z, 2))
  }

  def move(dx: Double, dy: Double, dz: Double): Point = {
    val res = new Point()
    res.x = x + dx
    res.y = y + dy
    res.z = z + dz
    res
  }

  override def toString: String = s"Point($x, $y, $z)"
}


class Point4D(var x1: Double = 0, var x2: Double = 0, var x3: Double = 0, var x4: Double = 0) extends
   Point(x1, x2, x3) {
   def +(other: Point4D): Point4D = {
     val temp: Point = super.+(other)
     val res:Point4D = new Point4D(temp.x, temp.y, temp.z)
     res.x4 = x4 + other.x4
     res
  }

  def -(other:Point4D): Point4D = {
    val temp: Point = super.-(other)
    val res: Point4D = new Point4D(temp.x, temp.y, temp.z)
    res.x4 = x4 - other.x4
    res
  }

  def *(other: Point4D): Point4D = {
    val temp: Point = super.*(other)
    val res: Point4D = new Point4D(temp.x, temp.y, temp.z)
    res.x4 = x4 * other.x4
    res
  }

  def /(other: Point4D): Point4D = {
    val temp: Point = super./(other)
    val res: Point4D = new Point4D(temp.x, temp.y, temp.z)
    res.x4 = x4 / other.x4
    res
  }

   def distance(other: Point4D): Double = {
    Math.sqrt(Math.pow(x1 - other.x1, 2) +
             Math.pow(x2 - other.x2, 2) +
    Math.pow(x3 - other.x3 , 2) +
    Math.pow(x4 - other.x4, 2))
  }

  def move(dx: Double, dy: Double, dz: Double, dw: Double): Point4D = {
    val temp = super.move(dx, dy, dz)
    new Point4D(temp.x, temp.y, temp.z, x4 + dw)
  }

  override def toString: String = s"Point4D($x1, $x2, $x3, $x4)"
}
