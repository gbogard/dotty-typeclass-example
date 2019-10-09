package example

// We define the methods of our type class
trait Inversible[T] {
  def (input: T) inverse: T 
}

object Inversible {

  // And add members to the type class by implementing the methods for each type using "given instances"
  given stringInversible: Inversible[String] {

    def (input: String) inverse: String = input.reverse

  }

  given ratioInversible: Inversible[Ratio] {
    
    def (input: Ratio) inverse: Ratio = Ratio(input.denominator, input.numerator)

  } 

}