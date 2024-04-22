package Exception_handle;

import java.util.Scanner;

// This is a program to check whether a given input index number is present or Not........
class MaxRetryTried extends Exception{
    public String  MaxRetry(String n){

        return n;
    }
}
public class Arrays_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
         arr[0] =12;
         arr[1] =22;
         arr[2] =45;
         arr[3] =45;
         arr[4] =55;
         boolean flag = true;
         int index;
         int i =0;

         while (flag && i<5){            //  ------->   While will keep on executing Until condition becomes True
             try {
                 System.out.println("Enter Your Index");
                 index = sc.nextInt();
                 System.out.println(arr[index]);
                 break;
             }
             catch (Exception e){
                 System.out.println(e);
                 i++;
             }

         }
         if (i>=5){
//             System.out.println("Error");
             try {
                 throw new MaxRetryTried();
             }
             catch (Exception e){
                 System.out.println(e);
             }
         }

    }
}
