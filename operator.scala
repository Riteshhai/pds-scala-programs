import scala.io.StdIn

object Calculator {
  def main(args: Array[String]): Unit = {

// println("Enter your name and department")
// val num1 = StdIn.readInt()
// val num2 = StdIn.readInt()
// println(num1+num2)
// val age = StdIn.readInt()
// val ans = age>=18
// println(age)
// println(ans)

// println("Enter first number")
// val num1 = StdIn.readInt()
// println("Enter second number")
// val num2 = StdIn.readInt()
// println("Sum is: " + (num1 + num2))
// println("Subtraction is: " + (num1 - num2))
// println("Multiplication is: " + (num1 * num2))
// println("Division is: " + (num1 / num2))

// println("Enter age")
// val age = StdIn.readInt()
// val ans = age >= 18
// println("Age is: " + age)
// println("Is eligible to vote: " + ans)

    println("Enter Marks")
    val marks = StdIn.readInt()
    println("Enter attendance")
    val attendance = StdIn.readInt()
    println("Enter family income")
    val income = StdIn.readInt()
    val ans = marks >= 80 && attendance >= 75
    println("Marks: " + marks)
    println("Attendance: " + attendance)
    println("Family Income: " + income)
    println("Is eligible for exam: " + ans)
    println("Is eligible for exam: " + (marks >= 80 && attendance >= 75))
    println(
      "Is eligible for scholarship: " + (marks >= 90 && attendance >= 80 && income <= 300000)
    )
  }
}
