package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpAccountTest {

    @Test(dataProvider = "empAccountData")
    public void testEmpAccount(int empId, String empName, float empAcctBalance, float creditAmount, float debitAmount) {
        Emp_Account employee = new Emp_Account(empId, empName, empAcctBalance);

        // Credit and Debit operations
        employee.creditAmount(creditAmount);
        employee.debitAmount(debitAmount);

        // Print final balance
        employee.printFinalBalance();
    }

    @DataProvider(name = "empAccountData")
    public Object[][] empAccountData() {
        return new Object[][] {
                {1, "John Doe", 1000.0f, 500.0f, 200.0f},
                {2, "Jane Smith", 1500.0f, 700.0f, 300.0f},
                {3, "Bob Johnson", 800.0f, 400.0f, 100.0f}
        };
    }
}
