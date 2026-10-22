class Employee(
    var EmpID: Int,
    var EmpName: String
) {
  def this() = this(0, "Unknown")

  def display(): Unit = {
    println("Employee ID: " + EmpID)
    println("Employee Name: " + EmpName)
  }
}
case class student(
    rollno: Int,
    name: String
)
case class department(
    deptid: Int,
    deptname: String
)

object Employee {
  def companyname(): Unit = {
    println("Company Name: ABC Pvt Ltd")
  }
  def createEmployee() = new Employee(101, "John")

  def main(args: Array[String]): Unit = {
    companyname()
    val s1 = student(101, "Alice")
    println(s1)
    val e1 = Employee.createEmployee()
    e1.display()
    val e2 = new Employee()
    e2.display()
    val dept = department(1, "IT")
    println(dept)
  }
}
