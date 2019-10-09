/**
  - To learn more on given instances in Dotty : https://dotty.epfl.ch/docs/reference/contextual/delegates.html
  - To learn more on extension methods : https://dotty.epfl.ch/docs/reference/contextual/extension-methods.html
  - To read my blog post on type classes : https://guillaumebogard.dev/posts/typeclasses/ 
**/

package example

// We need to explicitly import the "given instances" from our Inversible type class
import Inversible.given

object Main {

  // We can use a context bound to tell the compiler that the `A` expect must be a member of the Inversible type class
  // Then we can use our extension method without the need for an implicit class
  def printInverse[A: Inversible](input: A): Unit = println(s"The inverse of $input is ${input.inverse}")

  def main(args: Array[String]): Unit = {
    val r = Ratio(10, 45)
    val s = "Hello World!"
    
    printInverse(s)
    printInverse(r)
  }

}
