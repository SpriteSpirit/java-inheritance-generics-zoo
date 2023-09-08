package animals;

import java.time.LocalDate;

public abstract class Animal {
    private String name;
    private final int birthYear;

    // constructors                                                --------------------------------------------*********
    public Animal(String name) {
        this(name, 0);
    }

    public Animal(String name, int age) {
        this.name = name;
        if (age > 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
            ;
        }
    }

    // functional methods                                          --------------------------------------------*********
    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

    // getters and setters                                         --------------------------------------------*********
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name != null && !name.isBlank() && !name.isEmpty() ? name : "Unknown type";
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    @Override
    public String toString() {
        return String.format("Animal: %s%n" +
                        "Type: %s%n" +
                        "Age: %d%n",
                getClass(), getName(), getAge());
    }
}
