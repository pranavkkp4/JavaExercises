/**
   This program demonstrates a solution to the
   String Reverser programming challenge.
*/
import java.util.Scanner;
public class Recursion
{
   public static void main(String[] args)
   {
      int[] arr = { 13, 5, 7, 11, 23, 15, 6, 31, 91, 27, 14, 41, 55, 14 };
      Scanner kbd = new Scanner(System.in);
	  System.out.println("Which recursive method would you like to test? 1: String Reverser  2: Print array (Recursive remix feat: StackOverflow)");
	  int choice = kbd.nextInt();
	  if (choice == 1 )
	  {
	  System.out.print("Enter a string to reverse:");
      String str = kbd.next();
      strReverse(str); //hello
	  System.out.println("");
	  }
	  else if (choice == 2)
	  {
      printArray(arr,0); // send in our array and a starting position to begin printing from
	  }
   }
   
   /**
      The strReverse method uses recursion to
      display a string backward.
      @param str The string to display backward.
   */

//hello > o
//hell > l
//hel > l
//he > e
//h > h 
//


   public static void strReverse(String str)
   {
      if (str.length() == 0)  // Reached the end of the string
      {
         return; // doesnt make a recursive call as there is nothing left to process
      }
      else
      {
		  strReverse(str.substring(0, str.length()-1));
         System.out.print(str.charAt(str.length()-1)); //output last char of the string
          // calls to itself and supplies the string from first character to next to last char "ie chops off last character here"
      }
   }
   //System.out.print> olleh
   
   static void printArray( int[] array, int start )
    {
        if (start == array.length)
        {
            return; // normally we wouldnt need a return in a void method, here its being used to immediately terminate this method as recursion should stop when we reach the end of our array
        }
        else
        {
            
             // we send in the same array again, but the start position is where it was initially advanced by one. What happens if it is the same?
			// Lets try an experiment - what will happen if I move the output line above the recursive call to being AFTER the recursive call - what happpens? 
			printArray(array,start+1);
			System.out.print(array[start] + ",");
			
        }
        
    }
   
}