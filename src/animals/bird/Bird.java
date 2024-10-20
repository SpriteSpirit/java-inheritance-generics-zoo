package animals.bird;

import animals.Animal;

public abstract class Bird extends Animal {
    private String environment;

    // constructors                                                --------------------------------------------*********
    public Bird(String name) {
        this(name, 0,"Forest");
    }

    public Bird(String name, int age, String environment) {
        super(name, age);
        setEnvironment(environment);
    }

    // functional methods                                          --------------------------------------------*********
    @Override
    public void eat() {
        System.out.printf("%s is eating...%n", getName());
    }

    @Override
    public void sleep() {
        System.out.printf("%s sleeping...%n", getName());
    }

    @Override
    public void go() {
        System.out.printf("%s promenade...%n", getName());
    }
    public abstract void toHunt();

    // getters and setters                                         --------------------------------------------*********
    public String getEnvironment() {
        return environment;
    }

    private void setEnvironment(String environment) {
        this.environment = environment == null || environment.isBlank() || environment.isEmpty() ? "Forest" : environment;
    }

    @Override
    public String toString() {
        return String.format(
                "Type: %s%n" +
                        "Age: %d%n" +
                        "Environment: %s%n",
                getName(),
                getAge(),
                getEnvironment());
    }
}
