//> using dep org.scalanlp::breeze:2.1.0

import breeze.linalg._
object scalaLibrariesandbreeze extends App {
val v = DenseVector(10,20,30,40)
val v1 = DenseVector(1,2,3,4)
val c = v + v1
println(v)
println(v1)
println(c)

val mat = DenseMatrix((1,2),(3,4))
val mat2 = DenseMatrix((5,6),(7,8))
println(mat)
println(mat2)
println(mat + mat2)
println(mat * mat2)

println(math.sqrt(25.0))
println(math.exp(2.0))
println(math.log(10.0))
println(math.sin(0.5))

//list various mathematical functions available in breeze
// create a DenseVector and apply various mathematical functions
// create a vector for 5 student's marks out of 100 and calculate the average using breeze
// create a table for student marks for two internal exams and calculate the average marks for each student using breeze
// also calculate highest and lowest marks for each student using breeze

val marks = DenseVector(
    (85, 90),
    (80,90),
    (99,87),
    (89,93),
    (80,85))

val averageMarks = mean(marks)
val highestMark = max(marks)
val lowestMark = min(marks)
println(averageMarks)
println(highestMark)
println(lowestMark)

}