public class Person {
    protected String name;
    protected int phoneNumber;
    protected String gender;
    protected int age;
    protected String dateOfBirth;
    protected boolean isBirthday;

    // .this inherits the fields from the Person class
    public Person() {
        this.name = "John Doe";
        this.phoneNumber = 123456789;
        this.gender = "MALE";
        this.age = 18;
        this.dateOfBirth = "01/01/2001";
        this.isBirthday = false;

    }

    public Person(String name, int phoneNumber, String gender, int age, String dateOfBirth, boolean isBirthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.isBirthday = isBirthday;
    }

    public void showPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Is Birthday: " + isBirthday);
    }

    public static void handleBirthday() {
        System.out.println("Happy Birthday!" + "\n");
    }

    public static void handleNotBirthday() {
        System.out.println("Today is not their birthday");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isBirthday() {
        return isBirthday;
    }

    public void setBirthday(boolean isBirthday) {
        this.isBirthday = isBirthday;
    }

    public static void handlNotBirthday() {
        System.out.println("Today is not their birthday");
    }
}