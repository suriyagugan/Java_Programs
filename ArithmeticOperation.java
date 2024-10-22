import java.util.*;

class ArithmeticOperations
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
      
        int addition=a+b;
        System.out.println("Addition Value : "+addition);
        
        int subtraction=a-b;
        System.out.println("Subtraction Value : "+subtraction);
        
        int multiplication=a*b;
        System.out.println("Multiplication Value : "+multiplication);
        
        try{
            int division=a/b;
            System.out.println("Division Value : "+division);
        }
        catch(ArithmeticException e){
            System.out.println("Error : Division by zero is not allowed");
        }
        
        try{
            int remainder=a%b;
            System.out.println("Remainder Value : "+remainder);
        }
        catch(ArithmeticException e){
            System.out.println("Error : Division by zero is not allowed");
        }
    }
}
