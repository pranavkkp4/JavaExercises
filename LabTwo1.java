/*
LabTwo1: You will create a program that can build a perfect array from reading a file of ANY size.
You cannot code the array as one static size, it must be able to upsize itself to grow to whatever size is needed
Once file reading is done and all values have been pulled in from 'labinput.txt' you must then downsize the array to become perfect
Once perfect, use a method to print out the entire array stating how many values it contains.

The initial starter array has been provided but it will quickly fill. Compare the current count of items in the array to length to determine if an upsize is needed.
If there is space in the array: write directly into the array
If we are at capacity: call upsize to increase the arrays size, then write into it
increment count in the while loop

After the loop is finished, downsize the array to eliminate the empty spaces from the upsizes and perfect it.
Print out the array

ONLY 1 array, myarray should be in main. You should not create a separate array handle for any upsize or downsize operation

*/
/*LabTwo1: You will create a program that can build a perfect array from reading a
        file of ANY size.
        You cannot code the array as one static size, it must be able to upsize itself to
        grow to whatever size is needed
        Once file reading is done and all values have been pulled in from 'labinput.txt'
        you must then downsize the array to become perfect
        Once perfect, use a method to print out the entire array stating how many values it
        contains.
        The initial starter array has been provided but it will quickly fill. Compare the
        current count of items in the array to length to determine if an upsize is needed.
        If there is space in the array: write directly into the array
        If we are at capacity: call upsize to increase the arrays size, then write into it
        increment count in the while loop
        After the loop is finished, downsize the array to eliminate the empty spaces from
        the upsizes and perfect it.
        Print out the array
        ONLY 1 array, myarray should be in main. You should not create a separate array
        handle for any upsize or downsize operation
        */
//Nano time System.nanoTime();
import java.util.Scanner;
import java.io.*;

public class LabTwo1 {
    static int count;
    public static void main(String args[]) throws Exception {
      int[] myarray = new int[3]; // array is initially set to 3 spaces in length 
      count=0; //number of values we place in the array, initially, its 0 - no real values
      if (args.length < 1 )
	{
		System.out.println("usage error!: this program needs a filename to read from!");
		System.out.println("rerun program 'java LabTwo1 filename.txt'");
		System.exit(0);
	}
      Scanner infile = new Scanner( new File("labinput.txt") );
        while ( infile.hasNextInt() )
        {
            if(count>=myarray.length){
                myarray=upsize(myarray);
            }
            myarray[count] = infile.nextInt();
            ++count;
        }

        myarray = downsize(myarray);
        printArray(myarray);



    }
    // upsize method with take the arrays current size and double it. Why double?
    public static int[] upsize(int[] myarray){
        int[] finalArray= new int[count*2];
        for( int i=0 ; i< count ; ++i ){
            finalArray[i] = myarray[i];
        }
        return finalArray;
    }
    //printArray method will cycle through every value of an array and print it out to the command line(terminal)
    public static void printArray(int[] myarray){
        for( int i=0 ; i< count ; ++i ){
            System.out.println(myarray[i]);
        }
    }
    // downsize method to eliminate unused space in the array from the upsize operation.

    public static int[] downsize(int[] myarray){
        int[] downsized = new int[count];
        for( int i=0 ; i< count ; ++i ) {
            downsized[i] = myarray[i];
        }
        count=downsized.length;
        return downsized;
    }
}
