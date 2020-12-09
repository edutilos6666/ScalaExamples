/**
 * created by  Nijat Aghayev on 09.12.20 
 */
class SetExample {
  def execute(): Unit = {
    println("<<SetExample>>")
    example1()
    example2()
    println()
  }


  private def example2(): Unit = {
    val set: Set[Int] = Set(10, 11, 12, 15, 23, 24)
    val allNumbersAreEven = set.forall(el => el %2 == 0)
    val allNumbersAreOdd = set.forall(el => el % 2 != 0)
    val containsEvenNumber = set.exists(el => el % 2 == 0)
    val containsOddNumber = set.exists(el => el % 2 != 0)
    val evenNumberOption:  Option[Int] =  set.find(el => el % 2 == 0)
    val oddNumberOption: Option[Int] = set.find(el=> el % 2 != 0)
    val evenNumbers: Set[Int] = set.filter(el => el % 2 == 0)
    val oddNumbers = set.filter(el => el % 2 != 0)

    println("<<example2>>")
    set.foreach(el=> print(s"$el; "))
    println()
    println(
      s"""
         |set = ${set.mkString("; ")}
         |allNumbersAreEven = $allNumbersAreEven
         |allNumbersAreOdd = $allNumbersAreOdd
         |containsEvenNumber = $containsEvenNumber
         |containsOddNumber = $containsOddNumber
         |evenNumberOption = ${evenNumberOption.getOrElse(0)}
         |oddNumberOption = ${oddNumberOption.getOrElse(0)}
         |evenNumbers = ${evenNumbers.mkString("; ")}
         |oddNumbers = ${oddNumbers.mkString("; ")}
         |
         |""".stripMargin)
  }

  private def example1(): Unit = {
    val set1: Set[Int] = Set(10, 20, 30, 40, 50)
    val set2: Set[Int] = Set(30, 40, 50, 60, 70, 80)

    val setIntersect: Set[Int] = set1.intersect(set2)
    val set1DiffSet2: Set[Int] = set1.diff(set2)
    val set2DiffSet1: Set[Int] = set2.diff(set1)

    val set1Min: Int = set1.min
    val set1Max: Int = set1.max
    val set1Head: Int = set1.head
    val set1Tail: Set[Int] = set1.tail
    val set1Last: Int = set1.last
    val set1Size: Int = set1.size


    println(
      s"""<<example1>>
         |set1 = ${set1.mkString("; ")}
         |set2 = ${set2.mkString("; ")}
         |set1.intersect(set2) = ${setIntersect.mkString("; ")}
         |set1.diff(set2) = ${set1DiffSet2}
         |set2.diff(set1) = ${set2DiffSet1}
         |set1.min = $set1Min
         |set1.max = $set1Max
         |set1.head = $set1Head
         |set1.tail = ${set1Tail.mkString("; ")}
         |set1.last = $set1Last
         |set1.size = $set1Size
         |
         |""".stripMargin)
  }
}
