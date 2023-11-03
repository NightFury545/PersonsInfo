
public class Main {
    public static void main(String[] args) {

        PersonInfo personInfo = new PersonInfo();
        personInfo.addPerson(new Person("Руслан",
                "Чорнопиский",
                "Володимирович",
                "Щедріна 38 кв. 8",
                Sex.Чоловік,
                Education.Вища,
                55));
        personInfo.addPerson(new Person("Денис",
                "Чорнопиский",
                "Володимирович",
                "Щедріна 38 кв. 8",
                Sex.Чоловік,
                Education.Середня,
                45));
        personInfo.addPerson(new Person("Марина",
                "Агапова",
                "Валентинівна",
                "Кампотна 6 кв. 2",
                Sex.Жінка,
                Education.Вища,
                30));

        personInfo.showExceededPersonGivenAge(50);
        personInfo.showMalePersons();
        personInfo.ShowPersonsWithHigherEducation();
    }
}