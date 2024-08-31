/* explain the output of your code and how it demonstrates the relationship between constructors and inheritance 
 */
public class Main {
   public static void main(String[] args) {
      Student s1 = new Student("Ryan Oates", 12345, ": Male", 26, "10/10/1995", false, "Senior", "123456",
            new String[] { "CIS232", "Calculus 1", "American Literatre" }, 120, 120, 4.0);
      s1.showStudentDetails();
   }
}

/*
 * OUTPUT FROM MAIN.JAVA
 * The super.showPersonDetails() is called on the student s1 object
 * Name: Ryan Oates // included in the showPersonDetails() method
 * Phone Number: 12345 // included in the showPersonDetails() method
 * Gender: Male // included in the showPersonDetails() method
 * Age: 26 // included in the showPersonDetails() method
 * Date of Birth: 10/10/1995 // included in the showPersonDetails() method
 * Today is not their birthday // included in the showPersonDetails() method
 * as an if else statement for the isBirthday boolean
 * // End of inital Person class fields that are inherited by the s1 student
 * object.
 * Grade Level: Senior // included in the showStudentDetails() method
 * Student ID: 123456 // included in the showStudentDetails() method
 * Courses listed below: // included in the showStudentDetails() method
 * CIS232 // included in the showStudentDetails() method
 * Calculus 1 // included in the showStudentDetails() method
 * American Literatre // included in the showStudentDetails() method
 * Total Units: 120.0 // included in the showStudentDetails() method
 * Completed Units: 120.0 // included in the showStudentDetails() method
 * GPA: 4.0 // included in the showStudentDetails() method
 * // End of Student class fields that are shown with showStudentDetails.
 */