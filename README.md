# Home Expense Management System (HEMS)

## Project Overview
**Home Expense Management System (HEMS)** is a Java-based command-line application designed to help individuals track their daily spending, manage category-specific budgets, and analyze monthly savings. 

This project demonstrate the practical application of **Object-Oriented Programming (OOP)** in solving real-world financial tracking challenges.

## Features
* **Categorized Expense Tracking:** Add specific expenses for Utilities and Groceries.
* **Budget Alerts:** Automated warnings when grocery spending exceeds a predefined limit (10000).
* **Savings Analysis:** Compare total monthly spending against income to calculate net savings and savings rate.
* **Data Persistence:** Export recorded expenses to a `my_expenses.csv` file using Java File I/O (Append Mode).
* **User-Friendly Menu:** A fully interactive console interface for easy navigation.

## OOP Principles Applied
This project serves as a comprehensive demonstration of the four pillars of OOP:

1.  **Abstraction:** The `Expense` class is abstract, defining a mandatory template for all costs while hiding generic implementation details.
2.  **Inheritance:** `UtilityExpense` and `GroceryExpense` extend the base `Expense` class, inheriting core attributes while adding category-specific data.
3.  **Encapsulation:** All sensitive data (amount, description, income) is kept `private`. Access is strictly controlled via public getters, setters, and constructors.
4.  **Polymorphism:** The `ExpenseManager` uses a single `List<Expense>` to store different object types. It calls `displayDetails()` on each object, and Java automatically triggers the correct version of the method at runtime.

## Project Structure
```text
/
  ├── Main.java             # Entry point & Menu Logic
  ├── Expense.java          # Abstract Parent Class
  ├── UtilityExpense.java   # Subclass for Bills
  ├── GroceryExpense.java   # Subclass for Food/Supplies
  ├── ExpenseManager.java   # Business Logic & File I/O
  ├── Budget.java           # Threshold & Limit Checking
  ├── Savings.java          # Financial Analysis Logic
```

## ⚙️ How to Run
1.  **Prerequisites:** Ensure you have **JDK 11 or higher** installed.
2.  **Clone the Repo:** ```bash
    git clone https://github.com/CrazyScientist1901/ProjectJava.git
    cd home-expense-manager
    ```
3.  **Compile the Code:**
    ```bash
    javac *.java
    ```
4.  **Run the Application:**
    ```bash
    java Main
    ```

## 📊 Sample Output
```text
--- MAIN MENU ---
1. Add Utility Expense
2. Add Grocery Expense
3. Show All Expenses
4. Check Grocery Budget Status
5. View Savings Analysis
6. Save & Export to CSV
7. Exit
```

---
