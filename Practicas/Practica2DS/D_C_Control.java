import java.util.Scanner;

public class D_C_Control {
    
    static Scanner ints = new Scanner (System.in);
    static Scanner strs = new Scanner (System.in);

    static int[] debit = new int[30];
    static int[] credit = new int [30];
    static int choice;
    static String enter;
    static String name;

    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public static void main(String[] args) {
        System.out.println("Ingrese su nombre para ingresar: ");
        name = strs.nextLine();
        System.out.println("\n\nWELCOME TO YOUR BANK!!\n\nFirst you'll need to enter your debits and credits, the debits should be more than 10 and credis more than 5.\n\nWhen you finish entering press 0.\nEnter debits: ");
        for (int i = 0; i < debit.length; i++)
        {
            debit[i] = ints.nextInt();
            if (debit[i] == 0)
            {
                if (i < 10)
                {
                    System.out.println("You need at least 10 values, please continue entering values");
                    i = i -1;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println("\nTHANK YOU!\nIt's time for the credits\n\nEnter credits: ");
        for (int i = 0; i < credit.length; i++)
        {
            credit[i] = ints.nextInt();
            if (credit[i] == 0)
            {
                if (i < 5)
                {
                    System.out.println("You need at least 5 values, please continue entering values");
                    i = i -1;
                }
                else
                {
                    break;
                }
            }
        }
        Debit_Credit account = new Debit_Credit(name, debit, credit);
        while (choice != 9) {
            clearScreen();
            System.out.println("\n           MENU\n_____________________________");
            System.out.println("\n1. Show total of debits");
            System.out.println("\n2. Show total of credits");
            System.out.println("\n3. Show balance");
            System.out.println("\n4. Show average of debits");
            System.out.println("\n5. Show highest value in debit account");
            System.out.println("\n6. Quantity of debits and credits");
            System.out.println("\n7. Show all values of both accouts");
            System.out.println("\n8. Delete credits");
            System.out.println("\n9. Exit");
            System.out.println("\nEnter your menu option: ");
            choice = ints.nextInt();
            switch(choice) {
                case 1:
                    clearScreen();
                    System.out.println("DEBIT ACCOUNT TOTAL: $"+account.getDebitTotal());
                    System.out.println("\n\nPress enter to continue: ");
                    enter = strs.nextLine();
                    break;
                case 2: 
                    clearScreen();
                    System.out.println("CREDIT ACCOUNT TOTAL: $"+account.getCreditTotal());
                    System.out.println("\n\nPress enter to continue: ");
                    enter = strs.nextLine();
                    break;
                case 3: 
                    clearScreen();
                    System.out.println("\nBALANCE: $"+account.getBalance());
                    System.out.println("\n\nPress enter to continue: ");
                    enter = strs.nextLine();
                    break;
                case 4:
                    clearScreen();
                    System.out.println("\nAVERAGE DEBIT ACCOUNT: "+ account.getDebitAverage());
                    System.out.println("\n\nPress enter to continue: ");
                    enter = strs.nextLine();
                    break;
                case 5: 
                    clearScreen();
                    System.out.println("\nHIGHEST VALUE IN DEBIT ACCOUNT: "+ account.getHighestDebit());
                    System.out.println("\n\nPress enter to continue: ");
                    enter = strs.nextLine();
                    break;
                case 6:
                    clearScreen();
                    System.out.println("\nNumber of debit operations: " + account.getDebitCount());
                    System.out.println("\nNumber of credit operations: " + account.getCreditCount());
                    System.out.println("\n\nPress enter to continue: ");
                    enter = strs.nextLine();
                    break;
                case 7: 
                    clearScreen();
                    account.getDebit();
                    account.getCredit();
                    System.out.println("\n\nPress enter to continue: ");
                    enter = strs.nextLine();
                    break;
                case 8: 
                    clearScreen();
                    System.out.println("DELETE CREDIT");
                    account.getCredit();
                    System.out.println("Enter the number of the credit you wish to delete: ");
                    int index = ints.nextInt();
                    account.deleteCredit(index);
                    System.out.println("DEBIT ACCOUNT TOTAL: $"+account.getDebitTotal());
                    System.out.println("CREDIT ACCOUNT TOTAL: $"+account.getCreditTotal());
                    System.out.println("\nBALANCE: $"+account.getBalance());
                    System.out.println("\nAVERAGE DEBIT ACCOUNT: "+ account.getDebitAverage());
                    System.out.println("\nHIGHEST VALUE IN DEBIT ACCOUNT: "+ account.getHighestDebit());
                    System.out.println("\nNumber of debit operations: " + account.getDebitCount());
                    System.out.println("\nNumber of credit operations: " + account.getCreditCount());
                    System.out.println("\n\nPress enter to continue: ");
                    enter = strs.nextLine();
                    break;
            }
        }
        clearScreen();
        System.out.println("Bye "+account.getUsername()+"!");
    }
}