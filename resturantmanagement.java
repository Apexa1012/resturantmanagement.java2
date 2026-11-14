
public class RestaurantManagement {

    public static void main(String[] args) {

        String restaurantName = "Little Caesars";

        double pizzaSales = 1500;
        double deliverySales = 500;
        double expenses = 1100;

        double totalSales = pizzaSales + deliverySales;
        double profit = totalSales - expenses;

        double profitMargin = (profit / totalSales) * 100;

        System.out.println("===== RESTAURANT REPORT =====");

        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Expenses: $" + expenses);
        System.out.println("Net Profit: $" + profit);

        System.out.println(
            "Profit Margin: " + profitMargin + "%"
        );

        System.out.println("=============================");
    }
}
