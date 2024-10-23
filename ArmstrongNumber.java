import java.util.Scanner;

public class Armstrong_Number 
{
	public static int power(int a,int b) 
    {
		int res=1;
		for(int itr=1;itr<=b;itr++)
			res*=a;
		return res;
	}

	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,count=0;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		temp=n;
		int sum=0;
		while(temp!=0)
		{
			sum+=power(temp%10,count);
			temp/=10;
		}
		if(sum==n) 
			System.out.println("ArmStrong Number");
		else
			System.out.println("Not Armstrong Number");
		
        sc.close();
	}

}