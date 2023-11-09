package Model;

public class Player {
    protected String name;
    protected String surname;
    protected String patronymic;
    int age;

    public Player(String name, String surname, String patronymic, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymics() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ' ' + patronymic + ", " + age;
    }
}
