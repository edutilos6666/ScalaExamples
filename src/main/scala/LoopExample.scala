import scala.util.Random
import scala.util.control.Breaks

/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class LoopExample {
  def execute(): Unit = {
    println("<<LoopExample>>")
    forLoopExample()
    whileLoopExample()
    doWhileLoopExample()
    breakExample()
    println()
  }


  private def breakExample(): Unit = {
    val loop = new Breaks
    val loop2 = new Breaks
    val loop3 = new Breaks
    println("<<break example>>")
    var i = 10
    loop.breakable {

      do {
        if (i >= 20) loop.break()
        print(s"$i; ")
        i += 1
      } while (i < 100)

    }
    println()

    loop2.breakable {
      i = 10
      while (i < 100) {
        if (i >= 20) loop2.break()
        print(s"$i; ")
        i += 1
      }

    }
    println()

    loop3.breakable {
      i = 0
      for (i <- 1 to 100 if (i % 2 != 0); if (i % 3 != 0)) {
        if (i >= 20) loop3.break()
        print(s"$i; ")
      }

    }
    println()
  }

  private def doWhileLoopExample(): Unit = {
    println("<<Do-While Loop>>")
    var i = 10
    do {
      print(s"$i; ")
      i += 1
    } while( i <  20)
    println()
  }

  private def whileLoopExample(): Unit = {
    println("<<While Loop>>")
    var i = 10
    while ( i < 20) {
      print(s"$i; ")
      i += 1
    }
    println()
  }


  private def forLoopExample(): Unit = {
    println("<<For Loop>>")
    var i = 0
    for( i <- 1 to 10) {
      print(s"$i; ")
    }
    println()
    i = 0
    for ( i <- 1 until 10) {
      print(s"$i; ")
    }
    println()
    i = 0
    for( i <- List(Random.nextInt(100), Random.nextInt(100), Random.nextInt(100), Random.nextInt(100), Random.nextInt(100),
      Random.nextInt(100), Random.nextInt(100), Random.nextInt(100), Random.nextInt(100))) {
      print(s"$i; ")
    }
    println()

    i = 0
    var j = 0
    for(i <- 1 to 10; j <- 1 to 10) {
      if(i != 1 && j == 1) println()
      print(s"$j * $i = ${i * j}\t\t\t")
    }
    println()

    i = 0
    val numbers = 1 to 100
    for( i <- numbers
         if(i % 2 == 0); if(i <= 40)) {
      print(s"$i; ")
    }
    println()
    i = 0
    val evenNumbers =  for{ i <- numbers
                            if(i % 2 == 0); if(i <= 40) } yield i

    i = 0
    val oddNumbers = for { i <- numbers  if(i % 2 == 1); if ( i <= 40)} yield i

    println(s"evenNumbers = ${evenNumbers.mkString("; ")}")
    println(s"oddNumbers = ${oddNumbers.mkString("; ")}")
  }
}
