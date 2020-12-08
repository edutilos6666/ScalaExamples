/**
 * created by  Nijat Aghayev on 08.12.20 
 */

import scala.collection.immutable.{TreeMap, TreeSet}
object Example1Object {
  def main(args: Array[String]): Unit = {
    val dataTypesExample = new DataTypesExample
    dataTypesExample.execute()

    val variablesExample = new VariablesExample
    variablesExample.execute()

    val classExample = new ClassExample
    classExample.execute()

    val operatorsExample = new OperatorExample
    operatorsExample.execute()

    val loopExample = new LoopExample
    loopExample.execute()

    val functionsExample = new FunctionsExample
    functionsExample.execute()

    val stringExample = new StringExample
    stringExample.execute()

    val arrayExample = new ArrayExample
    arrayExample.execute()

    val listExample = new ListExample
    listExample.execute()
  }
}
