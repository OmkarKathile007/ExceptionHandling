package Exception_handle;


import java.util.Scanner;

public class Throw_Throws {
    public static void Add() throws Exception  // This Indicates that This Method Might Throws an Exception You need To be ready In
                                                //  Handling The Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            if (a<0){
                System.out.println("Throws Negative Exception");
            }
            else {
                System.out.println("Positive Exception");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        finally {
            System.out.println("End of the static Block");
        }
    }
    public static void main(String[] args)
    {
      try {                 // For handling the exception We have created Try Block
          Add();
      }
      catch (Exception e){
          System.out.println(e);
      }

    }
}
