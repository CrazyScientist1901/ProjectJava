//
public class Savings {
    private double monthlyIncome;

    public Savings(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
    public void calculateAndDisplaySavings(double totalExpenses) {
        double savedAmount = monthlyIncome - totalExpenses;
        double savingsRate = (savedAmount / monthlyIncome) * 100;

        System.out.println("\n--- SAVINGS SUMMARY ---");
        System.out.println("Monthly Income:   " + monthlyIncome);
        System.out.println("Total Expenses:   " + totalExpenses);
        System.out.println("Net Savings:      " + savedAmount);
        
        if (savedAmount > 0) {
            System.out.printf("Savings Rate:     %.2f%%\n", savingsRate);
            System.out.println("Great job! You are living within your means.");
        } else if (savedAmount == 0) {
            System.out.println("You broke even this month.");
        } else {
            System.out.println(" ALERT: You are overspending by" + Math.abs(savedAmount));
        }
    }
}