import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense e) {
        expenses.add(e);
    }

    // --- ADDED: This fixes the "undefined" error in Main ---
    public void showAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
            return;
        }
        for (Expense e : expenses) {
            e.displayDetails(); // Polymorphism: Calls the correct displayDetails() for Utility vs Grocery
        }
    }

    // --- ADDED: This fixes the "undefined" error for total calculation ---
    public double calculateTotal() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }

    public double getTotalForGroceries() {
        double total = 0;
        for (Expense e : expenses) {
            if (e instanceof GroceryExpense) { 
                total += e.getAmount();
            }
        }
        return total;
    }

    public void exportToCSV(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Description,Amount,Date\n"); 
            for (Expense e : expenses) {
                writer.write(e.getDescription() + "," + e.getAmount() + "," + e.getDate() + "\n");
            }
            System.out.println("Successfully saved to " + filename);
        } catch (IOException ex) {
            System.out.println("An error occurred while saving file.");
        }
    }
}