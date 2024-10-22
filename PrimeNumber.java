import java.util.*;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
        int number=obj.nextInt();
		for(int i=2; i*i<a; i++)
		{
			if(a%i==0) 
				break;
		}
		if(i*i>a) 
			System.out.printf("%d is Prime Number",number);
		else
			System.out.println("%d is not a Prime Number",number);
    }
}

/* Below code is used to print prime numbers from start range to end range

        public static void main(String[] args)
        {
            Scanner obj=new Scanner(System.in);
            int start=obj.nextInt();
            int end=obj.nextInt();
            for(int i=start;i<end;i++)
            {
                if(prime(i))
                    System.out.println(i+" ");
            }
        }

        public static boolean prime(int a) 
        {
            if(a<=1)
                return false;
            for(int i=2;i*i<a;i++)
            {
                if(a%i==0)
                    return false;
            }
        return true;
*/
