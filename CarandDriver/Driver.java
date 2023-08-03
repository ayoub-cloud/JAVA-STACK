// Driver.java
public class Driver extends Car {
    public void drive() {
        if (getGas() > 0) {
            System.out.println("You drive the car.");
            setGas(getGas() - 1);
        }
        status();
        gameOver();
    }

    public void boost() {
        if (getGas() >= 3) {
            System.out.println("Using boosters!");
            setGas(getGas() - 3);
        } else {
            System.out.println("Not enough gas to use boosters!");
        }
        status();
        gameOver();
    }

    public void refuel() {
        if (getGas() < 9) {
            System.out.println("Refueling.");
            setGas(getGas() + 2);
        } else {
            System.out.println("Gas tank is full. Cannot refuel!");
        }
        status();
        gameOver();
    }
}
