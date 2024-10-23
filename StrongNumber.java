import java.util.Scanner;

public class Strong_Number
{
	public static long factorial(long num)
    {
		long fact=1,itr;
		for(itr=1;itr<=num;itr++) {
			fact*=itr;
		}
		return fact;
	}
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		sc.close();
		long sum=0,temp=n;
		while(n!=0) 
        {
			sum+=factorial(n%10);
			n/=10;
		}
		if(temp==sum)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
	}
}
