import java.time.LocalDate;
// This is the main class that demonstrates the functionality of the ExpenseManager and its related classes.
public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        manager.addExpense(new UtilityExpense("Monthly Bill", 120.50, LocalDate.now(), "Electricity"));
        manager.addExpense(new GroceryExpense("Whole Foods Run", 85.00, LocalDate.now(), true));
        manager.addExpense(new GroceryExpense("Ice Cream", 12.00, LocalDate.now(), false));

        System.out.println("--- Home Expense Report ---");
        manager.showAllExpenses();
        
        System.out.println("---------------------------");
        System.out.println("Total Monthly Outflow: $" + manager.calculateTotal());
    }
}