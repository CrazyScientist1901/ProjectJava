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
    public void showAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
            return;
        }
        for (Expense e : expenses) {
            e.displayDetails(); 
        }
    }
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
    try (FileWriter writer = new FileWriter(filename, true)) {
        for (Expense e : expenses) {
            writer.write(e.getDescription() + "," + e.getAmount() + "," + e.getDate() + "\n");
        }
        
        System.out.println("Successfully appended data to " + filename);
        expenses.clear(); 
        
    } catch (IOException ex) {
        System.out.println("An error occurred while saving file.");
    }
}
}