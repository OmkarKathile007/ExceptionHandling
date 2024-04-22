package Exception_handle;

public class Exception_error {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 0;
        int op[] = {2,3,4,5,4};
        try {
            c = a/b;
            System.out.println(op[4]);
            StringBuilder st = new StringBuilder("2312");
        }
        catch (ArithmeticException Ae){
            System.out.println("Take another Input Number 0 is not Possible");
        }
        catch (ArrayIndexOutOfBoundsException Ai){
            System.out.println("You are Crossing Your Limit of array");
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(c);
        System.out.println("Yo");
    }
}
