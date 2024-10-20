package animals.mammals;

import animals.Animal;

public abstract class Mammals extends Animal {
    private String environment;
    private float moveSpeed;

    // constructors                                                --------------------------------------------*********
    public Mammals(String name) {
        this(name, 0, 1.2f,"Aviary");
    }

    public Mammals(String name, int age, float moveSpeed, String environment) {
        super(name, age);
        setEnvironment(environment);
        setMoveSpeed(moveSpeed);
    }

    public Mammals(String name, int age) {
        super(name, age);
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
    public abstract void toWalk();

    // getters and setters                                         --------------------------------------------*********
    public String getEnvironment() {
        return environment;
    }

    private void setEnvironment(String environment) {
        this.environment = environment == null || environment.isBlank() || environment.isEmpty() ? "Savannah" : environment;
    }

    public float getMoveSpeed() {
        return moveSpeed;
    }

    private void setMoveSpeed(float moveSpeed) {
        this.moveSpeed = moveSpeed < 0 ? Math.abs(moveSpeed) : (moveSpeed == 0 ? 1.2f : moveSpeed);
    }

    @Override
    public String toString() {
        return String.format(
                "Type: %s%n" +
                        "Age: %d%n" +
                        "Speed: %.2f km/h%n" +
                        "Environment: %s%n",
                getName(),
                getAge(),
                getMoveSpeed(),
                getEnvironment());
    }
}
