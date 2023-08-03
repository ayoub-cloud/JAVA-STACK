// CarAndDriver.java
public class CarAndDriver {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // Call the drive method four times
        driver.drive();
        driver.drive();
        driver.drive();
        driver.drive();

        // Call the boost method once
        driver.boost();

        // Call the refuel method three times
        driver.refuel();
        driver.refuel();
        driver.refuel();
    }
}
