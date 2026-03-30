//This class handles budgeting for a specific category of expenses, 
// allowing you to set a monthly limit and check if you've exceeded it.
public class Budget {
    private double monthlyLimit;
    private String category;

    public Budget(String category, double monthlyLimit) {
        this.category = category;
        this.monthlyLimit = monthlyLimit;
    }

    public void checkLimit(double currentTotal) {
        if (currentTotal > monthlyLimit) {
            System.out.println("WARNING: " + category + " expenses ($" + 
                               currentTotal + ") have exceeded your limit of $" + monthlyLimit + "!");
        } else {
            System.out.println(category + " budget is on track.");
        }
    }
}