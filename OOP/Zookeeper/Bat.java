// Bat.java
public class Bat extends Mammal {
    public void fly() {
        System.out.println("Bat takes off.");
        setEnergyLevel(getEnergyLevel() - 50);
    }

    public void eatHumans() {
        System.out.println("Bat is satisfied after eating humans.");
        setEnergyLevel(getEnergyLevel() + 25);
    }

    public void attackTown() {
        System.out.println("Sound of a town on fire.");
        setEnergyLevel(getEnergyLevel() - 100);
    }
}
