package Exception_handle;

import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        int []arr = new int[3];
        arr[0] = 32;
        arr[1] = 21;
        arr[2] = 56;
    Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Your Array Index");
        int ind = sc.nextInt();
        System.out.println("Enter the Number which You want to divide");
        int n = sc.nextInt();

        try {
            System.out.println("The result is "+arr[ind]/n);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException Ocurred");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Ocurred");
        }
        catch (Exception e ){
            System.out.println("Something Went Wrong Please try again later");
        }
        System.out.println("Program Completed");
    }
}
