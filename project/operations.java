package bankaccount;

import java.util.*;

public class operations {

    int NumberOfAccounts;
    ArrayList id;
    int[] balance;

    public operations() {
    }

    public int getNumberOfAccounts() {
        return NumberOfAccounts;
    }

    public void setNumberOfAccounts(int NumberOfAccounts) {
        this.NumberOfAccounts = NumberOfAccounts;
    }

    public ArrayList getId() {
        return id;
    }

    public void setId(ArrayList id) {
        this.id = id;
    }

    public int[] getBalance() {
        return balance;
    }

    public void setBalance(int[] balance) {
        this.balance = balance;
    }

    public void operation(int NumberOfAccounts, ArrayList id, int[] balance) {
        setNumberOfAccounts(NumberOfAccounts);
        setBalance(balance);
        setId(id);
    }

}
