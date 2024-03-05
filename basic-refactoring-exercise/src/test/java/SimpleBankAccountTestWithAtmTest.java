import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import example.model.AccountHolder;
import example.model.BankAccount;
import example.model.SimpleBankAccount;
import example.model.SimpleBankAccountWithAtm;

public class SimpleBankAccountTestWithAtmTest extends AbstractBankAccountTest{
    protected AccountHolder accountHolder;
    protected BankAccount bankAccount;

   
   @Override
   protected BankAccount createBankAccountToTest(AccountHolder accountHolder) {
        
        super.setFee(1);
        return new SimpleBankAccountWithAtm(accountHolder, 0);
        
   }

   /*  @Test
    void testInitialBalance() {
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(accountHolder.getId(), 100);
        assertEquals(99, bankAccount.getBalance());
    }

    @Test
    void testWrongDeposit() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.deposit(2, 50);
        assertEquals(99, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdraw(accountHolder.getId(), 70);
        assertEquals(28, bankAccount.getBalance());
    }

    @Test
    void testWrongWithdraw() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdraw(2, 70);
        assertEquals(99, bankAccount.getBalance());
    }*/
    
}
