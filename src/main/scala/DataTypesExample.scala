/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class DataTypesExample {
  def execute(): Unit = {
    typeMinMax()
  }

  private def typeMinMax(): Unit = {
    val byteMinValue: Byte = Byte.MinValue
    val byteMaxValue: Byte = Byte.MaxValue
    val shortMinValue: Short = Short.MinValue
    val shortMaxValue = Short.MaxValue
    val intMinValue = Int.MinValue
    val intMaxValue = Int.MaxValue
    val longMinValue = Long.MinValue
    val longMaxValue = Long.MaxValue
    val floatMinValue = Float.MinValue
    val floatMinPositiveValue = Float.MinPositiveValue
    val floatMaxValue = Float.MaxValue
    val floatNaN = Float.NaN
    val floatNegativeInfinity = Float.NegativeInfinity
    val floatPositiveInfinity = Float.PositiveInfinity
    val doubleMinValue = Double.MinValue
    val doubleMinPositiveValue = Double.MinPositiveValue
    val doubleMaxValue = Double.MaxValue
    val doubleNaN = Double.NaN
    val doubleNegativeInfinity = Double.NegativeInfinity
    val doublePositiveInfinity = Double.PositiveInfinity


    println(
      s"""
        |<<typeMinMax>>
        |Byte.MinValue = $byteMinValue
        |Byte.MaxValue = $byteMaxValue
        |Short.MinValue = $shortMinValue
        |Short.MaxValue = $shortMaxValue
        |Int.MinValue = $intMinValue
        |Int.MaxValue = $intMaxValue
        |Long.MinValue = $longMinValue
        |Long.MaxValue = $longMaxValue
        |Float.MinValue = $floatMinValue
        |Float.MinPositiveValue = $floatMinPositiveValue
        |Float.MaxValue = $floatMaxValue
        |Float.NaN = $floatNaN
        |Float.NegativeInfinity = $floatNegativeInfinity
        |Float.PositiveInfinity = $floatPositiveInfinity
        |Double.MinValue = $doubleMinValue
        |Double.MinPositiveValue = $doubleMinPositiveValue
        |Double.MaxValue = $doubleMaxValue
        |Double.NaN = $doubleNaN
        |Double.NegativeInfinity = $doubleNegativeInfinity
        |Double.PositiveInfinity = $doublePositiveInfinity
        |
        |""".stripMargin)
  }
}
