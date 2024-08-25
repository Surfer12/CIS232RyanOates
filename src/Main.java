/* explain the output of your code and how it demonstrates the relationship between constructors and inheritance 
 */
public class Main {
   public static void main(String[] args) {
      Student s1 = new Student("Ryan Oates", 12345, ": Male", 26, "10/10/1995", "Senior", "123456",
            new String[] { "CIS232", "Calculus 1", "American Literatre" }, 120, 120, 4.0);
      s1.showStudentDetails();
   }
}

/*
 * Output from Main.java
 * The output comments describe the the relationship between constructors and
 * inheritance
 */
/*
 * Name: Ryan Oates // The showPersonDetails() method is called from the Person
 * class
 * Phone Number: 12345 // included in the showPersonDetails() method
 * Gender: Male // included in the showPersonDetails() method
 * Age: 26 // included in the showPersonDetails() method
 * Date of Birth: 10/10/1995 // included in the showPersonDetails() method
 * Today is not their birthday // included in the showPersonDetails() method as
 * an if else statement for the isNotBirthday() boolean
 * // End of inital Person class fields that are inherited by the s1 student
 * object.
 * Grade Level: Senior
 * Student ID: 123456
 * Courses listed below:
 * CIS232
 * Calculus 1
 * American Literatre
 * Total Units: 120.0
 * Completed Units: 120.0
 * GPA: 4.0
 * // End of Student class fields that are shown with showStudentDetails.
 */