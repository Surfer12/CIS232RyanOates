/* explain the output of your code and how it demonstrates the relationship between constructors and inheritance  */
public class Main {
   public static void main(String[] args) {
      Student s1 = new Student("Ryan Oates", 12345, ": Male", 26, "10/10/1995", "Senior", "123456",
            new String[] { "CIS232", "Calculus 1", "American Literatre" }, 120, 90, 4.0);
      s1.isNotBirthday();
      s1.showStudentDetails();
   }
}

/*
 * Today is not your birthday
 * Name: Ryan Oates
 * Phone Number: 12345
 * Gender: Male
 * TODO age
 * TODO dateOfBirth
 * Grade Level: Senior
 * Student ID: 123456
 * Courses:
 * CIS232
 * Calculus 1
 * American Literatre
 * Total Units: 120.0
 * Completed Units: 120.0
 * GPA: 4.0
 */