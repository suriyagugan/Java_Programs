import java.util.*;
class CharacterToInteger
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        char ch=obj.next().charAt(0);
        int value=(int)ch;
        System.out.printf("Integer value of %c : %d",ch,value);
    }
}
