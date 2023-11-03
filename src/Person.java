
public final class Person {

    private final String firstName;
    private final String lastName;
    private final String patronymicName;
    private final String address;
    private final Sex sex;
    private final Education education;
    private final int age;

    public Person(String firstName, String lastName, String patronymicName, String address, Sex sex, Education education, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.address = address;
        this.sex = sex;
        this.education = education;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public String getAddress() {
        return address;
    }

    public Sex getSex() {
        return sex;
    }

    public Education getEducation() {
        return education;
    }

    public int getAge() {
        return age;
    }

}
