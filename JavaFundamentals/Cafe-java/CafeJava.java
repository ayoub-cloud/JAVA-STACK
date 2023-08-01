public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0;
        double lattePrice = 4.0;
        double cappuccinoPrice = 3.75;

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Noah";
        String customer3 = "Sam";
        String customer4 = "Jimmy";

        // Order completions
        boolean isReadyOrder1 = true; // Cindhuri's order is ready
        boolean isReadyOrder2 = false; // Noah's order is not ready
        boolean isReadyOrder3 = true; // Sam's order is ready
        boolean isReadyOrder4 = true; // Jimmy's order is ready

        // APP INTERACTION SIMULATION (Customer interactions)
        System.out.println(generalGreeting + customer1 + pendingMessage);

        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        }

        System.out.println(); // Adding an empty line for readability

        System.out.println(generalGreeting + customer2 + pendingMessage);

        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }

        System.out.println(); // Adding an empty line for readability

        int numberOfLattes = 2;
        double totalAmount = lattePrice * numberOfLattes;
        System.out.println(generalGreeting + customer3 + pendingMessage);
        System.out.println(displayTotalMessage + totalAmount);

        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        }

        System.out.println(); // Adding an empty line for readability

        double coffeePrice = 2.5; // Assuming Jimmy wanted coffee, not a latte
        double difference = lattePrice - coffeePrice;
        System.out.println(generalGreeting + customer4 + pendingMessage);
        System.out.println(displayTotalMessage + coffeePrice);

        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println("You were charged for a latte, but you ordered a coffee.");
            System.out.println("Please pay an additional $" + difference);
        }
    }
}
