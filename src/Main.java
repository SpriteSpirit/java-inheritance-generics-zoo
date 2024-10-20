import animals.mammals.Mammals;
import animals.amphibian.Amphibian;
import animals.bird.Bird;
import animals.bird.FlightBird;
import animals.bird.FlightlessBirds;
import animals.mammals.Herbivore;
import animals.mammals.Predator;

public class Main {
    public static void main(String[] args) {
        separator("⋮");
        // Herbivore class objects
        Herbivore gazelle = new Herbivore("Gazelle", 3, "Grass");
        System.out.println(gazelle);
        gazelle.toGaze();

        separator("⋮");
        Herbivore giraffe = new Herbivore("Giraffe", 5, "Leaf");
        System.out.println(giraffe);
        giraffe.toGaze();

        separator("⋮");
        Herbivore horse = new Herbivore("Horse", 7, "Hay");
        System.out.println(horse);
        horse.toGaze();
        horse.eat();
        horse.sleep();
        horse.go();

        separator("⋮");
        // Predator class objects
        Predator hyena = new Predator("Hyena", 2, "Carrion");
        System.out.println(hyena);
        hyena.toHunt();

        separator("⋮");
        Predator tiger = new Predator("Tiger", 4, "Meat");
        System.out.println(tiger);
        tiger.toHunt();

        separator("⋮");
        Predator bear = new Predator("Bear", 8, "Meat");
        System.out.println(bear);
        bear.toHunt();


        separator("⋮");
        // Amphibian class objects
        Amphibian frog = new Amphibian("Frog", 2, "Swamp");
        System.out.println(frog);
        frog.toHunt();

        separator("⋮");
        Amphibian freshwaterSnake = new Amphibian("Freshwater snake", 3, "Lake");
        System.out.println(freshwaterSnake);
        freshwaterSnake.toHunt();

        separator("⋮");
        // FlightBird class objects
        FlightBird gull = new FlightBird("Gull", 1, "Forest", "Fly");
        System.out.println(gull);
        gull.toFly();
        gull.toHunt();

        separator("⋮");
        FlightBird albatross = new FlightBird("Albatross", 3, "Sea", "Fly");
        System.out.println(albatross);
        albatross.toFly();
        albatross.toHunt();

        separator("⋮");
        FlightBird falcon = new FlightBird("Falcon", 15, "Mountains", "Fly");
        System.out.println(falcon);
        falcon.toFly();
        falcon.toHunt();

        separator("⋮");
        // FlightlessBird class objects
        FlightlessBirds peacock = new FlightlessBirds("Peacock", 5, "Hill", "Walk");
        System.out.println(peacock);
        peacock.toFly();
        peacock.toHunt();

        separator("⋮");
        FlightlessBirds penguin = new FlightlessBirds("Penguin", 3, "Arctic", "Walk");
        System.out.println(penguin);
        penguin.toFly();
        penguin.toHunt();

        separator("⋮");
        FlightlessBirds dodoBird = new FlightlessBirds("Dodo Bird", 2, "Hill", "Walk");
        System.out.println(dodoBird);
        dodoBird.toFly();
        dodoBird.toHunt();
    }
    public static void separator(String symbol) {
        System.out.println(symbol.repeat(20));
    }
}