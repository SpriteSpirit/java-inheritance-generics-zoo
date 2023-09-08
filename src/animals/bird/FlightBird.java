package animals.bird;

public class FlightBird extends Bird {
    private String typeMovement;

    // constructors                                                --------------------------------------------*********
    public FlightBird(String name) {
        this(name, 0, "Forest", "Fly");
    }

    public FlightBird(String name, int age, String environment, String typeMovement) {
        super(name, age, environment);
        setTypeMovement(typeMovement);
    }

    // functional methods                                          --------------------------------------------*********
    public void toFly() {
        System.out.printf("%s flying%n", getName());
    }

    // getters and setters                                         --------------------------------------------*********
    public String getTypeMovement() {
        return typeMovement;
    }

    private void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement == null || typeMovement.isBlank() || typeMovement.isEmpty() ? "Forest" : typeMovement;
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
