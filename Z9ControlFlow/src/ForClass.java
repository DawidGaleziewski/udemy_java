public class ForClass {
    public static void main(String[] args) {
        listHits(4);
        System.out.println("10,000 at 2% intrest = " + calculateInterest(10000.0, 2.0));
        calculateCompoundInterest(100000, 12, 0.5, 0.02, 700);
    }

    public static void listHits(int noOfHits) {
        // init; expression; increment
        for(int i = 0; i < noOfHits; i++){
            System.out.println(i + 1);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }

    public static void calculateCompoundInterest(double amount, int months, double interestRate, double compoundRate, double maxCompoundInterest){
        for(int i = 0; i < months; i++){
            double compoundInterest = calculateInterest(amount, interestRate + (compoundRate * i));
            if(compoundInterest >= maxCompoundInterest){
                break;
            }
            System.out.printf("Compound interest  with compound interest of %s, after month %s. \n", compoundInterest, i +1);
        }
    };
}

// no problem to small
