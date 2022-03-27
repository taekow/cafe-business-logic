import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        // count for number of customer who buy more drink than the week before
        // need to number after 10 weeks
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum += i;
        }

        return sum;

    }
    
    public double getOrderTotal(double[] prices) {
        // Given an array of item prices from an order, 
        // sum all of the prices in the array and return the total. 
        double sum = 0;

        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }

        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        // Given an ArrayList of menu items (strings), print out each index and menu item. 
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s: %s \n", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter you neme:");

        String userName = System.console().readLine();
        System.out.printf("Hello %s\n", userName);
        
        // count how many customer are waiting
        System.out.printf("There are %s people in front of you\n", customers.size());

        // Add customers name to Array
        customers.add(userName);

        // print waiting customers name array list
        System.out.println(customers);
    }

}
