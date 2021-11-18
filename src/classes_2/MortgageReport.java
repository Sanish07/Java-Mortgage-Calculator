
package classes_2;
import java.text.NumberFormat;

public class MortgageReport {
 
    private MortgageCalculator calculate;
    private final NumberFormat currency;
    
    public MortgageReport(MortgageCalculator calculate){
        this.calculate = calculate;
        currency = NumberFormat.getCurrencyInstance();
    }
    
    public void printMortgage() {
        double mortgage = calculate.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
    
    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= calculate.getYears() * MortgageCalculator.MONTHS_IN_YEAR; month++) {
            double balance = calculate.calculateBalance(month);
            System.out.println(currency.format(balance));
        }
    }

}
