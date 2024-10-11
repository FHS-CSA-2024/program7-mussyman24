//import stuff here
import java.util.Scanner;


//Your code here
public class Program7 {
    public static void main(String[] args) {
        int schruteBucks = 0;
        int klevins = 0;
        int stanleyNickels = 0;
        
        Scanner currencyInput = new Scanner(System.in);
        
        System.out.println("Enter schrute-bucks: ");
        schruteBucks = currencyInput.nextInt();
        
        System.out.println("Enter klevins: ");
        klevins = currencyInput.nextInt();
        
        System.out.println("Enter stanleyNickels: ");
        stanleyNickels = currencyInput.nextInt();
        
        int totalSN = klevins * 12 + stanleyNickels;
        double decimalSB = schruteBucks + Math.round(totalSN * 100.0/240.0)/100.0;
        
        System.out.println("Decimal schrute-bucks = " + decimalSB);
        
    }
    
}
//Paste console output below:
/*
Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanleyNickels: 
9
Decimal schrute-bucks = 7.89

*/
