package section06_access;

/**
 * 캡슐화
 * 좋은 캡슐화란? 데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것
 */
public class Chapter07_BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}
