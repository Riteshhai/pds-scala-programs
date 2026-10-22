object PracticeProgram {
  def main(args: Array[String]): Unit = {

    val numbers = Array(2, 5, 9, 14, 20)

    def calculateSum(numbers: Array[Int]): Int = {
      numbers.sum
    }

    val fruits = Array("Apple", "Banana", "Mango", "Orange", "Grapes")
    def concatenateFruits(fruits: Array[String]): String = {
      fruits.mkString(", ")
    }

    numbers.foreach(println)
    val sum = calculateSum(numbers)
    println("Sum of numbers: " + sum)

    fruits.foreach(println)
    val concatenatedFruits = concatenateFruits(fruits)
    println("Concatenated fruits: " + concatenatedFruits)

  }
}
