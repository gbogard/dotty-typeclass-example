/**
  - To learn more on given instances in Dotty : https://dotty.epfl.ch/docs/reference/contextual/delegates.html
  - To learn more on extension methods : https://dotty.epfl.ch/docs/reference/contextual/extension-methods.html
  - To read my blog post on type classes : https://guillaumebogard.dev/posts/typeclasses/ 
**/

package example

// We need to explicitly import the "given instances" from our Inversible type class
import Inversible.given

object Main {

  def main(args: Array[String]): Unit = {
    val r = Ratio(10, 45)
    val s = "Hello World!"

   // Then we can use our `reverse` extension method using an infix dot notation,
   // without the need for implicit classes

    val reversedR = r.inverse

    val reversedS = s.inverse



    println(
      s"""
      | String : $s
      | Ratio : $r
      | Reversed String : $reversedS
      | Reversed Ratio : $reversedR
      """.stripMargin
    )
  }

}
