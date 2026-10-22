class Student{
    var name = ""
    var reg = ""
    var programme = ""
    def display(): Unit = {
        println("Name: " + name)
        println("Registration Number: " + reg)
        println("Programme: " + programme)
    }
}
object Main{
    def main(args: Array[String]): Unit = {
        val s = new Student()
        val s1 = new Student()
        s.name = "Alice"
        s.reg = "12345"
        s.programme = "Computer Science"
        s1.name = "Bob"
        s1.reg = "26MML123"
        s1.programme = "Mechanical Engineering"
        s.display()
        s1.display()
    }
}