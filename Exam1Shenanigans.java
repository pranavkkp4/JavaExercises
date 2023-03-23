import java.lang.Math;
public class Exam1Shenanigans {
    public static int[] bob={1,2,-300000,-0004,15,6,7,18,-1,-1200};
    public static void main (String args[]){
        //maths();
        smallest();

    }
    public static void maths(){
        int currentNum;
        for(int i = 0; i < bob.length; i++){
            currentNum = bob[i];
            System.out.println("The square root of "+ currentNum+ " is "+ Math.sqrt(currentNum));
            System.out.println("2 to the power of "+currentNum+" is "+ Math.pow(2,currentNum));
        }
    }
    public static void smallest(){
        int smallest = bob[0];
        int smallestLoc = 0;
        for(int i = 1; i < bob.length; i++){
            if(smallest > bob[i]){
                smallest=bob[i];
                smallestLoc=i;
            }
        }

        System.out.println("Smallest is "+smallest+" located at "+ smallestLoc);
    }

}
