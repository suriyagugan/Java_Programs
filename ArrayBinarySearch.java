import java.util.Scanner;

class BinarySearch 
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
			
			int first=0,last=n-1,mid;
			
			while(first<=last)
			{
				mid=(first+last)/2;
				if(a[mid]==key)
				{
					break;
				}
				else
				{
					if(a[mid]<key)
						first=mid+1;
					else
						last=mid-1;
				}
			}
			if(first<=last)
				System.out.println("Found");
			else
				System.out.println("Not Found");
		}
	}
}
