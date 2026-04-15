package Day2;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private long phone;

    Person(String firstName, String lastName, Gender gender, long phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phone = phone;
    }

    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("---------------");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
    }
}