object PracticeProgram {
  def main(args: Array[String]): Unit = {

    val primeNumbers = List(2, 3, 5, 7, 11)
    println("Prime Numbers: " + primeNumbers.mkString(", "))

    def squareList(numbers: List[Int]): List[Int] = {
      numbers.map(x => x * x)
    }
    val char_array = "HELLO WORLD".toSet
    println("Unique Characters: " + char_array.mkString(", "))
    val set2 = Set('H', 'e', 'l', 'o', 'p')

    val commonChars = char_array.intersect(set2)
    println("Common Characters: " + commonChars.mkString(", "))

    def findIntersection(set1: Set[Char], set2: Set[Char]): Set[Char] = {
      set1.intersect(set2)
    }
    println(
      "Intersection of Sets: " + findIntersection(char_array, set2).mkString(
        ", "
      )
    )

    val squaredNumbers = squareList(primeNumbers)
    println("Squared Numbers: " + squaredNumbers.mkString(", "))

    val studentInfo = (20, "scala", true)
    println(
      "Student Info: " + studentInfo._1 + ", " + studentInfo._2 + ", " + studentInfo._3
    )
  }
}
