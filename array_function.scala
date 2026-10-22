import scala.io.StdIn

object PracticeProgram {
  
  // 1. Define your helper functions cleanly inside the object
  def calculateSum(numbers: Array[Int]): Int = {
    numbers.sum
  }

  def concatenateFruits(fruits: Array[String]): String = {
    fruits.mkString(", ")
  }

  def main(args: Array[String]): Unit = {
    
    // 2. Handle the numbers array properly
    val numbers = new Array[Int](5)
    println("Enter 5 numbers:")
    for (i <- 0 until 5) { // 0 until 5 loops from 0, 1, 2, 3, 4
      numbers(i) = StdIn.readInt() // Use variable 'i' instead of hardcoded '1'
    }

    // 3. Handle the fruits array properly
    val fruits = new Array[String](5) // Allocates space for 5 strings
    println("Enter 5 fruits:")
    for (i <- 0 until 5) {
      fruits(i) = StdIn.readLine() // Use variable 'i'
    }

    // 4. Output results
    println("\n--- Numbers Entered ---")
    numbers.foreach(println)
    val sum = calculateSum(numbers)
    println("Sum of numbers: " + sum)

    println("\n--- Fruits Entered ---")
    fruits.foreach(println)
    val concatenatedFruits = concatenateFruits(fruits)
    println("Concatenated fruits: " + concatenatedFruits)
  }
}