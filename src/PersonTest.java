import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

   @Test
   public void testDefaultConstructor() {
      Person person = new Person();
      assertEquals("John Doe", person.name);
      assertEquals(123456789, person.phoneNumber);
      assertEquals("MALE", person.gender);
      assertEquals(18, person.age);
      assertEquals("01/01/2001", person.dateOfBirth);
      assertFalse(person.isBirthday);
   }

   @Test
   public void testParameterizedConstructor() {
      Person person = new Person("Jane Doe", 987654321, "FEMALE", 25, "02/02/1995", true);
      assertEquals("Jane Doe", person.name);
      assertEquals(987654321, person.phoneNumber);
      assertEquals("FEMALE", person.gender);
      assertEquals(25, person.age);
      assertEquals("02/02/1995", person.dateOfBirth);
      assertTrue(person.isBirthday);
   }

   @Test
   public void testShowPersonDetails() {
      Person person = new Person("Jane Doe", 987654321, "FEMALE", 25, "02/02/1995", true);
      person.showPersonDetails();
      // This test will print the details to the console. 
      // You can manually verify the output or use a library like System Rules to capture and assert console output.
   }

   @Test
   public void testHandleBirthday() {
      // Capture the output of handleBirthday method
      final String expectedOutput = "Happy Birthday!\n\n";
      assertEquals(expectedOutput, captureOutput(Person::handleBirthday));
   }

   @Test
   public void testHandleNotBirthday() {
      // Capture the output of handlNotBirthday method
      final String expectedOutput = "Today is not their birthday\n";
      assertEquals(expectedOutput, captureOutput(Person::handlNotBirthday));
   }

   // Utility method to capture console output
   private String captureOutput(Runnable runnable) {
      java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
      System.setOut(new java.io.PrintStream(out));
      runnable.run();
      return out.toString();
   }
}