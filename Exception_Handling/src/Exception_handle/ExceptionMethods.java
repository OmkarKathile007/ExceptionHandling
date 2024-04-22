package Exception_handle;
class Number{
    public void M1(){
        System.out.println("This is a method1");
        try {
            M2();
        }
        catch (Exception e){
            System.out.println("Main Method will handle me");
        }
    }
    public void M2(){
        int a =10;
        int b = 10;
        int result = 0;
        try {
            result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException ap){
            System.out.println("Arithmetic error");
        }

        catch (Exception e){
            System.out.println("M1 will handle me"+e);
        }
    }
    public void M3() throws Exception              // ------>  This Method is also valid throws Exception
    {
        M1();
    }
}
public class ExceptionMethods {
    public static void main(String[] args)  //throws Exception
    {
        Number num = new Number();
        num.M1();
        num.M2();
    }
}
