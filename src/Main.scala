import scala.io.BufferedSource;

/**
 * @author Ermain
 * 
 */

object Main {
  /**
   * Main method for the application
   * @params args: arguments for the program to take
   */
  
  
   def main(args: Array[String]): Unit = {
       println("Hello, Worlds")
       println("Enter your name: ")
       val name:String = readLine()
       
       println("Enter your age: ")
       val age:Int = readInt()
       val nonApplicable:Unit = ()
        
       // 1. Create a tuple variable
       val t = (12, 87, "Score")
       // 2. Assign the values in the above tuple to the following variables
       val (a, b, c) = t
       
       // 3. Print the first element of the tuple
       println(t._1)
       
       // Create a single-line function using lambda expressions
       val square:Double => Double = x => x*x
       
       // ... or
       val twice: Double => Double = _*2
       
       // Also compare two values
       val lessThan: (Double, Double) => Boolean = _ < _
     
       println(s"${name} is ${age} years old")
   } 
}