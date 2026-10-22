object InputDemo {
  def main(args: Array[String]): Unit = {

    val numbers = Array(10, 20, 30, 40, 50)
    val arr = new Array[Int](5)
    arr(0) = 100
    arr(1) = 200
    arr(2) = 300
    arr(3) = 400
    arr(4) = 500
    println("Numbers array: " + numbers.mkString(", "))
    println(arr(1))
    val fruits = Array("Apple", "Banana", "Mango", "Orange")
    println("Fruits array: " + fruits.mkString(", "))
    println(fruits(2))

    for (i <- 0 until numbers.length) {
      println("Numbers array elements: " + numbers(i))
    }

    for (num <- numbers) {
      println(num)
    }
    numbers.foreach(println)

    println(numbers.length)
    println(numbers.sum)
    println(numbers.max)
    println(numbers.min)
    println(numbers.sorted.mkString(", "))
    println("Average: " + (numbers.sum.toDouble / numbers.length))

    val list = List(1, 2, 3, 4, 5)
    println("List: " + list.mkString(", "))
    println(list.head)
    println(list.tail)
    println(list.last)
    println(list.length)

    for(num<- list){
      println(num)
    }
    val updated = 5::list
    println("Updated List: " + updated.mkString(", "))

    val languages = List("Java", "Python", "Scala", "C++")
    languages.foreach(println)

    val student = ("John", 20, "Computer Science")
    println("Student: " + student._1 + ", Age: " + student._2 + ", Major: " + student._3)
  }
}  