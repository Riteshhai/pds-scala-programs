//> using scala 3.8.4
//> using dep io.github.pityka::saddle-core:4.0.0-M14

import org.saddle._

object Main {
  def main(args: Array[String]): Unit = {

    // 1. Create a Series of student marks
    val marks = Series(
      "Alice" -> 85,
      "Bob" -> 75,
      "Charlie" -> 92
    )
    val ages = Series(
      "0" -> 20,
      "1" -> 22,
      "2" -> 21
    )

    // 2. Display the Series
    println("Student Marks:")
    println(marks)
    println("Student Ages:")
    println(ages)

    val agesOver20 = ages.filter(ages.mapValues(_ > 20))
    println("\nAges greater than 20:")
    println(agesOver20)

    // 3. Get Alice's marks
    println("\nMarks of Alice:")
    println(marks.getRaw("Alice"))

    // 4. Display all marks
    println("\nAll marks:")
    println(marks.values)

    // 5. Total marks
    println("\nTotal marks:")
    println(marks.sum)

    // 6. Average marks
    println("\nAverage marks:")
    println(marks.sum.toDouble / marks.length)

    // 7. Minimum marks
    println("\nMinimum marks:")
    println(marks.min)

    // 8. Maximum marks
    println("\nMaximum marks:")
    println(marks.max)

    val frame = Frame(
      "Marks" -> marks,
      "Age" -> ages
    )

    val salary = Series(
      "Alice" -> 50000,
      "Bob" -> 60000,
      "Charlie" -> 55000
    )
    println("\nDataFrame:")
    println(frame)

    val averageMarks = frame.col("Marks").mean
    println("\nAverage Marks from DataFrame:")
    println(averageMarks)

    val avgsalary = salary.toVec.contents.sum / salary.length
    println("\nAverage Salary:")
    println(avgsalary)

    
  }
}
