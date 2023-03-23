/*
LabThree
Task 1(15points): You are to time both of the loops below with nanoTime. You need to determine the length of time each loop ran in nanoseconds, also,you will determine the runtime of each loop iteration and these values must be output as follows
"time(ns) = " totallooptime+ "; or time per loop iteration " ns / iteration of the loop"
This will allow us to measure the speed of getting data into an array from a file source vs a source entirely in ram
You can easily us t2-t1 to measure overall loop length but iteration time will be slightly more involved as you cant simply use array,length since the arrays wont be totally filled, ONLY count the number of ACTUAL iterations of the loop to determine this time period.
Rules: Only test the loops themselves, dont get other commands in between time points or it will affect time. Use the arrayinput.txt file in this week folder to test the first loop.

Task 2(10points): Run this program at least 3-5 times and take notes of the total time and iteration time for both loops Task 1 has shown you. Both of these arrays are exactly the same size(no upsize or downsize is occuring), they will both only pull in a value from a datasource, only their datasources differ. First loop will only run as many times as the file allows with the second loop only running an identical amount of time and filling its array identically in size. 
Answer this question for Task 2:
Which loop ran faster over multiple tests? What do you think is the reason(s) for this difference (Type answer below inside the comment area)
>>Answer Here

The second loop(reading data directly from the RAM) was faster than reading data from the file
over multiple tests. I think the reason is that it takes longer to get data
from a file than to use data entirely in the RAM since RAM is meant to be accessed quickly, while the
files are meant for permanent storage. Also, assessing data from a file requires more commands,
like with the input/output while the RAM data is easier to access.

*/
//Nano Time System.nanoTime()
import java.util.*;
import java.io.*;

public class LabThree
{
	static final int MAX_CAPACITY = 1000;  

	public static void main( String args[] ) throws Exception
	{
		if (args.length < 1 )
		{
			System.out.println("usage: $ java LabThree Requires a filename to read from!");
			System.exit(0);
		}

		int[] arr = new int[ MAX_CAPACITY ];
		int count=0;
		
		Scanner infile = new Scanner( new File("arrayInput.txt") );
		while ( infile.hasNextInt() )
		{
			
			arr[count] = infile.nextInt();
			++count;
		}
		//time for file reading
		long nanoTime1 = System.nanoTime(); //compile error when not using long

		int[] arr2 = new int[ MAX_CAPACITY ];
		int count2 = 0;
		while (count2 < count)
		{
		    arr2[count2] = count2;
		    count2++;
		}
		long nanoTime2 = System.nanoTime();
		long totalNanoTime = nanoTime2-nanoTime1;
		System.out.println("time(ns) = "+totalNanoTime);
		


	} // END MAIN

	// ############################################################################################################


} // END CLASS
