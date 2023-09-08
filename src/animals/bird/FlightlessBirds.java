package animals.bird;

public class FlightlessBirds extends Bird {
    private String typeMovement;

    // constructors                                                --------------------------------------------*********
    public FlightlessBirds(String name) {
        this(name, 0, "Hills", "Walk");
    }

    public FlightlessBirds(String name, int age, String environment, String typeMovement) {
        super(name, age, environment);
        setTypeMovement(typeMovement);
    }

    // functional methods                                          --------------------------------------------*********
    public void toFly() {
        System.out.printf("%s walking%n", getName());
    }

    // getters and setters                                         --------------------------------------------*********
    public String getTypeMovement() {
        return typeMovement;
    }

    private void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement == null || typeMovement.isBlank() || typeMovement.isEmpty() ? "Hills" : typeMovement;
    }

    @Override
    public String toString() {
        return String.format(
                "Type: %s%n" +
                        "Age: %d%n" +
                        "Environment: %s%n" +
                        "Type Movement: %s%n",
                getName(),
                getAge(),
                getEnvironment(),
                getTypeMovement());
    }
}
