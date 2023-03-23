// Lab: Module Zero, Lab 1

public class LabZero1
{
      public static void main (String [] args)
	  {
	  // Task 1: 10 Points
          int a,b,c; // set a value, any value for each one of these variables
          a = 691;
          b = 1420;
          c = 711;
          double x,y,z; // place any double type value into these variables.
          x = 420.6998;
          y = 619.4212;
          z = 7.111111111169111;
          float fl1; // place a float compatible value here - be careful when assigning floats(check precision!)
          fl1 = 0.11F;
          
          // Task 2: 15 Points Correct(if needed) the following commands for precision
          
          fl1 = (float)x * a; // textbook  says have to cast to the type to avoid conversion error, will truncate
          b = b - (int)y;
          z =  x / y;

          
          
          //End Task 2
          
          //Do not modify lines below
          System.out.println("Value of int [a] is: " + a + "Value of int [b] is: " + b + "Value of int [c] is: " + c);
          System.out.println("Value of double [x] is: " + x + "Value of double [y] is: " + y + "Value of double [z] is: " + z);
          System.out.println("Value of float [fl1] is " + fl1);
          
       }
}
