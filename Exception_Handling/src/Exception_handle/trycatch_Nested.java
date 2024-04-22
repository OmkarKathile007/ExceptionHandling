package Exception_handle;

import java.util.Scanner;

public class trycatch_Nested {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 32;
        arr[1] = 21;
        arr[2] = 56;
//        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array Index");
        int ind = sc.nextInt();
            try {
                System.out.println("Has Entered in Try Block");
                try {
                    System.out.println("Array index is " + arr[ind]);

                } catch (ArrayIndexOutOfBoundsException ap) {
                    System.out.println("ArrayIndexOutOfBoundsException Ocurred");
                }
            } catch (Exception e) {
                System.out.println("Something Went Wrong!");
            }

        System.out.println("Program Completed");
    }
}
