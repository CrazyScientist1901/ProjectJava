import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);
        
        Budget groceryBudget = new Budget("Grocery", 10000.00);
        
        boolean running = true;

        System.out.println("======================================");
        System.out.println("  HOME EXPENSE MANAGEMENT SYSTEM  ");
        System.out.println("======================================");

        while (running) {
            System.out.print("Enter your Monthly Income to start: ");
            double myIncome = scanner.nextDouble();
            Savings mySavings = new Savings(myIncome);
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Utility Expense");
            System.out.println("2. Add Grocery Expense");
            System.out.println("3. Show All Expenses");
            System.out.println("4. Check Grocery Budget Status");
            System.out.println("5. Save & Export to CSV");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter description: ");
                    String utilDesc = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double utilAmt = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Enter utility type (Electricity/Water/etc): ");
                    String type = scanner.nextLine();
                    
                    manager.addExpense(new UtilityExpense(utilDesc, utilAmt, LocalDate.now(), type));
                    System.out.println("Utility expense added!");
                    break;

                case 2:
                    System.out.print("Enter description: ");
                    String grocDesc = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double grocAmt = scanner.nextDouble();
                    System.out.print("Is it essential? (true/false): ");
                    boolean essential = scanner.nextBoolean();
                    
                    manager.addExpense(new GroceryExpense(grocDesc, grocAmt, LocalDate.now(), essential));
                    System.out.println("Grocery expense added!");
                    break;

                case 3:
                    System.out.println("\n--- ALL RECORDED EXPENSES ---");
                    manager.showAllExpenses();
                    System.out.println("Total: " + manager.calculateTotal());
                    break;

                case 4:
                    double currentGroc = manager.getTotalForGroceries();
                    groceryBudget.checkLimit(currentGroc);
                    break;

                case 5:
                    manager.exportToCSV("my_expenses.csv");
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;
                case 7:
                    double totalSpent = manager.calculateTotal();
                    mySavings.calculateAndDisplaySavings(totalSpent);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}