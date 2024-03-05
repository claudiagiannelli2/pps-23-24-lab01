import example.model.AccountHolder;
import example.model.BankAccount;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractBankAccountTest {

    private AccountHolder accountHolder;
    private BankAccount bankAccount;
    private int fee;

    
    protected void setFee(int fee){
        this.fee=fee;
    }

    @BeforeEach
    void init()  {
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        this.bankAccount= createBankAccountToTest(accountHolder);
    }

    protected abstract BankAccount createBankAccountToTest(AccountHolder accountHolder);

    @Test
    void testInitialBalance() {
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(accountHolder.getId(), 100);
        assertEquals(100-this.fee, bankAccount.getBalance());
    }

    @Test
    void testWrongDeposit() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.deposit(2, 50);
        assertEquals(100-this.fee, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdraw(accountHolder.getId(), 70);
        assertEquals(30-(this.fee*2), bankAccount.getBalance());
    }

    @Test
    void testWrongWithdraw() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdraw(2, 70);
        assertEquals(100-this.fee, bankAccount.getBalance());
    }

}