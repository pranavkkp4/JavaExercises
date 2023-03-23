import java.io.File;
import java.io.IOException;
public class M4 {
   public static void listOfFiles(File dirPath){
 
      //create an array of File Objects, populate it with listFiles() method of the file sent into this method
      //Use an enhanced for loop to go through each File object in that array
      	//Inside the loop you will create your if-else condition to control the recursive method
      		//If the current File is a file not a directory then you will output the AbsolutePath and the Name of the file
      		//else(meaning we have found a directory) make a recursive call and pass that file into the method
      File[] arr = dirPath.listFiles();
      for(File var : arr){
         if(var.isFile()){
            System.out.println("The absolute path is " + var.getAbsolutePath());
            System.out.println("The name of the file is " + var.getName());
         }
         else{
            listOfFiles(var);
         }
      }
      
   }
   public static void main(String args[]) throws IOException {
      //Creating a File object for directory
      File file = new File(args[0]);

      //List of all files and directories
      listOfFiles(file);
   }
}
