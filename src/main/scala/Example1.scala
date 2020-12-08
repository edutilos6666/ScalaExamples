import scala.collection.mutable

object Example {
  def main(args:Array[String]): Unit = {
    println("Hello world")
    testPersonDAO
  }


  def testPersonDAO: Unit = {
    var dao:PersonDAO = new PersonDAOImpl
    dao.save(new Person(1, "foo", 10 , 100.0, true))
    dao.save(new Person(2, "bar", 20 , 200.0, false))
    var all = dao.findAll()
    all.foreach(p => {
      println(p.toString)
    })


    var first:Person = dao.findById(1L)
    println(s"first Person = ${first.toString}")

    dao.update(1, new Person(1, "new_foo", 66, 666.6, false))
    first = dao.findById(1L)
    println(s"first Person after update = ${first.toString}")
    dao.remove(1L)
    all = dao.findAll()
    println(s"all people after remove = ${all.size}")
  }

  def testPerson:Unit = {
      var p1 = new Person(1, "foo", 10 , 100.0, true)
    var p2 = new Person(2, "bar", 20 , 200.0, false)

    println(s"person1 = ${p1.toString}")
    println(s"person2 = ${p2.toString}")
  }
}


trait PersonDAO {
  def save(person:Person): Unit
  def update(id:Long, newP:Person):Unit
  def remove(id:Long):Unit
  def findById(id:Long):Person
  def findAll():List[Person]
}

class PersonDAOImpl extends PersonDAO {
  private var container:Map[Long , Person] = Map()

  override def save(person: Person): Unit = {
    container += (person.getId()  -> person)
  }

  override def update(id: Long, newP: Person): Unit =  {
    container -= id
    container += (id -> newP)
  }

  override def remove(id: Long): Unit =  {
    container -= id
  }

  override def findById(id: Long): Person =  {
    return container(id)
  }

  override def findAll(): List[Person] = {
     var values = container.values
      var ret:List[Person] = List()
    values.foreach(p => {
         ret = p::ret
    })

    return ret
  }
}


class Person($id:Long , $name:String , $age:Int, $wage:Double , $active:Boolean) {
   var id = $id
   var name = $name
  var age = $age
  var wage = $wage
  var active = $active


  def setId($id:Long):Unit = {
    id = $id
  }

   def getId():Long = {
    return id
  }


  def setName($name:String): Unit = {
    name = $name
  }

  def getName:String = {
    return name
  }

  def setAge($age:Int): Unit = {
    age = $age
  }

  def getAge:Int = {
    return age
  }

  def setWage($wage:Double):Unit = {
    wage = $wage
  }

  def getWage:Double = {
    return wage
  }

  def setActive($active:Boolean): Unit = {
    active = $active
  }

  def isActive:Boolean = {
    return active
  }

  override def toString: String = {
    return  s"$id,$name,$age,$wage,$active"
  }
}