// Unique Values in a Array

import java.util.Scanner;

class UniqueValues
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int arr1[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int index=0;
		for(int i=0;i<size;i++) 
		{
			int flag=0;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j]) 
				{
					flag=1;
					break;
				}
			}
			if(flag==0) 
			{
				arr1[index]=arr[i];
				index++;
			}
		}
        
		for(int i=0;i<index;i++) 
			System.out.print(arr1[i]+" ");
		
        sc.close();
	}
}