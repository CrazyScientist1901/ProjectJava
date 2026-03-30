import java.time.LocalDate;
// This class represents a utility expense, which is subclass of Expense.
public class UtilityExpense extends Expense {
    private String type; 

    public UtilityExpense(String description, double amount, LocalDate date, String type) {
        super(description, amount, date);
        this.type = type;
    }

    @Override
    public void displayDetails() {
        System.out.println("[Utility] " + getType() + ": " + getDescription() + 
                           " | Cost: $" + getAmount() + " | Date: " + getDate());
    }

    public String getType() { return type; }
}