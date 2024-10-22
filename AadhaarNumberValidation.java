/*
Constraints:
    1.Number Contains 12 digits
    2.first digit of the number not start with 0 or 1
    3.Number shoud not contains alphabet and special characters
    4.After the every 4th digit there is a space
*/
import java.util.*;

public class AadhaarNumberValidation
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			String s=sc.nextLine();
			if(validation1(s) && validation2(s) && validation3(s) && validation4(s)) 
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}
	
	public static boolean validation1(String s) {
		int l=s.length();
		if(l==14)
			return true;
		else
			return false;
		
	}

	public static boolean validation2(String s) {
		if(s.charAt(0)!=0 && s.charAt(0)!=1)
			return true;
		else
			return false;
	}

	public static boolean validation3(String s) {
		int l=s.length();
		int i,count=0;
		for(i=0;i<l;i++) 
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				if(s.charAt(0)!='0' && s.charAt(0)!='1')
					count++;
			}
		}
		if(count>0)
			return true;
		else
			return false;
			
	}
	
	public static boolean validation4(String s) {
		if(s.charAt(4)==' ' && s.charAt(9)==' ')
			return true;
		else
			return false;
	}
}
