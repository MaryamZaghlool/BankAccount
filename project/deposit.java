package bankaccount;

import java.util.*;

public class deposit extends operations {

    public deposit() {
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
                System.out.println("enter the amount to be deposited ");
                int deposit = input.nextInt();
                balance[i] += deposit;
                break;
            }
        }
    }

}
