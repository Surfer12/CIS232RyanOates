import java.util.Arrays;

public class Student extends Person {
   private String gradeLevel;
   private String studentId;
   private String[] courses;
   private double totalUnits;
   private double completedUnits;
   private double gpa;

   public Student(String name, int phoneNumber, String gender, int age, String dateOfBirth, boolean isBirthday,
         String gradeLevel, String studentId, String[] courses, double totalUnits, double completedUnits, double gpa) {
      super(name, phoneNumber, gender, age, dateOfBirth, isBirthday);
      this.gradeLevel = gradeLevel;
      this.studentId = studentId;
      this.courses = courses;
      this.totalUnits = totalUnits;
      this.completedUnits = completedUnits;
      this.gpa = gpa;
   }

   public String getName() {
      return super.getName();
   }

   public int getPhoneNumber() {
      return super.getPhoneNumber();
   }

   public String getGender() {
      return super.getGender();
   }

   public int getAge() {
      return super.getAge();
   }

   public String getDateOfBirth() {
      return super.getDateOfBirth();
   }

   public boolean isBirthday() {
      return super.isBirthday();
   }

   public String getGradeLevel() {
      return gradeLevel;
   }

   public String getStudentId() {
      return studentId;
   }

   public String[] getCourses() {
      return Arrays.copyOf(courses, courses.length);
   }

   public double getTotalUnits() {
      return totalUnits;
   }

   public double getCompletedUnits() {
      return completedUnits;
   }

   public double getGpa() {
      return gpa;
   }

   @Override
   public void showPersonDetails() {
      super.showPersonDetails();
      System.out.println("Grade Level: " + gradeLevel);
      System.out.println("Student ID: " + studentId);
      System.out.println("Courses listed below: ");
      for (String course : courses) {
         System.out.println(course);
      }
      System.out.println("Total Units: " + totalUnits);
      System.out.println("Completed Units: " + completedUnits);
      System.out.println("GPA: " + gpa);
   }
}