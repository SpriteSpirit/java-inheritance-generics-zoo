package animals.mammals;

public class Predator extends Mammals {
    private String foodType;
    // constructors                                                --------------------------------------------*********
    public Predator(String name) {
        this(name, 0, "Meat");
    }

    public Predator(String name, int age, String foodType) {
        super(name, age);
        setFoodType(foodType);
    }

    // functional methods                                          --------------------------------------------*********
    @Override
    public void toWalk() {
        System.out.printf("%s walking %.2f km/h%n", getName(), getMoveSpeed());
    }
    public void toHunt() {
        System.out.printf("%s to hunting on%n", getName());
    }

    // getters and setters                                         --------------------------------------------*********
    public String getFoodType() {
        return foodType;
    }

    private void setFoodType(String foodType) {
        this.foodType = foodType == null || foodType.isBlank() || foodType.isEmpty() ? "Jungle" : foodType;
    }

    @Override
    public String toString() {
        return String.format(
                "Type: %s%n" +
                        "Age: %d%n" +
                        "Food type: %s%n",
                getName(),
                getAge(),
                getFoodType());
    }
}
