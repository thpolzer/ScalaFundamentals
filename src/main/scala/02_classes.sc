/* Constructing a rational*/
/* In contrast to Java there are no separate constructors in Scala.
The classes can take parameters directly.
 */

class Rational (n: Int, d: Int){
  /* requires a precondition (=constraint)  on values passed
  into a method or a constructor */
  require(d != 0)

  // auxiliary constructors
  // they always start with def this (...)
  def this (n:Int) = this(n,1)
  def this (n:Int,d:Int,s:Int) = this(n,d)
  def this () = this (1,3)


  //println("Created: " + n+ "/" + d)
  // toString gets invoked automatically
  override def toString = n+ "/" + d



  // fields
  val numer:Int = n
  val denom:Int = d

  def add (that: Rational):Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  /* implicit functions can convert a parameter into the required
  datatype.
  The implicit modifier in front of the method tells the compiler to
  apply it automatically in a number of situation.
   */
  implicit def intToRational (a:Int) = new Rational(a)


}

val rational1 = new Rational(2,3)
rational1.add(new Rational(4,5))
rational1 add (new Rational(2,7))

val rational2 = new Rational(6)
val rational3 = new Rational(6,5,4)

val mynumer = rational1.numer

val addition = rational1.add(rational2)

val rational4 = new Rational()