/**
 * created by  Nijat Aghayev on 08.12.20 
 */
class ListExample {
  def execute(): Unit = {
    println("<<ListExample>>")
    example1()
    println()
  }

  private def example1(): Unit = {
    val list1 = List("foo", "bar", "bim")
    val list2 = "pako":: "deko" :: Nil
    val listConcat = list1 ::: list2
    val listConcat2 = list1.concat(list2)

    val list1Modified: List[String] = list1.appended("post").prepended("pre")

    println(s"list1 = ${list1.mkString("; ")}")
    println(s"list2 = ${list2.mkString("; ")}")
    println(s"listConcat = $listConcat")
    println(s"listConcat2 = $listConcat2")
    println(s"list1Modified = $list1Modified")
    println(s"list1Modified.head = ${list1Modified.head}")
    println(s"list1Modified.tail = ${list1Modified.tail}")
    println(s"list1Modified.last = ${list1Modified.last}")
    println(s"list1Modified.reverse = ${list1Modified.reverse}")
    println(s"list1Modified.sorted = ${list1Modified.sorted}")
    println(s"list1Modified.length = ${list1Modified.length}")
    println(s"list1Modified.drop(2) = ${list1Modified.drop(2)}")
    println(s"list1Modified.dropRight(2) = ${list1Modified.dropRight(2)}")
    println(s"list1Modified.dropWhile() = ${list1Modified.dropWhile(el => el.length == 3)}")
    println(s"list1Modified.take(2) = ${list1Modified.take(2)}")
    println(s"list1Modified.takeRight(2) = ${list1Modified.takeRight(2)}")
    println(s"list1Modified.takeWhile() = ${list1Modified.takeWhile(el => el.length == 3)}")
    println(s"list1Modified.startsWith(pre) = ${list1Modified.startsWith("pre")}")
    println(s"list1Modified.endsWith(post) = ${list1Modified.endsWith("post")}")
    println(s"list1Modified.exists(foo) = ${list1Modified.exists(el => el.contentEquals("foo"))}")
    println(s"list1Modified.exists(length == 3) = ${list1Modified.exists(el => el.length == 3)}")
    println(s"list1Modified.filter(length == 3) = ${list1Modified.filter(el => el.length == 3)}")
    println(s"list1Modified.forall(length == 3) = ${list1Modified.forall(el => el.length == 3)}")

    println("<<foreach()>>")
    list1Modified.foreach(el => println(s"el = $el"))
    println()
  }
}
