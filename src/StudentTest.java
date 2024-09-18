import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
   private Student student;

   @BeforeEach
   public void setUp() {
      String[] courses = { "Math", "Science", "History" };
      student = new Student("John Doe", 1234567890, "Male", 20, "01/01/2003", false,
            "Sophomore", "S12345", courses, 120.0, 60.0, 3.5);
   }

   @Test
   public void testStudentConstructor() {
      assertEquals("John Doe", student.getName());
      assertEquals(1234567890, student.getPhoneNumber());
      assertEquals("Male", student.getGender());
      assertEquals(20, student.getAge());
      assertEquals("01/01/2003", student.getDateOfBirth());
      assertFalse(student.isBirthday());
      assertEquals("Sophomore", student.getGradeLevel());
      assertEquals("S12345", student.getStudentId());
      assertArrayEquals(new String[] { "Math", "Science", "History" }, student.getCourses());
      assertEquals(120.0, student.getTotalUnits());
      assertEquals(60.0, student.getCompletedUnits());
      assertEquals(3.5, student.getGpa());
   }

   @Test
   public void testShowPersonDetails() {
      // This test will check if the method runs without errors
      // and prints the expected details to the console.
      // Note: In a real-world scenario, you might want to capture the console output
      // and verify it.
      student.showPersonDetails();
   }

   public void showStudentDetails() {
}