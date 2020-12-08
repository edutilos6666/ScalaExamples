/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class Box(var width: Double = 0, var length: Double = 0, var height: Double = 0) {
  def width_ = width
  def length_ = length
  def height_ = height


  def +(other: Box): Box = {
    val result = new Box
    result.width = this.width + other.width
    result.length = this.length + other.length
    result.height = this.height + other.height
    result
  }

  def -(other: Box): Box = {
    val result = new Box
    result.width = width - other.width
    result.length = length - other.length
    result.height = height - other.height
    result
  }

  def *(other:Box): Box = {
    val result = new Box
    result.width = width * other.width
    result.length = length * other.length
    result.height = height * other.height
    result
  }

  def /(other:Box): Box = {
    val result = new Box
    result.width = width / other.width
    result.length = length / other.length
    result.height = height / other.height
    result
  }

  def %(other: Box): Box = {
    val result = new Box
    result.width = width % other.width
    result.length = length % other.length
    result.height = height % other.height
    result
  }

  def volume(): Double = {
    width * length * height
  }


  def >(other: Box): Boolean = {
    volume() > other.volume()
  }

  def <(other: Box): Boolean = volume() < other.volume()
  def >=(other: Box): Boolean = volume() >= other.volume()
  def <=(other: Box): Boolean = volume() <= other.volume()
  def ==(other: Box): Boolean = volume() == other.volume()
  def !=(other: Box): Boolean = volume() != other.volume()

  def unary_+ : Box = {
    new Box(
      if(width > 0) width else -width,
      if(length > 0) length else -length,
      if(height > 0) height else -height
     )
  }

  def unary_- : Box = {
    new Box(
      if(width < 0) width else -width,
      if(length < 0) length else -length,
      if(height < 0) height else -height
    )
  }


  override def toString: String = s"Box($width, $length, $height)"
}
