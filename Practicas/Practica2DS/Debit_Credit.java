import java.util.stream.*;

public class Debit_Credit {
    
    private String name;
    private int[] debit = new int[30];
    private int[] credit = new int[30];

    public Debit_Credit(String name, int[] debit, int[] credit)
    {
        this.name = name;
        this.debit = debit;
        this.credit = credit;
    }

    public String getUsername () {
        return this.name;
    }

    public int getDebitTotal() {
        return IntStream.of(this.debit).sum();
    }

    public int getCreditTotal() {
        return IntStream.of(this.credit).sum();
    }

    public int getBalance() {
        return getDebitTotal() - getCreditTotal();
    }

    public void getDebit(){
        System.out.println("\nDEBITS\n______________________");
        for (int i = 0; i <= this.debit.length; i++) {
            if (this.debit[i] != 0) {
                System.out.println("\n"+i+". "+this.debit[i]);
            }
            else {
                break;
            }
        }
    }

    public void getCredit () {
        System.out.println("\nCREDITS\n______________________");
        for (int i = 0; i <= this.credit.length; i++){
            if (this.credit[i] != 0 ) {
                System.out.println(i+". "+this.credit[i]);
            }
            else {
                break;
            }
        }
    }

    public int getDebitCount () {
        int counter = 0;
        for (int i = 0; i <= this.debit.length; i++) {
            if (this.debit[i] != 0 ) {
                counter++;
            }
            else {
                break;
            }
        }
        return counter;
    }

    public int getCreditCount () {
        int counter = 0;
        for (int i = 0; i <= this.credit.length; i++) {
            if (this.credit[i] != 0) {
                counter++;
            }
            else {
                break;
            }
        }
        return counter;
    }

    public int getHighestDebit() {
        int max = this.debit[0];
        for (int i =0; i <= getDebitCount(); i++) {
            if (this.debit[i] != 0) {
                if (max < this.debit[i])
                {
                    max = this.debit[i];
                }
            }
        }
        return max;
    }

    public int getDebitAverage() {
        return getDebitTotal()/getDebitCount();
    }

    public int getCreditAverage() {
        return getCreditTotal()/getCreditCount();
    }

    public String deleteCredit(int index) {
        if (this.credit == null || index < 0 || index >= this.credit.length)
        {
            return "The number of the credit you mant to delete is not in our data base. Please try again";
        }
        int[] credit2 = new int [this.credit.length - 1];

        for (int i = 0, j = 0; i < this.credit.length; i++)
        {
            if (i == index)
            {
                continue;
            }
            credit2[j++] = credit[i];
        }
        this.credit = credit2;
        return "The credit has been succesfully deleted!"; 
    }


}
