import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil(); // Instantiate CafeUtil class
        
        /* ============ App Test Cases ============= */

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: $%.2f \n\n", appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<>(Arrays.asList("drip coffee", "cappuccino", "latte", "mocha"));
        appTest.displayMenu(menu);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

        System.out.println("----- Print Price Chart Test-----");
        appTest.printPriceChart("Columbian Coffee Grounds", 15.0, 3);

        System.out.println("\n----- Display Menu with Prices Test-----");
        ArrayList<Double> prices = new ArrayList<>(Arrays.asList(1.50, 3.50, 4.50, 3.50));
        appTest.displayMenu(menu, prices);
    }
}
 //output
 // ----- Streak Goal Test -----
// Purchases needed by week 10: 55

// ----- Order Total Test-----
// Order total: $13,50 

// ----- Display Menu Test-----
// 0 drip coffee
// 1 cappuccino
// 2 latte
// 3 mocha

// ----- Add Customer Test-----
// Please enter your name: