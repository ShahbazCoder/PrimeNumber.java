import java.util.*;

public class Prime
{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		int n=(int)Math.sqrt(num);
		boolean flag=true;
		for(int i=2;i<=n;i++)
		{
			if(num%2==0){
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(num+"is a prime number.");
		else
			System.out.println(num+"is not a prime number.");
	}
}
			
		