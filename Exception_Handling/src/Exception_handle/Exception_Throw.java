package Exception_handle;

import java.util.Scanner;

public class Exception_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result;
        try {
            if(num2<0||num1<0) {
                throw new ArithmeticException("Negative Number");
            }
            else {
                result = num1 / num2;
                System.out.println();
            }
        }
        catch (Exception e){
            System.out.println("Please enter valid number");
        }

    }
}
