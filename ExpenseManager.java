import java.util.ArrayList;
import java.util.List;
// This class manages a collection of expenses, allowing you to add expenses, display them, and calculate the total.
public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense e) {
        expenses.add(e);
    }

    public void showAllExpenses() {
        for (Expense e : expenses) {
            e.displayDetails(); // Polymorphism in action!
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }
}