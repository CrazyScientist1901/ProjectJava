import java.time.LocalDate;
//This is the base class for all types of expenses.
public abstract class Expense {
    private String description;
    private double amount;
    private LocalDate date;

    public Expense(String description, double amount, LocalDate date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    // Getters and Setters (Encapsulation)
    public String getDescription() {
        return description; 
    }
    public double getAmount() { 
        return amount; 
    }
    public LocalDate getDate() { 
        return date; 
    }

    public abstract void displayDetails();
}