
import java.util.*;
public class ZeroAssignment {
    public static void main(String args[]) {
        int arr[] = {31, 2, 4, 67, 81, 6, 7, 9, 15, 65, 77, 15, 14, 36, 41, 25, 1};
        int count = 0;
        int num=arr[0];
        boolean flag = true;
        while (count < arr.length) {

            num = arr[count];
            if (num == 1) {
                System.out.println("1 is never prime");
            }
            else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        flag = false;
                    }
                }

                if (flag==false) {
                    System.out.println(num + " is not a prime number.");
                }
                else {
                    System.out.println(num + " is a prime number.");
                }
            }
            flag=true;
            count++;
        }
    }
}

