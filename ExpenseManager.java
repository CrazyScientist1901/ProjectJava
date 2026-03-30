import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//Expense Manager class to manage expenses and export to CSV.

public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense e) {
        expenses.add(e);
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

    // Save all expenses to a CSV file
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