/*
Similar to using loop, this code is similar to for loop removing from array list
Linear recursion doesn't involve for loop, uses if statement
is creating separate methods each does one part
linear recursion is typically faster than loop
when recursive method goes infitinite is stack overflow, or if the data is too large for the machine
each call is separate only connection is who called them
unique in that the method decides if it can end, no external structure
 */
import java.util.*;
import java.io.*;
public class RecursiveRemove {
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
      //Lets remove ALL copies of 26 from the ArrayList
      
      printArrayList(wordList);
      remover(wordList,26);
      printArrayList(wordList);
      
      
    }
    static void remover(ArrayList<Integer> array, int target)
    {
        
        int loc = array.indexOf(target); //find the target
        array.remove(loc); //remove it!
        if (array.indexOf(target) != -1) // test to determine if any targets remain in the list, if they are we recursively call remover again (loop logic without a loop)
        {
            remover(array,target);
        }
    }
    static void printArrayList( ArrayList<Integer> array  )
    {
        for ( int number : array ) 
            System.out.println( number);
        System.out.println();
    }
}