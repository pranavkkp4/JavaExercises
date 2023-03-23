/*
Module 2 Assignment  150pts total(100 and 50 for each method)
This assignment will require you to implement a selectionsort algorithm(Section 7.11 pg 463 in text)
A selectionsort is a brute force way to take an unsorted array and build a separate sorted array from it, it is brute for because it is an N^2 algorithm
N being the number of values in the array to be sorted, 10 elements means 10 squared or 100 traversals. It can take a long time on very large arrays
but it will work on any array no matter how random or clustered values are within it.
The idea is you take an array {15,12,3,22} and you would create a loop who will run as many times as there are elements in the array(N) and for EACH element you traverse each and test it to find the lowest value(N*N)
Outer loop: will run 4 times(4 values in our array)
	Inner loop will actually test each to find the lowest
	Lowest value is added to the new sorted array at its end
	Inner loop gives the lowest value it found back to the outer loop
Outer Loop will either remove or swap that lowest value so its no longer considered

Recommended way to most easily implement.
Inner loop can be simplified to a method 'findlowest' it will be sent the unsorted array and told to find the lowest value, period, return that value
Outloop would be its own method who will call findlowest when it needs it. It will handle running the process N number of times:
Whats the lowest from findlowest?
Add it to the sorted array
determine where it was located in the original array
replace the lowest value will a very high value to keep it out of interfering 

Build and TEST findlowest first, then work on sortArrayList. If findlowest isnt working dependably then the other WILL FAIL

*/

import java.util.*;
import java.io.*;
public class Module2Assignment {
    public static void main(String args[]) {
      ArrayList<Integer> wordList= new ArrayList<Integer>();
      wordList.add(2); // Load up the arraylist
      wordList.add(12);
      wordList.add(22);
      wordList.add(26);
      wordList.add(26);
      wordList.add(29);
      wordList.add(24);
      wordList.add(26);
      wordList.add(1);

      System.out.println("The length of the arraylist is: " +  wordList.size());
      
      printArrayList(wordList);
      /* You can reenable these to test your findlowest method prior to working on sortArrayList HIGHLY recommended to do so
      int lowest = findlowest(wordList);
      System.out.println(lowest + " is the lowest value");
      */
      wordList = sortArrayList(wordList);
      printArrayList(wordList);
      
      System.out.println("The length of the arraylist is: " +  wordList.size());
      
    }
    
    static void printArrayList( ArrayList<Integer> array  )
    {
        for ( int number : array ) 
            System.out.println( number);
        System.out.println();
    }
    static ArrayList<Integer> sortArrayList( ArrayList<Integer> array  )
    {   // this method is worth 100pts
        int lowest;
        int target;
        // create a new arraylist for the sorted values 'sorted'
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        // Create a simple loop to travel the whole arraylist(see printarray to borrow one)
        for(int number : array) {
            lowest = findlowest(array);
            sorted.add(lowest);
            target = array.indexOf(lowest);
            array.set(target, 9999);
        }
        {// Inside the loop
          // call findlowest to set lowest variable, send in the original array not the sorted one
          //add that value to the sorted arraylist
          //heres where we have to be careful, the previous lowest is STILL in the original arraylist, if we do this process again itll find the SAME value over and over
          //You cant call a remove to get rid of the original value, since you are using the arraylist for the loop Java will trigger a concurrencyexception
          // due to you modifying an objects size while traversing it. We can handle the arraylist like the book recommends on pg 1043 that we would with a typical 
          //array, we perform a swap. We can replace the lowest value with a value like 'findlowest' does, set it to 9999. That value will never get chosen
          // get an int target address of lowest in the original array, then call array.set(target,9999)
          //Now, we arent changing size while traversing and we took the previous lowest value out of the game effectively
        
        } // end of loop
        
        //return sorted;
        return sorted;
    }
    static int findlowest( ArrayList<Integer> array  )
    {   // This method is worth 50pts
        int lowest = 9999; //set to a value initially we know will be too high to be in our array. If null none of your values will beat it
        
        // Create a simple loop to travel the whole arraylist(see printarray to borrow one)
        for ( int number : array ) {
            if(number<lowest){
                lowest=number;
            }
        }
        // inside that for loop test is the value from the loop is lower than lowest, if it is, it replaces it as lowest
           
        //once loop is done you should have this arraylists lowest value, return it back
        return lowest;
    }
}
