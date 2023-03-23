/* CS 0401 Java LabZero3
You can use this as a starter template to make a new java program from scratch
   
*/
import java.util.Scanner;
public class LabZero3
{                 
	

      public static void main (String [] args)
	  {
	  
	  //Prompt user to enter a number value of how many numbers they will enter
	  Scanner input = new Scanner(System.in);
      System.out.println("How many values will you enter ");
      int count = input.nextInt();
      double userNum = 0;
      System.out.println("Enter a number ");// doing this once outside of loop because the user could enter
      userNum = input.nextDouble(); // super large negative number, alternative would be assigning smallest possible double
      double max = userNum; // if put 0, and user enter negatives, could give max as 0 which user never entered
      for(int i = 0; i < count - 1; i++){ // iterating to less than count -1 cuz index start at 0, and did it once already
          System.out.println("Enter a number ");
          userNum = input.nextDouble();
          if(max < userNum){
              max = userNum;
          }
      }
      System.out.println(max + " was the largest value entered");
	  //create a loop to be controlled by that value asked for above
	  	//inside the loop//
	  	//ask for a numeric value from the user(note, this number SHOULD ALLOW DECIMAL numbers!
	  	//use scanner to pull this value in(make sure to match type between the variable that will hold it and the scanner call
	  	//Loop needs to determine the largest value entered by the user(design the logic for this using an if test)
	  	//end of loop
	  //Output the largest value entered by the user stating "# was the largest value entered" where # is the highest value determined by the loop.

	  	   
      }
}
