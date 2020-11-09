/*
One way to use a Scala trait is like the original Java interface, where you define the desired
interface for some piece of functionality, but you don’t implement any behavior.
 */
trait Animal{
  def setName(name:String):Unit
  def getName (): String
}

class Dog extends Animal{
var name:String = "Ben"
  def setName(name:String):Unit = this.name = name
  def getName():String = this.name
}

val dog = new Dog()
dog.setName("Rambo")
print(dog.getName())

/*
You can also add real, working methods to them and use them
like abstract classes, or more accurately, as mixins.
 */
trait Animal1{
  def printExample = println("Anton")
}

class Dog1 extends Animal with Animal1{
  var name:String = "Ben"
  def setName(name:String):Unit = this.name = name
  def getName():String = this.name
}

val dog1 = new Dog1
dog1.printExample