import java.util.Scanner;

public class AdamNumber 
{
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int square_num=square(num);
		int rev_number=reverse(num);
		int square_rev_number=square(rev_number);
		int reverse_square_rev_number=reverse(square_rev_number);
		
        if(square_num==reverse_square_rev_number)
			System.out.println("Adam Number");
		else
			System.out.println("Not Adam Number");
	}
	
	public static int square(int num) {
		return num*num;
	}
	
	public static int reverse(int num)
    {
		int rev=0;
		while(num!=0) 
        {
			int remainder=num%10;
			rev=rev*10+remainder;
			num/=10;
		}
		return rev;
	}
}