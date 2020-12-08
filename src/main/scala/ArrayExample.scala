import scala.util.Random

/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class ArrayExample {
  def execute(): Unit = {
    println("<<ArrayExample>>")
    exampleOneDimensional()
    exampleTwoDimensional()
    println()
  }


  private def exampleTwoDimensional(): Unit = {
    val numbersArray2D1: Array[Array[Int]] = new Array(10)
    for(i <- numbersArray2D1.indices) {
      numbersArray2D1(i) = Array(Random.nextInt(100), Random.nextInt(100), Random.nextInt(100), Random.nextInt(100), Random.nextInt(100))
    }

    val numbersArray2DOfDim: Array[Array[Int]] = Array.ofDim(5, 5)
    for(i <- numbersArray2DOfDim.indices; j <- numbersArray2DOfDim(i).indices) {
      numbersArray2DOfDim(i)(j) = Random.nextInt(100)
    }

    val numbersArray2DFill: Array[Array[Int]] = Array.fill(5, 5) { 10 }

    val numbersArray2DTabulate: Array[Array[Int]] = Array.tabulate(5, 5) { (i, j)=> i*j }

    printNumberArray[Int]("numbersArray2D1", numbersArray2D1)
    printNumberArray("numbersArray2DOfDim", numbersArray2DOfDim)
    printNumberArray("numbersArray2DFill", numbersArray2DFill)
    printNumberArray("numbersArray2DTabulate", numbersArray2DTabulate)

    println()
  }

  private def printNumberArray[A](title: String, arr: Array[Array[A]]): Unit = {
    println(s"<<$title>>")
    for(i <- arr.indices; j <- arr(i).indices) {
      if(i != 0 && j == 0) println()
      print(s"${arr(i)(j)}; ")
    }
    println()
  }


  private def exampleOneDimensional(): Unit = {
    val numberArray1: Array[Int] = new Array[Int](10)
    val numberArray2: Array[Int] = new Array[Int](10)
    val numberArray3: Array[Int] = Array(Random.nextInt(100), Random.nextInt(100), Random.nextInt(100), Random.nextInt(100), Random.nextInt(100))

    for(i <- 0 until numberArray1.length) {
      numberArray1(i) = Random.nextInt(100)
    }

    for(i <- numberArray2.indices) {
      numberArray2(i) = Random.nextInt(100)
    }


    val numberArrayIterate: Array[Int] = Array.iterate(0, 10) { i => i*i}
    val numberArrayFill: Array[Int] = Array.fill(10) {10}
    val numberArrayOfDim: Array[Int] = Array.ofDim(10)
    for(i <- numberArrayOfDim.indices) {
      numberArrayOfDim(i) = Random.nextInt(100)
    }
    val numberArrayRange: Array[Int] = Array.range(0, 10)
    val numberArrayRangeWithStep: Array[Int] = Array.range(0, 10, 2)
    val numberArrayTabulate: Array[Int] = Array.tabulate(10) { i => i*i*i}


    printNumberArray[Int]("numberArray1", numberArray1, true)
    printNumberArray("numberArray2", numberArray2)
    printNumberArray("numberArray3", numberArray3)
    printNumberArray("numberArrayIterate", numberArrayIterate)
    printNumberArray("numberArrayFill", numberArrayFill)
    printNumberArray("numberArrayOfDim", numberArrayOfDim)
    printNumberArray("numberArrayRange", numberArrayRange)
    printNumberArray("numberArrayRangeWithStep", numberArrayRangeWithStep)
    printNumberArray("numberArrayTabulate", numberArrayTabulate)
    println()
  }

  private def printNumberArray[A](title: String = "", arr: Array[A], twoTimes: Boolean = false): Unit = {
    print(s"$title = ")
    for(i <- arr.indices) {
      print(s"${arr(i)}; ")
    }
    if(!twoTimes) println()
    if(twoTimes) {
      println(s"${System.lineSeparator()}<<Or>>")
      println(arr.mkString("; "))
    }
  }
}
