package bankaccount;

import java.util.*;

public class Withdraw extends operations {

    public Withdraw() {
    }

    @Override
    public void operation(int NumberOfAccounts, ArrayList id, int[] balance) {
        setNumberOfAccounts(NumberOfAccounts);
        setBalance(balance);
        setId(id);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id : ");
        String searchId = input.nextLine();
        for (int i = 0; i < NumberOfAccounts; i++) {
            if (getId().get(i).equals(searchId)) {
                System.out.println("enter the amount to be withdrawn ");
                int withdraw = input.nextInt();
                if (balance[i] < withdraw) {
                    System.out.println("your balance do not have the amount of money you want to withdraw");
                } else {
                    balance[i] -= withdraw;
                }
            }
        }
    }
}
