// Car.java
public class Car {
    private int gas;

    public Car() {
        this.gas = 10;
    }

    public void status() {
        System.out.println("Gas remaining: " + gas + "/10");
    }

    public void gameOver() {
        if (gas == 0) {
            System.out.println("Game Over! Your car is out of gas.");
        }
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
}
