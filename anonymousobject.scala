class Student{
    
    def display(): Unit = {
        println("Anonymous object created")
    }
}
object Main{
    def main(args: Array[String]): Unit = {
        new Student().display()
    }
}