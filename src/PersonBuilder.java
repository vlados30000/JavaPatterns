public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя неккоретно");
        } else {
            this.name = name;
            return this;
        }
    }

    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Фамилия неккоретна");
        } else {
            this.surname = surname;
            return this;
        }
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Отрицательный возраст недопустим");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String city) throws IllegalArgumentException {
        this.city = city;
        return this;

    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Имя не задано");
        }
        if (surname == null) {
            throw new IllegalStateException("Фамилия не задана");
        }
        Person person;
        if (age < 0) {
            person = new Person(name, surname);
        } else
            person = new Person(name, surname, age);
        person.setAddress(city);
        return person;
    }
}


