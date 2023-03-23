import java.util.*;
import java.io.*;

public class ex8Arrays
{
	static final int MAX_CAPACITY = 25;  

	public static void main( String args[] ) throws Exception
	{
		if (args.length < 1 )
		{
			System.out.println("usage error!: this program needs a filename to read from!");
			System.out.println("rerun program 'java ex8Arrays filename.txt'");
			System.exit(0);
		}
		//an array is an object that manages a set of real memory addresses, those addresses are fixed and cant move
		int[] arr = new int[ MAX_CAPACITY ]; //its size is fixed to this now, 25 addresses are reserved
		int count=0; //this is how many actual values we place into the array
		
		Scanner infile = new Scanner( new File( args[0] ) );
		while ( infile.hasNextInt() )
		{
			
			arr[count] = infile.nextInt(); //pull a value from the file, place it into the array
			//the array object will direct each value to and from the addresses it manages
			++count; //this has 2 purposes, 1 directly provided an increasing address to aim the next value into
			// 2: its an actual count of how many we have added
		}
		
		arr = trimArray( arr, count ); // if an array is fixed in size, how does this work?
		printArray( arr); 

	} // END MAIN

	// ############################################################################################################

	public static int[] trimArray( int[] array, int count  )
    {
        int[] trimmed = new int[count]; //a new set of addresses is created
           for ( int i=0 ; i< count ; ++i )
			   trimmed[i] = array[i]; //populate those addresses with the actual values from the original array
       return trimmed; //send back the NEW set of addresses, they will replace the original arrays addresses its object handle points to
    }

	public static void printArray( int[] array)
    {
        for ( int number : array ) // for each item in the array
            System.out.print( number + " ");
        System.out.println();
    }

} // END CLASS
