package bankaccount;

import java.util.*;

public class BankAccount {

    public static void getData(int NumberOfAccounts, ArrayList id, ArrayList name, ArrayList age, ArrayList address, ArrayList gender) {
        for (int i = 0; i < NumberOfAccounts; i++) {
            System.out.println("The information of client " + (i + 1));
            System.out.println("id : " + id.get(i));
            System.out.println("name : " + name.get(i));
            System.out.println("age : " + age.get(i));
            System.out.println("adress : " + address.get(i));
            System.out.println("gender : " + gender.get(i));
            System.out.println("***********************************");
        }
    }

    public static void setData(int NumberOfAccounts, ArrayList id, ArrayList name, ArrayList age, ArrayList address, ArrayList gender) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < NumberOfAccounts; i++) {
            System.out.println("Enter the information of client " + (i + 1));
            System.out.println("Enter the Id of client " + (i + 1) + " : ");
            String search=input.nextLine();
            if(id.contains(search))
            {
                System.out.println("Enter another id");
            id.add(input.nextLine());
            }
            else
            {
            id.add(search);
            }
            
            System.out.println("Enter the name of client " + (i + 1) + " : ");
            name.add(input.nextLine());
            System.out.println("Enter the age of client " + (i + 1) + " : ");
            age.add(input.nextInt());
            System.out.println("Enter the address of client " + (i + 1) + " : ");
            input.nextLine();
            address.add(input.nextLine());
            System.out.println("Enter the gender of client " + (i + 1) + " : ");
            gender.add(input.nextLine());
            System.out.println("***********************************");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of accounts you want to create");
        int NumberOfAccounts = input.nextInt();
        ArrayList id = new ArrayList(NumberOfAccounts);
        ArrayList name = new ArrayList(NumberOfAccounts);
        ArrayList age = new ArrayList(NumberOfAccounts);
        ArrayList address = new ArrayList(NumberOfAccounts);
        ArrayList gender = new ArrayList(NumberOfAccounts);
        int[] balance = new int[NumberOfAccounts];
        deposit depost = new deposit();
        Withdraw wthdrw = new Withdraw();
        AccountStatement accountst = new AccountStatement();
        setData(NumberOfAccounts, id, name, age, address, gender);
        getData(NumberOfAccounts, id, name, age, address, gender);
        int n = 1;
        do {
            System.out.println("if you want to make account statement enter 1");
            System.out.println("if you want deposit enter 2");
            System.out.println("if you want withdrawl enter 3");
            int operation = input.nextInt();
            if (operation == 1) {
                accountst.operation(NumberOfAccounts, id, balance);
            } else if (operation == 2) {
                depost.operation(NumberOfAccounts, id, balance);
            } else if (operation == 3) {
                wthdrw.operation(NumberOfAccounts, id, balance);
            }

            System.out.println("Enter -1 if you want to exit,else choose other");
            n = input.nextInt();
        } while (n != -1);
    }
}
