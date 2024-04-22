package Exception_handle;

import java.util.Scanner;
class MyException1 extends Exception{
    public void class1(){
        System.out.println("This an ");
    }
}
class MyException extends Exception{
    public int getMessage1(String op){
        System.out.println("This is an MyExceptionBlock");
        return 0  ;
    }
    public void Block(){
        System.out.println("This is an Block in My exception");
    }
}
public class My_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
          if(n<0){
              System.out.println("This Is not an Exception block");
          }
          else {
              throw new MyException();
          }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
