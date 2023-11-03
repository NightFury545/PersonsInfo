import java.util.ArrayList;
import java.util.List;

public class PersonInfo {
    private ArrayList<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public void showExceededPersonGivenAge(int givenAge) {
        for (Person currentPerson : this.persons) {
            if (currentPerson.getAge() > givenAge) {
                System.out.println("Людина, вік якої перевищує " + givenAge + ": " + currentPerson.getLastName() + " " + currentPerson.getFirstName());
            }
        }
    }

    public void ShowPersonsWithHigherEducation() {
        for (Person currentPerson : this.persons) {
            if (currentPerson.getEducation().toString().equals("Вища")) {
                System.out.println("Людина з вищою освітою: " + currentPerson.getLastName() + " " + currentPerson.getFirstName());
            }
        }
    }

    public void showMalePersons() {
        for (Person currentPerson : this.persons) {
            if (currentPerson.getSex().toString().equals("Чоловік")) {
                System.out.println("Людина чоловічої статі: " + currentPerson.getLastName() + " " + currentPerson.getFirstName());
            }
        }
    }
}
