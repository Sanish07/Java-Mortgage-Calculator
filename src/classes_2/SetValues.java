
package classes_2;

import java.util.Scanner;

public class SetValues {
    
    private static Scanner scan = new Scanner(System.in);
    
    public static double readNumber(String prompt){
        return scan.nextDouble();
    }
    
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scan.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
    
}
