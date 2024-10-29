// Removing Duplicate Values in a Array

import java.util.*;

class RemovingDuplicateValues 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int arr[]=new int[size];	
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		sc.close();
		
		removeDuplicates(arr);
	}
    public static void removeDuplicates(int[] array) 
    {
        if (array.length == 0)
        	System.out.println("Empty Array");
        
        Arrays.sort(array);
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[j]) {
                j++;
                array[j] = array[i];
            }
        }
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}