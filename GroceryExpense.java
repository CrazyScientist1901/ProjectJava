import java.time.LocalDate;
// This class represents a grocery expense, which is a subclass of Expense.
public class GroceryExpense extends Expense {
    private boolean isEssential;

    public GroceryExpense(String description, double amount, LocalDate date, boolean isEssential) {
        super(description, amount, date);
        this.isEssential = isEssential;
    }

    @Override
    public void displayDetails() {
        String tag = isEssential ? "[Essential Grocery]" : "[Luxury Grocery]";
        System.out.println(tag + " " + getDescription() + 
                           " | Cost: $" + getAmount() + " | Date: " + getDate());
    }
}