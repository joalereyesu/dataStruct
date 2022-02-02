import java.util.stream.*;

public class UnitTest {
    
    static int[] debit = new int[]{1000, 400, 100, 240, 350, 12000, 890, 134, 55, 900, 69, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] credit = new int[]{2000, 4500, 55, 350, 890, 98, 69, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static Debit_Credit testClass = new Debit_Credit("Jose Reyes", debit, credit);

    static boolean testDebitTotal() {
        int expected_total = IntStream.of(debit).sum();
        if (testClass.getDebitTotal() == expected_total){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean testCreditTotal() {
        int expected_total = IntStream.of(credit).sum();
        if (testClass.getCreditTotal() == expected_total){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean testBalance() {
        int expected_balance = IntStream.of(debit).sum() - IntStream.of(credit).sum();
        if (expected_balance == testClass.getBalance()){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean testDebitCount () {
        int expected_count = 11;
        if (expected_count == testClass.getDebitCount()) {
            return true;
        }
        else {
            return false;
        }
    }

    static boolean testCreditCount () {
        int expected_count = 7;
        if (expected_count == testClass.getCreditCount()) {
            return true;
        }
        else {
            return false;
        }
    }

    static boolean testDebitAverage () {
        int expected_average = IntStream.of(debit).sum()/11;
        if (expected_average == testClass.getDebitAverage()){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean testCreditAverage () {
        int expected_average = IntStream.of(credit).sum()/7;
        if (expected_average == testClass.getCreditAverage()){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean testHighestDebit () {
        int expected_max = debit[0];
        for (int i = 0; i <= 11; i++) {
            if (debit[i] != 0) {
                if (expected_max < debit[i]) {
                    expected_max = debit[i];
                }
            }
        }
        if (expected_max == testClass.getHighestDebit()){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("If all outputs are true all tests were succesfull");
        System.out.println("Debit total test: "+testDebitTotal());
        System.out.println("Credit total test: "+testCreditTotal());
        System.out.println("Total balance test: "+testBalance());
        System.out.println("Debit total count test: "+testDebitCount());
        System.out.println("Credit total count test: "+testCreditCount());
        System.out.println("Debit average test: "+testDebitAverage());
        System.out.println("Credit average test: "+testCreditAverage());
        System.out.println("Highest debit test: "+testHighestDebit());
    }

}
