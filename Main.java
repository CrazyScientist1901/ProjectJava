import java.time.LocalDate;

//Main function to demonstrate the ExpenseManager and related classes.

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        
        Budget groceryBudget = new Budget("Grocery", 100.00);

        manager.addExpense(new GroceryExpense("Weekly Staples", 80.00, LocalDate.now(), true));
        manager.addExpense(new GroceryExpense("Fancy Coffee Beans", 30.00, LocalDate.now(), false));
        manager.addExpense(new UtilityExpense("Wifi", 50.00, LocalDate.now(), "Internet"));

        System.out.println("--- Home Expense Report ---");
        double currentGroceries = manager.getTotalForGroceries();
        groceryBudget.checkLimit(currentGroceries);
        manager.exportToCSV("my_expenses.csv");
    }
}