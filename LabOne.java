/* CS 0401 Java Program LabOne
LabOne instructions:
Put the code into the isPrime method that will return a boolean true or false as to the argument 'test' being
sent in was a prime or not.
Hint, the for loop you built for the previous assignment may be able to help you out.

What to submit: Once you complete the method you are to use the LabOneDriver program to run and test this program.
Once youy verify the output is correct you must take a screenshot of the output and hand it in along with the LabOne.java file.

BOTH(image and LabOne.java) must be included on submission or the submission is incomplete 
   
*/
public class LabOne
{                 
	

      public static void main (String [] args)
	  {
	  System.out.println("This program isnt supposed to be run on its own. Use the driver program");
	  
	  	   
      }
      
      public static boolean isPrime(int test)
      {

          if (test == 1) {
              System.out.println("1 is never prime");
              return false;
          }
          else {
              for (int i = 2; i < test; i++) {
                  if (test % i == 0) {
                      return false;
                  }
              }


          }

      
          return true;
      }
}
