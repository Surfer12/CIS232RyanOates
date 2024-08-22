public class Person {
    String name;
    int phoneNumber;
    String gender;
    int age;
    String dateOfBirth;

    // .this inherits the properties of the fields from the Person class
    public Person() {
        this.name = "John Doe";
        this.phoneNumber = 123456789;
        this.gender = "MALE";
        this.age = 18;
        this.dateOfBirth = "01/01/2000";
    }

    public Person(String name, int phoneNumber, String gender, int age, String dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public void showPersonDetails(String name, int phoneNumber, String gender, int age, String dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Gender" + gender);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dateOfBirth);    
    }

    public boolean isBirthday() {
        System.out.println("Happy Birthday!" + "\n");
        return true;
    }

    public boolean isNotBirthday() {
        System.out.println("Today is not your birthday");
        return false;
    }
}