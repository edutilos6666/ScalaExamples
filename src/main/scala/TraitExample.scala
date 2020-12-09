/**
 * created by  Nijat Aghayev on 09.12.20 
 */
class TraitExample {
  def execute(): Unit = {
    println("<<TraitExample>>")
    example1()
    println()
  }

  private def example1(): Unit = {
    val fileR = new CustomFileR
    val fileRW = new CustomFileRW
    val fileRWE = new CustomFileRWE

    println("<<fileR>>")
    println(s"fileR = ${fileR.getFlag()}")
    fileR.read()
    println()

    println("<<fileRW>>")
    println(s"fileRW = ${fileRW.getFlag()}")
    fileRW.read()
    fileRW.write()
    println()

    println("<<fileRWE>>")
    println(s"fileRWE = ${fileRWE.getFlag()}")
    fileRWE.read()
    fileRWE.write()
    fileRWE.execute()
    println()


  }

  private class CustomFileR extends Readable {
    private final val fileName: String = "CustomFileR"
    override def read(): Unit = {
      println(s"$fileName READ was executed.")
    }

    override def getFlag(): String = {
      "R"
    }
  }


  private class CustomFileRW extends Readable with Writable {
    private final val fileName: String = "CustomFileRW"
    override def read(): Unit = {
      println(s"$fileName READ was executed.")
    }

    override def getFlag(): String = {
      "RW"
    }

    override def write(): Unit = {
      println(s"$fileName WRITE was executed.")
    }

  }

  private class CustomFileRWE extends Readable with Writable with Executable  {
    private final val fileName: String = "CustomFileRWE"
    override def read(): Unit = {
      println(s"$fileName READ was executed.")
    }

    override def getFlag(): String =  {
      "RWE"
    }

    override def write(): Unit =  {
      println(s"$fileName WRITE was executed.")
    }


    override def execute(): Unit = {
      println(s"$fileName EXECUTE was executed.")
    }

  }




  private trait FileFlag {
    def getFlag(): String
  }

  private trait Readable extends FileFlag {
    def read(): Unit
  }

  private trait Writable extends FileFlag {
    def write(): Unit
  }

  private trait Executable extends FileFlag {
    def execute(): Unit
  }
}
