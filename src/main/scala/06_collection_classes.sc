class Sport [A]{
  var players: List[A] = Nil
  var goals:Int = 0

  def score(player:A):Int = goals + 1
}

class Footballer(club: String){
  var name:String = ""
  var age:Int = 0
  var salary:Double = 0

  def setSalary (salary:Double):Unit = this.salary = salary
  def getSalary ():Double = this.salary
}

val footballer = new Footballer("1.FC Koeln")

val sport = new Sport[Footballer]
val goals = sport.score(footballer)
footballer.setSalary(200000)
val age = footballer.age = 27
footballer.name = "Bittencourt"
val footballplayers = List(footballer)

