import java.util.Scanner;

class LinearSearch 
{
	public static void main(String[] args)
    {
		try (Scanner sc = new Scanner(System.in))
		{
			int n=sc.nextInt();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextLong();
			int key=sc.nextInt();
			int itr;
			for(itr=0;itr<n;itr++)
			{
				if(a[itr]==key)
					break;
			}
			if(itr<n)
				System.out.println("found");
			else
				System.out.println("Not Found");
		}
	}
}