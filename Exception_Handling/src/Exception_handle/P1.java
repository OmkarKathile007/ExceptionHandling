package Exception_handle;

import java.util.Scanner;
import java.util.InputMismatchException;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int n=sc.nextInt();
            int m=sc.nextInt();
            int result=n/m;
            System.out.println(result);

        }
        catch(InputMismatchException inpute){
            System.out.println(inpute);
        }
        catch(ArithmeticException a){
            System.out.println(a);
        }
        catch(Exception e ){
            System.out.println(e);
        }
    }
}
