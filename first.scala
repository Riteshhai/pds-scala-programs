import scala.io.StdIn

object InputDemo{
def main(args: Array[String]):Unit ={

println("Enter your name and department")
val name = StdIn.readLine()
val dept = StdIn.readLine()
println("Welcome : " + name)
println("dept : " + dept)
println("Enter your age")

val Age = StdIn.readInt()
println("Enter temperature")
val temp = StdIn.readFloat()
println("temperature is : " + temp)

println("Age : " + Age)
  }
}