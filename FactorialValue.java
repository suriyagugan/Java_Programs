import java.util.*;

class FactorialValue
{
    static int fact(int a)
	{
		if(a==0 ||a==1)
			return 1;
        
		return a*fact(a-1);
	}
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int number=obj.nextInt();
		int value=fact(number);
		System.out.printf("Factorial value of %d : %d",number,value);
	}
}
