// Gorilla.java
public class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("Gorilla throws something!");
        setEnergyLevel(getEnergyLevel() - 5);
    }

    public void eatBananas() {
        System.out.println("Gorilla is satisfied after eating bananas.");
        setEnergyLevel(getEnergyLevel() + 10);
    }

    public void climb() {
        System.out.println("Gorilla climbs a tree.");
        setEnergyLevel(getEnergyLevel() - 10);
    }
}
