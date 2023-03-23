import java.util.*;
import java.io.*;
public class ArrayListDemo {
    public static void main(String args[]) {
      ArrayList<Integer> wordList= new ArrayList<Integer>();// the () allows us to specify an initial size of underlying array, if not specified - it assumes 10
      wordList.add(2); // Load up the arraylist with ints, ints are NOT objects and have to be converted(performance hit)
      wordList.add(12);
      wordList.add(22);
      wordList.add(26);
      wordList.add(29);
      wordList.add(24);
      //default underlying array size of ArrayList is 10, adding values that do not exceed it will NOT trigger an upsize(no performance slowdown from deep copy)
      // What happens at the 11th element added? From the sourcecode found in ArrayList.java: (OldCapacity*3)/2+1 = 10*3/2+1 =16
      Integer intObject = 15; //int 15 is converter to an object here
      wordList.add(intObject); // intObject is already an object so no conversion needed(faster than adding an int)
      System.out.println("Lets see our initial list!");
      System.out.println("The length of the arraylist is: " +  wordList.size());
      for (int word : wordList)
      {
          System.out.println(word);
      }
      System.out.println("Lets try a removal of the number 22");
      int addytoremove = wordList.indexOf(22);
      System.out.println("The index of 22 is " + addytoremove);
      System.out.println("That value will now be removed");
      wordList.remove(addytoremove);
      for (int word : wordList)
      {
          System.out.println(word);
      }
      System.out.println("The length of the arraylist is: " +  wordList.size());
      System.out.println("See the value is gone now and the list size adjusted on its own");
      // Lets remove an object directly
      wordList.remove(intObject);
      for (int word : wordList)
      {
          System.out.println(word);
      }
      System.out.println("The length of the arraylist is: " +  wordList.size());
      //notice we didn't have to use indexOf() to find the index of 15? We called .remove() with an Object instead of an int
      //See our Plain Arrays vs ArrayList sheet to see the 2 versions of .remove - which was used?
      
      //Lets try something to test object references
      System.out.println("Lets test our object references, intObject will be set to 10000 and added to the list");
      intObject = 10000;
      wordList.add(intObject);
      for (int word : wordList)
      {
          System.out.println(word);
      }
      System.out.println("The length of the arraylist is: " +  wordList.size());
      System.out.println("Now, we will set intObject to 9999 and see if its reflected in the list!");
      intObject = 9999;
      for (int word : wordList)
      {
          System.out.println(word);
      }
      System.out.println("The length of the arraylist is: " +  wordList.size());
      //One final test, lets try to remove intObject
      if (wordList.remove(intObject))
      	System.out.println(" object was removed");
      else
        System.out.println(" object was NOT removed");
      System.out.println("The length of the arraylist is: " +  wordList.size());
      
      //Notice the value in the List didnt change from 10000 to 9999? The intObject is an object referencing an address in mem 
      //containing 10000, THAT value was copied into the arraylists own array with the arraylists object reference pointing to its own managed address so changing the original value had no effect on whats in the list.
      
      
      /*
      	Closing thoughts: Efficiency of some operations like adding an int to an ArrayList seem to incur a penalty due to the object conversion but consider if we converted it to an Integer object prior to adding it, did we really gain anything?
      	An int to Integer conversion still occured, done in the same exact way regardless of how we did it.
      	We made our code more complex by manually doing the conversion ahead of the .add(), but gained nothing in speed and since we now have a separate reference to the object and we saw the our test of object references that intObject is an entirely separate object from those under control of the arraylist. By trying to make our code more efficient to adding items to the list 
      	we didn't gain anything but a slightly faster add at the cost of more code, an an extra object(more memory use).
      	Efficiency is multi faceted, tunnel vision on one aspect like .add() can cost us more than simply allowing the list to handle it and make our code simpler to write
      */
      
      
    }
}
