class Student(var rollNo: Int, var name: String) {
  def display(): Unit = {
    println("Roll No : " + rollNo)
    println("Name    : " + name)
  }
}

object College {
  def welcome(): Unit = {
    println("Welcome to Scala Programming")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    College.welcome()
    
    val s1 = new Student(101, "Alice"); s1.display()
    val s2 = new Student(102, "Bob"); s2.display()
    
    // Anonymous Object
    new Student(103, "Charlie").display() 
  }
}