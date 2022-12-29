package bankaccount;

import java.util.*;

public class AccountStatement extends operations {

    public AccountStatement() {
    }

    @Override
    public void operation(int NumberOfAccounts, ArrayList id, int[] balance) {
        setNumberOfAccounts(NumberOfAccounts);
        setBalance(balance);
        setId(id);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id : ");
        String searchId = input.next();
        for (int i = 0; i < NumberOfAccounts; i++) {
            if (getId().get(i).equals(searchId)) {
                System.out.println("Your Balance : " + balance[i]);
                break;

            }
        }
    }

}
