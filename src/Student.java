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