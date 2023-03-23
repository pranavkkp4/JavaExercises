import java.util.Arrays;
public class ExamShananigans2 {
    public static void main(String[] args){
        int[] array1 = {1000,9,8,3,-5,2345,-10000};



        for(int i = 1; i < array1.length; i++){
            int currentNum = array1[i];
            int loc =i-1;
            while(loc >=0 && currentNum < array1[loc]){
                array1[loc+1] = array1[loc];
               loc--;
            }
            System.out.println(loc);
            array1[loc+1]=currentNum;
            System.out.println(Arrays.toString(array1));

        }
        System.out.println(Arrays.toString(array1));
    }
}
