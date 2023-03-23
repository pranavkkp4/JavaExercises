// import the Scanner class to gain access to make our Scanner object
import java.util.Scanner;

public class LabZero2 {
  public static void main(String[] args) {
     // create a scanner to read from the keyboard
    String userName;
    double income,taxdue;
    
    // Prompt user to Enter username and income on the same line press Enter
    System.out.println("Enter your username and income: ");
    Scanner input = new Scanner(System.in);
    userName = input.next();
    income = input.nextDouble();

    
    //create a simple if/else type test to determine if income is greater than or equal to 50000, if so indicate output to the
    //user that they are middle income or higher
    if(income >= 50000){
      System.out.println("You are middle income or higher");
    }
    else{
      System.out.println("Darn your below middle income");
    }
    
    // calc taxdue as 10% on income
    taxdue = income * 0.1;

       
    System.out.println("Taxpayer name is: " + userName);  
    System.out.println("Their income was: " + income);
    System.out.println("Their tax amount due is: "+ taxdue);
  }
}
