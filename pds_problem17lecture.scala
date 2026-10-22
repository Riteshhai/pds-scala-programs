case class Person(name: String, age: Int, city: String)

object PracticeProgram17 {
  def main(args: Array[String]): Unit = {
    val people = List(
      Person("Alice", 28, "New York"),
      Person("Bob", 35, "London"),
      Person("Charlie", 42, "New York"),
      Person("Diana", 25, "Paris"),
      Person("Ethan", 31, "London")
    )

    def filterOlderThan30(people: List[Person]): List[Person] = {
      people.filter(_.age > 30)
    }

    def groupByCity(people: List[Person]): Map[String, List[Person]] = {
      people.groupBy(_.city)
    }

    def toDescription(person: Person): String = {
      s"${person.name} is ${person.age} years old and lives in ${person.city}"
    }

    def sortByAge(people: List[Person]): List[Person] = {
      people.sortBy(_.age)
    }

    println("People older than 30: " + filterOlderThan30(people).mkString(", "))
    println("People grouped by city: " + groupByCity(people))
    println("People descriptions: " + people.map(toDescription).mkString("; "))
    println("People sorted by age: " + sortByAge(people).mkString(", "))
  }
}