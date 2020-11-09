/* In Scala anything that is declared as an object cannot be instantiated.
* Below you can find an object that is used in the context of a keyword */
object HelloWorld {
  def main(args:Array[String]):Unit = {
    println("Hello " + args(0))
  }
}

HelloWorld.main(Array("Thomas"))

// The below code is not working
// val test = new HelloWorld()

// companion objects
class Animal(genre: String, name:String){
var age = 0

  def setAge(age:Int): Unit ={
    this.age = age
  }
  def getAge = this.age
  def getGenre = this.genre
  def getName = this.name
}

val myAnimal = new Animal("dog","Roxie");
print(myAnimal.getName)
/* The following is the way you will call methods through
the companion object (preferably with the same name
 */
object Animal{
  def main(args: Array[String]): Unit = {
    val animal:Animal = new Animal("dog", "Rambo")
    print (animal.getName)

  }
}
Animal.main(Array(""))