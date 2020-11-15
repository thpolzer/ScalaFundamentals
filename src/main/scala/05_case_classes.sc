/*
Case classes allow pattern matching on objects without requiring a large
amount of boilerplate code
Case classes need the modifier "case"
 */
abstract class Notification
case class Email(sender: String, title: String, body: String) extends Notification
case class SMS(caller: String, message: String) extends Notification
case class VoiceRecording(contactName: String, link: String) extends Notification

/*
Notification is an abstract super class which has three concrete Notification types
implemented with case classes Email, SMS, and VoiceRecording. Now we can
do pattern matching on these case classes:
 */

def showNotification(notification: Notification): String = {
  notification match {
    case Email(sender, title, _) =>
      s"You got an email from $sender with title: $title"
    case SMS(number, message) =>
      s"You got an SMS from $number! Message: $message"
    case VoiceRecording(name, link) =>
      s"You received a Voice Recording from $name! Click the link to hear it: $link"
  }
}
val someSms = SMS("12345", "Are you there?")
val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")

println(showNotification(someSms))  // prints You got an SMS from 12345! Message: Are you there?
println(showNotification(someVoiceRecording))  // prints You received a Voice Recording
// from Tom! Click the link to hear it: voicerecording.org/id/123

/*
The function showNotification takes as a parameter the abstract type
Notification and matches on the type of Notification (i.e. it figures out whether
it’s an Email, SMS, or VoiceRecording). In the case Email(sender, title, _) the
fields sender and title are used in the return value but the body field
is ignored with _.
 */


/*
Traits and classes can be marked sealed which means all subtypes
must be declared in the same file. This assures that all subtypes are known.
 */
sealed abstract class Furniture
case class Couch() extends Furniture
case class Chair() extends Furniture

def findPlaceToSit(piece: Furniture): String = piece match {
  case a: Couch => "Lie on the couch"
  case b: Chair => "Sit on the chair"
}

/*
This is useful for pattern matching because we don’t need a “catch all” case.
 */

val couch = new Couch()
print(findPlaceToSit(couch))


// another example
abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
